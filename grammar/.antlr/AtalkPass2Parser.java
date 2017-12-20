// Generated from /home/vmoh/uni_projs/compiler/Compiler-Atalk-phase3/grammar/AtalkPass2.g4 by ANTLR 4.7

	import java.util.ArrayList ;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AtalkPass2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, CONST_NUM=38, 
		CONST_CHAR=39, CONST_STR=40, NL=41, ID=42, COMMENT=43, WS=44;
	public static final int
		RULE_program = 0, RULE_actor = 1, RULE_state = 2, RULE_receiver = 3, RULE_type = 4, 
		RULE_block = 5, RULE_statements = 6, RULE_statement = 7, RULE_stm_vardef = 8, 
		RULE_stm_tell = 9, RULE_stm_write = 10, RULE_stm_if_elseif_else = 11, 
		RULE_stm_foreach = 12, RULE_stm_quit = 13, RULE_stm_break = 14, RULE_stm_assignment = 15, 
		RULE_expr = 16, RULE_expr_assign = 17, RULE_expr_or = 18, RULE_expr_or_tmp = 19, 
		RULE_expr_and = 20, RULE_expr_and_tmp = 21, RULE_expr_eq = 22, RULE_expr_eq_tmp = 23, 
		RULE_expr_cmp = 24, RULE_expr_cmp_tmp = 25, RULE_expr_add = 26, RULE_expr_add_tmp = 27, 
		RULE_expr_mult = 28, RULE_expr_mult_tmp = 29, RULE_expr_un = 30, RULE_expr_mem = 31, 
		RULE_expr_mem_tmp = 32, RULE_expr_other = 33;
	public static final String[] ruleNames = {
		"program", "actor", "state", "receiver", "type", "block", "statements", 
		"statement", "stm_vardef", "stm_tell", "stm_write", "stm_if_elseif_else", 
		"stm_foreach", "stm_quit", "stm_break", "stm_assignment", "expr", "expr_assign", 
		"expr_or", "expr_or_tmp", "expr_and", "expr_and_tmp", "expr_eq", "expr_eq_tmp", 
		"expr_cmp", "expr_cmp_tmp", "expr_add", "expr_add_tmp", "expr_mult", "expr_mult_tmp", 
		"expr_un", "expr_mem", "expr_mem_tmp", "expr_other"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'actor'", "'<'", "'>'", "'end'", "','", "'receiver'", "'('", "')'", 
		"'char'", "'['", "']'", "'int'", "'begin'", "'='", "'sender'", "'self'", 
		"'<<'", "'write'", "'if'", "'elseif'", "'else'", "'foreach'", "'in'", 
		"'quit'", "'break'", "'or'", "'and'", "'=='", "'<>'", "'+'", "'-'", "'*'", 
		"'/'", "'not'", "'{'", "'}'", "'read'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "CONST_NUM", "CONST_CHAR", "CONST_STR", "NL", "ID", "COMMENT", 
		"WS"
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
	public String getGrammarFileName() { return "AtalkPass2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		boolean hasErr = false;
		ArrayList<String> logs = new ArrayList<String>();
		String currentActor;

		void cerr(String str) {
			// System.out.println(str);
		}
	    void print(String str){
			// logs.add(str);
	    }
		void printErr(int line, String str){
			hasErr = true;
	        System.out.println("line " + line + ": " + str);
	    }
		void printLogs() {
			if (hasErr)
				return;
			for (int i = 0; i < logs.size(); i++) {
				System.out.println(logs.get(i));
			}
		}

	    void beginScope() {
	        SymbolTable.push();
	    }

	    void endScope() {
	        print("Stack offset: " + SymbolTable.top.getOffset(Register.SP) + ", Global offset: " + SymbolTable.top.getOffset(Register.GP));
	        SymbolTable.pop();
	    }

		int putLocalVar(String name, Type type) throws ItemAlreadyExistsException {
			int offset = SymbolTable.top.getOffset(Register.SP);
	        try{
	            SymbolTable.top.put(
	                new SymbolTableLocalVariableItem(
	                    new Variable(name, type),
	                    offset
	                )
	            );
	        }
	        catch (ItemAlreadyExistsException iaee){
	            name = name+"_temp";
	            offset = putLocalVar(name, type);
	            throw iaee;
	        }
			return offset;
	    }

		void checkVariableExistance(int line, String name) {
			SymbolTableItem sti = SymbolTable.top.get(name);
			try {
				if(sti == null) {
					throw new UndefinedVariableException();
				}
				else {
					cerr("hast " + name);
				}
			} catch (UndefinedVariableException uve) {
				try {
					SymbolTable.define();
					putLocalVar(name, NoType.getInstance());
				} catch (ItemAlreadyExistsException iaee) {
					printErr(line, "ERR: variable already exists: " + iaee.getName());
				}
				printErr(line, "ERR: Item " + name + " doesn't exist.");
			}
		}

		void checkActorExistance(int line, String name) {
			SymbolTableItem sti = SymbolTable.top.get(name);
			try {
				if(sti == null) {
					throw new UndefinedActorException();
				} else {
					cerr("actor hast " + name);
				}
			} catch (UndefinedActorException uae) {
				printErr(line, "ERR: Actor " + name + " doesn't exist.");
			}
		}
		void checkReceiverExistance(int line, String actor, String receiverKey) {
			SymbolTableActorItem stai = (SymbolTableActorItem) SymbolTable.top.get(actor);
			try {
				if (stai != null && !stai.hasReceiver(receiverKey)) {
					// stai.printReceivers();
					throw new UndefinedReceiverException();
				}
			} catch (UndefinedReceiverException ure) {
				printErr(line, "ERR: Receiver " + receiverKey + " doesn't exist in Actor " + actor + ".");
			}
		}
		Type getIDType(String name) {
			SymbolTableLocalVariableItem stlvi = (SymbolTableLocalVariableItem) SymbolTable.top.get(name);
			Variable var = stlvi.getVariable();
			return var.getType();
		}
		void typeCheck(int line, Type t1, Type t2) {
			try {
				if (!t1.equals(t2)) {
					throw new TypeErrorException();
				}
			} catch (TypeErrorException tee) {
				printErr(line, "ERR: Can't convert type " + t2.toString() + " to " + t1.toString());
			}
		}
		void checkArrayDim(int line, Type type, int dim) {
			try {
				if (type instanceof ArrayType && !(dim <= ((ArrayType) type).dim())) {
					throw new TypeErrorException();
				}
			} catch (TypeErrorException tee) {
				printErr(line, "ERR: Array " + type.toString() + " dimensions count is less than " + dim);
			}
		}
		void checkLValue(int line, boolean is_lvalue) {
			try {
				if (!is_lvalue) {
					throw new LValueException();
				}
			} catch (LValueException lve) {
				printErr(line, "ERR: Can't assign to RValue");
			}
		}
		void checkForeach(int line, Type exp) {
			try {
				if (!(exp instanceof ArrayType)) {
					throw new ForeachIterativeException();
				} /* else if (!exp.type().equals(var)) {
					throw new ForeachIteratorException();
				} */
			} catch (ForeachIterativeException ftie) {
				printErr(line, "ERR: Foreach iterative must be an array");
			} /* catch (ForeachIteratorException ftoe) {
				printErr(line, "ERR: Foreach iterator '" + var.toString() + "' doesn't match '" + exp.type().toString() + "'");
			} */
		}

	public AtalkPass2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<ActorContext> actor() {
			return getRuleContexts(ActorContext.class);
		}
		public ActorContext actor(int i) {
			return getRuleContext(ActorContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(AtalkPass2Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AtalkPass2Parser.NL, i);
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
			 beginScope(); 
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==NL) {
				{
				setState(71);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(69);
					actor();
					}
					break;
				case NL:
					{
					setState(70);
					match(NL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

					endScope();
					printLogs();
				
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

	public static class ActorContext extends ParserRuleContext {
		public Token act;
		public TerminalNode CONST_NUM() { return getToken(AtalkPass2Parser.CONST_NUM, 0); }
		public List<TerminalNode> NL() { return getTokens(AtalkPass2Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AtalkPass2Parser.NL, i);
		}
		public TerminalNode ID() { return getToken(AtalkPass2Parser.ID, 0); }
		public TerminalNode EOF() { return getToken(AtalkPass2Parser.EOF, 0); }
		public List<StateContext> state() {
			return getRuleContexts(StateContext.class);
		}
		public StateContext state(int i) {
			return getRuleContext(StateContext.class,i);
		}
		public List<ReceiverContext> receiver() {
			return getRuleContexts(ReceiverContext.class);
		}
		public ReceiverContext receiver(int i) {
			return getRuleContext(ReceiverContext.class,i);
		}
		public ActorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actor; }
	}

	public final ActorContext actor() throws RecognitionException {
		ActorContext _localctx = new ActorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_actor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__0);
			setState(79);
			((ActorContext)_localctx).act = match(ID);
			currentActor = ((ActorContext)_localctx).act.getText();
			setState(81);
			match(T__1);
			setState(82);
			match(CONST_NUM);
			setState(83);
			match(T__2);
			setState(84);
			match(NL);
			 beginScope(); 
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__8) | (1L << T__11) | (1L << NL))) != 0)) {
				{
				setState(89);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
				case T__11:
					{
					setState(86);
					state();
					}
					break;
				case T__5:
					{
					setState(87);
					receiver();
					}
					break;
				case NL:
					{
					setState(88);
					match(NL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
			match(T__3);
			 endScope(); 
			setState(96);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==NL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class StateContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(AtalkPass2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AtalkPass2Parser.ID, i);
		}
		public TerminalNode NL() { return getToken(AtalkPass2Parser.NL, 0); }
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_state);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			type();
			setState(99);
			match(ID);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(100);
				match(T__4);
				setState(101);
				match(ID);
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			match(NL);
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

	public static class ReceiverContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(AtalkPass2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AtalkPass2Parser.ID, i);
		}
		public List<TerminalNode> NL() { return getTokens(AtalkPass2Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AtalkPass2Parser.NL, i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public ReceiverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiver; }
	}

	public final ReceiverContext receiver() throws RecognitionException {
		ReceiverContext _localctx = new ReceiverContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_receiver);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__5);
			setState(110);
			match(ID);
			setState(111);
			match(T__6);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8 || _la==T__11) {
				{
				setState(112);
				type();
				setState(113);
				match(ID);
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(114);
					match(T__4);
					setState(115);
					type();
					setState(116);
					match(ID);
					}
					}
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(125);
			match(T__7);
			setState(126);
			match(NL);
			 beginScope(); 
			setState(128);
			statements();
			setState(129);
			match(T__3);
			setState(130);
			match(NL);
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

	public static class TypeContext extends ParserRuleContext {
		public Type retType;
		public int size = 1;
		public ArrayList<Integer> dims = new ArrayList<Integer>();
		public Type x;
		public Token sz;
		public List<TerminalNode> CONST_NUM() { return getTokens(AtalkPass2Parser.CONST_NUM); }
		public TerminalNode CONST_NUM(int i) {
			return getToken(AtalkPass2Parser.CONST_NUM, i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(T__8);
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(134);
					match(T__9);
					setState(135);
					((TypeContext)_localctx).sz = match(CONST_NUM);
					setState(136);
					match(T__10);

								_localctx.size *= (((TypeContext)_localctx).sz!=null?Integer.valueOf(((TypeContext)_localctx).sz.getText()):0);

								if((((TypeContext)_localctx).sz!=null?Integer.valueOf(((TypeContext)_localctx).sz.getText()):0) <= 0) {
									((TypeContext)_localctx).retType =  new ArrayType(CharType.getInstance(), 0);
								}
								_localctx.dims.add((((TypeContext)_localctx).sz!=null?Integer.valueOf(((TypeContext)_localctx).sz.getText()):0));
							
					}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}

							((TypeContext)_localctx).retType =  CharType.getInstance();
							if (_localctx.size == 1 && (((TypeContext)_localctx).sz!=null?Integer.valueOf(((TypeContext)_localctx).sz.getText()):0) == 0)
								((TypeContext)_localctx).retType =  CharType.getInstance();
							else {
								for(int i = _localctx.dims.size()-1; i >= 0; i--){
									if(i == _localctx.dims.size()-1)
										((TypeContext)_localctx).x =  new ArrayType(CharType.getInstance(), _localctx.dims.get(i));
									else
										((TypeContext)_localctx).x =  new ArrayType(_localctx.x, _localctx.dims.get(i));
								}
								((TypeContext)_localctx).retType =  _localctx.x;
							}
						
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(T__11);
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(145);
					match(T__9);
					setState(146);
					((TypeContext)_localctx).sz = match(CONST_NUM);
					setState(147);
					match(T__10);

								_localctx.size *= (((TypeContext)_localctx).sz!=null?Integer.valueOf(((TypeContext)_localctx).sz.getText()):0);
								if((((TypeContext)_localctx).sz!=null?Integer.valueOf(((TypeContext)_localctx).sz.getText()):0) <= 0){
									((TypeContext)_localctx).retType =  new ArrayType(IntType.getInstance(), 0);
								}
								_localctx.dims.add((((TypeContext)_localctx).sz!=null?Integer.valueOf(((TypeContext)_localctx).sz.getText()):0));
							
					}
					}
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}

							((TypeContext)_localctx).retType =  IntType.getInstance();
							if (_localctx.size == 1 && (((TypeContext)_localctx).sz!=null?Integer.valueOf(((TypeContext)_localctx).sz.getText()):0) == 0)
								((TypeContext)_localctx).retType =  IntType.getInstance();
							else if (_localctx.size != 0 && (((TypeContext)_localctx).sz!=null?Integer.valueOf(((TypeContext)_localctx).sz.getText()):0) != 0) {
								for(int i = _localctx.dims.size()-1; i >= 0; i--){
									if(i == _localctx.dims.size()-1)
										((TypeContext)_localctx).x =  new ArrayType(IntType.getInstance(), _localctx.dims.get(i));
									else
										((TypeContext)_localctx).x =  new ArrayType(_localctx.x, _localctx.dims.get(i));
								}
								((TypeContext)_localctx).retType =  _localctx.x;
							}
						
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

	public static class BlockContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(AtalkPass2Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AtalkPass2Parser.NL, i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(T__12);
			setState(158);
			match(NL);
			 beginScope(); 
			setState(160);
			statements();
			setState(161);
			match(T__3);
			setState(162);
			match(NL);
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

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(AtalkPass2Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AtalkPass2Parser.NL, i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__30) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << CONST_NUM) | (1L << CONST_CHAR) | (1L << CONST_STR) | (1L << NL) | (1L << ID))) != 0)) {
				{
				setState(167);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__6:
				case T__8:
				case T__11:
				case T__12:
				case T__14:
				case T__15:
				case T__17:
				case T__18:
				case T__21:
				case T__23:
				case T__24:
				case T__30:
				case T__33:
				case T__34:
				case T__36:
				case CONST_NUM:
				case CONST_CHAR:
				case CONST_STR:
				case ID:
					{
					setState(165);
					statement();
					}
					break;
				case NL:
					{
					setState(166);
					match(NL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class StatementContext extends ParserRuleContext {
		public Stm_vardefContext stm_vardef() {
			return getRuleContext(Stm_vardefContext.class,0);
		}
		public Stm_assignmentContext stm_assignment() {
			return getRuleContext(Stm_assignmentContext.class,0);
		}
		public Stm_foreachContext stm_foreach() {
			return getRuleContext(Stm_foreachContext.class,0);
		}
		public Stm_if_elseif_elseContext stm_if_elseif_else() {
			return getRuleContext(Stm_if_elseif_elseContext.class,0);
		}
		public Stm_quitContext stm_quit() {
			return getRuleContext(Stm_quitContext.class,0);
		}
		public Stm_breakContext stm_break() {
			return getRuleContext(Stm_breakContext.class,0);
		}
		public Stm_tellContext stm_tell() {
			return getRuleContext(Stm_tellContext.class,0);
		}
		public Stm_writeContext stm_write() {
			return getRuleContext(Stm_writeContext.class,0);
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
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				stm_vardef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				stm_assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				stm_foreach();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(175);
				stm_if_elseif_else();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(176);
				stm_quit();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(177);
				stm_break();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(178);
				stm_tell();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(179);
				stm_write();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(180);
				block();
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

	public static class Stm_vardefContext extends ParserRuleContext {
		public Type exp2LastType = NoType.getInstance();
		public TypeContext tp;
		public Token var;
		public ExprContext exp;
		public ExprContext exp2;
		public TerminalNode NL() { return getToken(AtalkPass2Parser.NL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(AtalkPass2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AtalkPass2Parser.ID, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Stm_vardefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_vardef; }
	}

	public final Stm_vardefContext stm_vardef() throws RecognitionException {
		Stm_vardefContext _localctx = new Stm_vardefContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stm_vardef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			((Stm_vardefContext)_localctx).tp = type();
			setState(184);
			((Stm_vardefContext)_localctx).var = match(ID);

						SymbolTable.define();
					
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(186);
				match(T__13);
				setState(187);
				((Stm_vardefContext)_localctx).exp = expr();

							typeCheck((((Stm_vardefContext)_localctx).var!=null?((Stm_vardefContext)_localctx).var.getLine():0), ((Stm_vardefContext)_localctx).tp.retType, ((Stm_vardefContext)_localctx).exp.retType);
						
				}
			}

			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(192);
				match(T__4);
				setState(193);
				match(ID);

							SymbolTable.define();
						
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(195);
					match(T__13);
					setState(196);
					((Stm_vardefContext)_localctx).exp2 = expr();

								if (_localctx.exp2LastType.equals(NoType.getInstance())) {
									checkLValue((((Stm_vardefContext)_localctx).var!=null?((Stm_vardefContext)_localctx).var.getLine():0), ((Stm_vardefContext)_localctx).exp.is_lvalue);
								} else {
									checkLValue((((Stm_vardefContext)_localctx).var!=null?((Stm_vardefContext)_localctx).var.getLine():0), ((Stm_vardefContext)_localctx).exp2.is_lvalue);
								}
								((Stm_vardefContext)_localctx).exp2LastType =  ((Stm_vardefContext)_localctx).exp2.retType;
								typeCheck((((Stm_vardefContext)_localctx).var!=null?((Stm_vardefContext)_localctx).var.getLine():0), ((Stm_vardefContext)_localctx).tp.retType, ((Stm_vardefContext)_localctx).exp2.retType);
							
					}
				}

				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(206);
			match(NL);
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

	public static class Stm_tellContext extends ParserRuleContext {
		public String rcKey;
		public String actorName;
		public Token act;
		public Token rc;
		public ExprContext ex;
		public ExprContext ex2;
		public TerminalNode NL() { return getToken(AtalkPass2Parser.NL, 0); }
		public List<TerminalNode> ID() { return getTokens(AtalkPass2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AtalkPass2Parser.ID, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Stm_tellContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_tell; }
	}

	public final Stm_tellContext stm_tell() throws RecognitionException {
		Stm_tellContext _localctx = new Stm_tellContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stm_tell);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(208);
				((Stm_tellContext)_localctx).act = match(ID);

							((Stm_tellContext)_localctx).actorName =  ((Stm_tellContext)_localctx).act.getText();
							checkActorExistance((((Stm_tellContext)_localctx).act!=null?((Stm_tellContext)_localctx).act.getLine():0), _localctx.actorName);
						
				}
				break;
			case T__14:
				{
				setState(210);
				match(T__14);
				}
				break;
			case T__15:
				{
				setState(211);
				match(T__15);

							((Stm_tellContext)_localctx).actorName =  currentActor;
						
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(215);
			match(T__16);
			setState(216);
			((Stm_tellContext)_localctx).rc = match(ID);

						((Stm_tellContext)_localctx).rcKey =  ((Stm_tellContext)_localctx).rc.getText();
					
			setState(218);
			match(T__6);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__30) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << CONST_NUM) | (1L << CONST_CHAR) | (1L << CONST_STR) | (1L << ID))) != 0)) {
				{
				setState(219);
				((Stm_tellContext)_localctx).ex = expr();
				_localctx.rcKey += ":" + ((Stm_tellContext)_localctx).ex.retType.toString();
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(221);
					match(T__4);
					setState(222);
					((Stm_tellContext)_localctx).ex2 = expr();
					_localctx.rcKey += ":" + ((Stm_tellContext)_localctx).ex2.retType.toString();
					}
					}
					setState(229);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(232);
			match(T__7);
			setState(233);
			match(NL);

						checkReceiverExistance((((Stm_tellContext)_localctx).rc!=null?((Stm_tellContext)_localctx).rc.getLine():0), _localctx.actorName, _localctx.rcKey);
					
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

	public static class Stm_writeContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NL() { return getToken(AtalkPass2Parser.NL, 0); }
		public Stm_writeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_write; }
	}

	public final Stm_writeContext stm_write() throws RecognitionException {
		Stm_writeContext _localctx = new Stm_writeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stm_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(T__17);
			setState(237);
			match(T__6);
			setState(238);
			expr();
			setState(239);
			match(T__7);
			setState(240);
			match(NL);
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

	public static class Stm_if_elseif_elseContext extends ParserRuleContext {
		public ExprContext exp;
		public ExprContext exp2;
		public List<TerminalNode> NL() { return getTokens(AtalkPass2Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AtalkPass2Parser.NL, i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Stm_if_elseif_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_if_elseif_else; }
	}

	public final Stm_if_elseif_elseContext stm_if_elseif_else() throws RecognitionException {
		Stm_if_elseif_elseContext _localctx = new Stm_if_elseif_elseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_stm_if_elseif_else);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(T__18);
			setState(243);
			((Stm_if_elseif_elseContext)_localctx).exp = expr();
			setState(244);
			match(NL);

							typeCheck(((Stm_if_elseif_elseContext)_localctx).exp.line, IntType.getInstance(), ((Stm_if_elseif_elseContext)_localctx).exp.retType);
							beginScope();
						
			setState(246);
			statements();
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(247);
				match(T__19);
				setState(248);
				((Stm_if_elseif_elseContext)_localctx).exp2 = expr();
				setState(249);
				match(NL);

								typeCheck(((Stm_if_elseif_elseContext)_localctx).exp2.line, IntType.getInstance(), ((Stm_if_elseif_elseContext)_localctx).exp2.retType);
								endScope();
								beginScope();
							
				setState(251);
				statements();
				}
				}
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(258);
				match(T__20);
				setState(259);
				match(NL);

								endScope();
								beginScope();
							
				setState(261);
				statements();
				}
			}

			setState(264);
			match(T__3);
			setState(265);
			match(NL);
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

	public static class Stm_foreachContext extends ParserRuleContext {
		public Token var;
		public ExprContext exp;
		public List<TerminalNode> NL() { return getTokens(AtalkPass2Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AtalkPass2Parser.NL, i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode ID() { return getToken(AtalkPass2Parser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Stm_foreachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_foreach; }
	}

	public final Stm_foreachContext stm_foreach() throws RecognitionException {
		Stm_foreachContext _localctx = new Stm_foreachContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_stm_foreach);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(T__21);
			setState(269);
			((Stm_foreachContext)_localctx).var = match(ID);
			setState(270);
			match(T__22);
			setState(271);
			((Stm_foreachContext)_localctx).exp = expr();
			setState(272);
			match(NL);

							checkForeach((((Stm_foreachContext)_localctx).var!=null?((Stm_foreachContext)_localctx).var.getLine():0), ((Stm_foreachContext)_localctx).exp.retType);
							beginScope();
						
			setState(274);
			statements();
			setState(275);
			match(T__3);
			setState(276);
			match(NL);
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

	public static class Stm_quitContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(AtalkPass2Parser.NL, 0); }
		public Stm_quitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_quit; }
	}

	public final Stm_quitContext stm_quit() throws RecognitionException {
		Stm_quitContext _localctx = new Stm_quitContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stm_quit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(T__23);
			setState(280);
			match(NL);
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

	public static class Stm_breakContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(AtalkPass2Parser.NL, 0); }
		public Stm_breakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_break; }
	}

	public final Stm_breakContext stm_break() throws RecognitionException {
		Stm_breakContext _localctx = new Stm_breakContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stm_break);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(T__24);
			setState(283);
			match(NL);
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

	public static class Stm_assignmentContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NL() { return getToken(AtalkPass2Parser.NL, 0); }
		public Stm_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_assignment; }
	}

	public final Stm_assignmentContext stm_assignment() throws RecognitionException {
		Stm_assignmentContext _localctx = new Stm_assignmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_stm_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			expr();
			setState(286);
			match(NL);
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
		public int line;
		public boolean is_lvalue;
		public Type retType;
		public Expr_assignContext exp;
		public Expr_assignContext expr_assign() {
			return getRuleContext(Expr_assignContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			((ExprContext)_localctx).exp = expr_assign();

						((ExprContext)_localctx).line =  ((ExprContext)_localctx).exp.line;
						((ExprContext)_localctx).is_lvalue =  ((ExprContext)_localctx).exp.is_lvalue;
						((ExprContext)_localctx).retType =  ((ExprContext)_localctx).exp.retType;
					
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

	public static class Expr_assignContext extends ParserRuleContext {
		public int line;
		public boolean is_lvalue;
		public Type retType;
		public Expr_orContext exp;
		public Expr_assignContext exp2;
		public Expr_orContext expr_or() {
			return getRuleContext(Expr_orContext.class,0);
		}
		public Expr_assignContext expr_assign() {
			return getRuleContext(Expr_assignContext.class,0);
		}
		public Expr_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_assign; }
	}

	public final Expr_assignContext expr_assign() throws RecognitionException {
		Expr_assignContext _localctx = new Expr_assignContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expr_assign);
		try {
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				((Expr_assignContext)_localctx).exp = expr_or();
				setState(292);
				match(T__13);
				setState(293);
				((Expr_assignContext)_localctx).exp2 = expr_assign();

							typeCheck(((Expr_assignContext)_localctx).exp.line, ((Expr_assignContext)_localctx).exp.retType, ((Expr_assignContext)_localctx).exp2.retType);
							checkLValue(((Expr_assignContext)_localctx).exp.line, ((Expr_assignContext)_localctx).exp.is_lvalue);
							((Expr_assignContext)_localctx).retType =  ((Expr_assignContext)_localctx).exp.retType;
							((Expr_assignContext)_localctx).is_lvalue =  ((Expr_assignContext)_localctx).exp2.is_lvalue;
							((Expr_assignContext)_localctx).line =  ((Expr_assignContext)_localctx).exp.line;
						
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				((Expr_assignContext)_localctx).exp = expr_or();

							((Expr_assignContext)_localctx).line =  ((Expr_assignContext)_localctx).exp.line;
							((Expr_assignContext)_localctx).is_lvalue =  ((Expr_assignContext)_localctx).exp.is_lvalue;
							((Expr_assignContext)_localctx).retType =  ((Expr_assignContext)_localctx).exp.retType;
						
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

	public static class Expr_orContext extends ParserRuleContext {
		public int line;
		public boolean is_lvalue;
		public Type retType;
		public Expr_andContext exp;
		public Expr_or_tmpContext exp2;
		public Expr_andContext expr_and() {
			return getRuleContext(Expr_andContext.class,0);
		}
		public Expr_or_tmpContext expr_or_tmp() {
			return getRuleContext(Expr_or_tmpContext.class,0);
		}
		public Expr_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_or; }
	}

	public final Expr_orContext expr_or() throws RecognitionException {
		Expr_orContext _localctx = new Expr_orContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expr_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			((Expr_orContext)_localctx).exp = expr_and();
			setState(302);
			((Expr_orContext)_localctx).exp2 = expr_or_tmp();

						if (!((Expr_orContext)_localctx).exp2.retType.equals(NoType.getInstance())) {
							typeCheck(((Expr_orContext)_localctx).exp.line, ((Expr_orContext)_localctx).exp.retType, ((Expr_orContext)_localctx).exp2.retType);
						}
						((Expr_orContext)_localctx).is_lvalue =  ((Expr_orContext)_localctx).exp.is_lvalue && ((Expr_orContext)_localctx).exp2.is_lvalue;
						((Expr_orContext)_localctx).retType =  ((Expr_orContext)_localctx).exp.retType;
						((Expr_orContext)_localctx).line =  ((Expr_orContext)_localctx).exp.line;
					
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

	public static class Expr_or_tmpContext extends ParserRuleContext {
		public int line;
		public boolean is_lvalue;
		public Type retType;
		public Expr_andContext exp;
		public Expr_or_tmpContext exp2;
		public Expr_andContext expr_and() {
			return getRuleContext(Expr_andContext.class,0);
		}
		public Expr_or_tmpContext expr_or_tmp() {
			return getRuleContext(Expr_or_tmpContext.class,0);
		}
		public Expr_or_tmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_or_tmp; }
	}

	public final Expr_or_tmpContext expr_or_tmp() throws RecognitionException {
		Expr_or_tmpContext _localctx = new Expr_or_tmpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expr_or_tmp);
		try {
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				match(T__25);
				setState(306);
				((Expr_or_tmpContext)_localctx).exp = expr_and();
				setState(307);
				((Expr_or_tmpContext)_localctx).exp2 = expr_or_tmp();

							if (!((Expr_or_tmpContext)_localctx).exp2.retType.equals(NoType.getInstance())) {
								typeCheck(((Expr_or_tmpContext)_localctx).exp.line, ((Expr_or_tmpContext)_localctx).exp.retType, ((Expr_or_tmpContext)_localctx).exp2.retType);
							}
							((Expr_or_tmpContext)_localctx).is_lvalue =  false;
							((Expr_or_tmpContext)_localctx).retType =  ((Expr_or_tmpContext)_localctx).exp.retType;
							((Expr_or_tmpContext)_localctx).line =  ((Expr_or_tmpContext)_localctx).exp.line;
						
				}
				break;
			case T__4:
			case T__7:
			case T__10:
			case T__13:
			case T__35:
			case NL:
				enterOuterAlt(_localctx, 2);
				{

							((Expr_or_tmpContext)_localctx).is_lvalue =  true;
							((Expr_or_tmpContext)_localctx).retType =  NoType.getInstance();
							((Expr_or_tmpContext)_localctx).line =  0;
						
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

	public static class Expr_andContext extends ParserRuleContext {
		public int line;
		public boolean is_lvalue;
		public Type retType;
		public Expr_eqContext exp;
		public Expr_and_tmpContext exp2;
		public Expr_eqContext expr_eq() {
			return getRuleContext(Expr_eqContext.class,0);
		}
		public Expr_and_tmpContext expr_and_tmp() {
			return getRuleContext(Expr_and_tmpContext.class,0);
		}
		public Expr_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_and; }
	}

	public final Expr_andContext expr_and() throws RecognitionException {
		Expr_andContext _localctx = new Expr_andContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expr_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			((Expr_andContext)_localctx).exp = expr_eq();
			setState(314);
			((Expr_andContext)_localctx).exp2 = expr_and_tmp();

						if (!((Expr_andContext)_localctx).exp2.retType.equals(NoType.getInstance())) {
							typeCheck(((Expr_andContext)_localctx).exp.line, ((Expr_andContext)_localctx).exp.retType, ((Expr_andContext)_localctx).exp2.retType);
						}
						((Expr_andContext)_localctx).is_lvalue =  ((Expr_andContext)_localctx).exp.is_lvalue && ((Expr_andContext)_localctx).exp2.is_lvalue;
						((Expr_andContext)_localctx).retType =  ((Expr_andContext)_localctx).exp.retType;
						((Expr_andContext)_localctx).line =  ((Expr_andContext)_localctx).exp.line;
					
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

	public static class Expr_and_tmpContext extends ParserRuleContext {
		public int line;
		public boolean is_lvalue;
		public Type retType;
		public Expr_eqContext exp;
		public Expr_and_tmpContext exp2;
		public Expr_eqContext expr_eq() {
			return getRuleContext(Expr_eqContext.class,0);
		}
		public Expr_and_tmpContext expr_and_tmp() {
			return getRuleContext(Expr_and_tmpContext.class,0);
		}
		public Expr_and_tmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_and_tmp; }
	}

	public final Expr_and_tmpContext expr_and_tmp() throws RecognitionException {
		Expr_and_tmpContext _localctx = new Expr_and_tmpContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expr_and_tmp);
		try {
			setState(323);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				match(T__26);
				setState(318);
				((Expr_and_tmpContext)_localctx).exp = expr_eq();
				setState(319);
				((Expr_and_tmpContext)_localctx).exp2 = expr_and_tmp();

							if (!((Expr_and_tmpContext)_localctx).exp2.retType.equals(NoType.getInstance())) {
								typeCheck(((Expr_and_tmpContext)_localctx).exp.line, ((Expr_and_tmpContext)_localctx).exp.retType, ((Expr_and_tmpContext)_localctx).exp2.retType);
							}
							((Expr_and_tmpContext)_localctx).is_lvalue =  false;
							((Expr_and_tmpContext)_localctx).retType =  ((Expr_and_tmpContext)_localctx).exp.retType;
							((Expr_and_tmpContext)_localctx).line =  ((Expr_and_tmpContext)_localctx).exp.line;
						
				}
				break;
			case T__4:
			case T__7:
			case T__10:
			case T__13:
			case T__25:
			case T__35:
			case NL:
				enterOuterAlt(_localctx, 2);
				{

							((Expr_and_tmpContext)_localctx).is_lvalue =  true;
							((Expr_and_tmpContext)_localctx).retType =  NoType.getInstance();
							((Expr_and_tmpContext)_localctx).line =  0;
						
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

	public static class Expr_eqContext extends ParserRuleContext {
		public int line;
		public boolean is_lvalue;
		public Type retType;
		public Expr_cmpContext exp;
		public Expr_eq_tmpContext exp2;
		public Expr_cmpContext expr_cmp() {
			return getRuleContext(Expr_cmpContext.class,0);
		}
		public Expr_eq_tmpContext expr_eq_tmp() {
			return getRuleContext(Expr_eq_tmpContext.class,0);
		}
		public Expr_eqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_eq; }
	}

	public final Expr_eqContext expr_eq() throws RecognitionException {
		Expr_eqContext _localctx = new Expr_eqContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expr_eq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			((Expr_eqContext)_localctx).exp = expr_cmp();
			setState(326);
			((Expr_eqContext)_localctx).exp2 = expr_eq_tmp();

						if (!((Expr_eqContext)_localctx).exp2.retType.equals(NoType.getInstance())) {
							typeCheck(((Expr_eqContext)_localctx).exp.line, ((Expr_eqContext)_localctx).exp.retType, ((Expr_eqContext)_localctx).exp2.retType);
						}
						((Expr_eqContext)_localctx).is_lvalue =  ((Expr_eqContext)_localctx).exp.is_lvalue && ((Expr_eqContext)_localctx).exp2.is_lvalue;
						((Expr_eqContext)_localctx).retType =  ((Expr_eqContext)_localctx).exp.retType;
						((Expr_eqContext)_localctx).line =  ((Expr_eqContext)_localctx).exp.line;
					
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

	public static class Expr_eq_tmpContext extends ParserRuleContext {
		public int line;
		public boolean is_lvalue;
		public Type retType;
		public Expr_cmpContext exp;
		public Expr_eq_tmpContext exp2;
		public Expr_cmpContext expr_cmp() {
			return getRuleContext(Expr_cmpContext.class,0);
		}
		public Expr_eq_tmpContext expr_eq_tmp() {
			return getRuleContext(Expr_eq_tmpContext.class,0);
		}
		public Expr_eq_tmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_eq_tmp; }
	}

	public final Expr_eq_tmpContext expr_eq_tmp() throws RecognitionException {
		Expr_eq_tmpContext _localctx = new Expr_eq_tmpContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expr_eq_tmp);
		int _la;
		try {
			setState(335);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				_la = _input.LA(1);
				if ( !(_la==T__27 || _la==T__28) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(330);
				((Expr_eq_tmpContext)_localctx).exp = expr_cmp();
				setState(331);
				((Expr_eq_tmpContext)_localctx).exp2 = expr_eq_tmp();

							if (!((Expr_eq_tmpContext)_localctx).exp2.retType.equals(NoType.getInstance())) {
								typeCheck(((Expr_eq_tmpContext)_localctx).exp.line, ((Expr_eq_tmpContext)_localctx).exp.retType, ((Expr_eq_tmpContext)_localctx).exp2.retType);
							}
							((Expr_eq_tmpContext)_localctx).is_lvalue =  false;
							((Expr_eq_tmpContext)_localctx).retType =  ((Expr_eq_tmpContext)_localctx).exp.retType;
							((Expr_eq_tmpContext)_localctx).line =  ((Expr_eq_tmpContext)_localctx).exp.line;
						
				}
				break;
			case T__4:
			case T__7:
			case T__10:
			case T__13:
			case T__25:
			case T__26:
			case T__35:
			case NL:
				enterOuterAlt(_localctx, 2);
				{

							((Expr_eq_tmpContext)_localctx).is_lvalue =  true;
							((Expr_eq_tmpContext)_localctx).retType =  NoType.getInstance();
							((Expr_eq_tmpContext)_localctx).line =  0;
						
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

	public static class Expr_cmpContext extends ParserRuleContext {
		public int line;
		public boolean is_lvalue;
		public Type retType;
		public Expr_addContext exp;
		public Expr_cmp_tmpContext exp2;
		public Expr_addContext expr_add() {
			return getRuleContext(Expr_addContext.class,0);
		}
		public Expr_cmp_tmpContext expr_cmp_tmp() {
			return getRuleContext(Expr_cmp_tmpContext.class,0);
		}
		public Expr_cmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_cmp; }
	}

	public final Expr_cmpContext expr_cmp() throws RecognitionException {
		Expr_cmpContext _localctx = new Expr_cmpContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expr_cmp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			((Expr_cmpContext)_localctx).exp = expr_add();
			setState(338);
			((Expr_cmpContext)_localctx).exp2 = expr_cmp_tmp();

						if (!((Expr_cmpContext)_localctx).exp2.retType.equals(NoType.getInstance())) {
							typeCheck(((Expr_cmpContext)_localctx).exp.line, ((Expr_cmpContext)_localctx).exp.retType, ((Expr_cmpContext)_localctx).exp2.retType);
						}
						((Expr_cmpContext)_localctx).is_lvalue =  ((Expr_cmpContext)_localctx).exp.is_lvalue && ((Expr_cmpContext)_localctx).exp2.is_lvalue;
						((Expr_cmpContext)_localctx).retType =  ((Expr_cmpContext)_localctx).exp.retType;
						((Expr_cmpContext)_localctx).line =  ((Expr_cmpContext)_localctx).exp.line;
					
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

	public static class Expr_cmp_tmpContext extends ParserRuleContext {
		public int line;
		public boolean is_lvalue;
		public Type retType;
		public Expr_addContext exp;
		public Expr_cmp_tmpContext exp2;
		public Expr_addContext expr_add() {
			return getRuleContext(Expr_addContext.class,0);
		}
		public Expr_cmp_tmpContext expr_cmp_tmp() {
			return getRuleContext(Expr_cmp_tmpContext.class,0);
		}
		public Expr_cmp_tmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_cmp_tmp; }
	}

	public final Expr_cmp_tmpContext expr_cmp_tmp() throws RecognitionException {
		Expr_cmp_tmpContext _localctx = new Expr_cmp_tmpContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expr_cmp_tmp);
		int _la;
		try {
			setState(347);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				_la = _input.LA(1);
				if ( !(_la==T__1 || _la==T__2) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(342);
				((Expr_cmp_tmpContext)_localctx).exp = expr_add();
				setState(343);
				((Expr_cmp_tmpContext)_localctx).exp2 = expr_cmp_tmp();

							if (!((Expr_cmp_tmpContext)_localctx).exp2.retType.equals(NoType.getInstance())) {
								typeCheck(((Expr_cmp_tmpContext)_localctx).exp.line, ((Expr_cmp_tmpContext)_localctx).exp.retType, ((Expr_cmp_tmpContext)_localctx).exp2.retType);
							}
							((Expr_cmp_tmpContext)_localctx).is_lvalue =  false;
							((Expr_cmp_tmpContext)_localctx).retType =  ((Expr_cmp_tmpContext)_localctx).exp.retType;
							((Expr_cmp_tmpContext)_localctx).line =  ((Expr_cmp_tmpContext)_localctx).exp.line;
						
				}
				break;
			case T__4:
			case T__7:
			case T__10:
			case T__13:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__35:
			case NL:
				enterOuterAlt(_localctx, 2);
				{

							((Expr_cmp_tmpContext)_localctx).is_lvalue =  true;
							((Expr_cmp_tmpContext)_localctx).retType =  NoType.getInstance();
							((Expr_cmp_tmpContext)_localctx).line =  0;
						
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

	public static class Expr_addContext extends ParserRuleContext {
		public int line;
		public boolean is_lvalue;
		public Type retType;
		public Expr_multContext exp;
		public Expr_add_tmpContext exp2;
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
	}

	public final Expr_addContext expr_add() throws RecognitionException {
		Expr_addContext _localctx = new Expr_addContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expr_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			((Expr_addContext)_localctx).exp = expr_mult();
			setState(350);
			((Expr_addContext)_localctx).exp2 = expr_add_tmp();

						if (!((Expr_addContext)_localctx).exp2.retType.equals(NoType.getInstance())) {
							typeCheck(((Expr_addContext)_localctx).exp.line, ((Expr_addContext)_localctx).exp.retType, ((Expr_addContext)_localctx).exp2.retType);
						}
						((Expr_addContext)_localctx).is_lvalue =  ((Expr_addContext)_localctx).exp.is_lvalue && ((Expr_addContext)_localctx).exp2.is_lvalue;
						((Expr_addContext)_localctx).retType =  ((Expr_addContext)_localctx).exp.retType;
						((Expr_addContext)_localctx).line =  ((Expr_addContext)_localctx).exp.line;
					
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
		public int line;
		public boolean is_lvalue;
		public Type retType;
		public Expr_multContext exp;
		public Expr_add_tmpContext exp2;
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
		enterRule(_localctx, 54, RULE_expr_add_tmp);
		int _la;
		try {
			setState(359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				_la = _input.LA(1);
				if ( !(_la==T__29 || _la==T__30) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(354);
				((Expr_add_tmpContext)_localctx).exp = expr_mult();
				setState(355);
				((Expr_add_tmpContext)_localctx).exp2 = expr_add_tmp();

							if (!((Expr_add_tmpContext)_localctx).exp2.retType.equals(NoType.getInstance())) {
								typeCheck(((Expr_add_tmpContext)_localctx).exp.line, ((Expr_add_tmpContext)_localctx).exp.retType, ((Expr_add_tmpContext)_localctx).exp2.retType);
							}
							((Expr_add_tmpContext)_localctx).is_lvalue =  false;
							((Expr_add_tmpContext)_localctx).retType =  ((Expr_add_tmpContext)_localctx).exp.retType;
							((Expr_add_tmpContext)_localctx).line =  ((Expr_add_tmpContext)_localctx).exp.line;
						
				}
				break;
			case T__1:
			case T__2:
			case T__4:
			case T__7:
			case T__10:
			case T__13:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__35:
			case NL:
				enterOuterAlt(_localctx, 2);
				{

							((Expr_add_tmpContext)_localctx).is_lvalue =  true;
							((Expr_add_tmpContext)_localctx).retType =  NoType.getInstance();
							((Expr_add_tmpContext)_localctx).line =  0;
						
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
		public int line;
		public boolean is_lvalue;
		public Type retType;
		public Expr_unContext exp;
		public Expr_mult_tmpContext exp2;
		public Expr_unContext expr_un() {
			return getRuleContext(Expr_unContext.class,0);
		}
		public Expr_mult_tmpContext expr_mult_tmp() {
			return getRuleContext(Expr_mult_tmpContext.class,0);
		}
		public Expr_multContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_mult; }
	}

	public final Expr_multContext expr_mult() throws RecognitionException {
		Expr_multContext _localctx = new Expr_multContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expr_mult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			((Expr_multContext)_localctx).exp = expr_un();
			setState(362);
			((Expr_multContext)_localctx).exp2 = expr_mult_tmp();

						if (!((Expr_multContext)_localctx).exp2.retType.equals(NoType.getInstance())) {
							typeCheck(((Expr_multContext)_localctx).exp.line, ((Expr_multContext)_localctx).exp.retType, ((Expr_multContext)_localctx).exp2.retType);
						}
						((Expr_multContext)_localctx).is_lvalue =  ((Expr_multContext)_localctx).exp.is_lvalue && ((Expr_multContext)_localctx).exp2.is_lvalue;
						((Expr_multContext)_localctx).retType =  ((Expr_multContext)_localctx).exp.retType;
						((Expr_multContext)_localctx).line =  ((Expr_multContext)_localctx).exp.line;
					
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
		public int line;
		public boolean is_lvalue;
		public Type retType;
		public Expr_unContext exp;
		public Expr_mult_tmpContext exp2;
		public Expr_unContext expr_un() {
			return getRuleContext(Expr_unContext.class,0);
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
		enterRule(_localctx, 58, RULE_expr_mult_tmp);
		int _la;
		try {
			setState(371);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				_la = _input.LA(1);
				if ( !(_la==T__31 || _la==T__32) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(366);
				((Expr_mult_tmpContext)_localctx).exp = expr_un();
				setState(367);
				((Expr_mult_tmpContext)_localctx).exp2 = expr_mult_tmp();

							if (!((Expr_mult_tmpContext)_localctx).exp2.retType.equals(NoType.getInstance())) {
								typeCheck(((Expr_mult_tmpContext)_localctx).exp.line, ((Expr_mult_tmpContext)_localctx).exp.retType, ((Expr_mult_tmpContext)_localctx).exp2.retType);
							}
							((Expr_mult_tmpContext)_localctx).is_lvalue =  false;
							((Expr_mult_tmpContext)_localctx).retType =  ((Expr_mult_tmpContext)_localctx).exp.retType;
							((Expr_mult_tmpContext)_localctx).line =  ((Expr_mult_tmpContext)_localctx).exp.line;
						
				}
				break;
			case T__1:
			case T__2:
			case T__4:
			case T__7:
			case T__10:
			case T__13:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__35:
			case NL:
				enterOuterAlt(_localctx, 2);
				{

							((Expr_mult_tmpContext)_localctx).is_lvalue =  true;
							((Expr_mult_tmpContext)_localctx).retType =  NoType.getInstance();
							((Expr_mult_tmpContext)_localctx).line =  0;
						
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

	public static class Expr_unContext extends ParserRuleContext {
		public int line;
		public boolean is_lvalue;
		public Type retType;
		public Expr_unContext exp;
		public Expr_memContext exp2;
		public Expr_unContext expr_un() {
			return getRuleContext(Expr_unContext.class,0);
		}
		public Expr_memContext expr_mem() {
			return getRuleContext(Expr_memContext.class,0);
		}
		public Expr_unContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_un; }
	}

	public final Expr_unContext expr_un() throws RecognitionException {
		Expr_unContext _localctx = new Expr_unContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_expr_un);
		int _la;
		try {
			setState(380);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				_la = _input.LA(1);
				if ( !(_la==T__30 || _la==T__33) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(374);
				((Expr_unContext)_localctx).exp = expr_un();

							((Expr_unContext)_localctx).is_lvalue =  false;
							((Expr_unContext)_localctx).retType =  ((Expr_unContext)_localctx).exp.retType;
							((Expr_unContext)_localctx).line =  ((Expr_unContext)_localctx).exp.line;
						
				}
				break;
			case T__6:
			case T__34:
			case T__36:
			case CONST_NUM:
			case CONST_CHAR:
			case CONST_STR:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
				((Expr_unContext)_localctx).exp2 = expr_mem();

							((Expr_unContext)_localctx).is_lvalue =  ((Expr_unContext)_localctx).exp2.is_lvalue;
							((Expr_unContext)_localctx).retType =  ((Expr_unContext)_localctx).exp2.retType;
							((Expr_unContext)_localctx).line =  ((Expr_unContext)_localctx).exp2.line;
						
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

	public static class Expr_memContext extends ParserRuleContext {
		public int line;
		public boolean is_lvalue;
		public Type retType;
		public Expr_otherContext exp;
		public Expr_mem_tmpContext expmt;
		public Expr_otherContext expr_other() {
			return getRuleContext(Expr_otherContext.class,0);
		}
		public Expr_mem_tmpContext expr_mem_tmp() {
			return getRuleContext(Expr_mem_tmpContext.class,0);
		}
		public Expr_memContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_mem; }
	}

	public final Expr_memContext expr_mem() throws RecognitionException {
		Expr_memContext _localctx = new Expr_memContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expr_mem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			((Expr_memContext)_localctx).exp = expr_other();

						((Expr_memContext)_localctx).is_lvalue =  ((Expr_memContext)_localctx).exp.is_lvalue;
						((Expr_memContext)_localctx).retType =  ((Expr_memContext)_localctx).exp.retType;
						((Expr_memContext)_localctx).line =  ((Expr_memContext)_localctx).exp.line;
					
			setState(384);
			((Expr_memContext)_localctx).expmt = expr_mem_tmp();

						checkArrayDim(((Expr_memContext)_localctx).exp.line, ((Expr_memContext)_localctx).exp.retType, ((Expr_memContext)_localctx).expmt.dim);

						for (int i = 0; i < ((Expr_memContext)_localctx).expmt.dim; i++) {
							((Expr_memContext)_localctx).retType =  ((ArrayType) _localctx.retType).type();
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

	public static class Expr_mem_tmpContext extends ParserRuleContext {
		public int dim;
		public Expr_mem_tmpContext expmt;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_mem_tmpContext expr_mem_tmp() {
			return getRuleContext(Expr_mem_tmpContext.class,0);
		}
		public Expr_mem_tmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_mem_tmp; }
	}

	public final Expr_mem_tmpContext expr_mem_tmp() throws RecognitionException {
		Expr_mem_tmpContext _localctx = new Expr_mem_tmpContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_expr_mem_tmp);
		try {
			setState(394);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				match(T__9);
				setState(388);
				expr();
				setState(389);
				match(T__10);
				setState(390);
				((Expr_mem_tmpContext)_localctx).expmt = expr_mem_tmp();

							((Expr_mem_tmpContext)_localctx).dim =  ((Expr_mem_tmpContext)_localctx).expmt.dim + 1;
						
				}
				break;
			case T__1:
			case T__2:
			case T__4:
			case T__7:
			case T__10:
			case T__13:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__35:
			case NL:
				enterOuterAlt(_localctx, 2);
				{

						((Expr_mem_tmpContext)_localctx).dim =  0;
						
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
		public int line;
		public boolean is_lvalue;
		public Type retType;
		public int arrayLength = 0;
		public Token l;
		public Token l2;
		public Token str;
		public Token var;
		public ExprContext exp;
		public ExprContext exp2;
		public Token alen;
		public TerminalNode CONST_NUM() { return getToken(AtalkPass2Parser.CONST_NUM, 0); }
		public TerminalNode CONST_CHAR() { return getToken(AtalkPass2Parser.CONST_CHAR, 0); }
		public TerminalNode CONST_STR() { return getToken(AtalkPass2Parser.CONST_STR, 0); }
		public TerminalNode ID() { return getToken(AtalkPass2Parser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Expr_otherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_other; }
	}

	public final Expr_otherContext expr_other() throws RecognitionException {
		Expr_otherContext _localctx = new Expr_otherContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_expr_other);
		int _la;
		try {
			setState(429);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST_NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				((Expr_otherContext)_localctx).l = match(CONST_NUM);

							((Expr_otherContext)_localctx).is_lvalue =  false;
							((Expr_otherContext)_localctx).retType =  IntType.getInstance();
							((Expr_otherContext)_localctx).line =  (((Expr_otherContext)_localctx).l!=null?((Expr_otherContext)_localctx).l.getLine():0);
						
				}
				break;
			case CONST_CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(398);
				((Expr_otherContext)_localctx).l2 = match(CONST_CHAR);

							((Expr_otherContext)_localctx).is_lvalue =  false;
							((Expr_otherContext)_localctx).retType =  CharType.getInstance();
							((Expr_otherContext)_localctx).line =  (((Expr_otherContext)_localctx).l2!=null?((Expr_otherContext)_localctx).l2.getLine():0);
						
				}
				break;
			case CONST_STR:
				enterOuterAlt(_localctx, 3);
				{
				setState(400);
				((Expr_otherContext)_localctx).str = match(CONST_STR);

							((Expr_otherContext)_localctx).is_lvalue =  false;
							((Expr_otherContext)_localctx).retType =  new ArrayType(CharType.getInstance(), ((Expr_otherContext)_localctx).str.getText().length()); ((Expr_otherContext)_localctx).line =  (((Expr_otherContext)_localctx).str!=null?((Expr_otherContext)_localctx).str.getLine():0);
						
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(402);
				((Expr_otherContext)_localctx).var = match(ID);

							checkVariableExistance((((Expr_otherContext)_localctx).var!=null?((Expr_otherContext)_localctx).var.getLine():0), ((Expr_otherContext)_localctx).var.getText());
							((Expr_otherContext)_localctx).is_lvalue =  true;
							((Expr_otherContext)_localctx).retType =  getIDType(((Expr_otherContext)_localctx).var.getText());
							((Expr_otherContext)_localctx).line =  (((Expr_otherContext)_localctx).var!=null?((Expr_otherContext)_localctx).var.getLine():0);
						
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 5);
				{
				setState(404);
				match(T__34);
				setState(405);
				((Expr_otherContext)_localctx).exp = expr();

							((Expr_otherContext)_localctx).arrayLength =  1;
						
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(407);
					match(T__4);
					setState(408);
					((Expr_otherContext)_localctx).exp2 = expr();

								((Expr_otherContext)_localctx).line =  ((Expr_otherContext)_localctx).exp.line;
								typeCheck(_localctx.line, ((Expr_otherContext)_localctx).exp2.retType, ((Expr_otherContext)_localctx).exp.retType);
								_localctx.arrayLength += 1;
							
					}
					}
					setState(415);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(416);
				match(T__35);

							((Expr_otherContext)_localctx).is_lvalue =  false; ((Expr_otherContext)_localctx).retType =  new ArrayType(((Expr_otherContext)_localctx).exp.retType, _localctx.arrayLength);
						
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 6);
				{
				setState(419);
				match(T__36);
				setState(420);
				match(T__6);
				setState(421);
				((Expr_otherContext)_localctx).alen = match(CONST_NUM);
				setState(422);
				match(T__7);

							((Expr_otherContext)_localctx).is_lvalue =  false;
							((Expr_otherContext)_localctx).retType =  new ArrayType(CharType.getInstance(), (((Expr_otherContext)_localctx).alen!=null?Integer.valueOf(((Expr_otherContext)_localctx).alen.getText()):0));
							((Expr_otherContext)_localctx).line =  (((Expr_otherContext)_localctx).alen!=null?((Expr_otherContext)_localctx).alen.getLine():0);
						
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 7);
				{
				setState(424);
				match(T__6);
				setState(425);
				((Expr_otherContext)_localctx).exp = expr();
				setState(426);
				match(T__7);

							((Expr_otherContext)_localctx).is_lvalue =  ((Expr_otherContext)_localctx).exp.is_lvalue;
							((Expr_otherContext)_localctx).retType =  ((Expr_otherContext)_localctx).exp.retType;
							((Expr_otherContext)_localctx).line =  ((Expr_otherContext)_localctx).exp.line;
						
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u01b2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\7\2J\n\2\f\2\16\2M\13\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\\\n\3\f\3\16\3_\13\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\7\4i\n\4\f\4\16\4l\13\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\7\5y\n\5\f\5\16\5|\13\5\5\5~\n\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6\u008d\n\6\f\6\16\6\u0090\13"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0098\n\6\f\6\16\6\u009b\13\6\3\6\5\6\u009e"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\7\b\u00aa\n\b\f\b\16\b\u00ad"+
		"\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b8\n\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\u00c1\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00ca\n\n"+
		"\7\n\u00cc\n\n\f\n\16\n\u00cf\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\5"+
		"\13\u00d8\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13"+
		"\u00e4\n\13\f\13\16\13\u00e7\13\13\5\13\u00e9\n\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7"+
		"\r\u0100\n\r\f\r\16\r\u0103\13\r\3\r\3\r\3\r\3\r\5\r\u0109\n\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\5\23\u012e\n\23\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\5\25\u013a\n\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\5\27\u0146\n\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\5\31\u0152\n\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\5\33\u015e\n\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\5\35\u016a\n\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\5\37"+
		"\u0176\n\37\3 \3 \3 \3 \3 \3 \3 \5 \u017f\n \3!\3!\3!\3!\3!\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\5\"\u018d\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\7#\u019e\n#\f#\16#\u01a1\13#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\5#\u01b0\n#\3#\2\2$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&(*,.\60\62\64\668:<>@BD\2\b\3\3++\3\2\36\37\3\2\4\5\3\2 !\3\2\"#\4\2"+
		"!!$$\2\u01bd\2F\3\2\2\2\4P\3\2\2\2\6d\3\2\2\2\bo\3\2\2\2\n\u009d\3\2\2"+
		"\2\f\u009f\3\2\2\2\16\u00ab\3\2\2\2\20\u00b7\3\2\2\2\22\u00b9\3\2\2\2"+
		"\24\u00d7\3\2\2\2\26\u00ee\3\2\2\2\30\u00f4\3\2\2\2\32\u010e\3\2\2\2\34"+
		"\u0119\3\2\2\2\36\u011c\3\2\2\2 \u011f\3\2\2\2\"\u0122\3\2\2\2$\u012d"+
		"\3\2\2\2&\u012f\3\2\2\2(\u0139\3\2\2\2*\u013b\3\2\2\2,\u0145\3\2\2\2."+
		"\u0147\3\2\2\2\60\u0151\3\2\2\2\62\u0153\3\2\2\2\64\u015d\3\2\2\2\66\u015f"+
		"\3\2\2\28\u0169\3\2\2\2:\u016b\3\2\2\2<\u0175\3\2\2\2>\u017e\3\2\2\2@"+
		"\u0180\3\2\2\2B\u018c\3\2\2\2D\u01af\3\2\2\2FK\b\2\1\2GJ\5\4\3\2HJ\7+"+
		"\2\2IG\3\2\2\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2"+
		"\2\2NO\b\2\1\2O\3\3\2\2\2PQ\7\3\2\2QR\7,\2\2RS\b\3\1\2ST\7\4\2\2TU\7("+
		"\2\2UV\7\5\2\2VW\7+\2\2W]\b\3\1\2X\\\5\6\4\2Y\\\5\b\5\2Z\\\7+\2\2[X\3"+
		"\2\2\2[Y\3\2\2\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_]"+
		"\3\2\2\2`a\7\6\2\2ab\b\3\1\2bc\t\2\2\2c\5\3\2\2\2de\5\n\6\2ej\7,\2\2f"+
		"g\7\7\2\2gi\7,\2\2hf\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2l"+
		"j\3\2\2\2mn\7+\2\2n\7\3\2\2\2op\7\b\2\2pq\7,\2\2q}\7\t\2\2rs\5\n\6\2s"+
		"z\7,\2\2tu\7\7\2\2uv\5\n\6\2vw\7,\2\2wy\3\2\2\2xt\3\2\2\2y|\3\2\2\2zx"+
		"\3\2\2\2z{\3\2\2\2{~\3\2\2\2|z\3\2\2\2}r\3\2\2\2}~\3\2\2\2~\177\3\2\2"+
		"\2\177\u0080\7\n\2\2\u0080\u0081\7+\2\2\u0081\u0082\b\5\1\2\u0082\u0083"+
		"\5\16\b\2\u0083\u0084\7\6\2\2\u0084\u0085\7+\2\2\u0085\u0086\b\5\1\2\u0086"+
		"\t\3\2\2\2\u0087\u008e\7\13\2\2\u0088\u0089\7\f\2\2\u0089\u008a\7(\2\2"+
		"\u008a\u008b\7\r\2\2\u008b\u008d\b\6\1\2\u008c\u0088\3\2\2\2\u008d\u0090"+
		"\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0091\u009e\b\6\1\2\u0092\u0099\7\16\2\2\u0093\u0094\7"+
		"\f\2\2\u0094\u0095\7(\2\2\u0095\u0096\7\r\2\2\u0096\u0098\b\6\1\2\u0097"+
		"\u0093\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009e\b\6\1\2\u009d"+
		"\u0087\3\2\2\2\u009d\u0092\3\2\2\2\u009e\13\3\2\2\2\u009f\u00a0\7\17\2"+
		"\2\u00a0\u00a1\7+\2\2\u00a1\u00a2\b\7\1\2\u00a2\u00a3\5\16\b\2\u00a3\u00a4"+
		"\7\6\2\2\u00a4\u00a5\7+\2\2\u00a5\u00a6\b\7\1\2\u00a6\r\3\2\2\2\u00a7"+
		"\u00aa\5\20\t\2\u00a8\u00aa\7+\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00a8\3\2"+
		"\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\17\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b8\5\22\n\2\u00af\u00b8\5 \21"+
		"\2\u00b0\u00b8\5\32\16\2\u00b1\u00b8\5\30\r\2\u00b2\u00b8\5\34\17\2\u00b3"+
		"\u00b8\5\36\20\2\u00b4\u00b8\5\24\13\2\u00b5\u00b8\5\26\f\2\u00b6\u00b8"+
		"\5\f\7\2\u00b7\u00ae\3\2\2\2\u00b7\u00af\3\2\2\2\u00b7\u00b0\3\2\2\2\u00b7"+
		"\u00b1\3\2\2\2\u00b7\u00b2\3\2\2\2\u00b7\u00b3\3\2\2\2\u00b7\u00b4\3\2"+
		"\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\21\3\2\2\2\u00b9\u00ba"+
		"\5\n\6\2\u00ba\u00bb\7,\2\2\u00bb\u00c0\b\n\1\2\u00bc\u00bd\7\20\2\2\u00bd"+
		"\u00be\5\"\22\2\u00be\u00bf\b\n\1\2\u00bf\u00c1\3\2\2\2\u00c0\u00bc\3"+
		"\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00cd\3\2\2\2\u00c2\u00c3\7\7\2\2\u00c3"+
		"\u00c4\7,\2\2\u00c4\u00c9\b\n\1\2\u00c5\u00c6\7\20\2\2\u00c6\u00c7\5\""+
		"\22\2\u00c7\u00c8\b\n\1\2\u00c8\u00ca\3\2\2\2\u00c9\u00c5\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c2\3\2\2\2\u00cc\u00cf\3\2"+
		"\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00d0\u00d1\7+\2\2\u00d1\23\3\2\2\2\u00d2\u00d3\7,\2\2"+
		"\u00d3\u00d8\b\13\1\2\u00d4\u00d8\7\21\2\2\u00d5\u00d6\7\22\2\2\u00d6"+
		"\u00d8\b\13\1\2\u00d7\u00d2\3\2\2\2\u00d7\u00d4\3\2\2\2\u00d7\u00d5\3"+
		"\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\7\23\2\2\u00da\u00db\7,\2\2\u00db"+
		"\u00dc\b\13\1\2\u00dc\u00e8\7\t\2\2\u00dd\u00de\5\"\22\2\u00de\u00e5\b"+
		"\13\1\2\u00df\u00e0\7\7\2\2\u00e0\u00e1\5\"\22\2\u00e1\u00e2\b\13\1\2"+
		"\u00e2\u00e4\3\2\2\2\u00e3\u00df\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3"+
		"\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8"+
		"\u00dd\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\7\n"+
		"\2\2\u00eb\u00ec\7+\2\2\u00ec\u00ed\b\13\1\2\u00ed\25\3\2\2\2\u00ee\u00ef"+
		"\7\24\2\2\u00ef\u00f0\7\t\2\2\u00f0\u00f1\5\"\22\2\u00f1\u00f2\7\n\2\2"+
		"\u00f2\u00f3\7+\2\2\u00f3\27\3\2\2\2\u00f4\u00f5\7\25\2\2\u00f5\u00f6"+
		"\5\"\22\2\u00f6\u00f7\7+\2\2\u00f7\u00f8\b\r\1\2\u00f8\u0101\5\16\b\2"+
		"\u00f9\u00fa\7\26\2\2\u00fa\u00fb\5\"\22\2\u00fb\u00fc\7+\2\2\u00fc\u00fd"+
		"\b\r\1\2\u00fd\u00fe\5\16\b\2\u00fe\u0100\3\2\2\2\u00ff\u00f9\3\2\2\2"+
		"\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0108"+
		"\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0105\7\27\2\2\u0105\u0106\7+\2\2\u0106"+
		"\u0107\b\r\1\2\u0107\u0109\5\16\b\2\u0108\u0104\3\2\2\2\u0108\u0109\3"+
		"\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\7\6\2\2\u010b\u010c\7+\2\2\u010c"+
		"\u010d\b\r\1\2\u010d\31\3\2\2\2\u010e\u010f\7\30\2\2\u010f\u0110\7,\2"+
		"\2\u0110\u0111\7\31\2\2\u0111\u0112\5\"\22\2\u0112\u0113\7+\2\2\u0113"+
		"\u0114\b\16\1\2\u0114\u0115\5\16\b\2\u0115\u0116\7\6\2\2\u0116\u0117\7"+
		"+\2\2\u0117\u0118\b\16\1\2\u0118\33\3\2\2\2\u0119\u011a\7\32\2\2\u011a"+
		"\u011b\7+\2\2\u011b\35\3\2\2\2\u011c\u011d\7\33\2\2\u011d\u011e\7+\2\2"+
		"\u011e\37\3\2\2\2\u011f\u0120\5\"\22\2\u0120\u0121\7+\2\2\u0121!\3\2\2"+
		"\2\u0122\u0123\5$\23\2\u0123\u0124\b\22\1\2\u0124#\3\2\2\2\u0125\u0126"+
		"\5&\24\2\u0126\u0127\7\20\2\2\u0127\u0128\5$\23\2\u0128\u0129\b\23\1\2"+
		"\u0129\u012e\3\2\2\2\u012a\u012b\5&\24\2\u012b\u012c\b\23\1\2\u012c\u012e"+
		"\3\2\2\2\u012d\u0125\3\2\2\2\u012d\u012a\3\2\2\2\u012e%\3\2\2\2\u012f"+
		"\u0130\5*\26\2\u0130\u0131\5(\25\2\u0131\u0132\b\24\1\2\u0132\'\3\2\2"+
		"\2\u0133\u0134\7\34\2\2\u0134\u0135\5*\26\2\u0135\u0136\5(\25\2\u0136"+
		"\u0137\b\25\1\2\u0137\u013a\3\2\2\2\u0138\u013a\b\25\1\2\u0139\u0133\3"+
		"\2\2\2\u0139\u0138\3\2\2\2\u013a)\3\2\2\2\u013b\u013c\5.\30\2\u013c\u013d"+
		"\5,\27\2\u013d\u013e\b\26\1\2\u013e+\3\2\2\2\u013f\u0140\7\35\2\2\u0140"+
		"\u0141\5.\30\2\u0141\u0142\5,\27\2\u0142\u0143\b\27\1\2\u0143\u0146\3"+
		"\2\2\2\u0144\u0146\b\27\1\2\u0145\u013f\3\2\2\2\u0145\u0144\3\2\2\2\u0146"+
		"-\3\2\2\2\u0147\u0148\5\62\32\2\u0148\u0149\5\60\31\2\u0149\u014a\b\30"+
		"\1\2\u014a/\3\2\2\2\u014b\u014c\t\3\2\2\u014c\u014d\5\62\32\2\u014d\u014e"+
		"\5\60\31\2\u014e\u014f\b\31\1\2\u014f\u0152\3\2\2\2\u0150\u0152\b\31\1"+
		"\2\u0151\u014b\3\2\2\2\u0151\u0150\3\2\2\2\u0152\61\3\2\2\2\u0153\u0154"+
		"\5\66\34\2\u0154\u0155\5\64\33\2\u0155\u0156\b\32\1\2\u0156\63\3\2\2\2"+
		"\u0157\u0158\t\4\2\2\u0158\u0159\5\66\34\2\u0159\u015a\5\64\33\2\u015a"+
		"\u015b\b\33\1\2\u015b\u015e\3\2\2\2\u015c\u015e\b\33\1\2\u015d\u0157\3"+
		"\2\2\2\u015d\u015c\3\2\2\2\u015e\65\3\2\2\2\u015f\u0160\5:\36\2\u0160"+
		"\u0161\58\35\2\u0161\u0162\b\34\1\2\u0162\67\3\2\2\2\u0163\u0164\t\5\2"+
		"\2\u0164\u0165\5:\36\2\u0165\u0166\58\35\2\u0166\u0167\b\35\1\2\u0167"+
		"\u016a\3\2\2\2\u0168\u016a\b\35\1\2\u0169\u0163\3\2\2\2\u0169\u0168\3"+
		"\2\2\2\u016a9\3\2\2\2\u016b\u016c\5> \2\u016c\u016d\5<\37\2\u016d\u016e"+
		"\b\36\1\2\u016e;\3\2\2\2\u016f\u0170\t\6\2\2\u0170\u0171\5> \2\u0171\u0172"+
		"\5<\37\2\u0172\u0173\b\37\1\2\u0173\u0176\3\2\2\2\u0174\u0176\b\37\1\2"+
		"\u0175\u016f\3\2\2\2\u0175\u0174\3\2\2\2\u0176=\3\2\2\2\u0177\u0178\t"+
		"\7\2\2\u0178\u0179\5> \2\u0179\u017a\b \1\2\u017a\u017f\3\2\2\2\u017b"+
		"\u017c\5@!\2\u017c\u017d\b \1\2\u017d\u017f\3\2\2\2\u017e\u0177\3\2\2"+
		"\2\u017e\u017b\3\2\2\2\u017f?\3\2\2\2\u0180\u0181\5D#\2\u0181\u0182\b"+
		"!\1\2\u0182\u0183\5B\"\2\u0183\u0184\b!\1\2\u0184A\3\2\2\2\u0185\u0186"+
		"\7\f\2\2\u0186\u0187\5\"\22\2\u0187\u0188\7\r\2\2\u0188\u0189\5B\"\2\u0189"+
		"\u018a\b\"\1\2\u018a\u018d\3\2\2\2\u018b\u018d\b\"\1\2\u018c\u0185\3\2"+
		"\2\2\u018c\u018b\3\2\2\2\u018dC\3\2\2\2\u018e\u018f\7(\2\2\u018f\u01b0"+
		"\b#\1\2\u0190\u0191\7)\2\2\u0191\u01b0\b#\1\2\u0192\u0193\7*\2\2\u0193"+
		"\u01b0\b#\1\2\u0194\u0195\7,\2\2\u0195\u01b0\b#\1\2\u0196\u0197\7%\2\2"+
		"\u0197\u0198\5\"\22\2\u0198\u019f\b#\1\2\u0199\u019a\7\7\2\2\u019a\u019b"+
		"\5\"\22\2\u019b\u019c\b#\1\2\u019c\u019e\3\2\2\2\u019d\u0199\3\2\2\2\u019e"+
		"\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a2\3\2"+
		"\2\2\u01a1\u019f\3\2\2\2\u01a2\u01a3\7&\2\2\u01a3\u01a4\b#\1\2\u01a4\u01b0"+
		"\3\2\2\2\u01a5\u01a6\7\'\2\2\u01a6\u01a7\7\t\2\2\u01a7\u01a8\7(\2\2\u01a8"+
		"\u01a9\7\n\2\2\u01a9\u01b0\b#\1\2\u01aa\u01ab\7\t\2\2\u01ab\u01ac\5\""+
		"\22\2\u01ac\u01ad\7\n\2\2\u01ad\u01ae\b#\1\2\u01ae\u01b0\3\2\2\2\u01af"+
		"\u018e\3\2\2\2\u01af\u0190\3\2\2\2\u01af\u0192\3\2\2\2\u01af\u0194\3\2"+
		"\2\2\u01af\u0196\3\2\2\2\u01af\u01a5\3\2\2\2\u01af\u01aa\3\2\2\2\u01b0"+
		"E\3\2\2\2\"IK[]jz}\u008e\u0099\u009d\u00a9\u00ab\u00b7\u00c0\u00c9\u00cd"+
		"\u00d7\u00e5\u00e8\u0101\u0108\u012d\u0139\u0145\u0151\u015d\u0169\u0175"+
		"\u017e\u018c\u019f\u01af";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}