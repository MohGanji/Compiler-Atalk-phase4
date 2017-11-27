// Generated from Lol.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LolParser}.
 */
public interface LolListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LolParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LolParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LolParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LolParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LolParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(LolParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LolParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(LolParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LolParser#vardef}.
	 * @param ctx the parse tree
	 */
	void enterVardef(LolParser.VardefContext ctx);
	/**
	 * Exit a parse tree produced by {@link LolParser#vardef}.
	 * @param ctx the parse tree
	 */
	void exitVardef(LolParser.VardefContext ctx);
	/**
	 * Enter a parse tree produced by {@link LolParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(LolParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LolParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(LolParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LolParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(LolParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LolParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(LolParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(LolParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(LolParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LolParser#expr_add}.
	 * @param ctx the parse tree
	 */
	void enterExpr_add(LolParser.Expr_addContext ctx);
	/**
	 * Exit a parse tree produced by {@link LolParser#expr_add}.
	 * @param ctx the parse tree
	 */
	void exitExpr_add(LolParser.Expr_addContext ctx);
	/**
	 * Enter a parse tree produced by {@link LolParser#expr_add_tmp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_add_tmp(LolParser.Expr_add_tmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LolParser#expr_add_tmp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_add_tmp(LolParser.Expr_add_tmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LolParser#expr_mult}.
	 * @param ctx the parse tree
	 */
	void enterExpr_mult(LolParser.Expr_multContext ctx);
	/**
	 * Exit a parse tree produced by {@link LolParser#expr_mult}.
	 * @param ctx the parse tree
	 */
	void exitExpr_mult(LolParser.Expr_multContext ctx);
	/**
	 * Enter a parse tree produced by {@link LolParser#expr_mult_tmp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_mult_tmp(LolParser.Expr_mult_tmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LolParser#expr_mult_tmp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_mult_tmp(LolParser.Expr_mult_tmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LolParser#expr_other}.
	 * @param ctx the parse tree
	 */
	void enterExpr_other(LolParser.Expr_otherContext ctx);
	/**
	 * Exit a parse tree produced by {@link LolParser#expr_other}.
	 * @param ctx the parse tree
	 */
	void exitExpr_other(LolParser.Expr_otherContext ctx);
}