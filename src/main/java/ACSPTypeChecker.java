import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class ACSPTypeChecker extends ACSPBaseVisitor<ACSPTypeChecker.Gamma> {

    List<String> errors = new ArrayList<>();
    final Gamma empty = new Gamma();
    HashMap<String,Gamma> locMap = new HashMap<>();
    Gamma root;

    public ACSPTypeChecker(ACSPParser parser) {
        this.root = visit(parser.spec());
    }

    public boolean isWellTyped() {
      return  errors.isEmpty();
    }

    @Override
    public Gamma visitLocProcess(ACSPParser.LocProcessContext ctx) {
        Gamma res = ctx.children.stream().map(c -> visit(c)).reduce((r, t) -> r=  r.merge(t)).orElse(empty);

        if(res != null && res.isEmpty()){
            return res.addIn(ctx.ID().getSymbol().getText());
        }

        return res;
    }

    @Override
    public Gamma visitChannelNames(ACSPParser.ChannelNamesContext ctx) {
        return empty;
    }

    @Override
    public Gamma visitSimpleDefinition(ACSPParser.SimpleDefinitionContext ctx) {
        String key = ctx.definitionLeft().ID().getText();
        Gamma any = visit(ctx.any());

        locMap.put(key,any);

        return any;
    }

    @Override
    public Gamma visitAssertDefinition(ACSPParser.AssertDefinitionContext ctx) {
        for(ACSPParser.ProcContext proc : ctx.proc()){
            if(!visit(proc).isEmpty()){
                errors.add("error in assertion "+proc.ID().getText()+" is not well typed");
            }
        }
        return ctx.children.stream().map(c -> visit(c)).reduce((r, t) -> r = r.merge(t)).orElse(empty);
    }

    @Override
    public Gamma visitTerminal(TerminalNode node) {
        if(locMap.containsKey(node.getText())) {
            return locMap.get(node.getText()).merge(empty);
        }else{
            return empty;
        }
    }

    @Override
    public Gamma visitLocOutput(ACSPParser.LocOutputContext ctx) {
        Gamma proc = visit(ctx.getChild(0));
        Gamma cont = visit(ctx.getChild(1));

        if(proc != null && cont != null && proc.isEmpty()){
            return cont.addOut(ctx.ID().getSymbol().getText());
        } else {
            errors.add("A process being communicated over " + ctx.ID() +" was not well-typed at \n"+ ctx.getText());
            return null;
        }

    }

    @Override
    public Gamma visitLocNames(ACSPParser.LocNamesContext ctx) {
        Gamma g = new Gamma();
        ctx.ID().stream().forEach(l ->{
            g.out.add(l.getText());
            g.in.add(l.getText());
        });
        return g;
    }

    @Override
    public Gamma visitParallelProc(ACSPParser.ParallelProcContext ctx) {
        Gamma left = visit(ctx.proc(0));
        Gamma right = visit(ctx.proc(1));
        Gamma L = visit(ctx.locNames());
        Gamma gamma =  left.merge(right);
        boolean cond4 = gamma.in.containsAll(L.in) && gamma.out.containsAll(L.out);
        gamma.in.removeAll(L.in);
        gamma.out.removeAll(L.out);

        boolean cond1= left.in.stream().filter(right.out::contains).allMatch(L.in::contains);
        boolean cond2= left.out.stream().filter(right.in::contains).allMatch(L.in::contains);
        boolean cond3 = !(left.in.stream().anyMatch(right.in::contains));

        if(cond1 && cond2 && cond3 && cond4)
            return gamma;
        else{

            if(!cond1){
                String names = left.in.stream().filter(right.out::contains).filter(l -> !L.in.contains(l)).collect(Collectors.joining());
                errors.add(names +" are in left in and right out but not in L (" + L.in.toString() +")");
            }


            if(!cond2){
                String names = left.out.stream().filter(right.in::contains).filter(l -> !L.in.contains(l)).collect(Collectors.joining());
                errors.add(names +" are in left out and right in but not in L (" + L.in.toString() +")");
            }

            if(!cond3){
                String names = left.in.stream().filter(right.in::contains).collect(Collectors.joining());
                errors.add(names +" are in left in and right in");
            }

            if(!cond4){
                errors.add("some locations are not used");
            }

            return empty;
        }
    }

    @Override
    public Gamma visitProc(ACSPParser.ProcContext ctx) {
        Gamma res = ctx.children.stream().map(c ->visit(c)).reduce((r,t) -> r = r.merge(t)).orElse(empty);
        if(ctx.ID() != null){
            res.merge(locMap.get(ctx.ID().getText()));
        }

        return res;
    }

    @Override
    public Gamma visitLetProc(ACSPParser.LetProcContext ctx) {
        ctx.simpleDefinition().stream().forEach(c -> visit(c));
        Gamma withinStat = visit(ctx.any());

        removeLetProc(ctx.simpleDefinition());

        return withinStat;
    }

    private void removeLetProc(List<ACSPParser.SimpleDefinitionContext> ctx){
        for(ACSPParser.SimpleDefinitionContext c : ctx){
            locMap.remove(c.definitionLeft().ID().getText());
        }
    }

    @Override
    protected Gamma aggregateResult(Gamma aggregate, Gamma nextResult) {
        return (aggregate == null ? empty :aggregate).merge(nextResult);
    }

    @Override
    protected Gamma defaultResult() {
        return empty;
    }

    public  class Gamma {
        HashSet<String> in = new HashSet<>();
        HashSet<String> out = new HashSet<>();

        public Gamma addIn(String text){
            Gamma g = new Gamma();
            g.in.add(text);
            return merge(g);
        }
        public Gamma addOut(String text){
            Gamma g = new Gamma();
            g.out.add(text);
            return merge(g);
        }

        public boolean isEmpty(){
            return in.isEmpty() && out.isEmpty();
        }

        public Gamma merge(Gamma other){
            if(other == null)
                other = empty;
            Gamma newEnv = new Gamma();
            newEnv.in.addAll(in);
            newEnv.in.addAll(other.in);

            newEnv.out.addAll(out);
            newEnv.out.addAll(other.out);

            return newEnv;
        }

        public boolean notEmpty(){
            return !isEmpty();
        }
    }
}