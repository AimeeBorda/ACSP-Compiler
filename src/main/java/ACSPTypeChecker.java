import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;


public class ACSPTypeChecker extends ACSPBaseVisitor<ACSPTypeChecker.Gamma> {

    List<String> errors = new ArrayList<>();
    final Gamma empty = new Gamma();
    Gamma root;

    public ACSPTypeChecker(ACSPParser parser) {
        this.root = visit(parser.spec());
    }

    public boolean isWellTyped() {
        return root.isEmpty() && errors.isEmpty();
    }

    @Override
    public Gamma visitLocProcess(ACSPParser.LocProcessContext ctx) {
        Gamma res = ctx.children.stream().map(c -> visit(c)).filter(Gamma::notEmpty).reduce((r, t) -> r.merge(t)).orElse(empty);

        if(res != null && res.isEmpty()){
            String text = ctx.ID().getSymbol().getText();
            res.addIn(text);
            return res;
        }

        return res;
    }

    @Override
    public Gamma visitChannelNames(ACSPParser.ChannelNamesContext ctx) {
        return empty;
    }

    @Override
    public Gamma visitSimpleDefinition(ACSPParser.SimpleDefinitionContext ctx) {
        return ctx.children.stream().map(c -> visit(c)).filter(Gamma::notEmpty).reduce((r, t) -> r.merge(t)).orElse(empty);
    }

    @Override
    public Gamma visitAssertDefinition(ACSPParser.AssertDefinitionContext ctx) {
        return ctx.children.stream().map(c -> visit(c)).filter(Gamma::notEmpty).reduce((r, t) -> r.merge(t)).orElse(empty);
    }

    @Override
    public Gamma visitRefinedBy(ACSPParser.RefinedByContext ctx) {
        return ctx.children.stream().map(c -> visit(c)).filter(Gamma::notEmpty).reduce((r, t) -> r.merge(t)).orElse(empty);
    }

    @Override
    public Gamma visitDefinitionLeft(ACSPParser.DefinitionLeftContext ctx) {
        return ctx.children.stream().map(c -> visit(c)).filter(Gamma::notEmpty).reduce((r, t) -> r.merge(t)).orElse(empty);
    }

    @Override
    public Gamma visitTerminal(TerminalNode node) {
        return empty;
    }

    @Override
    public Gamma visitType(ACSPParser.TypeContext ctx) {
        return ctx.children.stream().map(c -> visit(c)).filter(Gamma::notEmpty).reduce((r, t) -> r.merge(t)).orElse(empty);
    }

    @Override
    public Gamma visitSimple(ACSPParser.SimpleContext ctx) {
        return ctx.children.stream().map(c -> visit(c)).filter(Gamma::notEmpty).reduce((r, t) -> r.merge(t)).orElse(empty);
    }

    @Override
    public Gamma visitBoolExp(ACSPParser.BoolExpContext ctx) {
        return ctx.children.stream().map(c -> visit(c)).filter(Gamma::notEmpty).reduce((r, t) -> r.merge(t)).orElse(empty);
    }

    @Override
    public Gamma visitBoolOrAmb(ACSPParser.BoolOrAmbContext ctx) {
        return ctx.children.stream().map(c -> visit(c)).filter(Gamma::notEmpty).reduce((r, t) -> r.merge(t)).orElse(empty);
    }

    @Override
    public Gamma visitExpr(ACSPParser.ExprContext ctx) {
        return ctx.children.stream().map(c -> visit(c)).filter(Gamma::notEmpty).reduce((r, t) -> r.merge(t)).orElse(empty);
    }

    @Override
    public Gamma visitNumber(ACSPParser.NumberContext ctx) {
        return ctx.children.stream().map(c -> visit(c)).filter(Gamma::notEmpty).reduce((r, t) -> r.merge(t)).orElse(empty);
    }

    @Override
    public Gamma visitLocOutput(ACSPParser.LocOutputContext ctx) {
        Gamma proc = visit(ctx.getChild(0));
        Gamma cont = visit(ctx.getChild(1));

        if(proc != null && cont != null && proc.isEmpty()){
            String text = ctx.ID().getSymbol().getText();
            cont.addIn(text);

           return cont;
        } else {
            errors.add("A process being communicated over " + ctx.ID() +" was not well-typed at \n"+ ctx.getText());
            return null;
        }

    }

