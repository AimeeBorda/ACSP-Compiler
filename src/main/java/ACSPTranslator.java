import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;


public class ACSPTranslator extends ACSPBaseVisitor<String> {

    private TokenStream commonTokenStream;
    private HashMap<String, TreeSet<String>> locations;
    public String cspProcess;

    public ACSPTranslator(ACSPParser parser){
        this.locations = new HashMap<>();
        this.commonTokenStream = parser.getTokenStream();

        cspProcess = visit(parser.spec());
        if(!cspProcess.contains("transparent normal")){
            cspProcess = "transparent normal \n\n" + cspProcess;
        }
        cspProcess += "\n\n"+ locDeclaration()+getMaps();
    }

    private String locDeclaration() {
        StringBuilder res = new StringBuilder();
        for(Map.Entry entry : locations.entrySet()){
            res.append(String.format("channel %s : {0..%d}\n", entry.getKey(),((TreeSet)entry.getValue()).size()));
        }

        return res.toString()+"\n";
    }


    private String getMaps() {
        StringBuilder res = new StringBuilder();
        for(Map.Entry en : locations.entrySet()){
            Iterator<String> e = ((TreeSet<String>) en.getValue()).iterator();

            for (int i = 0; e.hasNext(); i++) {
                res.append(String.format("if chName == %s and id == %d then %s \nelse ",en.getKey().toString(),i,e.next()));
            }
        }
        res.append( "SKIP");

        return locations.size() > 0 ? "map = \\ chName,id @ "+res : "";
    }

    @Override
    public String visitLocProcess(ACSPParser.LocProcessContext ctx) {
        return
        "let R = "+ctx.ID()+"?id -> (map("+ctx.ID()+",id) /\\ R) \n within ("+visit(ctx.proc()) + "/\\ R)";
    }

    @Override
    public String visitLocOutput(ACSPParser.LocOutputContext ctx) {
        String loc = visit(ctx.ID());
        locations.putIfAbsent(loc, new TreeSet<>());
        TreeSet<String> processes = locations.get(loc);
        String hoOutput = visit(ctx.proc(0));

        processes.add(hoOutput);
        return " "+ctx.ID()+"!"+processes.headSet(hoOutput).size() + " -> "+visit(ctx.proc(1));
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
    public String visitTerminal(TerminalNode node) {
        String res = "";
        if(node.getSymbol().getTokenIndex() > 0) {
            Token previous = commonTokenStream.get(node.getSymbol().getTokenIndex() - 1);
            res += previous.getType() ==ACSPLexer.WS?previous.getText() :"";
        }
        return res+node.getSymbol().getText();
    }

    @Override
    protected String aggregateResult(String aggregate, String nextResult) {
        return (aggregate == null ? "" : aggregate)+ (nextResult == null?"":nextResult);
    }

    //TODO: Replicated Operators
    //TODO: Advanced Operators
    //TODO: include
    //TODO: comments
}
