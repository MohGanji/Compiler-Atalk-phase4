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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, COMMENT=16, 
		NEWLINE=17, SPACE=18, ACTOR=19, RECEIVER=20, TYPE=21, END=22, STRING=23, 
		CHAR=24, NUMBER=25, ID=26, CHARACTER=27, ANY_CHAR=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "COMMENT", "NEWLINE", 
		"SPACE", "ACTOR", "RECEIVER", "TYPE", "END", "STRING", "CHAR", "NUMBER", 
		"ID", "CHARACTER", "ANY_CHAR"
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
		case 15:
			COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 16:
			NEWLINE_action((RuleContext)_localctx, actionIndex);
			break;
		case 17:
			SPACE_action((RuleContext)_localctx, actionIndex);
			break;
		case 18:
			ACTOR_action((RuleContext)_localctx, actionIndex);
			break;
		case 20:
			TYPE_action((RuleContext)_localctx, actionIndex);
			break;
		case 21:
			END_action((RuleContext)_localctx, actionIndex);
			break;
		case 22:
			STRING_action((RuleContext)_localctx, actionIndex);
			break;
		case 23:
			CHAR_action((RuleContext)_localctx, actionIndex);
			break;
		case 24:
			NUMBER_action((RuleContext)_localctx, actionIndex);
			break;
		case 25:
			ID_action((RuleContext)_localctx, actionIndex);
			break;
		case 26:
			CHARACTER_action((RuleContext)_localctx, actionIndex);
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
	private void STRING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:
			print("STRING : " + getText());
			break;
		}
	}
	private void CHAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:
			print("CHAR : " + getText());
			break;
		}
	}
	private void NUMBER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9:
			print("NUMBER : " + getText());
			break;
		}
	}
	private void ID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10:
			print("ID : " + getText());
			break;
		}
	}
	private void CHARACTER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11:
			print("CHARACTER : " + getText());
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u00d2\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\7\21]\n\21\f\21\16\21"+
		"`\13\21\3\21\3\21\7\21d\n\21\f\21\16\21g\13\21\5\21i\n\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\6\22q\n\22\r\22\16\22r\3\22\3\22\3\23\6\23x\n\23\r"+
		"\23\16\23y\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u0096\n\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\7\30"+
		"\u00a2\n\30\f\30\16\30\u00a5\13\30\3\30\3\30\3\30\3\31\3\31\3\31\5\31"+
		"\u00ad\n\31\3\31\3\31\3\31\3\32\6\32\u00b3\n\32\r\32\16\32\u00b4\3\32"+
		"\3\32\3\33\3\33\7\33\u00bb\n\33\f\33\16\33\u00be\13\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u00cd\n\34\3\34"+
		"\3\34\3\35\3\35\2\2\36\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36\3\2\b\4\2\13\13\"\"\3\2\62;\5\2C\\aac|\6\2\62;C\\aac"+
		"|\4\2\f\f$$\3\2\f\f\2\u00e1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\3;\3\2\2\2\5=\3\2\2\2\7?\3\2\2\2\tA\3\2\2\2\13"+
		"C\3\2\2\2\rE\3\2\2\2\17G\3\2\2\2\21I\3\2\2\2\23K\3\2\2\2\25M\3\2\2\2\27"+
		"O\3\2\2\2\31Q\3\2\2\2\33S\3\2\2\2\35U\3\2\2\2\37W\3\2\2\2!h\3\2\2\2#p"+
		"\3\2\2\2%w\3\2\2\2\'}\3\2\2\2)\u0085\3\2\2\2+\u0095\3\2\2\2-\u0099\3\2"+
		"\2\2/\u009f\3\2\2\2\61\u00a9\3\2\2\2\63\u00b2\3\2\2\2\65\u00b8\3\2\2\2"+
		"\67\u00cc\3\2\2\29\u00d0\3\2\2\2;<\7>\2\2<\4\3\2\2\2=>\7@\2\2>\6\3\2\2"+
		"\2?@\7.\2\2@\b\3\2\2\2AB\7*\2\2B\n\3\2\2\2CD\7+\2\2D\f\3\2\2\2EF\7?\2"+
		"\2F\16\3\2\2\2GH\7-\2\2H\20\3\2\2\2IJ\7/\2\2J\22\3\2\2\2KL\7,\2\2L\24"+
		"\3\2\2\2MN\7\61\2\2N\26\3\2\2\2OP\7`\2\2P\30\3\2\2\2QR\7}\2\2R\32\3\2"+
		"\2\2ST\7\177\2\2T\34\3\2\2\2UV\7]\2\2V\36\3\2\2\2WX\7_\2\2X \3\2\2\2Y"+
		"Z\5#\22\2Z^\7%\2\2[]\59\35\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2"+
		"_i\3\2\2\2`^\3\2\2\2ae\7%\2\2bd\59\35\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2"+
		"ef\3\2\2\2fi\3\2\2\2ge\3\2\2\2hY\3\2\2\2ha\3\2\2\2ij\3\2\2\2jk\b\21\2"+
		"\2kl\b\21\3\2l\"\3\2\2\2mn\7\17\2\2nq\7\f\2\2oq\7\f\2\2pm\3\2\2\2po\3"+
		"\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2st\3\2\2\2tu\b\22\4\2u$\3\2\2\2vx"+
		"\t\2\2\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\b\23\5\2"+
		"|&\3\2\2\2}~\7c\2\2~\177\7e\2\2\177\u0080\7v\2\2\u0080\u0081\7q\2\2\u0081"+
		"\u0082\7t\2\2\u0082\u0083\3\2\2\2\u0083\u0084\b\24\6\2\u0084(\3\2\2\2"+
		"\u0085\u0086\7t\2\2\u0086\u0087\7g\2\2\u0087\u0088\7e\2\2\u0088\u0089"+
		"\7g\2\2\u0089\u008a\7k\2\2\u008a\u008b\7x\2\2\u008b\u008c\7g\2\2\u008c"+
		"\u008d\7t\2\2\u008d*\3\2\2\2\u008e\u008f\7k\2\2\u008f\u0090\7p\2\2\u0090"+
		"\u0096\7v\2\2\u0091\u0092\7e\2\2\u0092\u0093\7j\2\2\u0093\u0094\7c\2\2"+
		"\u0094\u0096\7t\2\2\u0095\u008e\3\2\2\2\u0095\u0091\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0097\u0098\b\26\7\2\u0098,\3\2\2\2\u0099\u009a\7g\2\2\u009a"+
		"\u009b\7p\2\2\u009b\u009c\7f\2\2\u009c\u009d\3\2\2\2\u009d\u009e\b\27"+
		"\b\2\u009e.\3\2\2\2\u009f\u00a3\7$\2\2\u00a0\u00a2\5\67\34\2\u00a1\u00a0"+
		"\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\7$\2\2\u00a7\u00a8\b\30"+
		"\t\2\u00a8\60\3\2\2\2\u00a9\u00ac\7)\2\2\u00aa\u00ad\5\67\34\2\u00ab\u00ad"+
		"\7$\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00af\7)\2\2\u00af\u00b0\b\31\n\2\u00b0\62\3\2\2\2\u00b1\u00b3\t\3\2"+
		"\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5"+
		"\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\b\32\13\2\u00b7\64\3\2\2\2\u00b8"+
		"\u00bc\t\4\2\2\u00b9\u00bb\t\5\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00be\3\2"+
		"\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be"+
		"\u00bc\3\2\2\2\u00bf\u00c0\b\33\f\2\u00c0\66\3\2\2\2\u00c1\u00cd\n\6\2"+
		"\2\u00c2\u00c3\7^\2\2\u00c3\u00cd\7$\2\2\u00c4\u00c5\7^\2\2\u00c5\u00cd"+
		"\7v\2\2\u00c6\u00c7\7^\2\2\u00c7\u00cd\7p\2\2\u00c8\u00c9\7^\2\2\u00c9"+
		"\u00cd\7^\2\2\u00ca\u00cb\7^\2\2\u00cb\u00cd\7)\2\2\u00cc\u00c1\3\2\2"+
		"\2\u00cc\u00c2\3\2\2\2\u00cc\u00c4\3\2\2\2\u00cc\u00c6\3\2\2\2\u00cc\u00c8"+
		"\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\b\34\r\2"+
		"\u00cf8\3\2\2\2\u00d0\u00d1\n\7\2\2\u00d1:\3\2\2\2\17\2^ehpry\u0095\u00a3"+
		"\u00ac\u00b4\u00bc\u00cc\16\3\21\2\3\21\3\3\22\4\3\23\5\3\24\6\3\26\7"+
		"\3\27\b\3\30\t\3\31\n\3\32\13\3\33\f\3\34\r";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}