    @Override
    public Gamma visitParallelProc(ACSPParser.ParallelProcContext ctx) {
        Gamma left = visit(ctx.proc(0));
        Gamma right = visit(ctx.proc(1));
        Gamma L = visit(ctx.channelNames());
        Gamma gamma =  left.merge(right);

        gamma.in.removeAll(L.in);
        gamma.out.removeAll(L.out);

        boolean cond1= left.in.stream().filter(right.out::contains).allMatch(L.in::contains);
        boolean cond2= left.out.stream().filter(right.in::contains).allMatch(L.in::contains);
        boolean cond3 = !(left.in.stream().anyMatch(right.in::contains));

        if(cond1 && cond2 && cond3)
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

            return empty;
        }
    }

    @Override
    public Gamma visitSpec(ACSPParser.SpecContext ctx) {
        return ctx.children.stream().map(c -> visit(c)).filter(Gamma::notEmpty).reduce((r, t) -> r.merge(t)).orElse(empty);
    }

    @Override
    public Gamma visitDefinition(ACSPParser.DefinitionContext ctx) {
        return super.visitDefinition(ctx);
    }

    @Override
    public Gamma visitChannelDecl(ACSPParser.ChannelDeclContext ctx) {
        return ctx.children.stream().map(c -> visit(c)).filter(Gamma::notEmpty).reduce((r, t) -> r.merge(t)).orElse(empty);
    }

    @Override
    public Gamma visitChannelColonType(ACSPParser.ChannelColonTypeContext ctx) {
        return ctx.children.stream().map(c -> visit(c)).filter(Gamma::notEmpty).reduce((r, t) -> r.merge(t)).orElse(empty);
    }

    @Override
    public Gamma visitAny(ACSPParser.AnyContext ctx) {
        return ctx.children.stream().map(c -> visit(c)).filter(Gamma::notEmpty).reduce((r,t) -> r.merge(t)).orElse(empty);
    }

    @Override
    public Gamma visitCheckConditionBody(ACSPParser.CheckConditionBodyContext ctx) {
        return ctx.children.stream().map(c -> visit(c)).filter(Gamma::notEmpty).reduce((r, t) -> r.merge(t)).orElse(empty);
    }

    @Override
    public Gamma visitModelCheckType(ACSPParser.ModelCheckTypeContext ctx) {
        return ctx.children.stream().map(c -> visit(c)).filter(Gamma::notEmpty).reduce((r, t) -> r.merge(t)).orElse(empty);
    }

    @Override
    public Gamma visitSet(ACSPParser.SetContext ctx) {
        return ctx.children.stream().map(c -> visit(c)).filter(Gamma::notEmpty).reduce((r, t) -> r.merge(t)).orElse(empty);
    }

    @Override
    public Gamma visitProc(ACSPParser.ProcContext ctx) {
        return ctx.children.stream().map(c ->visit(c)).filter(Gamma::notEmpty).reduce((r,t) -> r.merge(t)).orElse(empty);
    }

    @Override
    public Gamma visitDataTypeDefinition(ACSPParser.DataTypeDefinitionContext ctx) {
        return ctx.children.stream().map(c -> visit(c)).filter(Gamma::notEmpty).reduce((r, t) -> r.merge(t)).orElse(empty);
    }

    @Override
    public Gamma visitSetComprehension(ACSPParser.SetComprehensionContext ctx) {
        return ctx.children.stream().map(c -> visit(c)).filter(Gamma::notEmpty).reduce((r, t) -> r.merge(t)).orElse(empty);
    }

    @Override
    public Gamma visitEvent(ACSPParser.EventContext ctx) {
        return ctx.children.stream().map(c -> visit(c)).filter(Gamma::notEmpty).reduce((r, t) -> r.merge(t)).orElse(empty);
    }

    @Override
    public Gamma visitFuncImport(ACSPParser.FuncImportContext ctx) {
        return ctx.children.stream().map(c -> visit(c)).filter(Gamma::notEmpty).reduce((r, t) -> r.merge(t)).orElse(empty);
    }

    @Override
    protected Gamma aggregateResult(Gamma aggregate, Gamma nextResult) {
        return (aggregate == null ? empty :aggregate).merge(nextResult);
    }


    public  class Gamma {
        HashSet<String> in = new HashSet<>();
        HashSet<String> out = new HashSet<>();

        public void addIn(String text){
            in.add(text);
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