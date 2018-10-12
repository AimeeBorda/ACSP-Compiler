// Generated from /Users/aimee/IdeaProjects/untitled/src/ACSP.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ACSPLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, BOOL=2, EVENT=3, VAR=4, CH=5, SET_EVENTS=6, SET_STAT=7, SKIPLBL=8, 
		CHX=9, IF=10, THEN=11, ELSE=12, NEW=13, PRF=14, SND=15, FULLSTOP=16, AT=17, 
		BRACL=18, BRACR=19, SQL=20, SQR=21, EQ=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ID", "BOOL", "EVENT", "VAR", "CH", "SET_EVENTS", "SET_STAT", "SKIPLBL", 
		"CHX", "IF", "THEN", "ELSE", "NEW", "PRF", "SND", "FULLSTOP", "AT", "BRACL", 
		"BRACR", "SQL", "SQR", "EQ"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, "'SKIP'", "'[]'", "'If'", 
		"'Then'", "'Else'", "'new'", "'->'", "'!'", "'.'", "'@'", "'('", "')'", 
		"'['", "']'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ID", "BOOL", "EVENT", "VAR", "CH", "SET_EVENTS", "SET_STAT", "SKIPLBL", 
		"CHX", "IF", "THEN", "ELSE", "NEW", "PRF", "SND", "FULLSTOP", "AT", "BRACL", 
		"BRACR", "SQL", "SQR", "EQ"
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


	public ACSPLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ACSP.g4"; }

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u0084\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\7\2\62"+
		"\n\2\f\2\16\2\65\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3@\n\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\7\7L\n\7\f\7\16\7O\13\7\5\7Q\n\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30\3\2\4\5\2C\\a"+
		"ac|\7\2\60\60\62;C\\aac|\2\u0087\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5?\3\2\2\2\7A\3\2\2\2\tC\3\2\2\2\13"+
		"E\3\2\2\2\rG\3\2\2\2\17T\3\2\2\2\21X\3\2\2\2\23]\3\2\2\2\25`\3\2\2\2\27"+
		"c\3\2\2\2\31h\3\2\2\2\33m\3\2\2\2\35q\3\2\2\2\37t\3\2\2\2!v\3\2\2\2#x"+
		"\3\2\2\2%z\3\2\2\2\'|\3\2\2\2)~\3\2\2\2+\u0080\3\2\2\2-\u0082\3\2\2\2"+
		"/\63\t\2\2\2\60\62\t\3\2\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63"+
		"\64\3\2\2\2\64\4\3\2\2\2\65\63\3\2\2\2\66\67\7v\2\2\678\7t\2\289\7w\2"+
		"\29@\7g\2\2:;\7h\2\2;<\7c\2\2<=\7n\2\2=>\7u\2\2>@\7g\2\2?\66\3\2\2\2?"+
		":\3\2\2\2@\6\3\2\2\2AB\5\3\2\2B\b\3\2\2\2CD\5\3\2\2D\n\3\2\2\2EF\5\3\2"+
		"\2F\f\3\2\2\2GP\7}\2\2HM\5\7\4\2IJ\7.\2\2JL\5\7\4\2KI\3\2\2\2LO\3\2\2"+
		"\2MK\3\2\2\2MN\3\2\2\2NQ\3\2\2\2OM\3\2\2\2PH\3\2\2\2PQ\3\2\2\2QR\3\2\2"+
		"\2RS\7\177\2\2S\16\3\2\2\2TU\5\t\5\2UV\7<\2\2VW\5\r\7\2W\20\3\2\2\2XY"+
		"\7U\2\2YZ\7M\2\2Z[\7K\2\2[\\\7R\2\2\\\22\3\2\2\2]^\7]\2\2^_\7_\2\2_\24"+
		"\3\2\2\2`a\7K\2\2ab\7h\2\2b\26\3\2\2\2cd\7V\2\2de\7j\2\2ef\7g\2\2fg\7"+
		"p\2\2g\30\3\2\2\2hi\7G\2\2ij\7n\2\2jk\7u\2\2kl\7g\2\2l\32\3\2\2\2mn\7"+
		"p\2\2no\7g\2\2op\7y\2\2p\34\3\2\2\2qr\7/\2\2rs\7@\2\2s\36\3\2\2\2tu\7"+
		"#\2\2u \3\2\2\2vw\7\60\2\2w\"\3\2\2\2xy\7B\2\2y$\3\2\2\2z{\7*\2\2{&\3"+
		"\2\2\2|}\7+\2\2}(\3\2\2\2~\177\7]\2\2\177*\3\2\2\2\u0080\u0081\7_\2\2"+
		"\u0081,\3\2\2\2\u0082\u0083\7?\2\2\u0083.\3\2\2\2\7\2\63?MP\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}