import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ACSPTypeChecker extends ACSPBaseVisitor<ACSPTypeChecker.InOut> {

    List<String> errors = new ArrayList<>();

    @Override
    public InOut visitLocProcess(ACSPParser.LocProcessContext ctx) {
        InOut res = visitChildren(ctx);

        if(res != null && res.isEmpty()){
            String text = ctx.ID().getSymbol().getText();
            res.addIn(text);
            return res;
        }

        return res;
    }

    @Override
    public InOut visitChannelNames(ACSPParser.ChannelNamesContext ctx) {
        List<String> names = Arrays.asList(ctx.getText().split(","));

        InOut inOut = new InOut();
        inOut.in = new HashSet<>(names);
        inOut.out = new HashSet<>(names);

        return inOut;
    }

    @Override
    public InOut visitSimpleDefinition(ACSPParser.SimpleDefinitionContext ctx) {
        return visit(ctx.getChild(2));
    }

    @Override
    public InOut visitAssertDefinition(ACSPParser.AssertDefinitionContext ctx) {
        return new InOut();
    }

    @Override
    public InOut visitRefinedBy(ACSPParser.RefinedByContext ctx) {
        return new InOut();
    }

    @Override
    public InOut visitDefinitionLeft(ACSPParser.DefinitionLeftContext ctx) {
        return new InOut();
    }

    @Override
    public InOut visitDefnCallLeft(ACSPParser.DefnCallLeftContext ctx) {
        return new InOut();
    }


    @Override
    public InOut visitType(ACSPParser.TypeContext ctx) {
        return new InOut();
    }

    @Override
    public InOut visitSimple(ACSPParser.SimpleContext ctx) {
        return new InOut();
    }
    
//    @Override
//    public InOut visitTerminalProc(ACSPParser.TerminalProcContext ctx) {
//        return new InOut();
//    }

    @Override
    public InOut visitBoolExp(ACSPParser.BoolExpContext ctx) {
        return new InOut();
    }

    @Override
    public InOut visitBoolOrAmb(ACSPParser.BoolOrAmbContext ctx) {
        return new InOut();
    }

    @Override
    public InOut visitExpr(ACSPParser.ExprContext ctx) {
        return new InOut();
    }

    @Override
    public InOut visitNumber(ACSPParser.NumberContext ctx) {
        return new InOut();
    }

    @Override
    public InOut visitComment(ACSPParser.CommentContext ctx) {
        return new InOut();
    }

    @Override
    public InOut visitLocOutput(ACSPParser.LocOutputContext ctx) {
        InOut proc = visit(ctx.getChild(0));
        InOut cont = visit(ctx.getChild(1));

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
    public InOut visitParallelProc(ACSPParser.ParallelProcContext ctx) {
        InOut left = visit(ctx.proc(0));
        InOut right = visit(ctx.proc(1));
        InOut L = visit(ctx.channelNames());
        InOut gamma = new InOut();

        gamma.in.addAll(left.in);
        gamma.in.addAll(right.in);
        gamma.in.removeAll(L.in);

        gamma.out.addAll(left.out);
        gamma.out.addAll(right.out);
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



            return null;
        }
    }

    @Override
    public InOut visitSpec(ACSPParser.SpecContext ctx) {
        return super.visitSpec(ctx);
    }

    @Override
    public InOut visitDefinition(ACSPParser.DefinitionContext ctx) {
        return super.visitDefinition(ctx);
    }

    @Override
    public InOut visitChannelDecl(ACSPParser.ChannelDeclContext ctx) {
        return super.visitChannelDecl(ctx);
    }

    @Override
    public InOut visitChannelColonType(ACSPParser.ChannelColonTypeContext ctx) {
        return super.visitChannelColonType(ctx);
    }


    @Override
    public InOut visitAny(ACSPParser.AnyContext ctx) {
        return super.visitAny(ctx);
    }

    @Override
    public InOut visitCheckConditionBody(ACSPParser.CheckConditionBodyContext ctx) {
        return super.visitCheckConditionBody(ctx);
    }

    @Override
    public InOut visitModelCheckType(ACSPParser.ModelCheckTypeContext ctx) {
        return super.visitModelCheckType(ctx);
    }

    @Override
    public InOut visitSet(ACSPParser.SetContext ctx) {
        return super.visitSet(ctx);
    }

    @Override
    public InOut visitProc(ACSPParser.ProcContext ctx) {
        return super.visitProc(ctx);
    }

    public List<String> getErrors() {
        return errors;
    }

    public class InOut{
        HashSet<String> in = new HashSet<>();
        HashSet<String> out = new HashSet<>();

        public void addIn(String text){
            in.add(text);
        }

        public boolean isEmpty(){
            return in.isEmpty() && out.isEmpty();
        }
    }

}
