public class ACSPTranslatorVisitor extends ACSPBaseVisitor<String> {

    @Override
    public String visitSpec(ACSPParser.SpecContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitDefinition(ACSPParser.DefinitionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitChannelDecl(ACSPParser.ChannelDeclContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitChannelNames(ACSPParser.ChannelNamesContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitChannelColonType(ACSPParser.ChannelColonTypeContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitSimpleDefinition(ACSPParser.SimpleDefinitionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitAssertDefinition(ACSPParser.AssertDefinitionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitDefinitionLeft(ACSPParser.DefinitionLeftContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitDefnCallLeft(ACSPParser.DefnCallLeftContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitAny(ACSPParser.AnyContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitCheckConditionBody(ACSPParser.CheckConditionBodyContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitModelCheckType(ACSPParser.ModelCheckTypeContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitType(ACSPParser.TypeContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitSimple(ACSPParser.SimpleContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitSet(ACSPParser.SetContext ctx) {
        return visitChildren(ctx) ;
    }

    @Override
    public String visitProc(ACSPParser.ProcContext ctx) {

        return visitChildren(ctx);
    }

    @Override
    public String visitBoolExp(ACSPParser.BoolExpContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitBoolOrAmb(ACSPParser.BoolOrAmbContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitExpr(ACSPParser.ExprContext ctx) {
        return visitChildren(ctx) ;
    }

    @Override
    public String visitNumber(ACSPParser.NumberContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitComment(ACSPParser.CommentContext ctx) {
        return visitChildren(ctx);
    }
}
