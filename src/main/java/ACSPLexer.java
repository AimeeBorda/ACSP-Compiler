// Generated from /Users/aimee/IdeaProjects/untitled/src/main/java/ACSP.g4 by ANTLR 4.7
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
		AND=1, OR=2, EQ=3, NEQ=4, LT=5, GT=6, LTEQ=7, GTEQ=8, NOT=9, PLUS=10, 
		TIMES=11, MINUS=12, NEW=13, DIV=14, MOD=15, IF=16, THEN=17, ELSE=18, Skip=19, 
		Stop=20, DIVERGE=21, TRUE=22, FALSE=23, GUARD=24, LPAREN=25, RPAREN=26, 
		LBRACKET=27, RBRACKET=28, LSYNC=29, RSYNC=30, INTL=31, ECHOICE=32, ICHOICE=33, 
		PROJECT=34, COMMA=35, COLLON=36, SEMICOL=37, DATATYPE=38, ARROW=39, RARROW=40, 
		QUERY=41, PLING=42, CHANNEL=43, DOT=44, LBRACE=45, LBBRACE=46, RBBRACE=47, 
		RBRACE=48, EQUAL=49, BACKSLASH=50, TIMEOUT=51, INTR=52, ASSERT=53, DEADLOCK=54, 
		DETERMINISTIC=55, LIVELOCK=56, DIVERGENCE=57, FAILUREDIVE=58, FAILURE=59, 
		TRACE=60, TRACEREFINE=61, FAILUREREFINE=62, FAILUREDIVREFINE=63, FREE=64, 
		LET=65, WITHIN=66, INCLUDE=67, DBLQUOTE=68, ACSP=69, BAR=70, SUBTYPE=71, 
		TRANSPARENT=72, EXTERNAL=73, NAMETYPE=74, DIGIT=75, POR=76, ID=77, LINECOMMENT=78, 
		WS=79;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"AND", "OR", "EQ", "NEQ", "LT", "GT", "LTEQ", "GTEQ", "NOT", "PLUS", "TIMES", 
		"MINUS", "NEW", "DIV", "MOD", "IF", "THEN", "ELSE", "Skip", "Stop", "DIVERGE", 
		"TRUE", "FALSE", "GUARD", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", 
		"LSYNC", "RSYNC", "INTL", "ECHOICE", "ICHOICE", "PROJECT", "COMMA", "COLLON", 
		"SEMICOL", "DATATYPE", "ARROW", "RARROW", "QUERY", "PLING", "CHANNEL", 
		"DOT", "LBRACE", "LBBRACE", "RBBRACE", "RBRACE", "EQUAL", "BACKSLASH", 
		"TIMEOUT", "INTR", "ASSERT", "DEADLOCK", "DETERMINISTIC", "LIVELOCK", 
		"DIVERGENCE", "FAILUREDIVE", "FAILURE", "TRACE", "TRACEREFINE", "FAILUREREFINE", 
		"FAILUREDIVREFINE", "FREE", "LET", "WITHIN", "INCLUDE", "DBLQUOTE", "ACSP", 
		"BAR", "SUBTYPE", "TRANSPARENT", "EXTERNAL", "NAMETYPE", "DIGIT", "POR", 
		"ID", "LINECOMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'and'", "'or'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'not'", 
		"'+'", "'*'", "'-'", "'new'", "'/'", "'%'", "'if'", "'then'", "'else'", 
		"'SKIP'", "'STOP'", "'div'", "'true'", "'false'", "'&'", "'('", "')'", 
		"'['", "']'", "'[|'", "'|]'", "'|||'", "'[]'", "'|~|'", "'|\\'", "','", 
		"':'", "';'", "'datatype'", "'->'", "'<-'", "'?'", "'!'", "'channel'", 
		"'.'", "'{'", "'{|'", "'|}'", "'}'", "'='", "'\\'", "'[>'", "'/\\'", "'assert'", 
		"'deadlock'", "'deterministic'", "'livelock'", "'divergence'", "' [FD]'", 
		"' [F]'", "' [T]'", "'[T='", "'[F='", "'[FD='", "' free'", "'let'", "'within'", 
		"'include'", "'\"'", "'acsp'", "'|'", "'subtype'", "'transparent'", "'external'", 
		"'nametype'", null, "'partial order reduce'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "AND", "OR", "EQ", "NEQ", "LT", "GT", "LTEQ", "GTEQ", "NOT", "PLUS", 
		"TIMES", "MINUS", "NEW", "DIV", "MOD", "IF", "THEN", "ELSE", "Skip", "Stop", 
		"DIVERGE", "TRUE", "FALSE", "GUARD", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", 
		"LSYNC", "RSYNC", "INTL", "ECHOICE", "ICHOICE", "PROJECT", "COMMA", "COLLON", 
		"SEMICOL", "DATATYPE", "ARROW", "RARROW", "QUERY", "PLING", "CHANNEL", 
		"DOT", "LBRACE", "LBBRACE", "RBBRACE", "RBRACE", "EQUAL", "BACKSLASH", 
		"TIMEOUT", "INTR", "ASSERT", "DEADLOCK", "DETERMINISTIC", "LIVELOCK", 
		"DIVERGENCE", "FAILUREDIVE", "FAILURE", "TRACE", "TRACEREFINE", "FAILUREREFINE", 
		"FAILUREDIVREFINE", "FREE", "LET", "WITHIN", "INCLUDE", "DBLQUOTE", "ACSP", 
		"BAR", "SUBTYPE", "TRANSPARENT", "EXTERNAL", "NAMETYPE", "DIGIT", "POR", 
		"ID", "LINECOMMENT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2Q\u020c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3+\3+\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\3-\3-\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\62\3\62"+
		"\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\3"+
		"8\38\38\38\38\38\38\38\39\39\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3"+
		":\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3>\3>\3"+
		">\3>\3?\3?\3?\3?\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3C\3C\3"+
		"C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3E\3E\3F\3F\3F\3F\3F\3G\3G\3H\3"+
		"H\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3"+
		"J\3J\3J\3J\3J\3K\3K\3K\3K\3K\3K\3K\3K\3K\3L\3L\3M\3M\3M\3M\3M\3M\3M\3"+
		"M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3N\3N\7N\u01f6\nN\fN\16N\u01f9"+
		"\13N\3O\3O\3O\3O\7O\u01ff\nO\fO\16O\u0202\13O\3O\3O\3P\6P\u0207\nP\rP"+
		"\16P\u0208\3P\3P\2\2Q\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089"+
		"F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009d"+
		"P\u009fQ\3\2\6\5\2C\\aac|\7\2))\62;C\\aac|\4\2\f\f\17\17\5\2\13\f\16\17"+
		"\"\"\2\u020e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3"+
		"\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2"+
		"\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2"+
		"y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083"+
		"\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2"+
		"\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095"+
		"\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2"+
		"\2\2\u009f\3\2\2\2\3\u00a1\3\2\2\2\5\u00a5\3\2\2\2\7\u00a8\3\2\2\2\t\u00ab"+
		"\3\2\2\2\13\u00ae\3\2\2\2\r\u00b0\3\2\2\2\17\u00b2\3\2\2\2\21\u00b5\3"+
		"\2\2\2\23\u00b8\3\2\2\2\25\u00bc\3\2\2\2\27\u00be\3\2\2\2\31\u00c0\3\2"+
		"\2\2\33\u00c2\3\2\2\2\35\u00c6\3\2\2\2\37\u00c8\3\2\2\2!\u00ca\3\2\2\2"+
		"#\u00cd\3\2\2\2%\u00d2\3\2\2\2\'\u00d7\3\2\2\2)\u00dc\3\2\2\2+\u00e1\3"+
		"\2\2\2-\u00e5\3\2\2\2/\u00ea\3\2\2\2\61\u00f0\3\2\2\2\63\u00f2\3\2\2\2"+
		"\65\u00f4\3\2\2\2\67\u00f6\3\2\2\29\u00f8\3\2\2\2;\u00fa\3\2\2\2=\u00fd"+
		"\3\2\2\2?\u0100\3\2\2\2A\u0104\3\2\2\2C\u0107\3\2\2\2E\u010b\3\2\2\2G"+
		"\u010e\3\2\2\2I\u0110\3\2\2\2K\u0112\3\2\2\2M\u0114\3\2\2\2O\u011d\3\2"+
		"\2\2Q\u0120\3\2\2\2S\u0123\3\2\2\2U\u0125\3\2\2\2W\u0127\3\2\2\2Y\u012f"+
		"\3\2\2\2[\u0131\3\2\2\2]\u0133\3\2\2\2_\u0136\3\2\2\2a\u0139\3\2\2\2c"+
		"\u013b\3\2\2\2e\u013d\3\2\2\2g\u013f\3\2\2\2i\u0142\3\2\2\2k\u0145\3\2"+
		"\2\2m\u014c\3\2\2\2o\u0155\3\2\2\2q\u0163\3\2\2\2s\u016c\3\2\2\2u\u0177"+
		"\3\2\2\2w\u017d\3\2\2\2y\u0182\3\2\2\2{\u0187\3\2\2\2}\u018b\3\2\2\2\177"+
		"\u018f\3\2\2\2\u0081\u0194\3\2\2\2\u0083\u019a\3\2\2\2\u0085\u019e\3\2"+
		"\2\2\u0087\u01a5\3\2\2\2\u0089\u01ad\3\2\2\2\u008b\u01af\3\2\2\2\u008d"+
		"\u01b4\3\2\2\2\u008f\u01b6\3\2\2\2\u0091\u01be\3\2\2\2\u0093\u01ca\3\2"+
		"\2\2\u0095\u01d3\3\2\2\2\u0097\u01dc\3\2\2\2\u0099\u01de\3\2\2\2\u009b"+
		"\u01f3\3\2\2\2\u009d\u01fa\3\2\2\2\u009f\u0206\3\2\2\2\u00a1\u00a2\7c"+
		"\2\2\u00a2\u00a3\7p\2\2\u00a3\u00a4\7f\2\2\u00a4\4\3\2\2\2\u00a5\u00a6"+
		"\7q\2\2\u00a6\u00a7\7t\2\2\u00a7\6\3\2\2\2\u00a8\u00a9\7?\2\2\u00a9\u00aa"+
		"\7?\2\2\u00aa\b\3\2\2\2\u00ab\u00ac\7#\2\2\u00ac\u00ad\7?\2\2\u00ad\n"+
		"\3\2\2\2\u00ae\u00af\7>\2\2\u00af\f\3\2\2\2\u00b0\u00b1\7@\2\2\u00b1\16"+
		"\3\2\2\2\u00b2\u00b3\7>\2\2\u00b3\u00b4\7?\2\2\u00b4\20\3\2\2\2\u00b5"+
		"\u00b6\7@\2\2\u00b6\u00b7\7?\2\2\u00b7\22\3\2\2\2\u00b8\u00b9\7p\2\2\u00b9"+
		"\u00ba\7q\2\2\u00ba\u00bb\7v\2\2\u00bb\24\3\2\2\2\u00bc\u00bd\7-\2\2\u00bd"+
		"\26\3\2\2\2\u00be\u00bf\7,\2\2\u00bf\30\3\2\2\2\u00c0\u00c1\7/\2\2\u00c1"+
		"\32\3\2\2\2\u00c2\u00c3\7p\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5\7y\2\2\u00c5"+
		"\34\3\2\2\2\u00c6\u00c7\7\61\2\2\u00c7\36\3\2\2\2\u00c8\u00c9\7\'\2\2"+
		"\u00c9 \3\2\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7h\2\2\u00cc\"\3\2\2\2"+
		"\u00cd\u00ce\7v\2\2\u00ce\u00cf\7j\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1"+
		"\7p\2\2\u00d1$\3\2\2\2\u00d2\u00d3\7g\2\2\u00d3\u00d4\7n\2\2\u00d4\u00d5"+
		"\7u\2\2\u00d5\u00d6\7g\2\2\u00d6&\3\2\2\2\u00d7\u00d8\7U\2\2\u00d8\u00d9"+
		"\7M\2\2\u00d9\u00da\7K\2\2\u00da\u00db\7R\2\2\u00db(\3\2\2\2\u00dc\u00dd"+
		"\7U\2\2\u00dd\u00de\7V\2\2\u00de\u00df\7Q\2\2\u00df\u00e0\7R\2\2\u00e0"+
		"*\3\2\2\2\u00e1\u00e2\7f\2\2\u00e2\u00e3\7k\2\2\u00e3\u00e4\7x\2\2\u00e4"+
		",\3\2\2\2\u00e5\u00e6\7v\2\2\u00e6\u00e7\7t\2\2\u00e7\u00e8\7w\2\2\u00e8"+
		"\u00e9\7g\2\2\u00e9.\3\2\2\2\u00ea\u00eb\7h\2\2\u00eb\u00ec\7c\2\2\u00ec"+
		"\u00ed\7n\2\2\u00ed\u00ee\7u\2\2\u00ee\u00ef\7g\2\2\u00ef\60\3\2\2\2\u00f0"+
		"\u00f1\7(\2\2\u00f1\62\3\2\2\2\u00f2\u00f3\7*\2\2\u00f3\64\3\2\2\2\u00f4"+
		"\u00f5\7+\2\2\u00f5\66\3\2\2\2\u00f6\u00f7\7]\2\2\u00f78\3\2\2\2\u00f8"+
		"\u00f9\7_\2\2\u00f9:\3\2\2\2\u00fa\u00fb\7]\2\2\u00fb\u00fc\7~\2\2\u00fc"+
		"<\3\2\2\2\u00fd\u00fe\7~\2\2\u00fe\u00ff\7_\2\2\u00ff>\3\2\2\2\u0100\u0101"+
		"\7~\2\2\u0101\u0102\7~\2\2\u0102\u0103\7~\2\2\u0103@\3\2\2\2\u0104\u0105"+
		"\7]\2\2\u0105\u0106\7_\2\2\u0106B\3\2\2\2\u0107\u0108\7~\2\2\u0108\u0109"+
		"\7\u0080\2\2\u0109\u010a\7~\2\2\u010aD\3\2\2\2\u010b\u010c\7~\2\2\u010c"+
		"\u010d\7^\2\2\u010dF\3\2\2\2\u010e\u010f\7.\2\2\u010fH\3\2\2\2\u0110\u0111"+
		"\7<\2\2\u0111J\3\2\2\2\u0112\u0113\7=\2\2\u0113L\3\2\2\2\u0114\u0115\7"+
		"f\2\2\u0115\u0116\7c\2\2\u0116\u0117\7v\2\2\u0117\u0118\7c\2\2\u0118\u0119"+
		"\7v\2\2\u0119\u011a\7{\2\2\u011a\u011b\7r\2\2\u011b\u011c\7g\2\2\u011c"+
		"N\3\2\2\2\u011d\u011e\7/\2\2\u011e\u011f\7@\2\2\u011fP\3\2\2\2\u0120\u0121"+
		"\7>\2\2\u0121\u0122\7/\2\2\u0122R\3\2\2\2\u0123\u0124\7A\2\2\u0124T\3"+
		"\2\2\2\u0125\u0126\7#\2\2\u0126V\3\2\2\2\u0127\u0128\7e\2\2\u0128\u0129"+
		"\7j\2\2\u0129\u012a\7c\2\2\u012a\u012b\7p\2\2\u012b\u012c\7p\2\2\u012c"+
		"\u012d\7g\2\2\u012d\u012e\7n\2\2\u012eX\3\2\2\2\u012f\u0130\7\60\2\2\u0130"+
		"Z\3\2\2\2\u0131\u0132\7}\2\2\u0132\\\3\2\2\2\u0133\u0134\7}\2\2\u0134"+
		"\u0135\7~\2\2\u0135^\3\2\2\2\u0136\u0137\7~\2\2\u0137\u0138\7\177\2\2"+
		"\u0138`\3\2\2\2\u0139\u013a\7\177\2\2\u013ab\3\2\2\2\u013b\u013c\7?\2"+
		"\2\u013cd\3\2\2\2\u013d\u013e\7^\2\2\u013ef\3\2\2\2\u013f\u0140\7]\2\2"+
		"\u0140\u0141\7@\2\2\u0141h\3\2\2\2\u0142\u0143\7\61\2\2\u0143\u0144\7"+
		"^\2\2\u0144j\3\2\2\2\u0145\u0146\7c\2\2\u0146\u0147\7u\2\2\u0147\u0148"+
		"\7u\2\2\u0148\u0149\7g\2\2\u0149\u014a\7t\2\2\u014a\u014b\7v\2\2\u014b"+
		"l\3\2\2\2\u014c\u014d\7f\2\2\u014d\u014e\7g\2\2\u014e\u014f\7c\2\2\u014f"+
		"\u0150\7f\2\2\u0150\u0151\7n\2\2\u0151\u0152\7q\2\2\u0152\u0153\7e\2\2"+
		"\u0153\u0154\7m\2\2\u0154n\3\2\2\2\u0155\u0156\7f\2\2\u0156\u0157\7g\2"+
		"\2\u0157\u0158\7v\2\2\u0158\u0159\7g\2\2\u0159\u015a\7t\2\2\u015a\u015b"+
		"\7o\2\2\u015b\u015c\7k\2\2\u015c\u015d\7p\2\2\u015d\u015e\7k\2\2\u015e"+
		"\u015f\7u\2\2\u015f\u0160\7v\2\2\u0160\u0161\7k\2\2\u0161\u0162\7e\2\2"+
		"\u0162p\3\2\2\2\u0163\u0164\7n\2\2\u0164\u0165\7k\2\2\u0165\u0166\7x\2"+
		"\2\u0166\u0167\7g\2\2\u0167\u0168\7n\2\2\u0168\u0169\7q\2\2\u0169\u016a"+
		"\7e\2\2\u016a\u016b\7m\2\2\u016br\3\2\2\2\u016c\u016d\7f\2\2\u016d\u016e"+
		"\7k\2\2\u016e\u016f\7x\2\2\u016f\u0170\7g\2\2\u0170\u0171\7t\2\2\u0171"+
		"\u0172\7i\2\2\u0172\u0173\7g\2\2\u0173\u0174\7p\2\2\u0174\u0175\7e\2\2"+
		"\u0175\u0176\7g\2\2\u0176t\3\2\2\2\u0177\u0178\7\"\2\2\u0178\u0179\7]"+
		"\2\2\u0179\u017a\7H\2\2\u017a\u017b\7F\2\2\u017b\u017c\7_\2\2\u017cv\3"+
		"\2\2\2\u017d\u017e\7\"\2\2\u017e\u017f\7]\2\2\u017f\u0180\7H\2\2\u0180"+
		"\u0181\7_\2\2\u0181x\3\2\2\2\u0182\u0183\7\"\2\2\u0183\u0184\7]\2\2\u0184"+
		"\u0185\7V\2\2\u0185\u0186\7_\2\2\u0186z\3\2\2\2\u0187\u0188\7]\2\2\u0188"+
		"\u0189\7V\2\2\u0189\u018a\7?\2\2\u018a|\3\2\2\2\u018b\u018c\7]\2\2\u018c"+
		"\u018d\7H\2\2\u018d\u018e\7?\2\2\u018e~\3\2\2\2\u018f\u0190\7]\2\2\u0190"+
		"\u0191\7H\2\2\u0191\u0192\7F\2\2\u0192\u0193\7?\2\2\u0193\u0080\3\2\2"+
		"\2\u0194\u0195\7\"\2\2\u0195\u0196\7h\2\2\u0196\u0197\7t\2\2\u0197\u0198"+
		"\7g\2\2\u0198\u0199\7g\2\2\u0199\u0082\3\2\2\2\u019a\u019b\7n\2\2\u019b"+
		"\u019c\7g\2\2\u019c\u019d\7v\2\2\u019d\u0084\3\2\2\2\u019e\u019f\7y\2"+
		"\2\u019f\u01a0\7k\2\2\u01a0\u01a1\7v\2\2\u01a1\u01a2\7j\2\2\u01a2\u01a3"+
		"\7k\2\2\u01a3\u01a4\7p\2\2\u01a4\u0086\3\2\2\2\u01a5\u01a6\7k\2\2\u01a6"+
		"\u01a7\7p\2\2\u01a7\u01a8\7e\2\2\u01a8\u01a9\7n\2\2\u01a9\u01aa\7w\2\2"+
		"\u01aa\u01ab\7f\2\2\u01ab\u01ac\7g\2\2\u01ac\u0088\3\2\2\2\u01ad\u01ae"+
		"\7$\2\2\u01ae\u008a\3\2\2\2\u01af\u01b0\7c\2\2\u01b0\u01b1\7e\2\2\u01b1"+
		"\u01b2\7u\2\2\u01b2\u01b3\7r\2\2\u01b3\u008c\3\2\2\2\u01b4\u01b5\7~\2"+
		"\2\u01b5\u008e\3\2\2\2\u01b6\u01b7\7u\2\2\u01b7\u01b8\7w\2\2\u01b8\u01b9"+
		"\7d\2\2\u01b9\u01ba\7v\2\2\u01ba\u01bb\7{\2\2\u01bb\u01bc\7r\2\2\u01bc"+
		"\u01bd\7g\2\2\u01bd\u0090\3\2\2\2\u01be\u01bf\7v\2\2\u01bf\u01c0\7t\2"+
		"\2\u01c0\u01c1\7c\2\2\u01c1\u01c2\7p\2\2\u01c2\u01c3\7u\2\2\u01c3\u01c4"+
		"\7r\2\2\u01c4\u01c5\7c\2\2\u01c5\u01c6\7t\2\2\u01c6\u01c7\7g\2\2\u01c7"+
		"\u01c8\7p\2\2\u01c8\u01c9\7v\2\2\u01c9\u0092\3\2\2\2\u01ca\u01cb\7g\2"+
		"\2\u01cb\u01cc\7z\2\2\u01cc\u01cd\7v\2\2\u01cd\u01ce\7g\2\2\u01ce\u01cf"+
		"\7t\2\2\u01cf\u01d0\7p\2\2\u01d0\u01d1\7c\2\2\u01d1\u01d2\7n\2\2\u01d2"+
		"\u0094\3\2\2\2\u01d3\u01d4\7p\2\2\u01d4\u01d5\7c\2\2\u01d5\u01d6\7o\2"+
		"\2\u01d6\u01d7\7g\2\2\u01d7\u01d8\7v\2\2\u01d8\u01d9\7{\2\2\u01d9\u01da"+
		"\7r\2\2\u01da\u01db\7g\2\2\u01db\u0096\3\2\2\2\u01dc\u01dd\4\62;\2\u01dd"+
		"\u0098\3\2\2\2\u01de\u01df\7r\2\2\u01df\u01e0\7c\2\2\u01e0\u01e1\7t\2"+
		"\2\u01e1\u01e2\7v\2\2\u01e2\u01e3\7k\2\2\u01e3\u01e4\7c\2\2\u01e4\u01e5"+
		"\7n\2\2\u01e5\u01e6\7\"\2\2\u01e6\u01e7\7q\2\2\u01e7\u01e8\7t\2\2\u01e8"+
		"\u01e9\7f\2\2\u01e9\u01ea\7g\2\2\u01ea\u01eb\7t\2\2\u01eb\u01ec\7\"\2"+
		"\2\u01ec\u01ed\7t\2\2\u01ed\u01ee\7g\2\2\u01ee\u01ef\7f\2\2\u01ef\u01f0"+
		"\7w\2\2\u01f0\u01f1\7e\2\2\u01f1\u01f2\7g\2\2\u01f2\u009a\3\2\2\2\u01f3"+
		"\u01f7\t\2\2\2\u01f4\u01f6\t\3\2\2\u01f5\u01f4\3\2\2\2\u01f6\u01f9\3\2"+
		"\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u009c\3\2\2\2\u01f9"+
		"\u01f7\3\2\2\2\u01fa\u01fb\7/\2\2\u01fb\u01fc\7/\2\2\u01fc\u0200\3\2\2"+
		"\2\u01fd\u01ff\n\4\2\2\u01fe\u01fd\3\2\2\2\u01ff\u0202\3\2\2\2\u0200\u01fe"+
		"\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0203\3\2\2\2\u0202\u0200\3\2\2\2\u0203"+
		"\u0204\bO\2\2\u0204\u009e\3\2\2\2\u0205\u0207\t\5\2\2\u0206\u0205\3\2"+
		"\2\2\u0207\u0208\3\2\2\2\u0208\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209"+
		"\u020a\3\2\2\2\u020a\u020b\bP\2\2\u020b\u00a0\3\2\2\2\6\2\u01f7\u0200"+
		"\u0208\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}