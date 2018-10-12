// Generated from /Users/aimee/IdeaProjects/untitled/src/ACSP.g4 by ANTLR 4.7
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
	 * Visit a parse tree produced by {@link ACSPParser#skipCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkipCmd(ACSPParser.SkipCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACSPParser#choiceCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoiceCmd(ACSPParser.ChoiceCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACSPParser#ifCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfCmd(ACSPParser.IfCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACSPParser#parallelCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParallelCmd(ACSPParser.ParallelCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACSPParser#scopeCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScopeCmd(ACSPParser.ScopeCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACSPParser#outputCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputCmd(ACSPParser.OutputCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACSPParser#locCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocCmd(ACSPParser.LocCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACSPParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(ACSPParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACSPParser#funcDefn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDefn(ACSPParser.FuncDefnContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACSPParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ACSPParser.StatementContext ctx);
}