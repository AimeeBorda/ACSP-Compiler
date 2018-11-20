import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.IOException;
import java.util.*;


public class ACSPTranslator extends ACSPBaseVisitor<String> {

    private TokenStream commonTokenStream;
    private HashMap<String, LinkedHashSet<String>> locations;
    public String cspProcess;

    public ACSPTranslator(ACSPParser parser){
        this(parser, new HashMap<>());

        if(!cspProcess.contains("transparent normal")){
            cspProcess = "transparent normal \n\n" + cspProcess;
        }
        cspProcess += "\n\n"+ locDeclaration()+getMaps();
    }

    public ACSPTranslator(ACSPParser parser,HashMap<String, LinkedHashSet<String>> locations){
        this.locations =locations;
        this.commonTokenStream = parser.getTokenStream();

        cspProcess = visit(parser.spec());

    }

    private String locDeclaration() {
        StringBuilder res = new StringBuilder();
        for(Map.Entry entry : locations.entrySet()){
            res.append(String.format("channel %s : {0..%d}\n", entry.getKey(),((LinkedHashSet)entry.getValue()).size() -1));
        }

        return res.toString()+"\n";
    }


    private String getMaps() {
        StringBuilder res = new StringBuilder();
        for(Map.Entry en : locations.entrySet()){
            Iterator<String> e = ((LinkedHashSet<String>) en.getValue()).iterator();

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
        String loc = visit(ctx.ID()).trim();

        locations.putIfAbsent(loc, new LinkedHashSet<>());
        LinkedHashSet<String> processes = locations.get(loc);
        String hoOutput = visit(ctx.proc(0));

        processes.add(hoOutput);

        return " "+ctx.ID()+"!"+new ArrayList<String>(processes).indexOf(hoOutput) + " -> "+visit(ctx.proc(1));
    }

    @Override
    public String visitParallelProc(ACSPParser.ParallelProcContext ctx) {
        String L = visit(ctx.locNames());
        String M = visit(ctx.proc(0));
        String N = visit(ctx.proc(1));
        String A = "{|"+L+"|}";
        String E = "";
        if(ctx.set() != null) {
            E = "union("+ visit(ctx.set())+","+A +")";
        }else{
            E = A;
        }
        return " normal((" +M +"[|"+E+"|]"+N +") \\ " + A+")";
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

    @Override
    public String visitIncludeFile(ACSPParser.IncludeFileContext ctx) {
        String fileName = ACSPTypeChecker.getFileName(ctx);
        try {
            ACSPTranslator translator = new ACSPTranslator(new ACSPParser(new CommonTokenStream(new ACSPLexer(CharStreams.fromFileName(fileName)))), this.locations);

            return "\n -- File " + fileName +"\n"+translator.cspProcess +"\n";
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }


    //TODO: Replicated Operators
    //TODO: Advanced Operators
    //TODO: comments
    //TODO: lambda expressions
}
