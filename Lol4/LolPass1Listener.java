// Generated from LolPass1.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LolPass1Parser}.
 */
public interface LolPass1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LolPass1Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LolPass1Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LolPass1Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LolPass1Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LolPass1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(LolPass1Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LolPass1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(LolPass1Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LolPass1Parser#static_vardef}.
	 * @param ctx the parse tree
	 */
	void enterStatic_vardef(LolPass1Parser.Static_vardefContext ctx);
	/**
	 * Exit a parse tree produced by {@link LolPass1Parser#static_vardef}.
	 * @param ctx the parse tree
	 */
	void exitStatic_vardef(LolPass1Parser.Static_vardefContext ctx);
	/**
	 * Enter a parse tree produced by {@link LolPass1Parser#vardef}.
	 * @param ctx the parse tree
	 */
	void enterVardef(LolPass1Parser.VardefContext ctx);
	/**
	 * Exit a parse tree produced by {@link LolPass1Parser#vardef}.
	 * @param ctx the parse tree
	 */
	void exitVardef(LolPass1Parser.VardefContext ctx);
	/**
	 * Enter a parse tree produced by {@link LolPass1Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(LolPass1Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LolPass1Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(LolPass1Parser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LolPass1Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(LolPass1Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LolPass1Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(LolPass1Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LolPass1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(LolPass1Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LolPass1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(LolPass1Parser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LolPass1Parser#expr_add}.
	 * @param ctx the parse tree
	 */
	void enterExpr_add(LolPass1Parser.Expr_addContext ctx);
	/**
	 * Exit a parse tree produced by {@link LolPass1Parser#expr_add}.
	 * @param ctx the parse tree
	 */
	void exitExpr_add(LolPass1Parser.Expr_addContext ctx);
	/**
	 * Enter a parse tree produced by {@link LolPass1Parser#expr_add_tmp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_add_tmp(LolPass1Parser.Expr_add_tmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LolPass1Parser#expr_add_tmp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_add_tmp(LolPass1Parser.Expr_add_tmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LolPass1Parser#expr_mult}.
	 * @param ctx the parse tree
	 */
	void enterExpr_mult(LolPass1Parser.Expr_multContext ctx);
	/**
	 * Exit a parse tree produced by {@link LolPass1Parser#expr_mult}.
	 * @param ctx the parse tree
	 */
	void exitExpr_mult(LolPass1Parser.Expr_multContext ctx);
	/**
	 * Enter a parse tree produced by {@link LolPass1Parser#expr_mult_tmp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_mult_tmp(LolPass1Parser.Expr_mult_tmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LolPass1Parser#expr_mult_tmp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_mult_tmp(LolPass1Parser.Expr_mult_tmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LolPass1Parser#expr_other}.
	 * @param ctx the parse tree
	 */
	void enterExpr_other(LolPass1Parser.Expr_otherContext ctx);
	/**
	 * Exit a parse tree produced by {@link LolPass1Parser#expr_other}.
	 * @param ctx the parse tree
	 */
	void exitExpr_other(LolPass1Parser.Expr_otherContext ctx);
}