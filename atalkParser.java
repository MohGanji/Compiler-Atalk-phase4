// Generated from atalk.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class atalkParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, COMMENT=16, 
		NEWLINE=17, SPACE=18, ACTOR=19, RECEIVER=20, TYPE=21, END=22, STRING=23, 
		CHAR=24, NUMBER=25, ID=26, CHARACTER=27, ANY_CHAR=28;
	public static final int
		RULE_program = 0, RULE_actor = 1, RULE_actor_content = 2, RULE_actor_size = 3, 
		RULE_state = 4, RULE_global_vardef = 5, RULE_receiver = 6, RULE_arguments = 7, 
		RULE_arg_var = 8, RULE_receiver_content = 9, RULE_vardef = 10, RULE_var = 11, 
		RULE_value = 12, RULE_expr = 13, RULE_exprp = 14, RULE_texpr = 15, RULE_texprp = 16, 
		RULE_fexpr = 17, RULE_def_value = 18, RULE_array = 19, RULE_var_type = 20, 
		RULE_array_def = 21, RULE_array_access = 22;
	public static final String[] ruleNames = {
		"program", "actor", "actor_content", "actor_size", "state", "global_vardef", 
		"receiver", "arguments", "arg_var", "receiver_content", "vardef", "var", 
		"value", "expr", "exprp", "texpr", "texprp", "fexpr", "def_value", "array", 
		"var_type", "array_def", "array_access"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'<'", "'>'", "','", "'('", "')'", "'='", "'+'", "'-'", "'*'", "'/'", 
		"'^'", "'{'", "'}'", "'['", "']'", null, null, null, "'actor'", "'receiver'", 
		null, "'end'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "COMMENT", "NEWLINE", "SPACE", "ACTOR", "RECEIVER", 
		"TYPE", "END", "STRING", "CHAR", "NUMBER", "ID", "CHARACTER", "ANY_CHAR"
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
	public String getGrammarFileName() { return "atalk.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    void print(String str){
	        System.out.println(str);
	    }

	public atalkParser(TokenStream input) {
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
		public List<TerminalNode> NEWLINE() { return getTokens(atalkParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(atalkParser.NEWLINE, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE || _la==ACTOR) {
				{
				setState(48);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ACTOR:
					{
					setState(46);
					actor();
					}
					break;
				case NEWLINE:
					{
					setState(47);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(52);
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

	public static class ActorContext extends ParserRuleContext {
		public TerminalNode ACTOR() { return getToken(atalkParser.ACTOR, 0); }
		public TerminalNode ID() { return getToken(atalkParser.ID, 0); }
		public Actor_sizeContext actor_size() {
			return getRuleContext(Actor_sizeContext.class,0);
		}
		public Actor_contentContext actor_content() {
			return getRuleContext(Actor_contentContext.class,0);
		}
		public TerminalNode END() { return getToken(atalkParser.END, 0); }
		public TerminalNode NEWLINE() { return getToken(atalkParser.NEWLINE, 0); }
		public ActorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterActor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitActor(this);
		}
	}

	public final ActorContext actor() throws RecognitionException {
		ActorContext _localctx = new ActorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_actor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(ACTOR);
			setState(54);
			match(ID);
			setState(55);
			actor_size();
			setState(56);
			actor_content();
			setState(57);
			match(END);
			setState(58);
			match(NEWLINE);
			print("actor");
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

	public static class Actor_contentContext extends ParserRuleContext {
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
		public Actor_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actor_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterActor_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitActor_content(this);
		}
	}

	public final Actor_contentContext actor_content() throws RecognitionException {
		Actor_contentContext _localctx = new Actor_contentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_actor_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(63);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TYPE:
					{
					setState(61);
					state();
					}
					break;
				case RECEIVER:
					{
					setState(62);
					receiver();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==RECEIVER || _la==TYPE );
			print("actor content");
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

	public static class Actor_sizeContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(atalkParser.NUMBER, 0); }
		public TerminalNode NEWLINE() { return getToken(atalkParser.NEWLINE, 0); }
		public Actor_sizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actor_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterActor_size(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitActor_size(this);
		}
	}

	public final Actor_sizeContext actor_size() throws RecognitionException {
		Actor_sizeContext _localctx = new Actor_sizeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_actor_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__0);
			setState(70);
			match(NUMBER);
			setState(71);
			match(T__1);
			setState(72);
			match(NEWLINE);
			print("actor size");
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
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public List<Global_vardefContext> global_vardef() {
			return getRuleContexts(Global_vardefContext.class);
		}
		public Global_vardefContext global_vardef(int i) {
			return getRuleContext(Global_vardefContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(atalkParser.NEWLINE, 0); }
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitState(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_state);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("state start");
			setState(76);
			var_type();
			setState(77);
			global_vardef();
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(78);
				match(T__2);
				setState(79);
				global_vardef();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			match(NEWLINE);
			print("state");
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

	public static class Global_vardefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(atalkParser.ID, 0); }
		public Global_vardefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_vardef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterGlobal_vardef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitGlobal_vardef(this);
		}
	}

	public final Global_vardefContext global_vardef() throws RecognitionException {
		Global_vardefContext _localctx = new Global_vardefContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_global_vardef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(ID);
			print("global vardef");
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
		public TerminalNode RECEIVER() { return getToken(atalkParser.RECEIVER, 0); }
		public TerminalNode ID() { return getToken(atalkParser.ID, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public Receiver_contentContext receiver_content() {
			return getRuleContext(Receiver_contentContext.class,0);
		}
		public TerminalNode END() { return getToken(atalkParser.END, 0); }
		public TerminalNode NEWLINE() { return getToken(atalkParser.NEWLINE, 0); }
		public ReceiverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiver; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterReceiver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitReceiver(this);
		}
	}

	public final ReceiverContext receiver() throws RecognitionException {
		ReceiverContext _localctx = new ReceiverContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_receiver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(RECEIVER);
			setState(92);
			match(ID);
			setState(93);
			arguments();
			setState(94);
			receiver_content();
			setState(95);
			match(END);
			setState(96);
			match(NEWLINE);
			print("receiver");
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

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(atalkParser.NEWLINE, 0); }
		public List<Arg_varContext> arg_var() {
			return getRuleContexts(Arg_varContext.class);
		}
		public Arg_varContext arg_var(int i) {
			return getRuleContext(Arg_varContext.class,i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(T__3);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(100);
				arg_var();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			match(T__4);
			setState(107);
			match(NEWLINE);
			print("arguments");
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

	public static class Arg_varContext extends ParserRuleContext {
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public Global_vardefContext global_vardef() {
			return getRuleContext(Global_vardefContext.class,0);
		}
		public Arg_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterArg_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitArg_var(this);
		}
	}

	public final Arg_varContext arg_var() throws RecognitionException {
		Arg_varContext _localctx = new Arg_varContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arg_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			var_type();
			setState(111);
			global_vardef();
			print("arg var");
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

	public static class Receiver_contentContext extends ParserRuleContext {
		public List<VardefContext> vardef() {
			return getRuleContexts(VardefContext.class);
		}
		public VardefContext vardef(int i) {
			return getRuleContext(VardefContext.class,i);
		}
		public Receiver_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiver_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterReceiver_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitReceiver_content(this);
		}
	}

	public final Receiver_contentContext receiver_content() throws RecognitionException {
		Receiver_contentContext _localctx = new Receiver_contentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_receiver_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(114);
				vardef();
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			print("receiver content");
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
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(atalkParser.NEWLINE, 0); }
		public VardefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterVardef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitVardef(this);
		}
	}

	public final VardefContext vardef() throws RecognitionException {
		VardefContext _localctx = new VardefContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_vardef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			var_type();
			setState(123);
			var();
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(124);
				match(T__2);
				setState(125);
				var();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
			match(NEWLINE);
			print("vardef");
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(atalkParser.ID, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(ID);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(135);
				match(T__5);
				setState(136);
				value();
				}
			}

			print("var");
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

	public static class ValueContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_value);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__12:
			case NEWLINE:
			case STRING:
			case CHAR:
			case NUMBER:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				expr();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				array();
				print("value");
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

	public static class ExprContext extends ParserRuleContext {
		public TexprContext texpr() {
			return getRuleContext(TexprContext.class,0);
		}
		public ExprpContext exprp() {
			return getRuleContext(ExprpContext.class,0);
		}
		public Def_valueContext def_value() {
			return getRuleContext(Def_valueContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(147);
				texpr();
				setState(148);
				exprp();
				}
				break;
			case 2:
				{
				setState(150);
				def_value();
				}
				break;
			}
			print("expr");
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

	public static class ExprpContext extends ParserRuleContext {
		public TexprContext texpr() {
			return getRuleContext(TexprContext.class,0);
		}
		public ExprpContext exprp() {
			return getRuleContext(ExprpContext.class,0);
		}
		public ExprpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterExprp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitExprp(this);
		}
	}

	public final ExprpContext exprp() throws RecognitionException {
		ExprpContext _localctx = new ExprpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_exprp);
		int _la;
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				_la = _input.LA(1);
				if ( !(_la==T__6 || _la==T__7) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(156);
				texpr();
				setState(157);
				exprp();
				}
				break;
			case T__2:
			case T__4:
			case T__12:
			case NEWLINE:
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

	public static class TexprContext extends ParserRuleContext {
		public FexprContext fexpr() {
			return getRuleContext(FexprContext.class,0);
		}
		public TexprpContext texprp() {
			return getRuleContext(TexprpContext.class,0);
		}
		public TexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_texpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterTexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitTexpr(this);
		}
	}

	public final TexprContext texpr() throws RecognitionException {
		TexprContext _localctx = new TexprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_texpr);
		try {
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				fexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				texprp();
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

	public static class TexprpContext extends ParserRuleContext {
		public FexprContext fexpr() {
			return getRuleContext(FexprContext.class,0);
		}
		public TexprpContext texprp() {
			return getRuleContext(TexprpContext.class,0);
		}
		public TexprpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_texprp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterTexprp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitTexprp(this);
		}
	}

	public final TexprpContext texprp() throws RecognitionException {
		TexprpContext _localctx = new TexprpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_texprp);
		int _la;
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__3:
			case STRING:
			case CHAR:
			case NUMBER:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				fexpr();
				setState(168);
				texprp();
				}
				break;
			case T__2:
			case T__4:
			case T__6:
			case T__7:
			case T__12:
			case NEWLINE:
				enterOuterAlt(_localctx, 3);
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

	public static class FexprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Def_valueContext def_value() {
			return getRuleContext(Def_valueContext.class,0);
		}
		public FexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterFexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitFexpr(this);
		}
	}

	public final FexprContext fexpr() throws RecognitionException {
		FexprContext _localctx = new FexprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_fexpr);
		try {
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(T__3);
				setState(174);
				expr();
				setState(175);
				match(T__4);
				}
				break;
			case STRING:
			case CHAR:
			case NUMBER:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				def_value();
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

	public static class Def_valueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(atalkParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(atalkParser.NUMBER, 0); }
		public TerminalNode CHAR() { return getToken(atalkParser.CHAR, 0); }
		public TerminalNode ID() { return getToken(atalkParser.ID, 0); }
		public Def_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterDef_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitDef_value(this);
		}
	}

	public final Def_valueContext def_value() throws RecognitionException {
		Def_valueContext _localctx = new Def_valueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_def_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << CHAR) | (1L << NUMBER) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			print("def value");
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

	public static class ArrayContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(T__11);
			setState(184);
			value();
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(185);
				match(T__2);
				setState(186);
				value();
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192);
			match(T__12);
			print("array");
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

	public static class Var_typeContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(atalkParser.TYPE, 0); }
		public List<Array_defContext> array_def() {
			return getRuleContexts(Array_defContext.class);
		}
		public Array_defContext array_def(int i) {
			return getRuleContext(Array_defContext.class,i);
		}
		public Var_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterVar_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitVar_type(this);
		}
	}

	public final Var_typeContext var_type() throws RecognitionException {
		Var_typeContext _localctx = new Var_typeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_var_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(TYPE);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(196);
				array_def();
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			print("var type");
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

	public static class Array_defContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(atalkParser.NUMBER, 0); }
		public Array_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterArray_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitArray_def(this);
		}
	}

	public final Array_defContext array_def() throws RecognitionException {
		Array_defContext _localctx = new Array_defContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_array_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(204);
			match(T__13);
			setState(205);
			match(NUMBER);
			setState(206);
			match(T__14);
			}
			print("array def");
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

	public static class Array_accessContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(atalkParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(atalkParser.NUMBER, 0); }
		public Array_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_access; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterArray_access(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitArray_access(this);
		}
	}

	public final Array_accessContext array_access() throws RecognitionException {
		Array_accessContext _localctx = new Array_accessContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_array_access);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(210);
			match(T__13);
			setState(211);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(212);
			match(T__14);
			}
			print("array access");
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u00db\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\7"+
		"\2\63\n\2\f\2\16\2\66\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\6\4"+
		"B\n\4\r\4\16\4C\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7"+
		"\6S\n\6\f\6\16\6V\13\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\7\th\n\t\f\t\16\tk\13\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\13\7\13v\n\13\f\13\16\13y\13\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u0081"+
		"\n\f\f\f\16\f\u0084\13\f\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u008c\n\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\5\16\u0094\n\16\3\17\3\17\3\17\3\17\5\17\u009a\n"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\5\20\u00a3\n\20\3\21\3\21\5\21"+
		"\u00a7\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u00ae\n\22\3\23\3\23\3\23\3"+
		"\23\3\23\5\23\u00b5\n\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u00be"+
		"\n\25\f\25\16\25\u00c1\13\25\3\25\3\25\3\25\3\26\3\26\7\26\u00c8\n\26"+
		"\f\26\16\26\u00cb\13\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\2\2\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\2\6\3\2\t\n\3\2\13\r\3\2\31\34\3\2\33\34\2\u00d5\2\64\3\2"+
		"\2\2\4\67\3\2\2\2\6A\3\2\2\2\bG\3\2\2\2\nM\3\2\2\2\fZ\3\2\2\2\16]\3\2"+
		"\2\2\20e\3\2\2\2\22p\3\2\2\2\24w\3\2\2\2\26|\3\2\2\2\30\u0088\3\2\2\2"+
		"\32\u0093\3\2\2\2\34\u0099\3\2\2\2\36\u00a2\3\2\2\2 \u00a6\3\2\2\2\"\u00ad"+
		"\3\2\2\2$\u00b4\3\2\2\2&\u00b6\3\2\2\2(\u00b9\3\2\2\2*\u00c5\3\2\2\2,"+
		"\u00ce\3\2\2\2.\u00d4\3\2\2\2\60\63\5\4\3\2\61\63\7\23\2\2\62\60\3\2\2"+
		"\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\3\3\2\2"+
		"\2\66\64\3\2\2\2\678\7\25\2\289\7\34\2\29:\5\b\5\2:;\5\6\4\2;<\7\30\2"+
		"\2<=\7\23\2\2=>\b\3\1\2>\5\3\2\2\2?B\5\n\6\2@B\5\16\b\2A?\3\2\2\2A@\3"+
		"\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2DE\3\2\2\2EF\b\4\1\2F\7\3\2\2\2GH"+
		"\7\3\2\2HI\7\33\2\2IJ\7\4\2\2JK\7\23\2\2KL\b\5\1\2L\t\3\2\2\2MN\b\6\1"+
		"\2NO\5*\26\2OT\5\f\7\2PQ\7\5\2\2QS\5\f\7\2RP\3\2\2\2SV\3\2\2\2TR\3\2\2"+
		"\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\7\23\2\2XY\b\6\1\2Y\13\3\2\2\2Z[\7"+
		"\34\2\2[\\\b\7\1\2\\\r\3\2\2\2]^\7\26\2\2^_\7\34\2\2_`\5\20\t\2`a\5\24"+
		"\13\2ab\7\30\2\2bc\7\23\2\2cd\b\b\1\2d\17\3\2\2\2ei\7\6\2\2fh\5\22\n\2"+
		"gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\7\7\2\2"+
		"mn\7\23\2\2no\b\t\1\2o\21\3\2\2\2pq\5*\26\2qr\5\f\7\2rs\b\n\1\2s\23\3"+
		"\2\2\2tv\5\26\f\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw"+
		"\3\2\2\2z{\b\13\1\2{\25\3\2\2\2|}\5*\26\2}\u0082\5\30\r\2~\177\7\5\2\2"+
		"\177\u0081\5\30\r\2\u0080~\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2"+
		"\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085"+
		"\u0086\7\23\2\2\u0086\u0087\b\f\1\2\u0087\27\3\2\2\2\u0088\u008b\7\34"+
		"\2\2\u0089\u008a\7\b\2\2\u008a\u008c\5\32\16\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\b\r\1\2\u008e\31\3\2\2"+
		"\2\u008f\u0094\5\34\17\2\u0090\u0091\5(\25\2\u0091\u0092\b\16\1\2\u0092"+
		"\u0094\3\2\2\2\u0093\u008f\3\2\2\2\u0093\u0090\3\2\2\2\u0094\33\3\2\2"+
		"\2\u0095\u0096\5 \21\2\u0096\u0097\5\36\20\2\u0097\u009a\3\2\2\2\u0098"+
		"\u009a\5&\24\2\u0099\u0095\3\2\2\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2"+
		"\2\2\u009b\u009c\b\17\1\2\u009c\35\3\2\2\2\u009d\u009e\t\2\2\2\u009e\u009f"+
		"\5 \21\2\u009f\u00a0\5\36\20\2\u00a0\u00a3\3\2\2\2\u00a1\u00a3\3\2\2\2"+
		"\u00a2\u009d\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\37\3\2\2\2\u00a4\u00a7"+
		"\5$\23\2\u00a5\u00a7\5\"\22\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2"+
		"\u00a7!\3\2\2\2\u00a8\u00ae\t\3\2\2\u00a9\u00aa\5$\23\2\u00aa\u00ab\5"+
		"\"\22\2\u00ab\u00ae\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00a8\3\2\2\2\u00ad"+
		"\u00a9\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae#\3\2\2\2\u00af\u00b0\7\6\2\2"+
		"\u00b0\u00b1\5\34\17\2\u00b1\u00b2\7\7\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b5"+
		"\5&\24\2\u00b4\u00af\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5%\3\2\2\2\u00b6"+
		"\u00b7\t\4\2\2\u00b7\u00b8\b\24\1\2\u00b8\'\3\2\2\2\u00b9\u00ba\7\16\2"+
		"\2\u00ba\u00bf\5\32\16\2\u00bb\u00bc\7\5\2\2\u00bc\u00be\5\32\16\2\u00bd"+
		"\u00bb\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\7\17\2\2\u00c3"+
		"\u00c4\b\25\1\2\u00c4)\3\2\2\2\u00c5\u00c9\7\27\2\2\u00c6\u00c8\5,\27"+
		"\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca"+
		"\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\b\26\1\2"+
		"\u00cd+\3\2\2\2\u00ce\u00cf\7\20\2\2\u00cf\u00d0\7\33\2\2\u00d0\u00d1"+
		"\7\21\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\b\27\1\2\u00d3-\3\2\2\2\u00d4"+
		"\u00d5\7\20\2\2\u00d5\u00d6\t\5\2\2\u00d6\u00d7\7\21\2\2\u00d7\u00d8\3"+
		"\2\2\2\u00d8\u00d9\b\30\1\2\u00d9/\3\2\2\2\23\62\64ACTiw\u0082\u008b\u0093"+
		"\u0099\u00a2\u00a6\u00ad\u00b4\u00bf\u00c9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}