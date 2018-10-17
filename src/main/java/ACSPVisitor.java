// Generated from /Users/aimeeborda/ACSP-Compiler/src/main/java/ACSP.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ACSPParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ACSPVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ACSPParser#spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpec(ACSPParser.SpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACSPParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(ACSPParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACSPParser#channelDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChannelDecl(ACSPParser.ChannelDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACSPParser#channelNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChannelNames(ACSPParser.ChannelNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACSPParser#channelColonType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChannelColonType(ACSPParser.ChannelColonTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACSPParser#simpleDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleDefinition(ACSPParser.SimpleDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACSPParser#assertDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertDefinition(ACSPParser.AssertDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACSPParser#refinedBy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefinedBy(ACSPParser.RefinedByContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACSPParser#definitionLeft}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinitionLeft(ACSPParser.DefinitionLeftContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACSPParser#defnCallLeft}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefnCallLeft(ACSPParser.DefnCallLeftContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACSPParser#any}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny(ACSPParser.AnyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACSPParser#checkConditionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckConditionBody(ACSPParser.CheckConditionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACSPParser#modelCheckType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModelCheckType(ACSPParser.ModelCheckTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACSPParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ACSPParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACSPParser#simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple(ACSPParser.SimpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACSPParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(ACSPParser.SetContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACSPParser#proc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc(ACSPParser.ProcContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACSPParser#cspProc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCspProc(ACSPParser.CspProcContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACSPParser#locProcess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocProcess(ACSPParser.LocProcessContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACSPParser#locOutput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocOutput(ACSPParser.LocOutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACSPParser#parallelProc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParallelProc(ACSPParser.ParallelProcContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACSPParser#eventHide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventHide(ACSPParser.EventHideContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACSPParser#ifStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(ACSPParser.IfStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACSPParser#chxProc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChxProc(ACSPParser.ChxProcContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACSPParser#prfProc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrfProc(ACSPParser.PrfProcContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACSPParser#terminalProc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminalProc(ACSPParser.TerminalProcContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACSPParser#boolExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExp(ACSPParser.BoolExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACSPParser#boolOrAmb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolOrAmb(ACSPParser.BoolOrAmbContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACSPParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ACSPParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACSPParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(ACSPParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACSPParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(ACSPParser.CommentContext ctx);
}