import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.util.HashMap;
import java.util.stream.Collectors;

public class ACSPPreProcessor extends ACSPBaseVisitor<Environment> {

    HashMap<String,Environment> envMap;
    String dir;

    public ACSPPreProcessor(ACSPParser parser, String dir) {

        this(parser, new HashMap<>(),dir);
    }

    public ACSPPreProcessor(ACSPParser parser, HashMap<String, Environment> envMap,String dir) {
        this.envMap = envMap;
        this.dir = dir;
        visit(parser.spec());
    }


    @Override
    public Environment visitLocProcess(ACSPParser.LocProcessContext ctx) {
        return visit(ctx.proc()).in(ctx.ID().getText().trim());
    }

    @Override
    public Environment visitSimpleDefinition(ACSPParser.SimpleDefinitionContext ctx) {
        String key = ctx.definitionLeft().ID(ctx.definitionLeft().ID().size() - 1).getText();
        Environment any = visit(ctx.any());

        envMap.put(key,any);

        return any;
    }

    @Override
    public Environment visitLocOutput(ACSPParser.LocOutputContext ctx) {
        Environment proc = visit(ctx.getChild(0));
        Environment cont = visit(ctx.getChild(1));

        Environment env = proc.merge(cont);
        env.out(ctx.ID().getText().trim());


        return env;
    }

    @Override
    public Environment visitLocNames(ACSPParser.LocNamesContext ctx) {
        Environment g = defaultResult();
        Environment environment = ctx.ID().stream().map(l -> l.getText()).map(g::bound).reduce((r, m) -> r.merge(m)).orElse(defaultResult());
        return environment;
    }

//    @Override
//    public Environment visitParallelProc(ACSPParser.ParallelProcContext ctx) {
//
//        Environment env = visit(ctx.proc(0)).merge(visit(ctx.proc(1)));
//
//        return env.diff(visit(ctx.locNames()));
//    }

    @Override
    public Environment visitLetProc(ACSPParser.LetProcContext ctx) {
        ctx.simpleDefinition().stream().forEach(c -> visit(c));
        Environment withinStat = visit(ctx.any());

        for(ACSPParser.SimpleDefinitionContext c : ctx.simpleDefinition()){
            envMap.remove(c.definitionLeft().ID(c.definitionLeft().ID().size() - 1).getText());
        }

        return withinStat;
    }

    @Override
    public Environment visitDefinitionLeft(ACSPParser.DefinitionLeftContext ctx) {
        Environment res = ctx.children.stream().map(c ->visit(c)).reduce((r,t) -> r = r.merge(t)).orElse(defaultResult());
        return res.call(ctx.ID(ctx.ID().size() -1).getText().trim());
    }

    @Override
    protected Environment aggregateResult(Environment aggregate, Environment nextResult) {
        return (aggregate == null ? defaultResult() :aggregate).merge(nextResult);
    }

    @Override
    protected Environment defaultResult() {
        return new Environment(envMap);
    }

    @Override
    public Environment visitIncludeFile(ACSPParser.IncludeFileContext ctx) {
        try {
            String fileName = Translation.getFileName(ctx,dir);
            new ACSPPreProcessor(new ACSPParser(new CommonTokenStream(new ACSPLexer(CharStreams.fromFileName(fileName)))), envMap,dir);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return defaultResult();
    }
}