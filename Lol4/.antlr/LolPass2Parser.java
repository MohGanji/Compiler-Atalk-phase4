// Generated from /home/vmoh/uni_projs/compiler/Compiler-Atalk-phase4/Lol4/LolPass2.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LolPass2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

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
	public String getGrammarFileName() { return "LolPass2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    
	    void print(String str){
	        System.out.println(str);
	    }

	    void beginScope() {
	        SymbolTable.push();
	    }

	    void endScope() {
	        print("Stack offset: " + SymbolTable.top.getOffset(Register.SP) + ", Global offset: " + SymbolTable.top.getOffset(Register.GP));
	        SymbolTable.pop();
	    }

	    Translator mips = new Translator();

	public LolPass2Parser(TokenStream input) {
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
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 
			        print("Pass2 started -------------------------");
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
			        print("Pass2 finished -------------------------");
			        mips.makeOutput();
			    
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
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(43);
			_errHandler.sync(this);
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
		public TerminalNode ID() { return getToken(LolPass2Parser.ID, 0); }
		public Static_vardefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_static_vardef; }
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

			            SymbolTableItem item = SymbolTable.top.get((((Static_vardefContext)_localctx).var_id!=null?((Static_vardefContext)_localctx).var_id.getText():null));
			            SymbolTableVariableItemBase var = (SymbolTableVariableItemBase) item;
			            print((((Static_vardefContext)_localctx).var_id!=null?((Static_vardefContext)_localctx).var_id.getLine():0) + ") Variable " + (((Static_vardefContext)_localctx).var_id!=null?((Static_vardefContext)_localctx).var_id.getText():null) + " used.\t\t" +   "Base Reg: " + var.getBaseRegister() + ", Offset: " + var.getOffset());
			            mips.addGlobalVariable(var.getOffset(), -1);
			        
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
		public TerminalNode ID() { return getToken(LolPass2Parser.ID, 0); }
		public VardefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardef; }
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

			            SymbolTable.define();
			            mips.addToStack(0);
			        
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
		public boolean is_lvalue;
		public Expr_addContext expression_add;
		public Token op;
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
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expr);
		try {
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__5:
					{
					setState(68);
					match(T__5);
					setState(69);
					match(T__6);
					setState(70);
					expr();

					                ((ExprContext)_localctx).is_lvalue =  false;
					                mips.write();
					            
					}
					break;
				case T__11:
				case CONST_INT:
				case ID:
					{
					setState(73);
					((ExprContext)_localctx).expression_add = expr_add(true);
					setState(74);
					((ExprContext)_localctx).op = match(T__6);
					setState(75);
					expr();

					                if(!((ExprContext)_localctx).expression_add.is_lvalue)
					                    print((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getLine():0) + ") Cannot assign a value to rvalue expression.");
					                ((ExprContext)_localctx).is_lvalue =  true;
					                mips.assignCommand();
					            
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				((ExprContext)_localctx).expression_add = expr_add(false);
				 ((ExprContext)_localctx).is_lvalue =  ((ExprContext)_localctx).expression_add.is_lvalue; 
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
		public boolean is_left;
		public boolean is_lvalue;
		public Expr_multContext expression_mult;
		public Expr_add_tmpContext expression_add;
		public Expr_multContext expr_mult() {
			return getRuleContext(Expr_multContext.class,0);
		}
		public Expr_add_tmpContext expr_add_tmp() {
			return getRuleContext(Expr_add_tmpContext.class,0);
		}
		public Expr_addContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Expr_addContext(ParserRuleContext parent, int invokingState, boolean is_left) {
			super(parent, invokingState);
			this.is_left = is_left;
		}
		@Override public int getRuleIndex() { return RULE_expr_add; }
	}

	public final Expr_addContext expr_add(boolean is_left) throws RecognitionException {
		Expr_addContext _localctx = new Expr_addContext(_ctx, getState(), is_left);
		enterRule(_localctx, 14, RULE_expr_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			((Expr_addContext)_localctx).expression_mult = expr_mult(_localctx.is_left);
			setState(86);
			((Expr_addContext)_localctx).expression_add = expr_add_tmp();
			 ((Expr_addContext)_localctx).is_lvalue =  ((Expr_addContext)_localctx).expression_mult.is_lvalue && !((Expr_addContext)_localctx).expression_add.has_value; 
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
		public boolean has_value;
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
	}

	public final Expr_add_tmpContext expr_add_tmp() throws RecognitionException {
		Expr_add_tmpContext _localctx = new Expr_add_tmpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expr_add_tmp);
		int _la;
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				((Expr_add_tmpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__7 || _la==T__8) ) {
					((Expr_add_tmpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(90);
				expr_mult(false);

				            mips.operationCommand((((Expr_add_tmpContext)_localctx).op!=null?((Expr_add_tmpContext)_localctx).op.getText():null));
				        
				setState(92);
				expr_add_tmp();
				 ((Expr_add_tmpContext)_localctx).has_value =  true; 
				}
				break;
			case T__0:
			case T__6:
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				 ((Expr_add_tmpContext)_localctx).has_value =  false; 
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
		public boolean is_left;
		public boolean is_lvalue;
		public Expr_otherContext expression_other;
		public Expr_mult_tmpContext expression_mult;
		public Expr_otherContext expr_other() {
			return getRuleContext(Expr_otherContext.class,0);
		}
		public Expr_mult_tmpContext expr_mult_tmp() {
			return getRuleContext(Expr_mult_tmpContext.class,0);
		}
		public Expr_multContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Expr_multContext(ParserRuleContext parent, int invokingState, boolean is_left) {
			super(parent, invokingState);
			this.is_left = is_left;
		}
		@Override public int getRuleIndex() { return RULE_expr_mult; }
	}

	public final Expr_multContext expr_mult(boolean is_left) throws RecognitionException {
		Expr_multContext _localctx = new Expr_multContext(_ctx, getState(), is_left);
		enterRule(_localctx, 18, RULE_expr_mult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			((Expr_multContext)_localctx).expression_other = expr_other(_localctx.is_left);
			setState(99);
			((Expr_multContext)_localctx).expression_mult = expr_mult_tmp();
			 ((Expr_multContext)_localctx).is_lvalue =  ((Expr_multContext)_localctx).expression_other.is_lvalue && !((Expr_multContext)_localctx).expression_mult.has_value; 
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
		public boolean has_value;
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
	}

	public final Expr_mult_tmpContext expr_mult_tmp() throws RecognitionException {
		Expr_mult_tmpContext _localctx = new Expr_mult_tmpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr_mult_tmp);
		int _la;
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				((Expr_mult_tmpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__9 || _la==T__10) ) {
					((Expr_mult_tmpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(103);
				expr_other(false);

				            mips.operationCommand((((Expr_mult_tmpContext)_localctx).op!=null?((Expr_mult_tmpContext)_localctx).op.getText():null));
				        
				setState(105);
				expr_mult_tmp();
				 ((Expr_mult_tmpContext)_localctx).has_value =  true; 
				}
				break;
			case T__0:
			case T__6:
			case T__7:
			case T__8:
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				 ((Expr_mult_tmpContext)_localctx).has_value =  false; 
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
		public boolean is_left;
		public boolean is_lvalue;
		public Token num;
		public Token id;
		public ExprContext expression;
		public TerminalNode CONST_INT() { return getToken(LolPass2Parser.CONST_INT, 0); }
		public TerminalNode ID() { return getToken(LolPass2Parser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_otherContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Expr_otherContext(ParserRuleContext parent, int invokingState, boolean is_left) {
			super(parent, invokingState);
			this.is_left = is_left;
		}
		@Override public int getRuleIndex() { return RULE_expr_other; }
	}

	public final Expr_otherContext expr_other(boolean is_left) throws RecognitionException {
		Expr_otherContext _localctx = new Expr_otherContext(_ctx, getState(), is_left);
		enterRule(_localctx, 22, RULE_expr_other);
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				((Expr_otherContext)_localctx).num = match(CONST_INT);

				            ((Expr_otherContext)_localctx).is_lvalue =  false;
				            mips.addToStack(Integer.parseInt((((Expr_otherContext)_localctx).num!=null?((Expr_otherContext)_localctx).num.getText():null)));
				        
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				((Expr_otherContext)_localctx).id = match(ID);
				 
				            SymbolTableItem item = SymbolTable.top.get((((Expr_otherContext)_localctx).id!=null?((Expr_otherContext)_localctx).id.getText():null));
				            if(item == null) {
				                print((((Expr_otherContext)_localctx).id!=null?((Expr_otherContext)_localctx).id.getLine():0) + ") Item " + (((Expr_otherContext)_localctx).id!=null?((Expr_otherContext)_localctx).id.getText():null) + " doesn't exist.");
				            }
				            else {
				                SymbolTableVariableItemBase var = (SymbolTableVariableItemBase) item;
				                print((((Expr_otherContext)_localctx).id!=null?((Expr_otherContext)_localctx).id.getLine():0) + ") Variable " + (((Expr_otherContext)_localctx).id!=null?((Expr_otherContext)_localctx).id.getText():null) + " used.\t\t" +   "Base Reg: " + var.getBaseRegister() + ", Offset: " + var.getOffset());
				                if (var.getBaseRegister() == Register.SP){
				                    if (_localctx.is_left == false) mips.addToStack((((Expr_otherContext)_localctx).id!=null?((Expr_otherContext)_localctx).id.getText():null), var.getOffset()*-1);
				                    else mips.addAddressToStack((((Expr_otherContext)_localctx).id!=null?((Expr_otherContext)_localctx).id.getText():null), var.getOffset()*-1);
				                }
				                else {
				                    if (_localctx.is_left == false) mips.addGlobalToStack(var.getOffset());
				                    else mips.addGlobalAddressToStack((((Expr_otherContext)_localctx).id!=null?((Expr_otherContext)_localctx).id.getText():null), var.getOffset());
				                }
				            }
				            ((Expr_otherContext)_localctx).is_lvalue =  true;
				        
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				match(T__11);
				setState(116);
				((Expr_otherContext)_localctx).expression = expr();
				setState(117);
				match(T__12);
				 ((Expr_otherContext)_localctx).is_lvalue =  ((Expr_otherContext)_localctx).expression.is_lvalue; 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22}\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\7\2\35\n\2\f\2\16\2 \13\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3.\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\7\3\7\3\7\7\7?\n\7\f\7\16\7B\13\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bQ\n\b\3\b\3\b\3\b\5\bV\n\b\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nc\n\n\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\5\fp\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\5\r{\n\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\4\3\2\n\13\3\2\f"+
		"\r\2{\2\32\3\2\2\2\4-\3\2\2\2\6/\3\2\2\2\b\64\3\2\2\2\n8\3\2\2\2\f;\3"+
		"\2\2\2\16U\3\2\2\2\20W\3\2\2\2\22b\3\2\2\2\24d\3\2\2\2\26o\3\2\2\2\30"+
		"z\3\2\2\2\32\36\b\2\1\2\33\35\5\4\3\2\34\33\3\2\2\2\35 \3\2\2\2\36\34"+
		"\3\2\2\2\36\37\3\2\2\2\37!\3\2\2\2 \36\3\2\2\2!\"\b\2\1\2\"\3\3\2\2\2"+
		"#$\5\b\5\2$%\7\3\2\2%.\3\2\2\2&\'\5\6\4\2\'(\7\3\2\2(.\3\2\2\2)*\5\16"+
		"\b\2*+\7\3\2\2+.\3\2\2\2,.\5\f\7\2-#\3\2\2\2-&\3\2\2\2-)\3\2\2\2-,\3\2"+
		"\2\2.\5\3\2\2\2/\60\7\4\2\2\60\61\5\n\6\2\61\62\7\21\2\2\62\63\b\4\1\2"+
		"\63\7\3\2\2\2\64\65\5\n\6\2\65\66\7\21\2\2\66\67\b\5\1\2\67\t\3\2\2\2"+
		"89\7\5\2\29:\b\6\1\2:\13\3\2\2\2;<\b\7\1\2<@\7\6\2\2=?\5\4\3\2>=\3\2\2"+
		"\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B@\3\2\2\2CD\7\7\2\2DE\b\7\1"+
		"\2E\r\3\2\2\2FG\7\b\2\2GH\7\t\2\2HI\5\16\b\2IJ\b\b\1\2JQ\3\2\2\2KL\5\20"+
		"\t\2LM\7\t\2\2MN\5\16\b\2NO\b\b\1\2OQ\3\2\2\2PF\3\2\2\2PK\3\2\2\2QV\3"+
		"\2\2\2RS\5\20\t\2ST\b\b\1\2TV\3\2\2\2UP\3\2\2\2UR\3\2\2\2V\17\3\2\2\2"+
		"WX\5\24\13\2XY\5\22\n\2YZ\b\t\1\2Z\21\3\2\2\2[\\\t\2\2\2\\]\5\24\13\2"+
		"]^\b\n\1\2^_\5\22\n\2_`\b\n\1\2`c\3\2\2\2ac\b\n\1\2b[\3\2\2\2ba\3\2\2"+
		"\2c\23\3\2\2\2de\5\30\r\2ef\5\26\f\2fg\b\13\1\2g\25\3\2\2\2hi\t\3\2\2"+
		"ij\5\30\r\2jk\b\f\1\2kl\5\26\f\2lm\b\f\1\2mp\3\2\2\2np\b\f\1\2oh\3\2\2"+
		"\2on\3\2\2\2p\27\3\2\2\2qr\7\20\2\2r{\b\r\1\2st\7\21\2\2t{\b\r\1\2uv\7"+
		"\16\2\2vw\5\16\b\2wx\7\17\2\2xy\b\r\1\2y{\3\2\2\2zq\3\2\2\2zs\3\2\2\2"+
		"zu\3\2\2\2{\31\3\2\2\2\n\36-@PUboz";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}