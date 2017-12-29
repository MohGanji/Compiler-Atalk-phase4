// Generated from C:/Users/vrasa/IdeaProjects/Lol\LolPass1.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LolPass1Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, CONST_INT=14, ID=15, WS=16;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_static_vardef = 2, RULE_vardef = 3, 
		RULE_type = 4, RULE_block = 5, RULE_expr = 6, RULE_expr_add = 7, RULE_expr_add_tmp = 8, 
		RULE_expr_mult = 9, RULE_expr_mult_tmp = 10, RULE_expr_other = 11;
	public static final String[] ruleNames = {
		"program", "statement", "static_vardef", "vardef", "type", "block", "expr", 
		"expr_add", "expr_add_tmp", "expr_mult", "expr_mult_tmp", "expr_other"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'static'", "'int'", "'{'", "'}'", "'out'", "'<-'", "'+'", 
		"'-'", "'*'", "'/'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "CONST_INT", "ID", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "LolPass1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    
	    void print(String str){
	        System.out.println(str);
	    }

	    void putLocalVar(String name, Type type) throws ItemAlreadyExistsException {
	        SymbolTable.top.put(
	            new SymbolTableLocalVariableItem(
	                new Variable(name, type),
	                SymbolTable.top.getOffset(Register.SP)
	            )
	        );
	    }

	    void putStaticVar(String name, Type type) throws ItemAlreadyExistsException {
	        SymbolTable.top.put(
	            new SymbolTableStaticVariableItem(
	                new Variable(name, type),
	                SymbolTable.top.getOffset(Register.GP)
	            )
	        );
	    }

	    void beginScope() {
	    	int localOffset = 0;
	    	int globalOffset = 0;
	    	
	    	if(SymbolTable.top != null) {
	        	localOffset = SymbolTable.top.getOffset(Register.SP);
	        	globalOffset = SymbolTable.top.getOffset(Register.GP);
	    	}

	        SymbolTable.push(new SymbolTable(SymbolTable.top));

	        SymbolTable.top.setOffset(Register.SP, localOffset);
	        SymbolTable.top.setOffset(Register.GP, globalOffset);
	    }
	    
	    void endScope() {
	        print("Stack offset: " + SymbolTable.top.getOffset(Register.SP) + ", Global offset: " + SymbolTable.top.getOffset(Register.GP));
	        
	        if(SymbolTable.top.getPreSymbolTable() != null) {
	            SymbolTable.top.getPreSymbolTable().setOffset(
	                Register.GP,
	                SymbolTable.top.getOffset(Register.GP)
	            );
	        }
	        SymbolTable.pop();
	    }

	public LolPass1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LolPass1Listener ) ((LolPass1Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LolPass1Listener ) ((LolPass1Listener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 
			        print("Pass1 started -------------------------");
			        beginScope(); 
			    
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__5) | (1L << T__11) | (1L << CONST_INT) | (1L << ID))) != 0)) {
				{
				{
				setState(25);
				statement();
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			        endScope();
			        print("Pass1 finished -------------------------");
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public VardefContext vardef() {
			return getRuleContext(VardefContext.class,0);
		}
		public Static_vardefContext static_vardef() {
			return getRuleContext(Static_vardefContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LolPass1Listener ) ((LolPass1Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LolPass1Listener ) ((LolPass1Listener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(43);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				vardef();
				setState(34);
				match(T__0);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				static_vardef();
				setState(37);
				match(T__0);
				}
				break;
			case T__5:
			case T__11:
			case CONST_INT:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				expr();
				setState(40);
				match(T__0);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 4);
				{
				setState(42);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Static_vardefContext extends ParserRuleContext {
		public TypeContext var_type;
		public Token var_id;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(LolPass1Parser.ID, 0); }
		public Static_vardefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_static_vardef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LolPass1Listener ) ((LolPass1Listener)listener).enterStatic_vardef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LolPass1Listener ) ((LolPass1Listener)listener).exitStatic_vardef(this);
		}
	}

	public final Static_vardefContext static_vardef() throws RecognitionException {
		Static_vardefContext _localctx = new Static_vardefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_static_vardef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__1);
			setState(46);
			((Static_vardefContext)_localctx).var_type = type();
			setState(47);
			((Static_vardefContext)_localctx).var_id = match(ID);

			            try {
			                putStaticVar((((Static_vardefContext)_localctx).var_id!=null?((Static_vardefContext)_localctx).var_id.getText():null), ((Static_vardefContext)_localctx).var_type.return_type);
			            }
			            catch(ItemAlreadyExistsException e) {
			                print(String.format("[Line #%s] Variable \"%s\" already exists.", ((Static_vardefContext)_localctx).var_id.getLine(), (((Static_vardefContext)_localctx).var_id!=null?((Static_vardefContext)_localctx).var_id.getText():null)));
			            }
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VardefContext extends ParserRuleContext {
		public TypeContext var_type;
		public Token var_id;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(LolPass1Parser.ID, 0); }
		public VardefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LolPass1Listener ) ((LolPass1Listener)listener).enterVardef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LolPass1Listener ) ((LolPass1Listener)listener).exitVardef(this);
		}
	}

	public final VardefContext vardef() throws RecognitionException {
		VardefContext _localctx = new VardefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vardef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			((VardefContext)_localctx).var_type = type();
			setState(51);
			((VardefContext)_localctx).var_id = match(ID);

			            try {
			                putLocalVar((((VardefContext)_localctx).var_id!=null?((VardefContext)_localctx).var_id.getText():null), ((VardefContext)_localctx).var_type.return_type);
			            }
			            catch(ItemAlreadyExistsException e) {
			            	print(String.format("[Line #%s] Variable \"%s\" already exists.", ((VardefContext)_localctx).var_id.getLine(), (((VardefContext)_localctx).var_id!=null?((VardefContext)_localctx).var_id.getText():null)));
			            }
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public Type return_type;
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LolPass1Listener ) ((LolPass1Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LolPass1Listener ) ((LolPass1Listener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__2);
			 ((TypeContext)_localctx).return_type =  IntType.getInstance(); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LolPass1Listener ) ((LolPass1Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LolPass1Listener ) ((LolPass1Listener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 beginScope(); 
			setState(58);
			match(T__3);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__5) | (1L << T__11) | (1L << CONST_INT) | (1L << ID))) != 0)) {
				{
				{
				setState(59);
				statement();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
			match(T__4);
			 endScope(); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_addContext expr_add() {
			return getRuleContext(Expr_addContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LolPass1Listener ) ((LolPass1Listener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LolPass1Listener ) ((LolPass1Listener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expr);
		try {
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				switch (_input.LA(1)) {
				case T__5:
					{
					setState(68);
					match(T__5);
					}
					break;
				case T__11:
				case CONST_INT:
				case ID:
					{
					setState(69);
					expr_add();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(72);
				match(T__6);
				setState(73);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				expr_add();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_addContext extends ParserRuleContext {
		public Expr_multContext expr_mult() {
			return getRuleContext(Expr_multContext.class,0);
		}
		public Expr_add_tmpContext expr_add_tmp() {
			return getRuleContext(Expr_add_tmpContext.class,0);
		}
		public Expr_addContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LolPass1Listener ) ((LolPass1Listener)listener).enterExpr_add(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LolPass1Listener ) ((LolPass1Listener)listener).exitExpr_add(this);
		}
	}

	public final Expr_addContext expr_add() throws RecognitionException {
		Expr_addContext _localctx = new Expr_addContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expr_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			expr_mult();
			setState(78);
			expr_add_tmp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_add_tmpContext extends ParserRuleContext {
		public Token op;
		public Expr_multContext expr_mult() {
			return getRuleContext(Expr_multContext.class,0);
		}
		public Expr_add_tmpContext expr_add_tmp() {
			return getRuleContext(Expr_add_tmpContext.class,0);
		}
		public Expr_add_tmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_add_tmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LolPass1Listener ) ((LolPass1Listener)listener).enterExpr_add_tmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LolPass1Listener ) ((LolPass1Listener)listener).exitExpr_add_tmp(this);
		}
	}

	public final Expr_add_tmpContext expr_add_tmp() throws RecognitionException {
		Expr_add_tmpContext _localctx = new Expr_add_tmpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expr_add_tmp);
		int _la;
		try {
			setState(85);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				((Expr_add_tmpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__7 || _la==T__8) ) {
					((Expr_add_tmpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(81);
				expr_mult();
				setState(82);
				expr_add_tmp();
				}
				break;
			case T__0:
			case T__6:
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_multContext extends ParserRuleContext {
		public Expr_otherContext expr_other() {
			return getRuleContext(Expr_otherContext.class,0);
		}
		public Expr_mult_tmpContext expr_mult_tmp() {
			return getRuleContext(Expr_mult_tmpContext.class,0);
		}
		public Expr_multContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_mult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LolPass1Listener ) ((LolPass1Listener)listener).enterExpr_mult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LolPass1Listener ) ((LolPass1Listener)listener).exitExpr_mult(this);
		}
	}

	public final Expr_multContext expr_mult() throws RecognitionException {
		Expr_multContext _localctx = new Expr_multContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expr_mult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			expr_other();
			setState(88);
			expr_mult_tmp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_mult_tmpContext extends ParserRuleContext {
		public Token op;
		public Expr_otherContext expr_other() {
			return getRuleContext(Expr_otherContext.class,0);
		}
		public Expr_mult_tmpContext expr_mult_tmp() {
			return getRuleContext(Expr_mult_tmpContext.class,0);
		}
		public Expr_mult_tmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_mult_tmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LolPass1Listener ) ((LolPass1Listener)listener).enterExpr_mult_tmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LolPass1Listener ) ((LolPass1Listener)listener).exitExpr_mult_tmp(this);
		}
	}

	public final Expr_mult_tmpContext expr_mult_tmp() throws RecognitionException {
		Expr_mult_tmpContext _localctx = new Expr_mult_tmpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr_mult_tmp);
		int _la;
		try {
			setState(95);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				((Expr_mult_tmpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__9 || _la==T__10) ) {
					((Expr_mult_tmpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(91);
				expr_other();
				setState(92);
				expr_mult_tmp();
				}
				break;
			case T__0:
			case T__6:
			case T__7:
			case T__8:
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_otherContext extends ParserRuleContext {
		public TerminalNode CONST_INT() { return getToken(LolPass1Parser.CONST_INT, 0); }
		public TerminalNode ID() { return getToken(LolPass1Parser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_otherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_other; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LolPass1Listener ) ((LolPass1Listener)listener).enterExpr_other(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LolPass1Listener ) ((LolPass1Listener)listener).exitExpr_other(this);
		}
	}

	public final Expr_otherContext expr_other() throws RecognitionException {
		Expr_otherContext _localctx = new Expr_otherContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expr_other);
		try {
			setState(103);
			switch (_input.LA(1)) {
			case CONST_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(CONST_INT);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(ID);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				match(T__11);
				setState(100);
				expr();
				setState(101);
				match(T__12);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\22l\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\7\2\35\n\2\f\2\16\2 \13\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3.\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\7\3\7\3\7\7\7?\n\7\f\7\16\7B\13\7\3\7\3\7\3\7\3\b\3\b"+
		"\5\bI\n\b\3\b\3\b\3\b\5\bN\n\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\nX\n"+
		"\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\fb\n\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\5\rj\n\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\4\3\2\n\13\3\2\f"+
		"\rj\2\32\3\2\2\2\4-\3\2\2\2\6/\3\2\2\2\b\64\3\2\2\2\n8\3\2\2\2\f;\3\2"+
		"\2\2\16M\3\2\2\2\20O\3\2\2\2\22W\3\2\2\2\24Y\3\2\2\2\26a\3\2\2\2\30i\3"+
		"\2\2\2\32\36\b\2\1\2\33\35\5\4\3\2\34\33\3\2\2\2\35 \3\2\2\2\36\34\3\2"+
		"\2\2\36\37\3\2\2\2\37!\3\2\2\2 \36\3\2\2\2!\"\b\2\1\2\"\3\3\2\2\2#$\5"+
		"\b\5\2$%\7\3\2\2%.\3\2\2\2&\'\5\6\4\2\'(\7\3\2\2(.\3\2\2\2)*\5\16\b\2"+
		"*+\7\3\2\2+.\3\2\2\2,.\5\f\7\2-#\3\2\2\2-&\3\2\2\2-)\3\2\2\2-,\3\2\2\2"+
		".\5\3\2\2\2/\60\7\4\2\2\60\61\5\n\6\2\61\62\7\21\2\2\62\63\b\4\1\2\63"+
		"\7\3\2\2\2\64\65\5\n\6\2\65\66\7\21\2\2\66\67\b\5\1\2\67\t\3\2\2\289\7"+
		"\5\2\29:\b\6\1\2:\13\3\2\2\2;<\b\7\1\2<@\7\6\2\2=?\5\4\3\2>=\3\2\2\2?"+
		"B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B@\3\2\2\2CD\7\7\2\2DE\b\7\1\2"+
		"E\r\3\2\2\2FI\7\b\2\2GI\5\20\t\2HF\3\2\2\2HG\3\2\2\2IJ\3\2\2\2JK\7\t\2"+
		"\2KN\5\16\b\2LN\5\20\t\2MH\3\2\2\2ML\3\2\2\2N\17\3\2\2\2OP\5\24\13\2P"+
		"Q\5\22\n\2Q\21\3\2\2\2RS\t\2\2\2ST\5\24\13\2TU\5\22\n\2UX\3\2\2\2VX\3"+
		"\2\2\2WR\3\2\2\2WV\3\2\2\2X\23\3\2\2\2YZ\5\30\r\2Z[\5\26\f\2[\25\3\2\2"+
		"\2\\]\t\3\2\2]^\5\30\r\2^_\5\26\f\2_b\3\2\2\2`b\3\2\2\2a\\\3\2\2\2a`\3"+
		"\2\2\2b\27\3\2\2\2cj\7\20\2\2dj\7\21\2\2ef\7\16\2\2fg\5\16\b\2gh\7\17"+
		"\2\2hj\3\2\2\2ic\3\2\2\2id\3\2\2\2ie\3\2\2\2j\31\3\2\2\2\n\36-@HMWai";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}