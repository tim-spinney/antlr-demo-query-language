// Generated from src/main/resources/Queries.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class QueriesLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, Mult=3, Div=4, Add=5, Mod=6, And=7, Or=8, Comparator=9, 
		Whitespace=10, IntLiteral=11, Identifier=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "Mult", "Div", "Add", "Mod", "And", "Or", "Comparator", 
			"Whitespace", "IntLiteral", "Identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'WHERE'", "'NOT'", "'*'", "'/'", "'+'", "'%'", "'AND'", "'OR'", 
			null, null, null, "'it'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "Mult", "Div", "Add", "Mod", "And", "Or", "Comparator", 
			"Whitespace", "IntLiteral", "Identifier"
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


	public QueriesLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Queries.g4"; }

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
		"\u0004\u0000\fO\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b<\b\b\u0001\t\u0004\t?\b\t\u000b\t\f"+
		"\t@\u0001\t\u0001\t\u0001\n\u0003\nF\b\n\u0001\n\u0004\nI\b\n\u000b\n"+
		"\f\nJ\u0001\u000b\u0001\u000b\u0001\u000b\u0000\u0000\f\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0001\u0000\u0004\u0002\u0000<<>>\u0003"+
		"\u0000\t\n\r\r  \u0001\u0000--\u0001\u000009U\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0001\u0019\u0001\u0000\u0000\u0000"+
		"\u0003\u001f\u0001\u0000\u0000\u0000\u0005#\u0001\u0000\u0000\u0000\u0007"+
		"%\u0001\u0000\u0000\u0000\t\'\u0001\u0000\u0000\u0000\u000b)\u0001\u0000"+
		"\u0000\u0000\r+\u0001\u0000\u0000\u0000\u000f/\u0001\u0000\u0000\u0000"+
		"\u0011;\u0001\u0000\u0000\u0000\u0013>\u0001\u0000\u0000\u0000\u0015E"+
		"\u0001\u0000\u0000\u0000\u0017L\u0001\u0000\u0000\u0000\u0019\u001a\u0005"+
		"W\u0000\u0000\u001a\u001b\u0005H\u0000\u0000\u001b\u001c\u0005E\u0000"+
		"\u0000\u001c\u001d\u0005R\u0000\u0000\u001d\u001e\u0005E\u0000\u0000\u001e"+
		"\u0002\u0001\u0000\u0000\u0000\u001f \u0005N\u0000\u0000 !\u0005O\u0000"+
		"\u0000!\"\u0005T\u0000\u0000\"\u0004\u0001\u0000\u0000\u0000#$\u0005*"+
		"\u0000\u0000$\u0006\u0001\u0000\u0000\u0000%&\u0005/\u0000\u0000&\b\u0001"+
		"\u0000\u0000\u0000\'(\u0005+\u0000\u0000(\n\u0001\u0000\u0000\u0000)*"+
		"\u0005%\u0000\u0000*\f\u0001\u0000\u0000\u0000+,\u0005A\u0000\u0000,-"+
		"\u0005N\u0000\u0000-.\u0005D\u0000\u0000.\u000e\u0001\u0000\u0000\u0000"+
		"/0\u0005O\u0000\u000001\u0005R\u0000\u00001\u0010\u0001\u0000\u0000\u0000"+
		"23\u0005=\u0000\u00003<\u0005=\u0000\u000045\u0005<\u0000\u00005<\u0005"+
		">\u0000\u00006<\u0007\u0000\u0000\u000078\u0005>\u0000\u00008<\u0005="+
		"\u0000\u00009:\u0005<\u0000\u0000:<\u0005=\u0000\u0000;2\u0001\u0000\u0000"+
		"\u0000;4\u0001\u0000\u0000\u0000;6\u0001\u0000\u0000\u0000;7\u0001\u0000"+
		"\u0000\u0000;9\u0001\u0000\u0000\u0000<\u0012\u0001\u0000\u0000\u0000"+
		"=?\u0007\u0001\u0000\u0000>=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000"+
		"\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AB\u0001\u0000"+
		"\u0000\u0000BC\u0006\t\u0000\u0000C\u0014\u0001\u0000\u0000\u0000DF\u0007"+
		"\u0002\u0000\u0000ED\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000"+
		"FH\u0001\u0000\u0000\u0000GI\u0007\u0003\u0000\u0000HG\u0001\u0000\u0000"+
		"\u0000IJ\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000"+
		"\u0000\u0000K\u0016\u0001\u0000\u0000\u0000LM\u0005i\u0000\u0000MN\u0005"+
		"t\u0000\u0000N\u0018\u0001\u0000\u0000\u0000\u0005\u0000;@EJ\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}