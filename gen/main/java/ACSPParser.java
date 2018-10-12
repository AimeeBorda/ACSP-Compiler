// Generated from /Users/aimee/IdeaProjects/untitled/src/main/java/ACSP.g4 by ANTLR 4.7
package main.java;
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
		ID=1, BOOL=2, EVENT=3, VAR=4, CH=5, SET_EVENTS=6, SET_STAT=7, SKIPLBL=8, 
		CHX=9, IF=10, THEN=11, ELSE=12, NEW=13, PRF=14, SND=15, FULLSTOP=16, AT=17, 
		BRACL=18, BRACR=19, SQL=20, SQR=21, EQ=22;
	public static final int
		RULE_skipCmd = 0, RULE_choiceCmd = 1, RULE_ifCmd = 2, RULE_parallelCmd = 3, 
		RULE_scopeCmd = 4, RULE_outputCmd = 5, RULE_locCmd = 6, RULE_funcCall = 7, 
		RULE_funcDefn = 8, RULE_statement = 9;
	public static final String[] ruleNames = {
		"skipCmd", "choiceCmd", "ifCmd", "parallelCmd", "scopeCmd", "outputCmd", 
		"locCmd", "funcCall", "funcDefn", "statement"
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
	public static class SkipCmdContext extends ParserRuleContext {
		public TerminalNode SKIPLBL() { return getToken(ACSPParser.SKIPLBL, 0); }
		public SkipCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skipCmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterSkipCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitSkipCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitSkipCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkipCmdContext skipCmd() throws RecognitionException {
		SkipCmdContext _localctx = new SkipCmdContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_skipCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(SKIPLBL);
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

	public static class ChoiceCmdContext extends ParserRuleContext {
		public TerminalNode CHX() { return getToken(ACSPParser.CHX, 0); }
		public TerminalNode SET_STAT() { return getToken(ACSPParser.SET_STAT, 0); }
		public TerminalNode AT() { return getToken(ACSPParser.AT, 0); }
		public TerminalNode VAR() { return getToken(ACSPParser.VAR, 0); }
		public TerminalNode PRF() { return getToken(ACSPParser.PRF, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ChoiceCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choiceCmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterChoiceCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitChoiceCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitChoiceCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChoiceCmdContext choiceCmd() throws RecognitionException {
		ChoiceCmdContext _localctx = new ChoiceCmdContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_choiceCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(CHX);
			setState(23);
			match(SET_STAT);
			setState(24);
			match(AT);
			setState(25);
			match(VAR);
			setState(26);
			match(PRF);
			setState(27);
			statement();
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

	public static class IfCmdContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ACSPParser.IF, 0); }
		public TerminalNode BOOL() { return getToken(ACSPParser.BOOL, 0); }
		public TerminalNode THEN() { return getToken(ACSPParser.THEN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ACSPParser.ELSE, 0); }
		public IfCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterIfCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitIfCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitIfCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfCmdContext ifCmd() throws RecognitionException {
		IfCmdContext _localctx = new IfCmdContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ifCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(IF);
			setState(30);
			match(BOOL);
			setState(31);
			match(THEN);
			setState(32);
			statement();
			setState(33);
			match(ELSE);
			setState(34);
			statement();
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

	public static class ParallelCmdContext extends ParserRuleContext {
		public TerminalNode BRACL() { return getToken(ACSPParser.BRACL, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode SQL() { return getToken(ACSPParser.SQL, 0); }
		public TerminalNode SET_EVENTS() { return getToken(ACSPParser.SET_EVENTS, 0); }
		public TerminalNode SQR() { return getToken(ACSPParser.SQR, 0); }
		public TerminalNode BRACR() { return getToken(ACSPParser.BRACR, 0); }
		public ParallelCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parallelCmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterParallelCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitParallelCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitParallelCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParallelCmdContext parallelCmd() throws RecognitionException {
		ParallelCmdContext _localctx = new ParallelCmdContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parallelCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(BRACL);
			setState(37);
			statement();
			setState(38);
			match(SQL);
			setState(39);
			match(SET_EVENTS);
			setState(40);
			match(SQR);
			setState(41);
			statement();
			setState(42);
			match(BRACR);
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

	public static class ScopeCmdContext extends ParserRuleContext {
		public TerminalNode BRACL() { return getToken(ACSPParser.BRACL, 0); }
		public TerminalNode NEW() { return getToken(ACSPParser.NEW, 0); }
		public TerminalNode CH() { return getToken(ACSPParser.CH, 0); }
		public TerminalNode BRACR() { return getToken(ACSPParser.BRACR, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ScopeCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scopeCmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterScopeCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitScopeCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitScopeCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScopeCmdContext scopeCmd() throws RecognitionException {
		ScopeCmdContext _localctx = new ScopeCmdContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_scopeCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(BRACL);
			setState(45);
			match(NEW);
			setState(46);
			match(CH);
			setState(47);
			match(BRACR);
			setState(48);
			statement();
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

	public static class OutputCmdContext extends ParserRuleContext {
		public TerminalNode CH() { return getToken(ACSPParser.CH, 0); }
		public TerminalNode SND() { return getToken(ACSPParser.SND, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode FULLSTOP() { return getToken(ACSPParser.FULLSTOP, 0); }
		public OutputCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputCmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterOutputCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitOutputCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitOutputCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputCmdContext outputCmd() throws RecognitionException {
		OutputCmdContext _localctx = new OutputCmdContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_outputCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(CH);
			setState(51);
			match(SND);
			setState(52);
			statement();
			setState(53);
			match(FULLSTOP);
			setState(54);
			statement();
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

	public static class LocCmdContext extends ParserRuleContext {
		public TerminalNode CH() { return getToken(ACSPParser.CH, 0); }
		public TerminalNode SQL() { return getToken(ACSPParser.SQL, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode SQR() { return getToken(ACSPParser.SQR, 0); }
		public LocCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locCmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterLocCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitLocCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitLocCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocCmdContext locCmd() throws RecognitionException {
		LocCmdContext _localctx = new LocCmdContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_locCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(CH);
			setState(57);
			match(SQL);
			setState(58);
			statement();
			setState(59);
			match(SQR);
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

	public static class FuncCallContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(ACSPParser.VAR, 0); }
		public List<TerminalNode> BRACL() { return getTokens(ACSPParser.BRACL); }
		public TerminalNode BRACL(int i) {
			return getToken(ACSPParser.BRACL, i);
		}
		public List<TerminalNode> EVENT() { return getTokens(ACSPParser.EVENT); }
		public TerminalNode EVENT(int i) {
			return getToken(ACSPParser.EVENT, i);
		}
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funcCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(VAR);
			setState(62);
			match(BRACL);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EVENT) {
				{
				{
				setState(63);
				match(EVENT);
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			match(BRACL);
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

	public static class FuncDefnContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(ACSPParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(ACSPParser.VAR, i);
		}
		public TerminalNode BRACL() { return getToken(ACSPParser.BRACL, 0); }
		public TerminalNode BRACR() { return getToken(ACSPParser.BRACR, 0); }
		public TerminalNode EQ() { return getToken(ACSPParser.EQ, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public FuncDefnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDefn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterFuncDefn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitFuncDefn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitFuncDefn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDefnContext funcDefn() throws RecognitionException {
		FuncDefnContext _localctx = new FuncDefnContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_funcDefn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(VAR);
			setState(72);
			match(BRACL);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(73);
				match(VAR);
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			match(BRACR);
			setState(80);
			match(EQ);
			setState(81);
			statement();
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
		public SkipCmdContext skipCmd() {
			return getRuleContext(SkipCmdContext.class,0);
		}
		public ChoiceCmdContext choiceCmd() {
			return getRuleContext(ChoiceCmdContext.class,0);
		}
		public IfCmdContext ifCmd() {
			return getRuleContext(IfCmdContext.class,0);
		}
		public ParallelCmdContext parallelCmd() {
			return getRuleContext(ParallelCmdContext.class,0);
		}
		public ScopeCmdContext scopeCmd() {
			return getRuleContext(ScopeCmdContext.class,0);
		}
		public OutputCmdContext outputCmd() {
			return getRuleContext(OutputCmdContext.class,0);
		}
		public LocCmdContext locCmd() {
			return getRuleContext(LocCmdContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public FuncDefnContext funcDefn() {
			return getRuleContext(FuncDefnContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(83);
				skipCmd();
				}
				break;
			case 2:
				{
				setState(84);
				choiceCmd();
				}
				break;
			case 3:
				{
				setState(85);
				ifCmd();
				}
				break;
			case 4:
				{
				setState(86);
				parallelCmd();
				}
				break;
			case 5:
				{
				setState(87);
				scopeCmd();
				}
				break;
			case 6:
				{
				setState(88);
				outputCmd();
				}
				break;
			case 7:
				{
				setState(89);
				locCmd();
				}
				break;
			case 8:
				{
				setState(90);
				funcCall();
				}
				break;
			case 9:
				{
				setState(91);
				funcDefn();
				}
				break;
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30a\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\7\tC\n\t\f\t\16\tF\13\t\3\t\3\t\3\n"+
		"\3\n\3\n\7\nM\n\n\f\n\16\nP\13\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\5\13_\n\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24"+
		"\2\2\2`\2\26\3\2\2\2\4\30\3\2\2\2\6\37\3\2\2\2\b&\3\2\2\2\n.\3\2\2\2\f"+
		"\64\3\2\2\2\16:\3\2\2\2\20?\3\2\2\2\22I\3\2\2\2\24^\3\2\2\2\26\27\7\n"+
		"\2\2\27\3\3\2\2\2\30\31\7\13\2\2\31\32\7\t\2\2\32\33\7\23\2\2\33\34\7"+
		"\6\2\2\34\35\7\20\2\2\35\36\5\24\13\2\36\5\3\2\2\2\37 \7\f\2\2 !\7\4\2"+
		"\2!\"\7\r\2\2\"#\5\24\13\2#$\7\16\2\2$%\5\24\13\2%\7\3\2\2\2&\'\7\24\2"+
		"\2\'(\5\24\13\2()\7\26\2\2)*\7\b\2\2*+\7\27\2\2+,\5\24\13\2,-\7\25\2\2"+
		"-\t\3\2\2\2./\7\24\2\2/\60\7\17\2\2\60\61\7\7\2\2\61\62\7\25\2\2\62\63"+
		"\5\24\13\2\63\13\3\2\2\2\64\65\7\7\2\2\65\66\7\21\2\2\66\67\5\24\13\2"+
		"\678\7\22\2\289\5\24\13\29\r\3\2\2\2:;\7\7\2\2;<\7\26\2\2<=\5\24\13\2"+
		"=>\7\27\2\2>\17\3\2\2\2?@\7\6\2\2@D\7\24\2\2AC\7\5\2\2BA\3\2\2\2CF\3\2"+
		"\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2FD\3\2\2\2GH\7\24\2\2H\21\3\2\2\2IJ"+
		"\7\6\2\2JN\7\24\2\2KM\7\6\2\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2"+
		"OQ\3\2\2\2PN\3\2\2\2QR\7\25\2\2RS\7\30\2\2ST\5\24\13\2T\23\3\2\2\2U_\5"+
		"\2\2\2V_\5\4\3\2W_\5\6\4\2X_\5\b\5\2Y_\5\n\6\2Z_\5\f\7\2[_\5\16\b\2\\"+
		"_\5\20\t\2]_\5\22\n\2^U\3\2\2\2^V\3\2\2\2^W\3\2\2\2^X\3\2\2\2^Y\3\2\2"+
		"\2^Z\3\2\2\2^[\3\2\2\2^\\\3\2\2\2^]\3\2\2\2_\25\3\2\2\2\5DN^";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}