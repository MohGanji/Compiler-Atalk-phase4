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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		SPACE=18, COMMENT=19, NEWLINE=20, ACTOR=21, RECEIVER=22, TYPE=23, QUIT=24, 
		IF=25, ELSEIF=26, ELSE=27, END=28, FOREACH=29, BREAK=30, IN=31, SENDER=32, 
		SELF=33, BEGIN=34, READ=35, WRITE=36, AND=37, OR=38, NOT=39, STRING=40, 
		CHAR=41, NUMBER=42, ID=43, CHARACTER=44, ANY_CHAR=45;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"SPACE", "COMMENT", "NEWLINE", "ACTOR", "RECEIVER", "TYPE", "QUIT", "IF", 
		"ELSEIF", "ELSE", "END", "FOREACH", "BREAK", "IN", "SENDER", "SELF", "BEGIN", 
		"READ", "WRITE", "AND", "OR", "NOT", "STRING", "CHAR", "NUMBER", "ID", 
		"CHARACTER", "ANY_CHAR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'<'", "'>'", "','", "'('", "')'", "'='", "'<<'", "'=='", "'<>'", 
		"'+'", "'-'", "'*'", "'/'", "'{'", "'}'", "'['", "']'", null, null, null, 
		"'actor'", "'receiver'", null, "'quit'", "'if'", "'elseif'", "'else'", 
		"'end'", "'foreach'", "'break'", "'in'", "'sender'", "'self'", "'begin'", 
		"'read'", "'write'", "'and'", "'or'", "'not'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "SPACE", "COMMENT", "NEWLINE", "ACTOR", 
		"RECEIVER", "TYPE", "QUIT", "IF", "ELSEIF", "ELSE", "END", "FOREACH", 
		"BREAK", "IN", "SENDER", "SELF", "BEGIN", "READ", "WRITE", "AND", "OR", 
		"NOT", "STRING", "CHAR", "NUMBER", "ID", "CHARACTER", "ANY_CHAR"
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
		case 17:
			SPACE_action((RuleContext)_localctx, actionIndex);
			break;
		case 18:
			COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 19:
			NEWLINE_action((RuleContext)_localctx, actionIndex);
			break;
		case 20:
			ACTOR_action((RuleContext)_localctx, actionIndex);
			break;
		case 21:
			RECEIVER_action((RuleContext)_localctx, actionIndex);
			break;
		case 22:
			TYPE_action((RuleContext)_localctx, actionIndex);
			break;
		case 23:
			QUIT_action((RuleContext)_localctx, actionIndex);
			break;
		case 24:
			IF_action((RuleContext)_localctx, actionIndex);
			break;
		case 25:
			ELSEIF_action((RuleContext)_localctx, actionIndex);
			break;
		case 26:
			ELSE_action((RuleContext)_localctx, actionIndex);
			break;
		case 27:
			END_action((RuleContext)_localctx, actionIndex);
			break;
		case 28:
			FOREACH_action((RuleContext)_localctx, actionIndex);
			break;
		case 29:
			BREAK_action((RuleContext)_localctx, actionIndex);
			break;
		case 30:
			IN_action((RuleContext)_localctx, actionIndex);
			break;
		case 31:
			SENDER_action((RuleContext)_localctx, actionIndex);
			break;
		case 32:
			SELF_action((RuleContext)_localctx, actionIndex);
			break;
		case 33:
			BEGIN_action((RuleContext)_localctx, actionIndex);
			break;
		case 34:
			READ_action((RuleContext)_localctx, actionIndex);
			break;
		case 35:
			WRITE_action((RuleContext)_localctx, actionIndex);
			break;
		case 36:
			AND_action((RuleContext)_localctx, actionIndex);
			break;
		case 37:
			OR_action((RuleContext)_localctx, actionIndex);
			break;
		case 38:
			NOT_action((RuleContext)_localctx, actionIndex);
			break;
		case 39:
			STRING_action((RuleContext)_localctx, actionIndex);
			break;
		case 40:
			CHAR_action((RuleContext)_localctx, actionIndex);
			break;
		case 41:
			NUMBER_action((RuleContext)_localctx, actionIndex);
			break;
		case 42:
			ID_action((RuleContext)_localctx, actionIndex);
			break;
		case 43:
			CHARACTER_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void SPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			print("COMMENT : " + getText());
			break;
		case 2:
			skip();
			break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			print("NEWLINE");
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
	private void RECEIVER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			print("RECEIVER");
			break;
		}
	}
	private void TYPE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			print("TYPE : " + getText());
			break;
		}
	}
	private void QUIT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:
			print("QUIT");
			break;
		}
	}
	private void IF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:
			print("IF");
			break;
		}
	}
	private void ELSEIF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9:
			print("ELSEIF");
			break;
		}
	}
	private void ELSE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10:
			print("ELSE");
			break;
		}
	}
	private void END_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11:
			print("END");
			break;
		}
	}
	private void FOREACH_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12:
			print("FOREACH");
			break;
		}
	}
	private void BREAK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 13:
			print("BREAK");
			break;
		}
	}
	private void IN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 14:
			print("IN");
			break;
		}
	}
	private void SENDER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 15:
			print("SENDER");
			break;
		}
	}
	private void SELF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 16:
			print("SELF");
			break;
		}
	}
	private void BEGIN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 17:
			print("BEGIN");
			break;
		}
	}
	private void READ_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 18:
			print("READ");
			break;
		}
	}
	private void WRITE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 19:
			print("WRITE");
			break;
		}
	}
	private void AND_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 20:
			print("AND");
			break;
		}
	}
	private void OR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 21:
			print("OR");
			break;
		}
	}
	private void NOT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 22:
			print("NOT");
			break;
		}
	}
	private void STRING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 23:
			print("STRING : " + getText());
			break;
		}
	}
	private void CHAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 24:
			print("CHAR : " + getText());
			break;
		}
	}
	private void NUMBER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 25:
			print("NUMBER : " + getText());
			break;
		}
	}
	private void ID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 26:
			print("ID : " + getText());
			break;
		}
	}
	private void CHARACTER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 27:
			print("CHARACTER : " + getText());
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u0176\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\6\23\u0084\n\23\r\23\16\23\u0085"+
		"\3\23\3\23\3\24\3\24\7\24\u008c\n\24\f\24\16\24\u008f\13\24\3\24\3\24"+
		"\7\24\u0093\n\24\f\24\16\24\u0096\13\24\3\24\3\24\7\24\u009a\n\24\f\24"+
		"\16\24\u009d\13\24\5\24\u009f\n\24\3\24\3\24\3\24\3\25\3\25\3\25\5\25"+
		"\u00a7\n\25\3\25\7\25\u00aa\n\25\f\25\16\25\u00ad\13\25\6\25\u00af\n\25"+
		"\r\25\16\25\u00b0\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\5\30\u00cf\n\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3"+
		"$\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3("+
		"\3(\3(\3(\3(\3)\3)\7)\u0146\n)\f)\16)\u0149\13)\3)\3)\3)\3*\3*\3*\5*\u0151"+
		"\n*\3*\3*\3*\3+\6+\u0157\n+\r+\16+\u0158\3+\3+\3,\3,\7,\u015f\n,\f,\16"+
		",\u0162\13,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0171\n-\3-\3-\3"+
		".\3.\2\2/\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/\3\2\b\4\2\13\13\"\"\3\2"+
		"\62;\5\2C\\aac|\6\2\62;C\\aac|\4\2\f\f$$\3\2\f\f\2\u0187\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\3]\3\2\2\2\5_\3\2\2\2\7a\3\2\2\2\tc\3\2\2"+
		"\2\13e\3\2\2\2\rg\3\2\2\2\17i\3\2\2\2\21l\3\2\2\2\23o\3\2\2\2\25r\3\2"+
		"\2\2\27t\3\2\2\2\31v\3\2\2\2\33x\3\2\2\2\35z\3\2\2\2\37|\3\2\2\2!~\3\2"+
		"\2\2#\u0080\3\2\2\2%\u0083\3\2\2\2\'\u009e\3\2\2\2)\u00ae\3\2\2\2+\u00b4"+
		"\3\2\2\2-\u00bc\3\2\2\2/\u00ce\3\2\2\2\61\u00d2\3\2\2\2\63\u00d9\3\2\2"+
		"\2\65\u00de\3\2\2\2\67\u00e7\3\2\2\29\u00ee\3\2\2\2;\u00f4\3\2\2\2=\u00fe"+
		"\3\2\2\2?\u0106\3\2\2\2A\u010b\3\2\2\2C\u0114\3\2\2\2E\u011b\3\2\2\2G"+
		"\u0123\3\2\2\2I\u012a\3\2\2\2K\u0132\3\2\2\2M\u0138\3\2\2\2O\u013d\3\2"+
		"\2\2Q\u0143\3\2\2\2S\u014d\3\2\2\2U\u0156\3\2\2\2W\u015c\3\2\2\2Y\u0170"+
		"\3\2\2\2[\u0174\3\2\2\2]^\7>\2\2^\4\3\2\2\2_`\7@\2\2`\6\3\2\2\2ab\7.\2"+
		"\2b\b\3\2\2\2cd\7*\2\2d\n\3\2\2\2ef\7+\2\2f\f\3\2\2\2gh\7?\2\2h\16\3\2"+
		"\2\2ij\7>\2\2jk\7>\2\2k\20\3\2\2\2lm\7?\2\2mn\7?\2\2n\22\3\2\2\2op\7>"+
		"\2\2pq\7@\2\2q\24\3\2\2\2rs\7-\2\2s\26\3\2\2\2tu\7/\2\2u\30\3\2\2\2vw"+
		"\7,\2\2w\32\3\2\2\2xy\7\61\2\2y\34\3\2\2\2z{\7}\2\2{\36\3\2\2\2|}\7\177"+
		"\2\2} \3\2\2\2~\177\7]\2\2\177\"\3\2\2\2\u0080\u0081\7_\2\2\u0081$\3\2"+
		"\2\2\u0082\u0084\t\2\2\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\b\23"+
		"\2\2\u0088&\3\2\2\2\u0089\u008d\5)\25\2\u008a\u008c\5%\23\2\u008b\u008a"+
		"\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0094\7%\2\2\u0091\u0093\5[."+
		"\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095"+
		"\3\2\2\2\u0095\u009f\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u009b\7%\2\2\u0098"+
		"\u009a\5[.\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2"+
		"\2\u009b\u009c\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u0089"+
		"\3\2\2\2\u009e\u0097\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\b\24\3\2"+
		"\u00a1\u00a2\b\24\4\2\u00a2(\3\2\2\2\u00a3\u00a4\7\17\2\2\u00a4\u00a7"+
		"\7\f\2\2\u00a5\u00a7\7\f\2\2\u00a6\u00a3\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7"+
		"\u00ab\3\2\2\2\u00a8\u00aa\5%\23\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3\2"+
		"\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ae\u00a6\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00ae\3\2"+
		"\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\b\25\5\2\u00b3"+
		"*\3\2\2\2\u00b4\u00b5\7c\2\2\u00b5\u00b6\7e\2\2\u00b6\u00b7\7v\2\2\u00b7"+
		"\u00b8\7q\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\b\26"+
		"\6\2\u00bb,\3\2\2\2\u00bc\u00bd\7t\2\2\u00bd\u00be\7g\2\2\u00be\u00bf"+
		"\7e\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7k\2\2\u00c1\u00c2\7x\2\2\u00c2"+
		"\u00c3\7g\2\2\u00c3\u00c4\7t\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\b\27"+
		"\7\2\u00c6.\3\2\2\2\u00c7\u00c8\7k\2\2\u00c8\u00c9\7p\2\2\u00c9\u00cf"+
		"\7v\2\2\u00ca\u00cb\7e\2\2\u00cb\u00cc\7j\2\2\u00cc\u00cd\7c\2\2\u00cd"+
		"\u00cf\7t\2\2\u00ce\u00c7\3\2\2\2\u00ce\u00ca\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\u00d1\b\30\b\2\u00d1\60\3\2\2\2\u00d2\u00d3\7s\2\2\u00d3\u00d4"+
		"\7w\2\2\u00d4\u00d5\7k\2\2\u00d5\u00d6\7v\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00d8\b\31\t\2\u00d8\62\3\2\2\2\u00d9\u00da\7k\2\2\u00da\u00db\7h\2\2"+
		"\u00db\u00dc\3\2\2\2\u00dc\u00dd\b\32\n\2\u00dd\64\3\2\2\2\u00de\u00df"+
		"\7g\2\2\u00df\u00e0\7n\2\2\u00e0\u00e1\7u\2\2\u00e1\u00e2\7g\2\2\u00e2"+
		"\u00e3\7k\2\2\u00e3\u00e4\7h\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\b\33"+
		"\13\2\u00e6\66\3\2\2\2\u00e7\u00e8\7g\2\2\u00e8\u00e9\7n\2\2\u00e9\u00ea"+
		"\7u\2\2\u00ea\u00eb\7g\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\b\34\f\2\u00ed"+
		"8\3\2\2\2\u00ee\u00ef\7g\2\2\u00ef\u00f0\7p\2\2\u00f0\u00f1\7f\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u00f3\b\35\r\2\u00f3:\3\2\2\2\u00f4\u00f5\7h\2\2"+
		"\u00f5\u00f6\7q\2\2\u00f6\u00f7\7t\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9"+
		"\7c\2\2\u00f9\u00fa\7e\2\2\u00fa\u00fb\7j\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"\u00fd\b\36\16\2\u00fd<\3\2\2\2\u00fe\u00ff\7d\2\2\u00ff\u0100\7t\2\2"+
		"\u0100\u0101\7g\2\2\u0101\u0102\7c\2\2\u0102\u0103\7m\2\2\u0103\u0104"+
		"\3\2\2\2\u0104\u0105\b\37\17\2\u0105>\3\2\2\2\u0106\u0107\7k\2\2\u0107"+
		"\u0108\7p\2\2\u0108\u0109\3\2\2\2\u0109\u010a\b \20\2\u010a@\3\2\2\2\u010b"+
		"\u010c\7u\2\2\u010c\u010d\7g\2\2\u010d\u010e\7p\2\2\u010e\u010f\7f\2\2"+
		"\u010f\u0110\7g\2\2\u0110\u0111\7t\2\2\u0111\u0112\3\2\2\2\u0112\u0113"+
		"\b!\21\2\u0113B\3\2\2\2\u0114\u0115\7u\2\2\u0115\u0116\7g\2\2\u0116\u0117"+
		"\7n\2\2\u0117\u0118\7h\2\2\u0118\u0119\3\2\2\2\u0119\u011a\b\"\22\2\u011a"+
		"D\3\2\2\2\u011b\u011c\7d\2\2\u011c\u011d\7g\2\2\u011d\u011e\7i\2\2\u011e"+
		"\u011f\7k\2\2\u011f\u0120\7p\2\2\u0120\u0121\3\2\2\2\u0121\u0122\b#\23"+
		"\2\u0122F\3\2\2\2\u0123\u0124\7t\2\2\u0124\u0125\7g\2\2\u0125\u0126\7"+
		"c\2\2\u0126\u0127\7f\2\2\u0127\u0128\3\2\2\2\u0128\u0129\b$\24\2\u0129"+
		"H\3\2\2\2\u012a\u012b\7y\2\2\u012b\u012c\7t\2\2\u012c\u012d\7k\2\2\u012d"+
		"\u012e\7v\2\2\u012e\u012f\7g\2\2\u012f\u0130\3\2\2\2\u0130\u0131\b%\25"+
		"\2\u0131J\3\2\2\2\u0132\u0133\7c\2\2\u0133\u0134\7p\2\2\u0134\u0135\7"+
		"f\2\2\u0135\u0136\3\2\2\2\u0136\u0137\b&\26\2\u0137L\3\2\2\2\u0138\u0139"+
		"\7q\2\2\u0139\u013a\7t\2\2\u013a\u013b\3\2\2\2\u013b\u013c\b\'\27\2\u013c"+
		"N\3\2\2\2\u013d\u013e\7p\2\2\u013e\u013f\7q\2\2\u013f\u0140\7v\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\u0142\b(\30\2\u0142P\3\2\2\2\u0143\u0147\7$\2\2\u0144"+
		"\u0146\5Y-\2\u0145\u0144\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2"+
		"\2\u0147\u0148\3\2\2\2\u0148\u014a\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014b"+
		"\7$\2\2\u014b\u014c\b)\31\2\u014cR\3\2\2\2\u014d\u0150\7)\2\2\u014e\u0151"+
		"\5Y-\2\u014f\u0151\7$\2\2\u0150\u014e\3\2\2\2\u0150\u014f\3\2\2\2\u0151"+
		"\u0152\3\2\2\2\u0152\u0153\7)\2\2\u0153\u0154\b*\32\2\u0154T\3\2\2\2\u0155"+
		"\u0157\t\3\2\2\u0156\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0156\3\2"+
		"\2\2\u0158\u0159\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\b+\33\2\u015b"+
		"V\3\2\2\2\u015c\u0160\t\4\2\2\u015d\u015f\t\5\2\2\u015e\u015d\3\2\2\2"+
		"\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0163"+
		"\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0164\b,\34\2\u0164X\3\2\2\2\u0165"+
		"\u0171\n\6\2\2\u0166\u0167\7^\2\2\u0167\u0171\7$\2\2\u0168\u0169\7^\2"+
		"\2\u0169\u0171\7v\2\2\u016a\u016b\7^\2\2\u016b\u0171\7p\2\2\u016c\u016d"+
		"\7^\2\2\u016d\u0171\7^\2\2\u016e\u016f\7^\2\2\u016f\u0171\7)\2\2\u0170"+
		"\u0165\3\2\2\2\u0170\u0166\3\2\2\2\u0170\u0168\3\2\2\2\u0170\u016a\3\2"+
		"\2\2\u0170\u016c\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0172\3\2\2\2\u0172"+
		"\u0173\b-\35\2\u0173Z\3\2\2\2\u0174\u0175\n\7\2\2\u0175\\\3\2\2\2\21\2"+
		"\u0085\u008d\u0094\u009b\u009e\u00a6\u00ab\u00b0\u00ce\u0147\u0150\u0158"+
		"\u0160\u0170\36\3\23\2\3\24\3\3\24\4\3\25\5\3\26\6\3\27\7\3\30\b\3\31"+
		"\t\3\32\n\3\33\13\3\34\f\3\35\r\3\36\16\3\37\17\3 \20\3!\21\3\"\22\3#"+
		"\23\3$\24\3%\25\3&\26\3\'\27\3(\30\3)\31\3*\32\3+\33\3,\34\3-\35";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}