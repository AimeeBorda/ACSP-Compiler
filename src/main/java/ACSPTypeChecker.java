import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class ACSPTypeChecker extends ACSPBaseVisitor<Environment> {

    private final String dir;
    //TODO: Free Variables in Let not to be used in the prefix
    List<String> errors;
    HashMap<String,Environment> locMap;


    public ACSPTypeChecker(ACSPParser parser, HashMap<String, Environment> locMap, String dir) {
        this(parser, locMap, new ArrayList<>(),dir);
    }

    public ACSPTypeChecker(ACSPParser parser, HashMap<String, Environment> locMaps, List<String> errors,String dir) {
        this.locMap = locMaps;
        this.dir = dir;
        this.errors = errors;
        visit(parser.spec());
    }

    public boolean isWellTyped() {
      return  errors.isEmpty();
    }

    @Override
    public Environment visitLocProcess(ACSPParser.LocProcessContext ctx) {
        Environment res = ctx.children.stream().map(c -> visit(c)).reduce((r, t) -> r=  r.merge(t)).orElse(defaultResult());

        if(res != null && res.isEmpty()){
            return res.in(ctx.ID().getSymbol().getText());
        }else{
            errors.add("location "+ctx.ID().getText() +" is not well-formed");
            return defaultResult();
        }
    }

    @Override
    public Environment visitSimpleDefinition(ACSPParser.SimpleDefinitionContext ctx) {
        String key = ctx.definitionLeft().ID().getText();
        Environment any = visit(ctx.any());

        locMap.compute(key, (k, v) -> (v == null) ? any : v.merge(any));

        return any;
    }

    @Override
    public Environment visitAssertDefinition(ACSPParser.AssertDefinitionContext ctx) {

        if(ctx.proc().stream().map(c ->visit(c)).anyMatch(e -> !e.isEmpty()) ||
                (ctx.definitionLeft() != null && !visit(ctx.definitionLeft()).isEmpty())
        ){
            errors.add("error in assertion "+ctx.getText() +" is not well-formed");
        }

        return ctx.children.stream().map(c -> visit(c)).reduce((r, t) -> r = r.merge(t)).orElse(defaultResult());
    }

    @Override
    public Environment visitTerminal(TerminalNode node) {
        return locMap.getOrDefault(node.getText(),defaultResult());
    }

    @Override
    public Environment visitLocOutput(ACSPParser.LocOutputContext ctx) {
        Environment proc = visit(ctx.proc(0));
        Environment cont = visit(ctx.proc(1));

        if(proc != null && cont != null && proc.isEmpty()){
            return cont.out(ctx.ID().getText());
        } else {
            errors.add("A process being communicated over " + ctx.ID() +" was not well-formed at \n"+ ctx.getText());
            return defaultResult();
        }

    }

    @Override
    public Environment visitLocNames(ACSPParser.LocNamesContext ctx) {
        Environment env =  defaultResult();
        ctx.ID().stream().map(TerminalNode::getText).forEach (l ->{
            env.out(l); env.in(l);
        });
        return env;
    }

    @Override
    public Environment visitParallelProc(ACSPParser.ParallelProcContext ctx) {
        Environment left = visit(ctx.proc(0));
        Environment right = visit(ctx.proc(1));
        Environment L = ctx.locNames() == null ? defaultResult() : visit(ctx.locNames());
        Environment gamma =  left.merge(right);

        gamma.removeAllIn(L.locations());
        gamma.removeAllOut(L.prefixes());

        if(!left.locations().stream().filter(right.prefixes()::contains).allMatch(L.locations()::contains)){
            String names = left.locations().stream().filter(right.prefixes()::contains).filter(l -> !L.locations().contains(l)).collect(Collectors.joining());
            errors.add(names +" are in left in and right out but not in L (" + L.locations().toString() +")");
            return defaultResult();
        }
        if(!left.prefixes().stream().filter(right.locations()::contains).allMatch(L.locations()::contains)){
            String names = left.prefixes().stream().filter(right.locations()::contains).filter(l -> !L.locations().contains(l)).collect(Collectors.joining());
            errors.add(names +" are in left out and right in but not in L (" + L.locations().toString() +")");
            return defaultResult();
        }
        if((left.locations().stream().anyMatch(right.locations()::contains))){
            String names = left.locations().stream().filter(right.locations()::contains).collect(Collectors.joining());
            errors.add(names +" are in left in and right in");
            return defaultResult();
        }

        return gamma;
    }


    @Override
    public Environment visitLetProc(ACSPParser.LetProcContext ctx) {
        ctx.simpleDefinition().stream().forEach(c -> visit(c));
        Environment withinStat = visit(ctx.any());

        for(ACSPParser.SimpleDefinitionContext c : ctx.simpleDefinition()){
            locMap.remove(c.definitionLeft().ID().getText());
        }

        return withinStat;
    }

    @Override
    protected Environment aggregateResult(Environment aggregate, Environment nextResult) {
        return (aggregate == null ? defaultResult() : aggregate).merge(nextResult);
    }

    @Override
    protected Environment defaultResult() {
        return new Environment(locMap);
    }

    @Override
    public Environment visitIncludeFile(ACSPParser.IncludeFileContext ctx) {
        try {
            String fileName = Translation.getFileName(ctx,dir);
            new ACSPTypeChecker(new ACSPParser(new CommonTokenStream(new ACSPLexer(CharStreams.fromFileName(fileName)))), locMap,errors,dir);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return defaultResult();
    }

}