import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.util.HashMap;
import java.util.stream.Collectors;

public class ACSPPreProcessor extends ACSPBaseVisitor<Environment> {

    HashMap<String,Environment> envMap;

    public ACSPPreProcessor(ACSPParser parser) {
        this(parser, new HashMap<>());
    }

    public ACSPPreProcessor(ACSPParser parser, HashMap<String, Environment> envMap) {
        this.envMap = envMap;
        visit(parser.spec());
    }


    @Override
    public Environment visitLocProcess(ACSPParser.LocProcessContext ctx) {
        return visit(ctx.proc()).in(ctx.ID().getText().trim());
    }

    @Override
    public Environment visitSimpleDefinition(ACSPParser.SimpleDefinitionContext ctx) {
        String key = ctx.definitionLeft().ID().getText();
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
        ctx.ID().stream().map(l -> l.getText()).forEach(l ->{
            g.out(l);
            g.in(l);
        });
        return g;
    }

    @Override
    public Environment visitParallelProc(ACSPParser.ParallelProcContext ctx) {
        return visit(ctx.proc(0)).merge(visit(ctx.proc(1)));
    }

    @Override
    public Environment visitLetProc(ACSPParser.LetProcContext ctx) {
        ctx.simpleDefinition().stream().forEach(c -> visit(c));
        Environment withinStat = visit(ctx.any());

        for(ACSPParser.SimpleDefinitionContext c : ctx.simpleDefinition()){
            envMap.remove(c.definitionLeft().ID().getText());
        }

        return withinStat;
    }

    @Override
    public Environment visitDefinitionLeft(ACSPParser.DefinitionLeftContext ctx) {
        Environment res = ctx.children.stream().map(c ->visit(c)).reduce((r,t) -> r = r.merge(t)).orElse(defaultResult());
        return res.call(ctx.ID().getText().trim());
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
            String fileName = getFileName(ctx);
            new ACSPPreProcessor(new ACSPParser(new CommonTokenStream(new ACSPLexer(CharStreams.fromFileName(fileName)))), envMap);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return defaultResult();
    }


    public static String getFileName(ACSPParser.IncludeFileContext ctx){
        return ctx.ID().stream().map(c -> c.getText().trim()).collect(Collectors.joining("/")) +".acsp";
    }

}