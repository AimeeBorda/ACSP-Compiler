import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ACSPTranslatorVisitor extends ACSPBaseVisitor<String> {

    HashMap<String, ArrayList<String>> locations = new HashMap<>();

    @Override
    public String visitSpec(ACSPParser.SpecContext ctx) {
        return "transparent normal \n\n"+super.visitSpec(ctx) + "\n\n"+ locDeclaration()+getMaps();
    }

    private String locDeclaration() {
        StringBuilder res = new StringBuilder();
        for(Map.Entry entry : locations.entrySet()){
            res.append(String.format("channel %s : {0..%d}\n", entry.getKey(),((ArrayList)entry.getValue()).size()));
        }

        return res.toString()+"\n";
    }


    private String getMaps() {
        StringBuilder res = new StringBuilder();
        for(Map.Entry en : locations.entrySet()){
            ArrayList<String>e = (ArrayList<String>) en.getValue();
            for (int i = 0; i < e.size(); i++) {

                res.append(String.format("if l == %s and id == %d then %s \nelse ",en.getKey().toString(),i,e.get(i)));
            }
        }
        res.append( "SKIP");

        return locations.size() > 0 ? "map = \\ l,id @ "+res : "";
    }

    @Override
    public String visitChannelDecl(ACSPParser.ChannelDeclContext ctx) {
        return ctx.children.stream().map(c ->visit(c)).collect(Collectors.joining(" "));
    }


    @Override
    public String visitChannelColonType(ACSPParser.ChannelColonTypeContext ctx) {
        return ctx.children.stream().map(c ->visit(c)).collect(Collectors.joining(" "));
    }



    @Override
    public String visitAssertDefinition(ACSPParser.AssertDefinitionContext ctx) {
        if(ctx.refinedBy() == null){
            return visit(ctx.ASSERT()) +" "+ visit(ctx.definitionLeft(0)) +" "+visit(ctx.COLLON()) +visit(ctx.LBRACKET()) + visit(ctx.checkConditionBody())+ visit(ctx.RBRACKET());
        }else{
            return visit(ctx.ASSERT()) +" "+visit(ctx.definitionLeft(0))+ "  "+visit(ctx.refinedBy()) +" "+ visit(ctx.definitionLeft(1));
        }
    }


    @Override
    public String visitDefinitionLeft(ACSPParser.DefinitionLeftContext ctx) {
        if(ctx.LPAREN() == null){

            return visit(ctx.defnCallLeft());
        }else{
            return visit(ctx.defnCallLeft()) + visit(ctx.LPAREN()) + ctx.any().stream().map(c -> visit(c)).collect(Collectors.joining( " ")) + visit(ctx.RPAREN());
        }
    }

    @Override
    public String visitCheckConditionBody(ACSPParser.CheckConditionBodyContext ctx) {
        return    (ctx.DEADLOCK() != null ? ctx.DEADLOCK().getText() :"")
                + (ctx.DIVERGENCE() != null ? ctx.DIVERGENCE().getText():"")
                + (ctx.DETERMINISTIC() != null ? ctx.DETERMINISTIC().getText():"")
                + (ctx.FREE() != null ? ctx.FREE().getText() :"")
                + (ctx.modelCheckType()!= null?visit(ctx.modelCheckType()):"");

    }

    @Override
    public String visitSet(ACSPParser.SetContext ctx) {

        String join = ",";
        if(ctx.DOT().size() > 0){
            join = "..";
        }

        return visit(ctx.LBRACE()) + ctx.any().stream().map(c -> visit(c)).collect(Collectors.joining(join)) + visit(ctx.RBRACE());
    }


    @Override
    public String visitLocProcess(ACSPParser.LocProcessContext ctx) {
        return "let R = ("+ctx.ID()+"?id -> (map("+ctx.ID()+",id) /\\ R)) within "+visit(ctx.proc()) + "/\\ R";
    }

    @Override
    public String visitLocOutput(ACSPParser.LocOutputContext ctx) {
        locations.putIfAbsent(ctx.ID().getText(),new ArrayList<>());
        ArrayList<String> processes = locations.get(ctx.ID().getText());
        processes.add(visit(ctx.proc(0)));

        return ctx.ID()+"!"+processes.size() + " -> "+visit(ctx.proc(1));
    }

    @Override
    public String visitParallelProc(ACSPParser.ParallelProcContext ctx) {
        String L = visit(ctx.channelNames());
        String M = visit(ctx.proc(0));
        String N = visit(ctx.proc(1));
        String E = visit(ctx.set());
        String A = "{|"+L+"|}";
        return "normal((" +M +"[|union("+E +","+A +")|]"+N +") \\ " + A+")";
    }

    @Override
    public String visitNumber(ACSPParser.NumberContext ctx) {
        return ctx.DIGIT().stream().map(c -> visit(c)).collect(Collectors.joining());
    }

    @Override
    public String visitTerminal(TerminalNode node) {
        return node.toString();
    }

    @Override
    public String visitIfStat(ACSPParser.IfStatContext ctx) {
        return visit(ctx.IF()) +" " + visit(ctx.boolExp()) +"\n"
                    + visit(ctx.THEN()) +" "+ visit(ctx.proc(0)) +"\n"+
                 visit(ctx.ELSE()) +" "+ visit(ctx.proc(1)) +"\n";
    }
//
//    @Override
//    public String visitDefinition(ACSPParser.DefinitionContext ctx) {
//        return super.visitDefinition(ctx);
//    }

//    @Override
//    public String visitChannelNames(ACSPParser.ChannelNamesContext ctx) {
//        return super.visitChannelNames(ctx);
//    }

    @Override
    public String visitSimpleDefinition(ACSPParser.SimpleDefinitionContext ctx) {
        return ctx.children.stream().map(c ->visit(c)).collect(Collectors.joining(" "));
    }

//    @Override
//    public String visitRefinedBy(ACSPParser.RefinedByContext ctx) {
//        return super.visitRefinedBy(ctx);
//    }

//    @Override
//    public String visitDefnCallLeft(ACSPParser.DefnCallLeftContext ctx) {
//        return super.visitDefnCallLeft(ctx);
//    }

//    @Override
//    public String visitAny(ACSPParser.AnyContext ctx) {
//        return super.visitAny(ctx);
//    }

//    @Override
//    public String visitModelCheckType(ACSPParser.ModelCheckTypeContext ctx) {
//        return super.visitModelCheckType(ctx);
//    }

    @Override
    public String visitType(ACSPParser.TypeContext ctx) {
        return ctx.children.stream().map(c ->visit(c)).collect(Collectors.joining(" "));
    }

//    @Override
//    public String visitSimple(ACSPParser.SimpleContext ctx) {
//        return super.visitSimple(ctx);
//    }

//    @Override
//    public String visitProc(ACSPParser.ProcContext ctx) {
//        return super.visitProc(ctx);
//    }

    @Override
    public String visitEventHide(ACSPParser.EventHideContext ctx) {
        return ctx.children.stream().map(c ->visit(c)).collect(Collectors.joining(" "));
    }

    @Override
    public String visitChxProc(ACSPParser.ChxProcContext ctx) {
        return ctx.children.stream().map(c ->visit(c)).collect(Collectors.joining(" "));
    }


    @Override
    public String visitPrfProc(ACSPParser.PrfProcContext ctx) {
        return ctx.children.stream().map(c ->visit(c)).collect(Collectors.joining(" "));
    }

//    @Override
//    public String visitTerminalProc(ACSPParser.TerminalProcContext ctx) {
//        return super.visitTerminalProc(ctx);
//    }

    @Override
    public String visitBoolExp(ACSPParser.BoolExpContext ctx) {
        return ctx.children.stream().map(c ->visit(c)).collect(Collectors.joining(" "));
    }

//    @Override
//    public String visitBoolOrAmb(ACSPParser.BoolOrAmbContext ctx) {
//        return super.visitBoolOrAmb(ctx);
//    }

    @Override
    public String visitExpr(ACSPParser.ExprContext ctx) {
        return ctx.children.stream().map(c ->visit(c)).collect(Collectors.joining(" "));
    }
//
//    @Override
//    public String visitComment(ACSPParser.CommentContext ctx) {
//        return super.visitComment(ctx);
//    }
//

    @Override
    public String visitCspProc(ACSPParser.CspProcContext ctx) {
        return ctx.children.stream().map(c ->visit(c)).collect(Collectors.joining(" "));
    }
}