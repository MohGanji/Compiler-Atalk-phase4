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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, COMMENT=7, NEWLINE=8, 
		SPACE=9, ACTOR=10, RECEIVER=11, TYPE=12, END=13, STRING=14, CHAR=15, NUMBER=16, 
		ID=17, ANY_CHAR=18;
	public static final int
		RULE_program = 0, RULE_actor = 1, RULE_actor_content = 2, RULE_actor_size = 3, 
		RULE_state = 4, RULE_global_vardef = 5, RULE_receiver = 6, RULE_arguments = 7, 
		RULE_arg_var = 8, RULE_receiver_content = 9, RULE_var = 10, RULE_vardef = 11, 
		RULE_value = 12;
	public static final String[] ruleNames = {
		"program", "actor", "actor_content", "actor_size", "state", "global_vardef", 
		"receiver", "arguments", "arg_var", "receiver_content", "var", "vardef", 
		"value"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'<'", "'>'", "','", "'('", "')'", "'='", null, null, null, "'actor'", 
		"'receiver'", null, "'end'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "COMMENT", "NEWLINE", "SPACE", 
		"ACTOR", "RECEIVER", "TYPE", "END", "STRING", "CHAR", "NUMBER", "ID", 
		"ANY_CHAR"
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
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE || _la==ACTOR) {
				{
				setState(28);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ACTOR:
					{
					setState(26);
					actor();
					}
					break;
				case NEWLINE:
					{
					setState(27);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(32);
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
			setState(33);
			match(ACTOR);
			setState(34);
			match(ID);
			setState(35);
			actor_size();
			setState(36);
			actor_content();
			setState(37);
			match(END);
			setState(38);
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
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(43);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TYPE:
					{
					setState(41);
					state();
					}
					break;
				case RECEIVER:
					{
					setState(42);
					receiver();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(45); 
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
			setState(49);
			match(T__0);
			setState(50);
			match(NUMBER);
			setState(51);
			match(T__1);
			setState(52);
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
		public TerminalNode TYPE() { return getToken(atalkParser.TYPE, 0); }
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
			setState(56);
			match(TYPE);
			setState(57);
			global_vardef();
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(58);
				match(T__2);
				setState(59);
				global_vardef();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
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
			setState(68);
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
			setState(71);
			match(RECEIVER);
			setState(72);
			match(ID);
			setState(73);
			arguments();
			setState(74);
			receiver_content();
			setState(75);
			match(END);
			setState(76);
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
			setState(79);
			match(T__3);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(80);
				arg_var();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			match(T__4);
			setState(87);
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
		public TerminalNode TYPE() { return getToken(atalkParser.TYPE, 0); }
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
			setState(90);
			match(TYPE);
			setState(91);
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
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
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
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(94);
				var();
				}
				}
				setState(99);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(atalkParser.TYPE, 0); }
		public List<VardefContext> vardef() {
			return getRuleContexts(VardefContext.class);
		}
		public VardefContext vardef(int i) {
			return getRuleContext(VardefContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(atalkParser.NEWLINE, 0); }
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
		enterRule(_localctx, 20, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(TYPE);
			setState(103);
			vardef();
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(104);
				match(T__2);
				setState(105);
				vardef();
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
			match(NEWLINE);
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

	public static class VardefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(atalkParser.ID, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
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
		enterRule(_localctx, 22, RULE_vardef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(ID);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(115);
				match(T__5);
				setState(116);
				value();
				}
			}

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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(atalkParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(atalkParser.NUMBER, 0); }
		public TerminalNode CHAR() { return getToken(atalkParser.CHAR, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << CHAR) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			print("value");
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24\177\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\7\2\37\n\2\f\2\16\2\"\13\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\6\4.\n\4\r\4\16\4/\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6?\n\6\f\6\16\6B\13\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\7\tT\n\t\f\t\16"+
		"\tW\13\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\7\13b\n\13\f\13\16\13e\13"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\7\fm\n\f\f\f\16\fp\13\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\5\rx\n\r\3\r\3\r\3\16\3\16\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\2\3\3\2\20\22\2z\2 \3\2\2\2\4#\3\2\2\2\6-\3\2\2\2\b\63"+
		"\3\2\2\2\n9\3\2\2\2\fF\3\2\2\2\16I\3\2\2\2\20Q\3\2\2\2\22\\\3\2\2\2\24"+
		"c\3\2\2\2\26h\3\2\2\2\30t\3\2\2\2\32{\3\2\2\2\34\37\5\4\3\2\35\37\7\n"+
		"\2\2\36\34\3\2\2\2\36\35\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!\3"+
		"\3\2\2\2\" \3\2\2\2#$\7\f\2\2$%\7\23\2\2%&\5\b\5\2&\'\5\6\4\2\'(\7\17"+
		"\2\2()\7\n\2\2)*\b\3\1\2*\5\3\2\2\2+.\5\n\6\2,.\5\16\b\2-+\3\2\2\2-,\3"+
		"\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61\62\b\4\1\2\62"+
		"\7\3\2\2\2\63\64\7\3\2\2\64\65\7\22\2\2\65\66\7\4\2\2\66\67\7\n\2\2\67"+
		"8\b\5\1\28\t\3\2\2\29:\b\6\1\2:;\7\16\2\2;@\5\f\7\2<=\7\5\2\2=?\5\f\7"+
		"\2><\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B@\3\2\2\2CD\7\n\2"+
		"\2DE\b\6\1\2E\13\3\2\2\2FG\7\23\2\2GH\b\7\1\2H\r\3\2\2\2IJ\7\r\2\2JK\7"+
		"\23\2\2KL\5\20\t\2LM\5\24\13\2MN\7\17\2\2NO\7\n\2\2OP\b\b\1\2P\17\3\2"+
		"\2\2QU\7\6\2\2RT\5\22\n\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VX\3"+
		"\2\2\2WU\3\2\2\2XY\7\7\2\2YZ\7\n\2\2Z[\b\t\1\2[\21\3\2\2\2\\]\7\16\2\2"+
		"]^\5\f\7\2^_\b\n\1\2_\23\3\2\2\2`b\5\26\f\2a`\3\2\2\2be\3\2\2\2ca\3\2"+
		"\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\b\13\1\2g\25\3\2\2\2hi\7\16\2\2i"+
		"n\5\30\r\2jk\7\5\2\2km\5\30\r\2lj\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2"+
		"\2oq\3\2\2\2pn\3\2\2\2qr\7\n\2\2rs\b\f\1\2s\27\3\2\2\2tw\7\23\2\2uv\7"+
		"\b\2\2vx\5\32\16\2wu\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\b\r\1\2z\31\3\2\2\2"+
		"{|\t\2\2\2|}\b\16\1\2}\33\3\2\2\2\13\36 -/@Ucnw";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}