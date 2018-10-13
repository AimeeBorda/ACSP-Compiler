public class ACSPTranslatorVisitor extends ACSPBaseVisitor<String> {

    @Override
    public String visitSkipCmd(ACSPParser.SkipCmdContext ctx) {
        return "SKIP";
    }

    @Override
    public String visitChoiceCmd(ACSPParser.ChoiceCmdContext ctx) {
        return super.visitChoiceCmd(ctx);
    }

    @Override
    public String visitIfCmd(ACSPParser.IfCmdContext ctx) {
        return super.visitIfCmd(ctx);
    }

    @Override
    public String visitParallelCmd(ACSPParser.ParallelCmdContext ctx) {
        return super.visitParallelCmd(ctx);
    }

    @Override
    public String visitScopeCmd(ACSPParser.ScopeCmdContext ctx) {
        return super.visitScopeCmd(ctx);
    }

    @Override
    public String visitOutputCmd(ACSPParser.OutputCmdContext ctx) {
        return super.visitOutputCmd(ctx);
    }

    @Override
    public String visitLocCmd(ACSPParser.LocCmdContext ctx) {
        return super.visitLocCmd(ctx);
    }

    @Override
    public String visitFuncCall(ACSPParser.FuncCallContext ctx) {
        return super.visitFuncCall(ctx);
    }

    @Override
    public String visitFuncDefn(ACSPParser.FuncDefnContext ctx) {
        return super.visitFuncDefn(ctx);
    }

    @Override
    public String visitStatement(ACSPParser.StatementContext ctx) {
        return super.visitStatement(ctx);
    }
}
