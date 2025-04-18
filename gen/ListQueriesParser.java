// Generated from src/main/resources/ListQueries.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ListQueriesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, Mult=4, Add=5, Mod=6, Comparator=7, Whitespace=8, 
		IntLiteral=9, Identifier=10;
	public static final int
		RULE_query = 0, RULE_listLiteral = 1, RULE_listMember = 2, RULE_numericExpression = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"query", "listLiteral", "listMember", "numericExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'WHERE'", "'['", "']'", "'*'", "'+'", "'%'", null, null, null, 
			"'it'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "Mult", "Add", "Mod", "Comparator", "Whitespace", 
			"IntLiteral", "Identifier"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "ListQueries.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ListQueriesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryContext extends ParserRuleContext {
		public List<NumericExpressionContext> numericExpression() {
			return getRuleContexts(NumericExpressionContext.class);
		}
		public NumericExpressionContext numericExpression(int i) {
			return getRuleContext(NumericExpressionContext.class,i);
		}
		public TerminalNode Comparator() { return getToken(ListQueriesParser.Comparator, 0); }
		public TerminalNode EOF() { return getToken(ListQueriesParser.EOF, 0); }
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ListQueriesListener ) ((ListQueriesListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ListQueriesListener ) ((ListQueriesListener)listener).exitQuery(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			match(T__0);
			setState(9);
			numericExpression(0);
			setState(10);
			match(Comparator);
			setState(11);
			numericExpression(0);
			setState(12);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListLiteralContext extends ParserRuleContext {
		public List<ListMemberContext> listMember() {
			return getRuleContexts(ListMemberContext.class);
		}
		public ListMemberContext listMember(int i) {
			return getRuleContext(ListMemberContext.class,i);
		}
		public ListLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ListQueriesListener ) ((ListQueriesListener)listener).enterListLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ListQueriesListener ) ((ListQueriesListener)listener).exitListLiteral(this);
		}
	}

	public final ListLiteralContext listLiteral() throws RecognitionException {
		ListLiteralContext _localctx = new ListLiteralContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_listLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(T__1);
			setState(16); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(15);
				listMember();
				}
				}
				setState(18); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IntLiteral || _la==Identifier );
			setState(20);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListMemberContext extends ParserRuleContext {
		public TerminalNode IntLiteral() { return getToken(ListQueriesParser.IntLiteral, 0); }
		public TerminalNode Identifier() { return getToken(ListQueriesParser.Identifier, 0); }
		public ListMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ListQueriesListener ) ((ListQueriesListener)listener).enterListMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ListQueriesListener ) ((ListQueriesListener)listener).exitListMember(this);
		}
	}

	public final ListMemberContext listMember() throws RecognitionException {
		ListMemberContext _localctx = new ListMemberContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_listMember);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			_la = _input.LA(1);
			if ( !(_la==IntLiteral || _la==Identifier) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumericExpressionContext extends ParserRuleContext {
		public TerminalNode IntLiteral() { return getToken(ListQueriesParser.IntLiteral, 0); }
		public TerminalNode Identifier() { return getToken(ListQueriesParser.Identifier, 0); }
		public List<NumericExpressionContext> numericExpression() {
			return getRuleContexts(NumericExpressionContext.class);
		}
		public NumericExpressionContext numericExpression(int i) {
			return getRuleContext(NumericExpressionContext.class,i);
		}
		public TerminalNode Mult() { return getToken(ListQueriesParser.Mult, 0); }
		public TerminalNode Add() { return getToken(ListQueriesParser.Add, 0); }
		public TerminalNode Mod() { return getToken(ListQueriesParser.Mod, 0); }
		public NumericExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ListQueriesListener ) ((ListQueriesListener)listener).enterNumericExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ListQueriesListener ) ((ListQueriesListener)listener).exitNumericExpression(this);
		}
	}

	public final NumericExpressionContext numericExpression() throws RecognitionException {
		return numericExpression(0);
	}

	private NumericExpressionContext numericExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NumericExpressionContext _localctx = new NumericExpressionContext(_ctx, _parentState);
		NumericExpressionContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_numericExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntLiteral:
				{
				setState(25);
				match(IntLiteral);
				}
				break;
			case Identifier:
				{
				setState(26);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(40);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(38);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new NumericExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_numericExpression);
						setState(29);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(30);
						match(Mult);
						setState(31);
						numericExpression(6);
						}
						break;
					case 2:
						{
						_localctx = new NumericExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_numericExpression);
						setState(32);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(33);
						match(Add);
						setState(34);
						numericExpression(5);
						}
						break;
					case 3:
						{
						_localctx = new NumericExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_numericExpression);
						setState(35);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(36);
						match(Mod);
						setState(37);
						numericExpression(4);
						}
						break;
					}
					} 
				}
				setState(42);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return numericExpression_sempred((NumericExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean numericExpression_sempred(NumericExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\n,\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0004"+
		"\u0001\u0011\b\u0001\u000b\u0001\f\u0001\u0012\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u001c\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\'\b\u0003"+
		"\n\u0003\f\u0003*\t\u0003\u0001\u0003\u0000\u0001\u0006\u0004\u0000\u0002"+
		"\u0004\u0006\u0000\u0001\u0001\u0000\t\n,\u0000\b\u0001\u0000\u0000\u0000"+
		"\u0002\u000e\u0001\u0000\u0000\u0000\u0004\u0016\u0001\u0000\u0000\u0000"+
		"\u0006\u001b\u0001\u0000\u0000\u0000\b\t\u0005\u0001\u0000\u0000\t\n\u0003"+
		"\u0006\u0003\u0000\n\u000b\u0005\u0007\u0000\u0000\u000b\f\u0003\u0006"+
		"\u0003\u0000\f\r\u0005\u0000\u0000\u0001\r\u0001\u0001\u0000\u0000\u0000"+
		"\u000e\u0010\u0005\u0002\u0000\u0000\u000f\u0011\u0003\u0004\u0002\u0000"+
		"\u0010\u000f\u0001\u0000\u0000\u0000\u0011\u0012\u0001\u0000\u0000\u0000"+
		"\u0012\u0010\u0001\u0000\u0000\u0000\u0012\u0013\u0001\u0000\u0000\u0000"+
		"\u0013\u0014\u0001\u0000\u0000\u0000\u0014\u0015\u0005\u0003\u0000\u0000"+
		"\u0015\u0003\u0001\u0000\u0000\u0000\u0016\u0017\u0007\u0000\u0000\u0000"+
		"\u0017\u0005\u0001\u0000\u0000\u0000\u0018\u0019\u0006\u0003\uffff\uffff"+
		"\u0000\u0019\u001c\u0005\t\u0000\u0000\u001a\u001c\u0005\n\u0000\u0000"+
		"\u001b\u0018\u0001\u0000\u0000\u0000\u001b\u001a\u0001\u0000\u0000\u0000"+
		"\u001c(\u0001\u0000\u0000\u0000\u001d\u001e\n\u0005\u0000\u0000\u001e"+
		"\u001f\u0005\u0004\u0000\u0000\u001f\'\u0003\u0006\u0003\u0006 !\n\u0004"+
		"\u0000\u0000!\"\u0005\u0005\u0000\u0000\"\'\u0003\u0006\u0003\u0005#$"+
		"\n\u0003\u0000\u0000$%\u0005\u0006\u0000\u0000%\'\u0003\u0006\u0003\u0004"+
		"&\u001d\u0001\u0000\u0000\u0000& \u0001\u0000\u0000\u0000&#\u0001\u0000"+
		"\u0000\u0000\'*\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000()\u0001"+
		"\u0000\u0000\u0000)\u0007\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000"+
		"\u0000\u0004\u0012\u001b&(";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}