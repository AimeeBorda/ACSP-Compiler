// Generated from /Users/aimeeborda/ACSP-Compiler/src/main/java/ACSP.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ACSPParser}.
 */
public interface ACSPListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ACSPParser#spec}.
	 * @param ctx the parse tree
	 */
	void enterSpec(ACSPParser.SpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACSPParser#spec}.
	 * @param ctx the parse tree
	 */
	void exitSpec(ACSPParser.SpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACSPParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(ACSPParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACSPParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(ACSPParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACSPParser#includeFile}.
	 * @param ctx the parse tree
	 */
	void enterIncludeFile(ACSPParser.IncludeFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACSPParser#includeFile}.
	 * @param ctx the parse tree
	 */
	void exitIncludeFile(ACSPParser.IncludeFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACSPParser#funcImport}.
	 * @param ctx the parse tree
	 */
	void enterFuncImport(ACSPParser.FuncImportContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACSPParser#funcImport}.
	 * @param ctx the parse tree
	 */
	void exitFuncImport(ACSPParser.FuncImportContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACSPParser#dataTypeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeDefinition(ACSPParser.DataTypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACSPParser#dataTypeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeDefinition(ACSPParser.DataTypeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACSPParser#channelDecl}.
	 * @param ctx the parse tree
	 */
	void enterChannelDecl(ACSPParser.ChannelDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACSPParser#channelDecl}.
	 * @param ctx the parse tree
	 */
	void exitChannelDecl(ACSPParser.ChannelDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACSPParser#channelNames}.
	 * @param ctx the parse tree
	 */
	void enterChannelNames(ACSPParser.ChannelNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACSPParser#channelNames}.
	 * @param ctx the parse tree
	 */
	void exitChannelNames(ACSPParser.ChannelNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACSPParser#channelColonType}.
	 * @param ctx the parse tree
	 */
	void enterChannelColonType(ACSPParser.ChannelColonTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACSPParser#channelColonType}.
	 * @param ctx the parse tree
	 */
	void exitChannelColonType(ACSPParser.ChannelColonTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACSPParser#simpleDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSimpleDefinition(ACSPParser.SimpleDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACSPParser#simpleDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSimpleDefinition(ACSPParser.SimpleDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACSPParser#assertDefinition}.
	 * @param ctx the parse tree
	 */
	void enterAssertDefinition(ACSPParser.AssertDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACSPParser#assertDefinition}.
	 * @param ctx the parse tree
	 */
	void exitAssertDefinition(ACSPParser.AssertDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACSPParser#refinedBy}.
	 * @param ctx the parse tree
	 */
	void enterRefinedBy(ACSPParser.RefinedByContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACSPParser#refinedBy}.
	 * @param ctx the parse tree
	 */
	void exitRefinedBy(ACSPParser.RefinedByContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACSPParser#definitionLeft}.
	 * @param ctx the parse tree
	 */
	void enterDefinitionLeft(ACSPParser.DefinitionLeftContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACSPParser#definitionLeft}.
	 * @param ctx the parse tree
	 */
	void exitDefinitionLeft(ACSPParser.DefinitionLeftContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACSPParser#any}.
	 * @param ctx the parse tree
	 */
	void enterAny(ACSPParser.AnyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACSPParser#any}.
	 * @param ctx the parse tree
	 */
	void exitAny(ACSPParser.AnyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACSPParser#checkConditionBody}.
	 * @param ctx the parse tree
	 */
	void enterCheckConditionBody(ACSPParser.CheckConditionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACSPParser#checkConditionBody}.
	 * @param ctx the parse tree
	 */
	void exitCheckConditionBody(ACSPParser.CheckConditionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACSPParser#modelCheckType}.
	 * @param ctx the parse tree
	 */
	void enterModelCheckType(ACSPParser.ModelCheckTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACSPParser#modelCheckType}.
	 * @param ctx the parse tree
	 */
	void exitModelCheckType(ACSPParser.ModelCheckTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACSPParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ACSPParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACSPParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ACSPParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACSPParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(ACSPParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACSPParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(ACSPParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACSPParser#setComprehension}.
	 * @param ctx the parse tree
	 */
	void enterSetComprehension(ACSPParser.SetComprehensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACSPParser#setComprehension}.
	 * @param ctx the parse tree
	 */
	void exitSetComprehension(ACSPParser.SetComprehensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACSPParser#proc}.
	 * @param ctx the parse tree
	 */
	void enterProc(ACSPParser.ProcContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACSPParser#proc}.
	 * @param ctx the parse tree
	 */
	void exitProc(ACSPParser.ProcContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACSPParser#event}.
	 * @param ctx the parse tree
	 */
	void enterEvent(ACSPParser.EventContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACSPParser#event}.
	 * @param ctx the parse tree
	 */
	void exitEvent(ACSPParser.EventContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACSPParser#locProcess}.
	 * @param ctx the parse tree
	 */
	void enterLocProcess(ACSPParser.LocProcessContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACSPParser#locProcess}.
	 * @param ctx the parse tree
	 */
	void exitLocProcess(ACSPParser.LocProcessContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACSPParser#locOutput}.
	 * @param ctx the parse tree
	 */
	void enterLocOutput(ACSPParser.LocOutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACSPParser#locOutput}.
	 * @param ctx the parse tree
	 */
	void exitLocOutput(ACSPParser.LocOutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACSPParser#parallelProc}.
	 * @param ctx the parse tree
	 */
	void enterParallelProc(ACSPParser.ParallelProcContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACSPParser#parallelProc}.
	 * @param ctx the parse tree
	 */
	void exitParallelProc(ACSPParser.ParallelProcContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACSPParser#letProc}.
	 * @param ctx the parse tree
	 */
	void enterLetProc(ACSPParser.LetProcContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACSPParser#letProc}.
	 * @param ctx the parse tree
	 */
	void exitLetProc(ACSPParser.LetProcContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACSPParser#locNames}.
	 * @param ctx the parse tree
	 */
	void enterLocNames(ACSPParser.LocNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACSPParser#locNames}.
	 * @param ctx the parse tree
	 */
	void exitLocNames(ACSPParser.LocNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACSPParser#parallelSync}.
	 * @param ctx the parse tree
	 */
	void enterParallelSync(ACSPParser.ParallelSyncContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACSPParser#parallelSync}.
	 * @param ctx the parse tree
	 */
	void exitParallelSync(ACSPParser.ParallelSyncContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACSPParser#boolExp}.
	 * @param ctx the parse tree
	 */
	void enterBoolExp(ACSPParser.BoolExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACSPParser#boolExp}.
	 * @param ctx the parse tree
	 */
	void exitBoolExp(ACSPParser.BoolExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACSPParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ACSPParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACSPParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ACSPParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACSPParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(ACSPParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACSPParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(ACSPParser.NumberContext ctx);
}