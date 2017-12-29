// Generated from C:/Users/vrasa/IdeaProjects/Lol\LolPass2.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LolPass2Parser}.
 */
public interface LolPass2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LolPass2Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LolPass2Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LolPass2Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LolPass2Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LolPass2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(LolPass2Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LolPass2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(LolPass2Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LolPass2Parser#static_vardef}.
	 * @param ctx the parse tree
	 */
	void enterStatic_vardef(LolPass2Parser.Static_vardefContext ctx);
	/**
	 * Exit a parse tree produced by {@link LolPass2Parser#static_vardef}.
	 * @param ctx the parse tree
	 */
	void exitStatic_vardef(LolPass2Parser.Static_vardefContext ctx);
	/**
	 * Enter a parse tree produced by {@link LolPass2Parser#vardef}.
	 * @param ctx the parse tree
	 */
	void enterVardef(LolPass2Parser.VardefContext ctx);
	/**
	 * Exit a parse tree produced by {@link LolPass2Parser#vardef}.
	 * @param ctx the parse tree
	 */
	void exitVardef(LolPass2Parser.VardefContext ctx);
	/**
	 * Enter a parse tree produced by {@link LolPass2Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(LolPass2Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LolPass2Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(LolPass2Parser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LolPass2Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(LolPass2Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LolPass2Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(LolPass2Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LolPass2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(LolPass2Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LolPass2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(LolPass2Parser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LolPass2Parser#expr_add}.
	 * @param ctx the parse tree
	 */
	void enterExpr_add(LolPass2Parser.Expr_addContext ctx);
	/**
	 * Exit a parse tree produced by {@link LolPass2Parser#expr_add}.
	 * @param ctx the parse tree
	 */
	void exitExpr_add(LolPass2Parser.Expr_addContext ctx);
	/**
	 * Enter a parse tree produced by {@link LolPass2Parser#expr_add_tmp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_add_tmp(LolPass2Parser.Expr_add_tmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LolPass2Parser#expr_add_tmp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_add_tmp(LolPass2Parser.Expr_add_tmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LolPass2Parser#expr_mult}.
	 * @param ctx the parse tree
	 */
	void enterExpr_mult(LolPass2Parser.Expr_multContext ctx);
	/**
	 * Exit a parse tree produced by {@link LolPass2Parser#expr_mult}.
	 * @param ctx the parse tree
	 */
	void exitExpr_mult(LolPass2Parser.Expr_multContext ctx);
	/**
	 * Enter a parse tree produced by {@link LolPass2Parser#expr_mult_tmp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_mult_tmp(LolPass2Parser.Expr_mult_tmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LolPass2Parser#expr_mult_tmp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_mult_tmp(LolPass2Parser.Expr_mult_tmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LolPass2Parser#expr_other}.
	 * @param ctx the parse tree
	 */
	void enterExpr_other(LolPass2Parser.Expr_otherContext ctx);
	/**
	 * Exit a parse tree produced by {@link LolPass2Parser#expr_other}.
	 * @param ctx the parse tree
	 */
	void exitExpr_other(LolPass2Parser.Expr_otherContext ctx);
}