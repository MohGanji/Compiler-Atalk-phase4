// Generated from atalk.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class atalkLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, COMMENT=7, NEWLINE=8, 
		SPACE=9, ACTOR=10, RECEIVER=11, TYPE=12, END=13, STRING=14, CHAR=15, NUMBER=16, 
		ID=17, ANY_CHAR=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "COMMENT", "NEWLINE", 
		"SPACE", "ACTOR", "RECEIVER", "TYPE", "END", "STRING", "CHAR", "NUMBER", 
		"ID", "ANY_CHAR"
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


	    void print(String str){
	        System.out.println(str);
	    }


	public atalkLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "atalk.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 6:
			COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 7:
			NEWLINE_action((RuleContext)_localctx, actionIndex);
			break;
		case 8:
			SPACE_action((RuleContext)_localctx, actionIndex);
			break;
		case 9:
			ACTOR_action((RuleContext)_localctx, actionIndex);
			break;
		case 11:
			TYPE_action((RuleContext)_localctx, actionIndex);
			break;
		case 12:
			END_action((RuleContext)_localctx, actionIndex);
			break;
		case 14:
			CHAR_action((RuleContext)_localctx, actionIndex);
			break;
		case 15:
			NUMBER_action((RuleContext)_localctx, actionIndex);
			break;
		case 16:
			ID_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			print("COMMENT : " + getText());
			break;
		case 1:
			skip();
			break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			print("NEWLINE");
			break;
		}
	}
	private void SPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			skip();
			break;
		}
	}
	private void ACTOR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			print("ACTOR : " + getText());
			break;
		}
	}
	private void TYPE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			print("TYPE : " + getText());
			break;
		}
	}
	private void END_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			print("END");
			break;
		}
	}
	private void CHAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:
			print("CHAR : " + getText());
			break;
		}
	}
	private void NUMBER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:
			print("NUMBER : " + getText());
			break;
		}
	}
	private void ID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9:
			print("ID : " + getText());
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u00a6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\b\7\b\67\n\b\f\b\16\b:\13\b\3\b\3\b\7\b>\n\b\f\b\16\bA\13\b\5\bC"+
		"\n\b\3\b\3\b\3\b\3\t\3\t\3\t\6\tK\n\t\r\t\16\tL\3\t\3\t\3\n\6\nR\n\n\r"+
		"\n\16\nS\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\rp\n\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\7\17|\n\17\f\17\16\17\177\13\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u0090\n\20\3\20\3\20\3\20\3\21\6\21\u0096\n\21\r\21\16\21\u0097"+
		"\3\21\3\21\3\22\3\22\7\22\u009e\n\22\f\22\16\22\u00a1\13\22\3\22\3\22"+
		"\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\3\2\b\4\2\13\13\"\"\4\2\f\f$$\3\2\62"+
		";\5\2C\\aac|\6\2\62;C\\aac|\3\2\f\f\2\u00b5\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2"+
		"\2\5)\3\2\2\2\7+\3\2\2\2\t-\3\2\2\2\13/\3\2\2\2\r\61\3\2\2\2\17B\3\2\2"+
		"\2\21J\3\2\2\2\23Q\3\2\2\2\25W\3\2\2\2\27_\3\2\2\2\31o\3\2\2\2\33s\3\2"+
		"\2\2\35y\3\2\2\2\37\u0082\3\2\2\2!\u0095\3\2\2\2#\u009b\3\2\2\2%\u00a4"+
		"\3\2\2\2\'(\7>\2\2(\4\3\2\2\2)*\7@\2\2*\6\3\2\2\2+,\7.\2\2,\b\3\2\2\2"+
		"-.\7*\2\2.\n\3\2\2\2/\60\7+\2\2\60\f\3\2\2\2\61\62\7?\2\2\62\16\3\2\2"+
		"\2\63\64\5\21\t\2\648\7%\2\2\65\67\5%\23\2\66\65\3\2\2\2\67:\3\2\2\28"+
		"\66\3\2\2\289\3\2\2\29C\3\2\2\2:8\3\2\2\2;?\7%\2\2<>\5%\23\2=<\3\2\2\2"+
		">A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@C\3\2\2\2A?\3\2\2\2B\63\3\2\2\2B;\3\2\2"+
		"\2CD\3\2\2\2DE\b\b\2\2EF\b\b\3\2F\20\3\2\2\2GH\7\17\2\2HK\7\f\2\2IK\7"+
		"\f\2\2JG\3\2\2\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\b"+
		"\t\4\2O\22\3\2\2\2PR\t\2\2\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T"+
		"U\3\2\2\2UV\b\n\5\2V\24\3\2\2\2WX\7c\2\2XY\7e\2\2YZ\7v\2\2Z[\7q\2\2[\\"+
		"\7t\2\2\\]\3\2\2\2]^\b\13\6\2^\26\3\2\2\2_`\7t\2\2`a\7g\2\2ab\7e\2\2b"+
		"c\7g\2\2cd\7k\2\2de\7x\2\2ef\7g\2\2fg\7t\2\2g\30\3\2\2\2hi\7k\2\2ij\7"+
		"p\2\2jp\7v\2\2kl\7e\2\2lm\7j\2\2mn\7c\2\2np\7t\2\2oh\3\2\2\2ok\3\2\2\2"+
		"pq\3\2\2\2qr\b\r\7\2r\32\3\2\2\2st\7g\2\2tu\7p\2\2uv\7f\2\2vw\3\2\2\2"+
		"wx\b\16\b\2x\34\3\2\2\2y}\7$\2\2z|\5\37\20\2{z\3\2\2\2|\177\3\2\2\2}{"+
		"\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0081\7$\2\2\u0081"+
		"\36\3\2\2\2\u0082\u008f\7)\2\2\u0083\u0090\n\3\2\2\u0084\u0085\7^\2\2"+
		"\u0085\u0090\7$\2\2\u0086\u0087\7^\2\2\u0087\u0090\7v\2\2\u0088\u0089"+
		"\7^\2\2\u0089\u0090\7p\2\2\u008a\u008b\7^\2\2\u008b\u0090\7^\2\2\u008c"+
		"\u0090\7$\2\2\u008d\u008e\7^\2\2\u008e\u0090\7)\2\2\u008f\u0083\3\2\2"+
		"\2\u008f\u0084\3\2\2\2\u008f\u0086\3\2\2\2\u008f\u0088\3\2\2\2\u008f\u008a"+
		"\3\2\2\2\u008f\u008c\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0092\7)\2\2\u0092\u0093\b\20\t\2\u0093 \3\2\2\2\u0094\u0096\t\4\2\2"+
		"\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\b\21\n\2\u009a\"\3\2\2\2\u009b"+
		"\u009f\t\5\2\2\u009c\u009e\t\6\2\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2"+
		"\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a2\u00a3\b\22\13\2\u00a3$\3\2\2\2\u00a4\u00a5\n\7\2"+
		"\2\u00a5&\3\2\2\2\16\28?BJLSo}\u008f\u0097\u009f\f\3\b\2\3\b\3\3\t\4\3"+
		"\n\5\3\13\6\3\r\7\3\16\b\3\20\t\3\21\n\3\22\13";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}