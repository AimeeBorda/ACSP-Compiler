import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;


public class ACSPTranslatorVisitor extends ACSPBaseVisitor<String> {

    private final TokenStream commonTokenStream;
    private HashMap<String, TreeSet<String>> locations;

    public ACSPTranslatorVisitor(TokenStream commonTokenStream){
        this.locations = new HashMap<>();
        this.commonTokenStream = commonTokenStream;
    }


    @Override
    public String visitSpec(ACSPParser.SpecContext ctx) {
        String translation = ctx.children.stream().map(c ->visit(c)).collect(Collectors.joining());
        if(!translation.contains("transparent normal")){
            translation = "transparent normal \n\n"+ translation;
        }
        return translation+ "\n\n"+ locDeclaration()+getMaps();
    }

    private String locDeclaration() {
        StringBuilder res = new StringBuilder();
        for(Map.Entry entry : locations.entrySet()){
            res.append(String.format("channel %s : {1..%d}\n", entry.getKey(),((TreeSet)entry.getValue()).size()));
        }

        return res.toString()+"\n";
    }


    private String getMaps() {
        StringBuilder res = new StringBuilder();
        for(Map.Entry en : locations.entrySet()){
            Iterator<String> e = ((TreeSet<String>) en.getValue()).iterator();

            for (int i = 1; e.hasNext(); i++) {
                res.append(String.format("if chName == %s and id == %d then %s \nelse ",en.getKey().toString(),i,e.next()));
            }
        }
        res.append( "SKIP");

        return locations.size() > 0 ? "map = \\ chName,id @ "+res : "";
    }

    @Override
    public String visitChannelDecl(ACSPParser.ChannelDeclContext ctx) {
        return ctx.children.stream().map(c ->visit(c)).collect(Collectors.joining(""));
    }


    @Override
    public String visitChannelColonType(ACSPParser.ChannelColonTypeContext ctx) {
        return ctx.children.stream().map(c ->visit(c)).collect(Collectors.joining(""));
    }



    @Override
    public String visitAssertDefinition(ACSPParser.AssertDefinitionContext ctx) {
        return ctx.children.stream().map(c ->visit(c)).collect(Collectors.joining(""));
    }


    @Override
    public String visitDefinitionLeft(ACSPParser.DefinitionLeftContext ctx) {
        return ctx.children.stream().map(c ->visit(c)).collect(Collectors.joining(""));
    }

    @Override
    public String visitCheckConditionBody(ACSPParser.CheckConditionBodyContext ctx) {
        return  ctx.children.stream().map(c ->visit(c)).collect(Collectors.joining(""));
    }

    @Override
    public String visitSet(ACSPParser.SetContext ctx) {
        return ctx.children.stream().map(c ->visit(c)).collect(Collectors.joining(""));
    }


    @Override
    public String visitLocProcess(ACSPParser.LocProcessContext ctx) {
        return
        "let R = "+ctx.ID()+"?id -> (map("+ctx.ID()+",id) /\\ R) \n within ("+visit(ctx.proc()) + "/\\ R)";
    }

    @Override
    public String visitLocOutput(ACSPParser.LocOutputContext ctx) {
        locations.putIfAbsent(ctx.ID().getText(),new TreeSet<>());
        TreeSet<String> processes = locations.get(ctx.ID().getText());
        String hoOutput = visit(ctx.proc(0));

        processes.add(hoOutput);
        return ctx.ID()+"!"+processes.headSet(hoOutput).size() + " -> "+visit(ctx.proc(1));
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

        return ctx.children.stream().map(c ->visit(c)).collect(Collectors.joining());
    }

    @Override
    public String visitTerminal(TerminalNode node) {
        String res = "";
        if(node.getSymbol().getTokenIndex() > 0) {
            Token previous = commonTokenStream.get(node.getSymbol().getTokenIndex() - 1);
            res += previous.getType() ==ACSPLexer.WS?previous.getText() :"";
            //res += previous.getType() ==ACSPLexer.LINECOMMENT?"BAJGJASDFASJDFA":"";
        }
        return res+node.getSymbol().getText();
    }



    //    @Override
//    public String visitIfStat(ACSPParser.IfStatContext ctx) {
//        return visit(ctx.IF()) +" " + visit(ctx.boolExp()) +"\n"
//                    + visit(ctx.THEN()) +" "+ visit(ctx.proc(0)) +"\n"+
//                 visit(ctx.ELSE()) +" "+ visit(ctx.proc(1)) +"\n";
//    }
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
        return ctx.children.stream().map(c ->visit(c)).collect(Collectors.joining(""));
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
        return ctx.children.stream().map(c ->visit(c)).collect(Collectors.joining(""));
    }

//    @Override
//    public String visitSimple(ACSPParser.SimpleContext ctx) {
//        return super.visitSimple(ctx);
//    }

    @Override
    public String visitProc(ACSPParser.ProcContext ctx) {
        return ctx.children.stream().map(c ->visit(c)).collect(Collectors.joining(""));
    }

//    @Override
//    public String visitEventHide(ACSPParser.EventHideContext ctx) {
//        return ctx.children.stream().map(c ->visit(c)).collect(Collectors.joining(""));
//    }

//    @Override
//    public String visitChxProc(ACSPParser.ChxProcContext ctx) {
//        return ctx.children.stream().map(c ->visit(c)).collect(Collectors.joining(""));
//    }


//    @Override
//    public String visitPrfProc(ACSPParser.PrfProcContext ctx) {
//        return ctx.children.stream().map(c ->visit(c)).collect(Collectors.joining(""));
//    }

//    @Override
//    public String visitTerminalProc(ACSPParser.TerminalProcContext ctx) {
//        return super.visitTerminalProc(ctx);
//    }

    @Override
    public String visitBoolExp(ACSPParser.BoolExpContext ctx) {
        return ctx.children.stream().map(c ->visit(c)).collect(Collectors.joining(""));
    }


//    @Override
//    public String visitBoolOrAmb(ACSPParser.BoolOrAmbContext ctx) {
//        return super.visitBoolOrAmb(ctx);
//    }

    @Override
    public String visitExpr(ACSPParser.ExprContext ctx) {
        return ctx.children.stream().map(c ->visit(c)).collect(Collectors.joining(""));
    }
//
//    @Override
//    public String visitComment(ACSPParser.CommentContext ctx) {
//        return super.visitComment(ctx);
//    }
//

//    @Override
//    public String visitCspProc(ACSPParser.CspProcContext ctx) {
//        return ctx.children.stream().map(c ->visit(c)).collect(Collectors.joining(""));
//    }


//    @Override
//    public String visitInclude(ACSPParser.IncludeContext ctx) {
//
//        Translation r = null;
//        try {
//            String fileName = visit(ctx.ID());
//
//            r = new Translation(fileName +".csp");
//            r.translate();
//
//
//            return "include "+fileName+".csp";
//        } catch (IOException e) { }
//
//        return "";
//    }

    @Override
    public String visitEvent(ACSPParser.EventContext ctx) {
        return ctx.children.stream().map(c ->visit(c)).collect(Collectors.joining(""));
    }

    @Override
    public String visitSetComprehension(ACSPParser.SetComprehensionContext ctx) {
        return ctx.children.stream().map(c ->visit(c)).collect(Collectors.joining(""));
    }

//TODO: Replicated Operators
    //TODO: Advanced Operators
    //TODO: include commands
}
