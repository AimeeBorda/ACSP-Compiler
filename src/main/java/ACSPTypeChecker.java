import java.util.ArrayList;
import java.util.List;

public class ACSPTypeChecker extends ACSPBaseVisitor<Boolean> {

    public List<String> getErrors() {
        return errors;
    }

    private List<String> errors = new ArrayList<String>();

    @Override
    public Boolean visitSpec(ACSPParser.SpecContext ctx) {
        return true;// super.visitSpec(ctx);
    }

    @Override
    public Boolean visitDefinition(ACSPParser.DefinitionContext ctx) {
        return super.visitDefinition(ctx);
    }

    @Override
    public Boolean visitChannelDecl(ACSPParser.ChannelDeclContext ctx) {
        return super.visitChannelDecl(ctx);
    }

    @Override
    public Boolean visitChannelNames(ACSPParser.ChannelNamesContext ctx) {
        return super.visitChannelNames(ctx);
    }

    @Override
    public Boolean visitChannelColonType(ACSPParser.ChannelColonTypeContext ctx) {
        return super.visitChannelColonType(ctx);
    }

    @Override
    public Boolean visitSimpleDefinition(ACSPParser.SimpleDefinitionContext ctx) {
        return super.visitSimpleDefinition(ctx);
    }

    @Override
    public Boolean visitAssertDefinition(ACSPParser.AssertDefinitionContext ctx) {
        return true;
    }

    @Override
    public Boolean visitRefinedBy(ACSPParser.RefinedByContext ctx) {
        return super.visitRefinedBy(ctx);
    }

    @Override
    public Boolean visitDefinitionLeft(ACSPParser.DefinitionLeftContext ctx) {
        return super.visitDefinitionLeft(ctx);
    }

    @Override
    public Boolean visitDefnCallLeft(ACSPParser.DefnCallLeftContext ctx) {
        return super.visitDefnCallLeft(ctx);
    }

    @Override
    public Boolean visitAny(ACSPParser.AnyContext ctx) {
        return super.visitAny(ctx);
    }

    @Override
    public Boolean visitCheckConditionBody(ACSPParser.CheckConditionBodyContext ctx) {
        return super.visitCheckConditionBody(ctx);
    }

    @Override
    public Boolean visitModelCheckType(ACSPParser.ModelCheckTypeContext ctx) {
        return super.visitModelCheckType(ctx);
    }

    @Override
    public Boolean visitType(ACSPParser.TypeContext ctx) {
        return true;
    }

    @Override
    public Boolean visitSimple(ACSPParser.SimpleContext ctx) {
        return true;
    }

    @Override
    public Boolean visitSet(ACSPParser.SetContext ctx) {
        return true;
    }

    @Override
    public Boolean visitProc(ACSPParser.ProcContext ctx) {
        return super.visitProc(ctx);
    }

    @Override
    public Boolean visitBoolExp(ACSPParser.BoolExpContext ctx) {
        return true;
    }

    @Override
    public Boolean visitBoolOrAmb(ACSPParser.BoolOrAmbContext ctx) {
        return true;
    }

    @Override
    public Boolean visitExpr(ACSPParser.ExprContext ctx) {
        return true;
    }

    @Override
    public Boolean visitNumber(ACSPParser.NumberContext ctx) {
        return true;
    }

    @Override
    public Boolean visitComment(ACSPParser.CommentContext ctx) {
        return true;
    }
}
