// Generated from /Users/aimee/IdeaProjects/ACSP Compiler/src/main/java/ACSP.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ACSPParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, OR=2, EQ=3, NEQ=4, LT=5, GT=6, LTEQ=7, GTEQ=8, NOT=9, PLUS=10, 
		TIMES=11, MINUS=12, NEW=13, DIV=14, MOD=15, DOLLAR=16, IF=17, THEN=18, 
		ELSE=19, Skip=20, Stop=21, DIVERGE=22, TRUE=23, FALSE=24, GUARD=25, LPAREN=26, 
		RPAREN=27, LBRACKET=28, RBRACKET=29, LSYNC=30, RSYNC=31, INTL=32, ECHOICE=33, 
		ICHOICE=34, PROJECT=35, COMMA=36, COLLON=37, SEMICOL=38, DATATYPE=39, 
		ARROW=40, RARROW=41, QUERY=42, PLING=43, CHANNEL=44, DOT=45, LBRACE=46, 
		LBBRACE=47, RBBRACE=48, RBRACE=49, EQUAL=50, BACKSLASH=51, TIMEOUT=52, 
		INTR=53, ASSERT=54, DEADLOCK=55, DETERMINISTIC=56, LIVELOCK=57, DIVERGENCE=58, 
		FAILUREDIVE=59, FAILURE=60, TRACE=61, TRACEREFINE=62, FAILUREREFINE=63, 
		FAILUREDIVREFINE=64, FREE=65, LET=66, WITHIN=67, INCLUDE=68, DBLQUOTE=69, 
		ACSP=70, BAR=71, SUBTYPE=72, TRANSPARENT=73, EXTERNAL=74, NAMETYPE=75, 
		DIGIT=76, POR=77, ID=78, LINECOMMENT=79, WS=80;
	public static final int
		RULE_spec = 0, RULE_definition = 1, RULE_includeFile = 2, RULE_funcImport = 3, 
		RULE_dataTypeDefinition = 4, RULE_channelDecl = 5, RULE_channelNames = 6, 
		RULE_channelColonType = 7, RULE_simpleDefinition = 8, RULE_assertDefinition = 9, 
		RULE_refinedBy = 10, RULE_definitionLeft = 11, RULE_any = 12, RULE_checkConditionBody = 13, 
		RULE_modelCheckType = 14, RULE_type = 15, RULE_set = 16, RULE_setComprehension = 17, 
		RULE_proc = 18, RULE_event = 19, RULE_locProcess = 20, RULE_locOutput = 21, 
		RULE_parallelProc = 22, RULE_letProc = 23, RULE_locNames = 24, RULE_parallelSync = 25, 
		RULE_boolExp = 26, RULE_expr = 27, RULE_number = 28;
	public static final String[] ruleNames = {
		"spec", "definition", "includeFile", "funcImport", "dataTypeDefinition", 
		"channelDecl", "channelNames", "channelColonType", "simpleDefinition", 
		"assertDefinition", "refinedBy", "definitionLeft", "any", "checkConditionBody", 
		"modelCheckType", "type", "set", "setComprehension", "proc", "event", 
		"locProcess", "locOutput", "parallelProc", "letProc", "locNames", "parallelSync", 
		"boolExp", "expr", "number"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'and'", "'or'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'not'", 
		"'+'", "'*'", "'-'", "'new'", "'/'", "'%'", "'$'", "'if'", "'then'", "'else'", 
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
		"TIMES", "MINUS", "NEW", "DIV", "MOD", "DOLLAR", "IF", "THEN", "ELSE", 
		"Skip", "Stop", "DIVERGE", "TRUE", "FALSE", "GUARD", "LPAREN", "RPAREN", 
		"LBRACKET", "RBRACKET", "LSYNC", "RSYNC", "INTL", "ECHOICE", "ICHOICE", 
		"PROJECT", "COMMA", "COLLON", "SEMICOL", "DATATYPE", "ARROW", "RARROW", 
		"QUERY", "PLING", "CHANNEL", "DOT", "LBRACE", "LBBRACE", "RBBRACE", "RBRACE", 
		"EQUAL", "BACKSLASH", "TIMEOUT", "INTR", "ASSERT", "DEADLOCK", "DETERMINISTIC", 
		"LIVELOCK", "DIVERGENCE", "FAILUREDIVE", "FAILURE", "TRACE", "TRACEREFINE", 
		"FAILUREREFINE", "FAILUREDIVREFINE", "FREE", "LET", "WITHIN", "INCLUDE", 
		"DBLQUOTE", "ACSP", "BAR", "SUBTYPE", "TRANSPARENT", "EXTERNAL", "NAMETYPE", 
		"DIGIT", "POR", "ID", "LINECOMMENT", "WS"
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
	public String getGrammarFileName() { return "ACSP.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ACSPParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SpecContext extends ParserRuleContext {
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public SpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecContext spec() throws RecognitionException {
		SpecContext _localctx = new SpecContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & ((1L << (DATATYPE - 39)) | (1L << (CHANNEL - 39)) | (1L << (ASSERT - 39)) | (1L << (INCLUDE - 39)) | (1L << (SUBTYPE - 39)) | (1L << (TRANSPARENT - 39)) | (1L << (EXTERNAL - 39)) | (1L << (NAMETYPE - 39)) | (1L << (ID - 39)))) != 0)) {
				{
				{
				setState(58);
				definition();
				}
				}
				setState(63);
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

	public static class DefinitionContext extends ParserRuleContext {
		public DataTypeDefinitionContext dataTypeDefinition() {
			return getRuleContext(DataTypeDefinitionContext.class,0);
		}
		public ChannelDeclContext channelDecl() {
			return getRuleContext(ChannelDeclContext.class,0);
		}
		public AssertDefinitionContext assertDefinition() {
			return getRuleContext(AssertDefinitionContext.class,0);
		}
		public FuncImportContext funcImport() {
			return getRuleContext(FuncImportContext.class,0);
		}
		public IncludeFileContext includeFile() {
			return getRuleContext(IncludeFileContext.class,0);
		}
		public SimpleDefinitionContext simpleDefinition() {
			return getRuleContext(SimpleDefinitionContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definition);
		try {
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATATYPE:
			case SUBTYPE:
			case NAMETYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				dataTypeDefinition();
				}
				break;
			case CHANNEL:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				channelDecl();
				}
				break;
			case ASSERT:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				assertDefinition();
				}
				break;
			case TRANSPARENT:
			case EXTERNAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				funcImport();
				}
				break;
			case INCLUDE:
				enterOuterAlt(_localctx, 5);
				{
				setState(68);
				includeFile();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(69);
				simpleDefinition();
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

	public static class IncludeFileContext extends ParserRuleContext {
		public TerminalNode INCLUDE() { return getToken(ACSPParser.INCLUDE, 0); }
		public List<TerminalNode> DBLQUOTE() { return getTokens(ACSPParser.DBLQUOTE); }
		public TerminalNode DBLQUOTE(int i) {
			return getToken(ACSPParser.DBLQUOTE, i);
		}
		public List<TerminalNode> ID() { return getTokens(ACSPParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ACSPParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(ACSPParser.DOT, 0); }
		public TerminalNode ACSP() { return getToken(ACSPParser.ACSP, 0); }
		public List<TerminalNode> DIV() { return getTokens(ACSPParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(ACSPParser.DIV, i);
		}
		public IncludeFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_includeFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterIncludeFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitIncludeFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitIncludeFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncludeFileContext includeFile() throws RecognitionException {
		IncludeFileContext _localctx = new IncludeFileContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_includeFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(INCLUDE);
			setState(73);
			match(DBLQUOTE);
			setState(74);
			match(ID);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DIV) {
				{
				{
				setState(75);
				match(DIV);
				setState(76);
				match(ID);
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			match(DOT);
			setState(83);
			match(ACSP);
			setState(84);
			match(DBLQUOTE);
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

	public static class FuncImportContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ACSPParser.ID, 0); }
		public TerminalNode TRANSPARENT() { return getToken(ACSPParser.TRANSPARENT, 0); }
		public TerminalNode EXTERNAL() { return getToken(ACSPParser.EXTERNAL, 0); }
		public FuncImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcImport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterFuncImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitFuncImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitFuncImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncImportContext funcImport() throws RecognitionException {
		FuncImportContext _localctx = new FuncImportContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcImport);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_la = _input.LA(1);
			if ( !(_la==TRANSPARENT || _la==EXTERNAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(87);
			match(ID);
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

	public static class DataTypeDefinitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ACSPParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(ACSPParser.EQUAL, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode DATATYPE() { return getToken(ACSPParser.DATATYPE, 0); }
		public TerminalNode SUBTYPE() { return getToken(ACSPParser.SUBTYPE, 0); }
		public TerminalNode NAMETYPE() { return getToken(ACSPParser.NAMETYPE, 0); }
		public List<TerminalNode> BAR() { return getTokens(ACSPParser.BAR); }
		public TerminalNode BAR(int i) {
			return getToken(ACSPParser.BAR, i);
		}
		public DataTypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterDataTypeDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitDataTypeDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitDataTypeDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeDefinitionContext dataTypeDefinition() throws RecognitionException {
		DataTypeDefinitionContext _localctx = new DataTypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dataTypeDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_la = _input.LA(1);
			if ( !(((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & ((1L << (DATATYPE - 39)) | (1L << (SUBTYPE - 39)) | (1L << (NAMETYPE - 39)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(90);
			match(ID);
			setState(91);
			match(EQUAL);
			setState(92);
			type(0);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BAR) {
				{
				{
				setState(93);
				match(BAR);
				setState(94);
				type(0);
				}
				}
				setState(99);
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

	public static class ChannelDeclContext extends ParserRuleContext {
		public TerminalNode CHANNEL() { return getToken(ACSPParser.CHANNEL, 0); }
		public ChannelNamesContext channelNames() {
			return getRuleContext(ChannelNamesContext.class,0);
		}
		public ChannelColonTypeContext channelColonType() {
			return getRuleContext(ChannelColonTypeContext.class,0);
		}
		public ChannelDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_channelDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterChannelDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitChannelDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitChannelDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChannelDeclContext channelDecl() throws RecognitionException {
		ChannelDeclContext _localctx = new ChannelDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_channelDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(CHANNEL);
			setState(101);
			channelNames();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLLON) {
				{
				setState(102);
				channelColonType();
				}
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

	public static class ChannelNamesContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ACSPParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ACSPParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ACSPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ACSPParser.COMMA, i);
		}
		public ChannelNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_channelNames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterChannelNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitChannelNames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitChannelNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChannelNamesContext channelNames() throws RecognitionException {
		ChannelNamesContext _localctx = new ChannelNamesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_channelNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(ID);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(106);
				match(COMMA);
				setState(107);
				match(ID);
				}
				}
				setState(112);
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

	public static class ChannelColonTypeContext extends ParserRuleContext {
		public TerminalNode COLLON() { return getToken(ACSPParser.COLLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ChannelColonTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_channelColonType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterChannelColonType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitChannelColonType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitChannelColonType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChannelColonTypeContext channelColonType() throws RecognitionException {
		ChannelColonTypeContext _localctx = new ChannelColonTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_channelColonType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(COLLON);
			setState(114);
			type(0);
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

	public static class SimpleDefinitionContext extends ParserRuleContext {
		public DefinitionLeftContext definitionLeft() {
			return getRuleContext(DefinitionLeftContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(ACSPParser.EQUAL, 0); }
		public AnyContext any() {
			return getRuleContext(AnyContext.class,0);
		}
		public SimpleDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterSimpleDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitSimpleDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitSimpleDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleDefinitionContext simpleDefinition() throws RecognitionException {
		SimpleDefinitionContext _localctx = new SimpleDefinitionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_simpleDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			definitionLeft();
			setState(117);
			match(EQUAL);
			setState(118);
			any();
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

	public static class AssertDefinitionContext extends ParserRuleContext {
		public TerminalNode ASSERT() { return getToken(ACSPParser.ASSERT, 0); }
		public DefinitionLeftContext definitionLeft() {
			return getRuleContext(DefinitionLeftContext.class,0);
		}
		public TerminalNode COLLON() { return getToken(ACSPParser.COLLON, 0); }
		public TerminalNode LBRACKET() { return getToken(ACSPParser.LBRACKET, 0); }
		public CheckConditionBodyContext checkConditionBody() {
			return getRuleContext(CheckConditionBodyContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(ACSPParser.RBRACKET, 0); }
		public List<ProcContext> proc() {
			return getRuleContexts(ProcContext.class);
		}
		public ProcContext proc(int i) {
			return getRuleContext(ProcContext.class,i);
		}
		public RefinedByContext refinedBy() {
			return getRuleContext(RefinedByContext.class,0);
		}
		public AssertDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterAssertDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitAssertDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitAssertDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssertDefinitionContext assertDefinition() throws RecognitionException {
		AssertDefinitionContext _localctx = new AssertDefinitionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assertDefinition);
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(ASSERT);
				setState(121);
				definitionLeft();
				setState(122);
				match(COLLON);
				setState(123);
				match(LBRACKET);
				setState(124);
				checkConditionBody();
				setState(125);
				match(RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				match(ASSERT);
				setState(128);
				proc(0);
				setState(129);
				refinedBy();
				setState(130);
				proc(0);
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

	public static class RefinedByContext extends ParserRuleContext {
		public TerminalNode TRACEREFINE() { return getToken(ACSPParser.TRACEREFINE, 0); }
		public TerminalNode FAILUREREFINE() { return getToken(ACSPParser.FAILUREREFINE, 0); }
		public TerminalNode FAILUREDIVREFINE() { return getToken(ACSPParser.FAILUREDIVREFINE, 0); }
		public RefinedByContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refinedBy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterRefinedBy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitRefinedBy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitRefinedBy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefinedByContext refinedBy() throws RecognitionException {
		RefinedByContext _localctx = new RefinedByContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_refinedBy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_la = _input.LA(1);
			if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (TRACEREFINE - 62)) | (1L << (FAILUREREFINE - 62)) | (1L << (FAILUREDIVREFINE - 62)))) != 0)) ) {
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

	public static class DefinitionLeftContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ACSPParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(ACSPParser.LPAREN, 0); }
		public List<AnyContext> any() {
			return getRuleContexts(AnyContext.class);
		}
		public AnyContext any(int i) {
			return getRuleContext(AnyContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ACSPParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ACSPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ACSPParser.COMMA, i);
		}
		public DefinitionLeftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definitionLeft; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterDefinitionLeft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitDefinitionLeft(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitDefinitionLeft(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionLeftContext definitionLeft() throws RecognitionException {
		DefinitionLeftContext _localctx = new DefinitionLeftContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_definitionLeft);
		int _la;
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(ID);
				setState(138);
				match(LPAREN);
				setState(139);
				any();
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(140);
					match(COMMA);
					setState(141);
					any();
					}
					}
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(147);
				match(RPAREN);
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

	public static class AnyContext extends ParserRuleContext {
		public ProcContext proc() {
			return getRuleContext(ProcContext.class,0);
		}
		public BoolExpContext boolExp() {
			return getRuleContext(BoolExpContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public EventContext event() {
			return getRuleContext(EventContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AnyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterAny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitAny(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitAny(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnyContext any() throws RecognitionException {
		AnyContext _localctx = new AnyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_any);
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				proc(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				boolExp(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(154);
				event();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(155);
				type(0);
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

	public static class CheckConditionBodyContext extends ParserRuleContext {
		public TerminalNode DEADLOCK() { return getToken(ACSPParser.DEADLOCK, 0); }
		public TerminalNode FREE() { return getToken(ACSPParser.FREE, 0); }
		public ModelCheckTypeContext modelCheckType() {
			return getRuleContext(ModelCheckTypeContext.class,0);
		}
		public TerminalNode LIVELOCK() { return getToken(ACSPParser.LIVELOCK, 0); }
		public TerminalNode DIVERGENCE() { return getToken(ACSPParser.DIVERGENCE, 0); }
		public TerminalNode DETERMINISTIC() { return getToken(ACSPParser.DETERMINISTIC, 0); }
		public TerminalNode POR() { return getToken(ACSPParser.POR, 0); }
		public CheckConditionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkConditionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterCheckConditionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitCheckConditionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitCheckConditionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckConditionBodyContext checkConditionBody() throws RecognitionException {
		CheckConditionBodyContext _localctx = new CheckConditionBodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_checkConditionBody);
		int _la;
		try {
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEADLOCK:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(DEADLOCK);
				setState(159);
				match(FREE);
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FAILUREDIVE) | (1L << FAILURE) | (1L << TRACE))) != 0)) {
					{
					setState(160);
					modelCheckType();
					}
				}

				}
				break;
			case LIVELOCK:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(LIVELOCK);
				setState(164);
				match(FREE);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FAILUREDIVE) | (1L << FAILURE) | (1L << TRACE))) != 0)) {
					{
					setState(165);
					modelCheckType();
					}
				}

				}
				break;
			case DIVERGENCE:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				match(DIVERGENCE);
				setState(169);
				match(FREE);
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FAILUREDIVE) | (1L << FAILURE) | (1L << TRACE))) != 0)) {
					{
					setState(170);
					modelCheckType();
					}
				}

				}
				break;
			case DETERMINISTIC:
				enterOuterAlt(_localctx, 4);
				{
				setState(173);
				match(DETERMINISTIC);
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FAILUREDIVE) | (1L << FAILURE) | (1L << TRACE))) != 0)) {
					{
					setState(174);
					modelCheckType();
					}
				}

				}
				break;
			case POR:
				enterOuterAlt(_localctx, 5);
				{
				setState(177);
				match(POR);
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

	public static class ModelCheckTypeContext extends ParserRuleContext {
		public TerminalNode FAILUREDIVE() { return getToken(ACSPParser.FAILUREDIVE, 0); }
		public TerminalNode FAILURE() { return getToken(ACSPParser.FAILURE, 0); }
		public TerminalNode TRACE() { return getToken(ACSPParser.TRACE, 0); }
		public ModelCheckTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelCheckType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterModelCheckType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitModelCheckType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitModelCheckType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModelCheckTypeContext modelCheckType() throws RecognitionException {
		ModelCheckTypeContext _localctx = new ModelCheckTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_modelCheckType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FAILUREDIVE) | (1L << FAILURE) | (1L << TRACE))) != 0)) ) {
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ACSPParser.ID, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode DOT() { return getToken(ACSPParser.DOT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(183);
				match(ID);
				}
				break;
			case 2:
				{
				setState(184);
				number();
				}
				break;
			case 3:
				{
				setState(185);
				set();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(193);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(188);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(189);
					match(DOT);
					setState(190);
					type(3);
					}
					} 
				}
				setState(195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SetContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ACSPParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ACSPParser.RBRACE, 0); }
		public List<AnyContext> any() {
			return getRuleContexts(AnyContext.class);
		}
		public AnyContext any(int i) {
			return getRuleContext(AnyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ACSPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ACSPParser.COMMA, i);
		}
		public List<TerminalNode> DOT() { return getTokens(ACSPParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ACSPParser.DOT, i);
		}
		public TerminalNode LBBRACE() { return getToken(ACSPParser.LBBRACE, 0); }
		public TerminalNode RBBRACE() { return getToken(ACSPParser.RBBRACE, 0); }
		public DefinitionLeftContext definitionLeft() {
			return getRuleContext(DefinitionLeftContext.class,0);
		}
		public TerminalNode BAR() { return getToken(ACSPParser.BAR, 0); }
		public List<SetComprehensionContext> setComprehension() {
			return getRuleContexts(SetComprehensionContext.class);
		}
		public SetComprehensionContext setComprehension(int i) {
			return getRuleContext(SetComprehensionContext.class,i);
		}
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_set);
		int _la;
		try {
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(196);
				match(LBRACE);
				setState(212);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(197);
					any();
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(198);
						match(COMMA);
						setState(199);
						any();
						}
						}
						setState(204);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << MINUS) | (1L << IF) | (1L << Skip) | (1L << Stop) | (1L << TRUE) | (1L << FALSE) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBBRACE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (LET - 66)) | (1L << (DIGIT - 66)) | (1L << (ID - 66)))) != 0)) {
						{
						setState(205);
						any();
						setState(206);
						match(DOT);
						setState(207);
						match(DOT);
						setState(208);
						any();
						}
					}

					}
					break;
				}
				setState(214);
				match(RBRACE);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(215);
				match(LBBRACE);
				setState(231);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(216);
					any();
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(217);
						match(COMMA);
						setState(218);
						any();
						}
						}
						setState(223);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(229);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << MINUS) | (1L << IF) | (1L << Skip) | (1L << Stop) | (1L << TRUE) | (1L << FALSE) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBBRACE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (LET - 66)) | (1L << (DIGIT - 66)) | (1L << (ID - 66)))) != 0)) {
						{
						setState(224);
						any();
						setState(225);
						match(DOT);
						setState(226);
						match(DOT);
						setState(227);
						any();
						}
					}

					}
					break;
				}
				setState(233);
				match(RBBRACE);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				definitionLeft();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(235);
				match(LBRACE);
				{
				setState(236);
				any();
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(237);
					match(COMMA);
					setState(238);
					any();
					}
					}
					setState(243);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(244);
				match(BAR);
				setState(245);
				setComprehension();
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(246);
					match(COMMA);
					setState(247);
					setComprehension();
					}
					}
					setState(252);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(253);
				match(RBRACE);
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

	public static class SetComprehensionContext extends ParserRuleContext {
		public AnyContext any() {
			return getRuleContext(AnyContext.class,0);
		}
		public TerminalNode RARROW() { return getToken(ACSPParser.RARROW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public BoolExpContext boolExp() {
			return getRuleContext(BoolExpContext.class,0);
		}
		public SetComprehensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setComprehension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterSetComprehension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitSetComprehension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitSetComprehension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetComprehensionContext setComprehension() throws RecognitionException {
		SetComprehensionContext _localctx = new SetComprehensionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_setComprehension);
		try {
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				any();
				setState(258);
				match(RARROW);
				setState(259);
				type(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				boolExp(0);
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

	public static class ProcContext extends ParserRuleContext {
		public TerminalNode Skip() { return getToken(ACSPParser.Skip, 0); }
		public TerminalNode Stop() { return getToken(ACSPParser.Stop, 0); }
		public EventContext event() {
			return getRuleContext(EventContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(ACSPParser.ARROW, 0); }
		public List<ProcContext> proc() {
			return getRuleContexts(ProcContext.class);
		}
		public ProcContext proc(int i) {
			return getRuleContext(ProcContext.class,i);
		}
		public TerminalNode IF() { return getToken(ACSPParser.IF, 0); }
		public BoolExpContext boolExp() {
			return getRuleContext(BoolExpContext.class,0);
		}
		public TerminalNode THEN() { return getToken(ACSPParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(ACSPParser.ELSE, 0); }
		public TerminalNode GUARD() { return getToken(ACSPParser.GUARD, 0); }
		public TerminalNode LPAREN() { return getToken(ACSPParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ACSPParser.RPAREN, 0); }
		public LocProcessContext locProcess() {
			return getRuleContext(LocProcessContext.class,0);
		}
		public LocOutputContext locOutput() {
			return getRuleContext(LocOutputContext.class,0);
		}
		public ParallelProcContext parallelProc() {
			return getRuleContext(ParallelProcContext.class,0);
		}
		public LetProcContext letProc() {
			return getRuleContext(LetProcContext.class,0);
		}
		public DefinitionLeftContext definitionLeft() {
			return getRuleContext(DefinitionLeftContext.class,0);
		}
		public TerminalNode ECHOICE() { return getToken(ACSPParser.ECHOICE, 0); }
		public TerminalNode ICHOICE() { return getToken(ACSPParser.ICHOICE, 0); }
		public TerminalNode TIMEOUT() { return getToken(ACSPParser.TIMEOUT, 0); }
		public TerminalNode INTR() { return getToken(ACSPParser.INTR, 0); }
		public TerminalNode SEMICOL() { return getToken(ACSPParser.SEMICOL, 0); }
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public TerminalNode BACKSLASH() { return getToken(ACSPParser.BACKSLASH, 0); }
		public TerminalNode PROJECT() { return getToken(ACSPParser.PROJECT, 0); }
		public ProcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterProc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitProc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitProc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcContext proc() throws RecognitionException {
		return proc(0);
	}

	private ProcContext proc(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ProcContext _localctx = new ProcContext(_ctx, _parentState);
		ProcContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_proc, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(265);
				match(Skip);
				}
				break;
			case 2:
				{
				setState(266);
				match(Stop);
				}
				break;
			case 3:
				{
				setState(267);
				event();
				setState(268);
				match(ARROW);
				setState(269);
				proc(15);
				}
				break;
			case 4:
				{
				setState(271);
				match(IF);
				setState(272);
				boolExp(0);
				setState(273);
				match(THEN);
				setState(274);
				proc(0);
				setState(275);
				match(ELSE);
				setState(276);
				proc(12);
				}
				break;
			case 5:
				{
				setState(278);
				boolExp(0);
				setState(279);
				match(GUARD);
				setState(280);
				proc(11);
				}
				break;
			case 6:
				{
				setState(282);
				match(LPAREN);
				setState(283);
				proc(0);
				setState(284);
				match(RPAREN);
				}
				break;
			case 7:
				{
				setState(286);
				locProcess();
				}
				break;
			case 8:
				{
				setState(287);
				locOutput();
				}
				break;
			case 9:
				{
				setState(288);
				parallelProc();
				}
				break;
			case 10:
				{
				setState(289);
				letProc();
				}
				break;
			case 11:
				{
				setState(290);
				definitionLeft();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(313);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(311);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new ProcContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_proc);
						setState(293);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(294);
						match(ECHOICE);
						setState(295);
						proc(15);
						}
						break;
					case 2:
						{
						_localctx = new ProcContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_proc);
						setState(296);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(297);
						match(ICHOICE);
						setState(298);
						proc(14);
						}
						break;
					case 3:
						{
						_localctx = new ProcContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_proc);
						setState(299);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(300);
						match(TIMEOUT);
						setState(301);
						proc(10);
						}
						break;
					case 4:
						{
						_localctx = new ProcContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_proc);
						setState(302);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(303);
						match(INTR);
						setState(304);
						proc(9);
						}
						break;
					case 5:
						{
						_localctx = new ProcContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_proc);
						setState(305);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(306);
						match(SEMICOL);
						setState(307);
						proc(8);
						}
						break;
					case 6:
						{
						_localctx = new ProcContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_proc);
						setState(308);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(309);
						_la = _input.LA(1);
						if ( !(_la==PROJECT || _la==BACKSLASH) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(310);
						set();
						}
						break;
					}
					} 
				}
				setState(315);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EventContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ACSPParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ACSPParser.ID, i);
		}
		public List<TerminalNode> QUERY() { return getTokens(ACSPParser.QUERY); }
		public TerminalNode QUERY(int i) {
			return getToken(ACSPParser.QUERY, i);
		}
		public List<TerminalNode> PLING() { return getTokens(ACSPParser.PLING); }
		public TerminalNode PLING(int i) {
			return getToken(ACSPParser.PLING, i);
		}
		public List<TerminalNode> DOLLAR() { return getTokens(ACSPParser.DOLLAR); }
		public TerminalNode DOLLAR(int i) {
			return getToken(ACSPParser.DOLLAR, i);
		}
		public List<TerminalNode> DOT() { return getTokens(ACSPParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ACSPParser.DOT, i);
		}
		public List<TerminalNode> COLLON() { return getTokens(ACSPParser.COLLON); }
		public TerminalNode COLLON(int i) {
			return getToken(ACSPParser.COLLON, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public EventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitEvent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitEvent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventContext event() throws RecognitionException {
		EventContext _localctx = new EventContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_event);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(ID);
			setState(325);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(317);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOLLAR) | (1L << QUERY) | (1L << PLING) | (1L << DOT))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(318);
					match(ID);
					setState(321);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						setState(319);
						match(COLLON);
						setState(320);
						type(0);
						}
						break;
					}
					}
					} 
				}
				setState(327);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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

	public static class LocProcessContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ACSPParser.ID, 0); }
		public TerminalNode LBRACKET() { return getToken(ACSPParser.LBRACKET, 0); }
		public ProcContext proc() {
			return getRuleContext(ProcContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(ACSPParser.RBRACKET, 0); }
		public LocProcessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locProcess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterLocProcess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitLocProcess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitLocProcess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocProcessContext locProcess() throws RecognitionException {
		LocProcessContext _localctx = new LocProcessContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_locProcess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(ID);
			setState(329);
			match(LBRACKET);
			setState(330);
			proc(0);
			setState(331);
			match(RBRACKET);
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

	public static class LocOutputContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ACSPParser.ID, 0); }
		public TerminalNode PLING() { return getToken(ACSPParser.PLING, 0); }
		public TerminalNode LT() { return getToken(ACSPParser.LT, 0); }
		public List<ProcContext> proc() {
			return getRuleContexts(ProcContext.class);
		}
		public ProcContext proc(int i) {
			return getRuleContext(ProcContext.class,i);
		}
		public TerminalNode GT() { return getToken(ACSPParser.GT, 0); }
		public TerminalNode DOT() { return getToken(ACSPParser.DOT, 0); }
		public LocOutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locOutput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterLocOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitLocOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitLocOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocOutputContext locOutput() throws RecognitionException {
		LocOutputContext _localctx = new LocOutputContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_locOutput);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(ID);
			setState(334);
			match(PLING);
			setState(335);
			match(LT);
			setState(336);
			proc(0);
			setState(337);
			match(GT);
			setState(338);
			match(DOT);
			setState(339);
			proc(0);
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

	public static class ParallelProcContext extends ParserRuleContext {
		public List<TerminalNode> LPAREN() { return getTokens(ACSPParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(ACSPParser.LPAREN, i);
		}
		public List<ProcContext> proc() {
			return getRuleContexts(ProcContext.class);
		}
		public ProcContext proc(int i) {
			return getRuleContext(ProcContext.class,i);
		}
		public ParallelSyncContext parallelSync() {
			return getRuleContext(ParallelSyncContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(ACSPParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(ACSPParser.RPAREN, i);
		}
		public TerminalNode NEW() { return getToken(ACSPParser.NEW, 0); }
		public LocNamesContext locNames() {
			return getRuleContext(LocNamesContext.class,0);
		}
		public ParallelProcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parallelProc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterParallelProc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitParallelProc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitParallelProc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParallelProcContext parallelProc() throws RecognitionException {
		ParallelProcContext _localctx = new ParallelProcContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_parallelProc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(341);
				match(LPAREN);
				setState(342);
				match(NEW);
				setState(343);
				locNames();
				setState(344);
				match(RPAREN);
				}
				break;
			}
			setState(348);
			match(LPAREN);
			setState(349);
			proc(0);
			setState(350);
			parallelSync();
			setState(351);
			proc(0);
			setState(352);
			match(RPAREN);
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

	public static class LetProcContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(ACSPParser.LET, 0); }
		public TerminalNode WITHIN() { return getToken(ACSPParser.WITHIN, 0); }
		public AnyContext any() {
			return getRuleContext(AnyContext.class,0);
		}
		public List<SimpleDefinitionContext> simpleDefinition() {
			return getRuleContexts(SimpleDefinitionContext.class);
		}
		public SimpleDefinitionContext simpleDefinition(int i) {
			return getRuleContext(SimpleDefinitionContext.class,i);
		}
		public LetProcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letProc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterLetProc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitLetProc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitLetProc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetProcContext letProc() throws RecognitionException {
		LetProcContext _localctx = new LetProcContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_letProc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(LET);
			setState(356); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(355);
				simpleDefinition();
				}
				}
				setState(358); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(360);
			match(WITHIN);
			setState(361);
			any();
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

	public static class LocNamesContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ACSPParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ACSPParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ACSPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ACSPParser.COMMA, i);
		}
		public LocNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locNames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterLocNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitLocNames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitLocNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocNamesContext locNames() throws RecognitionException {
		LocNamesContext _localctx = new LocNamesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_locNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(ID);
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(364);
				match(COMMA);
				setState(365);
				match(ID);
				}
				}
				setState(370);
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

	public static class ParallelSyncContext extends ParserRuleContext {
		public TerminalNode LSYNC() { return getToken(ACSPParser.LSYNC, 0); }
		public List<SetContext> set() {
			return getRuleContexts(SetContext.class);
		}
		public SetContext set(int i) {
			return getRuleContext(SetContext.class,i);
		}
		public TerminalNode RSYNC() { return getToken(ACSPParser.RSYNC, 0); }
		public TerminalNode INTL() { return getToken(ACSPParser.INTL, 0); }
		public TerminalNode LBRACKET() { return getToken(ACSPParser.LBRACKET, 0); }
		public List<TerminalNode> BAR() { return getTokens(ACSPParser.BAR); }
		public TerminalNode BAR(int i) {
			return getToken(ACSPParser.BAR, i);
		}
		public TerminalNode RBRACKET() { return getToken(ACSPParser.RBRACKET, 0); }
		public ParallelSyncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parallelSync; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterParallelSync(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitParallelSync(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitParallelSync(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParallelSyncContext parallelSync() throws RecognitionException {
		ParallelSyncContext _localctx = new ParallelSyncContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_parallelSync);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LSYNC:
				{
				setState(371);
				match(LSYNC);
				setState(372);
				set();
				setState(373);
				match(RSYNC);
				}
				break;
			case INTL:
				{
				setState(375);
				match(INTL);
				}
				break;
			case LBRACKET:
				{
				setState(376);
				match(LBRACKET);
				setState(377);
				set();
				setState(378);
				match(BAR);
				setState(379);
				match(BAR);
				setState(380);
				set();
				setState(381);
				match(RBRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class BoolExpContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(ACSPParser.NOT, 0); }
		public List<BoolExpContext> boolExp() {
			return getRuleContexts(BoolExpContext.class);
		}
		public BoolExpContext boolExp(int i) {
			return getRuleContext(BoolExpContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(ACSPParser.LT, 0); }
		public TerminalNode GT() { return getToken(ACSPParser.GT, 0); }
		public TerminalNode LTEQ() { return getToken(ACSPParser.LTEQ, 0); }
		public TerminalNode GTEQ() { return getToken(ACSPParser.GTEQ, 0); }
		public TerminalNode EQ() { return getToken(ACSPParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(ACSPParser.NEQ, 0); }
		public TerminalNode TRUE() { return getToken(ACSPParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ACSPParser.FALSE, 0); }
		public DefinitionLeftContext definitionLeft() {
			return getRuleContext(DefinitionLeftContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ACSPParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ACSPParser.RPAREN, 0); }
		public TerminalNode AND() { return getToken(ACSPParser.AND, 0); }
		public TerminalNode OR() { return getToken(ACSPParser.OR, 0); }
		public BoolExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterBoolExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitBoolExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitBoolExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExpContext boolExp() throws RecognitionException {
		return boolExp(0);
	}

	private BoolExpContext boolExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolExpContext _localctx = new BoolExpContext(_ctx, _parentState);
		BoolExpContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_boolExp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(386);
				match(NOT);
				setState(387);
				boolExp(8);
				}
				break;
			case 2:
				{
				setState(388);
				expr(0);
				setState(389);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NEQ) | (1L << LT) | (1L << GT) | (1L << LTEQ) | (1L << GTEQ))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(390);
				expr(0);
				}
				break;
			case 3:
				{
				setState(392);
				match(TRUE);
				}
				break;
			case 4:
				{
				setState(393);
				match(FALSE);
				}
				break;
			case 5:
				{
				setState(394);
				definitionLeft();
				}
				break;
			case 6:
				{
				setState(395);
				number();
				}
				break;
			case 7:
				{
				setState(396);
				match(LPAREN);
				setState(397);
				boolExp(0);
				setState(398);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(407);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BoolExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_boolExp);
					setState(402);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(403);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(404);
					boolExp(7);
					}
					} 
				}
				setState(409);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(ACSPParser.MINUS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(ACSPParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ACSPParser.RPAREN, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode ID() { return getToken(ACSPParser.ID, 0); }
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public EventContext event() {
			return getRuleContext(EventContext.class,0);
		}
		public TerminalNode TIMES() { return getToken(ACSPParser.TIMES, 0); }
		public TerminalNode DIV() { return getToken(ACSPParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(ACSPParser.PLUS, 0); }
		public TerminalNode MOD() { return getToken(ACSPParser.MOD, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(411);
				match(MINUS);
				setState(412);
				expr(7);
				}
				break;
			case 2:
				{
				setState(413);
				match(LPAREN);
				setState(414);
				expr(0);
				setState(415);
				match(RPAREN);
				}
				break;
			case 3:
				{
				setState(417);
				number();
				}
				break;
			case 4:
				{
				setState(418);
				match(ID);
				}
				break;
			case 5:
				{
				setState(419);
				set();
				}
				break;
			case 6:
				{
				setState(420);
				event();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(428);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(423);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(424);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << TIMES) | (1L << MINUS) | (1L << DIV) | (1L << MOD))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(425);
					expr(7);
					}
					} 
				}
				setState(430);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(ACSPParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(ACSPParser.DIGIT, i);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_number);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(432); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(431);
					match(DIGIT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(434); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return type_sempred((TypeContext)_localctx, predIndex);
		case 18:
			return proc_sempred((ProcContext)_localctx, predIndex);
		case 26:
			return boolExp_sempred((BoolExpContext)_localctx, predIndex);
		case 27:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean proc_sempred(ProcContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 10);
		}
		return true;
	}
	private boolean boolExp_sempred(BoolExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3R\u01b7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\7\2>\n\2\f\2\16"+
		"\2A\13\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3I\n\3\3\4\3\4\3\4\3\4\3\4\7\4P\n\4"+
		"\f\4\16\4S\13\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7"+
		"\6b\n\6\f\6\16\6e\13\6\3\7\3\7\3\7\5\7j\n\7\3\b\3\b\3\b\7\bo\n\b\f\b\16"+
		"\br\13\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\5\13\u0087\n\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\7\r\u0091\n\r\f\r\16\r\u0094\13\r\3\r\3\r\5\r\u0098\n\r\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u009f\n\16\3\17\3\17\3\17\5\17\u00a4\n\17\3\17\3"+
		"\17\3\17\5\17\u00a9\n\17\3\17\3\17\3\17\5\17\u00ae\n\17\3\17\3\17\5\17"+
		"\u00b2\n\17\3\17\5\17\u00b5\n\17\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u00bd"+
		"\n\21\3\21\3\21\3\21\7\21\u00c2\n\21\f\21\16\21\u00c5\13\21\3\22\3\22"+
		"\3\22\3\22\7\22\u00cb\n\22\f\22\16\22\u00ce\13\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u00d5\n\22\5\22\u00d7\n\22\3\22\3\22\3\22\3\22\3\22\7\22\u00de"+
		"\n\22\f\22\16\22\u00e1\13\22\3\22\3\22\3\22\3\22\3\22\5\22\u00e8\n\22"+
		"\5\22\u00ea\n\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00f2\n\22\f\22\16"+
		"\22\u00f5\13\22\3\22\3\22\3\22\3\22\7\22\u00fb\n\22\f\22\16\22\u00fe\13"+
		"\22\3\22\3\22\5\22\u0102\n\22\3\23\3\23\3\23\3\23\3\23\5\23\u0109\n\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u0126\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u013a\n\24\f\24\16\24\u013d\13\24"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u0144\n\25\7\25\u0146\n\25\f\25\16\25\u0149"+
		"\13\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u015d\n\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\6\31\u0167\n\31\r\31\16\31\u0168\3\31\3\31\3\31\3\32\3\32\3"+
		"\32\7\32\u0171\n\32\f\32\16\32\u0174\13\32\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0182\n\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0193\n\34"+
		"\3\34\3\34\3\34\7\34\u0198\n\34\f\34\16\34\u019b\13\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01a8\n\35\3\35\3\35\3\35"+
		"\7\35\u01ad\n\35\f\35\16\35\u01b0\13\35\3\36\6\36\u01b3\n\36\r\36\16\36"+
		"\u01b4\3\36\2\6 &\668\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\64\668:\2\13\3\2KL\5\2))JJMM\3\2@B\3\2=?\4\2%%\65\65\5\2\22"+
		"\22,-//\3\2\5\n\3\2\3\4\4\2\f\16\20\21\2\u01e6\2?\3\2\2\2\4H\3\2\2\2\6"+
		"J\3\2\2\2\bX\3\2\2\2\n[\3\2\2\2\ff\3\2\2\2\16k\3\2\2\2\20s\3\2\2\2\22"+
		"v\3\2\2\2\24\u0086\3\2\2\2\26\u0088\3\2\2\2\30\u0097\3\2\2\2\32\u009e"+
		"\3\2\2\2\34\u00b4\3\2\2\2\36\u00b6\3\2\2\2 \u00bc\3\2\2\2\"\u0101\3\2"+
		"\2\2$\u0108\3\2\2\2&\u0125\3\2\2\2(\u013e\3\2\2\2*\u014a\3\2\2\2,\u014f"+
		"\3\2\2\2.\u015c\3\2\2\2\60\u0164\3\2\2\2\62\u016d\3\2\2\2\64\u0181\3\2"+
		"\2\2\66\u0192\3\2\2\28\u01a7\3\2\2\2:\u01b2\3\2\2\2<>\5\4\3\2=<\3\2\2"+
		"\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\3\3\2\2\2A?\3\2\2\2BI\5\n\6\2CI\5\f"+
		"\7\2DI\5\24\13\2EI\5\b\5\2FI\5\6\4\2GI\5\22\n\2HB\3\2\2\2HC\3\2\2\2HD"+
		"\3\2\2\2HE\3\2\2\2HF\3\2\2\2HG\3\2\2\2I\5\3\2\2\2JK\7F\2\2KL\7G\2\2LQ"+
		"\7P\2\2MN\7\20\2\2NP\7P\2\2OM\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT"+
		"\3\2\2\2SQ\3\2\2\2TU\7/\2\2UV\7H\2\2VW\7G\2\2W\7\3\2\2\2XY\t\2\2\2YZ\7"+
		"P\2\2Z\t\3\2\2\2[\\\t\3\2\2\\]\7P\2\2]^\7\64\2\2^c\5 \21\2_`\7I\2\2`b"+
		"\5 \21\2a_\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\13\3\2\2\2ec\3\2\2\2"+
		"fg\7.\2\2gi\5\16\b\2hj\5\20\t\2ih\3\2\2\2ij\3\2\2\2j\r\3\2\2\2kp\7P\2"+
		"\2lm\7&\2\2mo\7P\2\2nl\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\17\3\2\2"+
		"\2rp\3\2\2\2st\7\'\2\2tu\5 \21\2u\21\3\2\2\2vw\5\30\r\2wx\7\64\2\2xy\5"+
		"\32\16\2y\23\3\2\2\2z{\78\2\2{|\5\30\r\2|}\7\'\2\2}~\7\36\2\2~\177\5\34"+
		"\17\2\177\u0080\7\37\2\2\u0080\u0087\3\2\2\2\u0081\u0082\78\2\2\u0082"+
		"\u0083\5&\24\2\u0083\u0084\5\26\f\2\u0084\u0085\5&\24\2\u0085\u0087\3"+
		"\2\2\2\u0086z\3\2\2\2\u0086\u0081\3\2\2\2\u0087\25\3\2\2\2\u0088\u0089"+
		"\t\4\2\2\u0089\27\3\2\2\2\u008a\u0098\7P\2\2\u008b\u008c\7P\2\2\u008c"+
		"\u008d\7\34\2\2\u008d\u0092\5\32\16\2\u008e\u008f\7&\2\2\u008f\u0091\5"+
		"\32\16\2\u0090\u008e\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096\7\35"+
		"\2\2\u0096\u0098\3\2\2\2\u0097\u008a\3\2\2\2\u0097\u008b\3\2\2\2\u0098"+
		"\31\3\2\2\2\u0099\u009f\5&\24\2\u009a\u009f\5\66\34\2\u009b\u009f\58\35"+
		"\2\u009c\u009f\5(\25\2\u009d\u009f\5 \21\2\u009e\u0099\3\2\2\2\u009e\u009a"+
		"\3\2\2\2\u009e\u009b\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f"+
		"\33\3\2\2\2\u00a0\u00a1\79\2\2\u00a1\u00a3\7C\2\2\u00a2\u00a4\5\36\20"+
		"\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00b5\3\2\2\2\u00a5\u00a6"+
		"\7;\2\2\u00a6\u00a8\7C\2\2\u00a7\u00a9\5\36\20\2\u00a8\u00a7\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00b5\3\2\2\2\u00aa\u00ab\7<\2\2\u00ab\u00ad\7C\2"+
		"\2\u00ac\u00ae\5\36\20\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00b5\3\2\2\2\u00af\u00b1\7:\2\2\u00b0\u00b2\5\36\20\2\u00b1\u00b0\3"+
		"\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b5\7O\2\2\u00b4"+
		"\u00a0\3\2\2\2\u00b4\u00a5\3\2\2\2\u00b4\u00aa\3\2\2\2\u00b4\u00af\3\2"+
		"\2\2\u00b4\u00b3\3\2\2\2\u00b5\35\3\2\2\2\u00b6\u00b7\t\5\2\2\u00b7\37"+
		"\3\2\2\2\u00b8\u00b9\b\21\1\2\u00b9\u00bd\7P\2\2\u00ba\u00bd\5:\36\2\u00bb"+
		"\u00bd\5\"\22\2\u00bc\u00b8\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3"+
		"\2\2\2\u00bd\u00c3\3\2\2\2\u00be\u00bf\f\4\2\2\u00bf\u00c0\7/\2\2\u00c0"+
		"\u00c2\5 \21\5\u00c1\u00be\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2"+
		"\2\2\u00c3\u00c4\3\2\2\2\u00c4!\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00d6"+
		"\7\60\2\2\u00c7\u00cc\5\32\16\2\u00c8\u00c9\7&\2\2\u00c9\u00cb\5\32\16"+
		"\2\u00ca\u00c8\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd"+
		"\3\2\2\2\u00cd\u00d7\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\5\32\16\2"+
		"\u00d0\u00d1\7/\2\2\u00d1\u00d2\7/\2\2\u00d2\u00d3\5\32\16\2\u00d3\u00d5"+
		"\3\2\2\2\u00d4\u00cf\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6"+
		"\u00c7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u0102\7\63"+
		"\2\2\u00d9\u00e9\7\61\2\2\u00da\u00df\5\32\16\2\u00db\u00dc\7&\2\2\u00dc"+
		"\u00de\5\32\16\2\u00dd\u00db\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3"+
		"\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00ea\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2"+
		"\u00e3\5\32\16\2\u00e3\u00e4\7/\2\2\u00e4\u00e5\7/\2\2\u00e5\u00e6\5\32"+
		"\16\2\u00e6\u00e8\3\2\2\2\u00e7\u00e2\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00ea\3\2\2\2\u00e9\u00da\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\3\2"+
		"\2\2\u00eb\u0102\7\62\2\2\u00ec\u0102\5\30\r\2\u00ed\u00ee\7\60\2\2\u00ee"+
		"\u00f3\5\32\16\2\u00ef\u00f0\7&\2\2\u00f0\u00f2\5\32\16\2\u00f1\u00ef"+
		"\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\7I\2\2\u00f7\u00fc\5$\23"+
		"\2\u00f8\u00f9\7&\2\2\u00f9\u00fb\5$\23\2\u00fa\u00f8\3\2\2\2\u00fb\u00fe"+
		"\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe"+
		"\u00fc\3\2\2\2\u00ff\u0100\7\63\2\2\u0100\u0102\3\2\2\2\u0101\u00c6\3"+
		"\2\2\2\u0101\u00d9\3\2\2\2\u0101\u00ec\3\2\2\2\u0101\u00ed\3\2\2\2\u0102"+
		"#\3\2\2\2\u0103\u0104\5\32\16\2\u0104\u0105\7+\2\2\u0105\u0106\5 \21\2"+
		"\u0106\u0109\3\2\2\2\u0107\u0109\5\66\34\2\u0108\u0103\3\2\2\2\u0108\u0107"+
		"\3\2\2\2\u0109%\3\2\2\2\u010a\u010b\b\24\1\2\u010b\u0126\7\26\2\2\u010c"+
		"\u0126\7\27\2\2\u010d\u010e\5(\25\2\u010e\u010f\7*\2\2\u010f\u0110\5&"+
		"\24\21\u0110\u0126\3\2\2\2\u0111\u0112\7\23\2\2\u0112\u0113\5\66\34\2"+
		"\u0113\u0114\7\24\2\2\u0114\u0115\5&\24\2\u0115\u0116\7\25\2\2\u0116\u0117"+
		"\5&\24\16\u0117\u0126\3\2\2\2\u0118\u0119\5\66\34\2\u0119\u011a\7\33\2"+
		"\2\u011a\u011b\5&\24\r\u011b\u0126\3\2\2\2\u011c\u011d\7\34\2\2\u011d"+
		"\u011e\5&\24\2\u011e\u011f\7\35\2\2\u011f\u0126\3\2\2\2\u0120\u0126\5"+
		"*\26\2\u0121\u0126\5,\27\2\u0122\u0126\5.\30\2\u0123\u0126\5\60\31\2\u0124"+
		"\u0126\5\30\r\2\u0125\u010a\3\2\2\2\u0125\u010c\3\2\2\2\u0125\u010d\3"+
		"\2\2\2\u0125\u0111\3\2\2\2\u0125\u0118\3\2\2\2\u0125\u011c\3\2\2\2\u0125"+
		"\u0120\3\2\2\2\u0125\u0121\3\2\2\2\u0125\u0122\3\2\2\2\u0125\u0123\3\2"+
		"\2\2\u0125\u0124\3\2\2\2\u0126\u013b\3\2\2\2\u0127\u0128\f\20\2\2\u0128"+
		"\u0129\7#\2\2\u0129\u013a\5&\24\21\u012a\u012b\f\17\2\2\u012b\u012c\7"+
		"$\2\2\u012c\u013a\5&\24\20\u012d\u012e\f\13\2\2\u012e\u012f\7\66\2\2\u012f"+
		"\u013a\5&\24\f\u0130\u0131\f\n\2\2\u0131\u0132\7\67\2\2\u0132\u013a\5"+
		"&\24\13\u0133\u0134\f\t\2\2\u0134\u0135\7(\2\2\u0135\u013a\5&\24\n\u0136"+
		"\u0137\f\f\2\2\u0137\u0138\t\6\2\2\u0138\u013a\5\"\22\2\u0139\u0127\3"+
		"\2\2\2\u0139\u012a\3\2\2\2\u0139\u012d\3\2\2\2\u0139\u0130\3\2\2\2\u0139"+
		"\u0133\3\2\2\2\u0139\u0136\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2"+
		"\2\2\u013b\u013c\3\2\2\2\u013c\'\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u0147"+
		"\7P\2\2\u013f\u0140\t\7\2\2\u0140\u0143\7P\2\2\u0141\u0142\7\'\2\2\u0142"+
		"\u0144\5 \21\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0146\3\2"+
		"\2\2\u0145\u013f\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147"+
		"\u0148\3\2\2\2\u0148)\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014b\7P\2\2\u014b"+
		"\u014c\7\36\2\2\u014c\u014d\5&\24\2\u014d\u014e\7\37\2\2\u014e+\3\2\2"+
		"\2\u014f\u0150\7P\2\2\u0150\u0151\7-\2\2\u0151\u0152\7\7\2\2\u0152\u0153"+
		"\5&\24\2\u0153\u0154\7\b\2\2\u0154\u0155\7/\2\2\u0155\u0156\5&\24\2\u0156"+
		"-\3\2\2\2\u0157\u0158\7\34\2\2\u0158\u0159\7\17\2\2\u0159\u015a\5\62\32"+
		"\2\u015a\u015b\7\35\2\2\u015b\u015d\3\2\2\2\u015c\u0157\3\2\2\2\u015c"+
		"\u015d\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\7\34\2\2\u015f\u0160\5"+
		"&\24\2\u0160\u0161\5\64\33\2\u0161\u0162\5&\24\2\u0162\u0163\7\35\2\2"+
		"\u0163/\3\2\2\2\u0164\u0166\7D\2\2\u0165\u0167\5\22\n\2\u0166\u0165\3"+
		"\2\2\2\u0167\u0168\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169"+
		"\u016a\3\2\2\2\u016a\u016b\7E\2\2\u016b\u016c\5\32\16\2\u016c\61\3\2\2"+
		"\2\u016d\u0172\7P\2\2\u016e\u016f\7&\2\2\u016f\u0171\7P\2\2\u0170\u016e"+
		"\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		"\63\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0176\7 \2\2\u0176\u0177\5\"\22"+
		"\2\u0177\u0178\7!\2\2\u0178\u0182\3\2\2\2\u0179\u0182\7\"\2\2\u017a\u017b"+
		"\7\36\2\2\u017b\u017c\5\"\22\2\u017c\u017d\7I\2\2\u017d\u017e\7I\2\2\u017e"+
		"\u017f\5\"\22\2\u017f\u0180\7\37\2\2\u0180\u0182\3\2\2\2\u0181\u0175\3"+
		"\2\2\2\u0181\u0179\3\2\2\2\u0181\u017a\3\2\2\2\u0182\65\3\2\2\2\u0183"+
		"\u0184\b\34\1\2\u0184\u0185\7\13\2\2\u0185\u0193\5\66\34\n\u0186\u0187"+
		"\58\35\2\u0187\u0188\t\b\2\2\u0188\u0189\58\35\2\u0189\u0193\3\2\2\2\u018a"+
		"\u0193\7\31\2\2\u018b\u0193\7\32\2\2\u018c\u0193\5\30\r\2\u018d\u0193"+
		"\5:\36\2\u018e\u018f\7\34\2\2\u018f\u0190\5\66\34\2\u0190\u0191\7\35\2"+
		"\2\u0191\u0193\3\2\2\2\u0192\u0183\3\2\2\2\u0192\u0186\3\2\2\2\u0192\u018a"+
		"\3\2\2\2\u0192\u018b\3\2\2\2\u0192\u018c\3\2\2\2\u0192\u018d\3\2\2\2\u0192"+
		"\u018e\3\2\2\2\u0193\u0199\3\2\2\2\u0194\u0195\f\b\2\2\u0195\u0196\t\t"+
		"\2\2\u0196\u0198\5\66\34\t\u0197\u0194\3\2\2\2\u0198\u019b\3\2\2\2\u0199"+
		"\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a\67\3\2\2\2\u019b\u0199\3\2\2"+
		"\2\u019c\u019d\b\35\1\2\u019d\u019e\7\16\2\2\u019e\u01a8\58\35\t\u019f"+
		"\u01a0\7\34\2\2\u01a0\u01a1\58\35\2\u01a1\u01a2\7\35\2\2\u01a2\u01a8\3"+
		"\2\2\2\u01a3\u01a8\5:\36\2\u01a4\u01a8\7P\2\2\u01a5\u01a8\5\"\22\2\u01a6"+
		"\u01a8\5(\25\2\u01a7\u019c\3\2\2\2\u01a7\u019f\3\2\2\2\u01a7\u01a3\3\2"+
		"\2\2\u01a7\u01a4\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a6\3\2\2\2\u01a8"+
		"\u01ae\3\2\2\2\u01a9\u01aa\f\b\2\2\u01aa\u01ab\t\n\2\2\u01ab\u01ad\58"+
		"\35\t\u01ac\u01a9\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae"+
		"\u01af\3\2\2\2\u01af9\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01b3\7N\2\2\u01b2"+
		"\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2"+
		"\2\2\u01b5;\3\2\2\2+?HQcip\u0086\u0092\u0097\u009e\u00a3\u00a8\u00ad\u00b1"+
		"\u00b4\u00bc\u00c3\u00cc\u00d4\u00d6\u00df\u00e7\u00e9\u00f3\u00fc\u0101"+
		"\u0108\u0125\u0139\u013b\u0143\u0147\u015c\u0168\u0172\u0181\u0192\u0199"+
		"\u01a7\u01ae\u01b4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}