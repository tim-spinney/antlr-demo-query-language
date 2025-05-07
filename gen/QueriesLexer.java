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
		T__0=1, Mult=2, Div=3, Add=4, Sub=5, Mod=6, And=7, Or=8, Not=9, Comparator=10, 
		Whitespace=11, IntLiteral=12, Identifier=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "Mult", "Div", "Add", "Sub", "Mod", "And", "Or", "Not", "Comparator", 
			"Whitespace", "IntLiteral", "Identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'WHERE'", "'*'", "'/'", "'+'", "'-'", "'%'", "'AND'", "'OR'", 
			"'NOT'", null, null, null, "'it'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "Mult", "Div", "Add", "Sub", "Mod", "And", "Or", "Not", "Comparator", 
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
		"\u0004\u0000\rS\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t@\b\t\u0001"+
		"\n\u0004\nC\b\n\u000b\n\f\nD\u0001\n\u0001\n\u0001\u000b\u0003\u000bJ"+
		"\b\u000b\u0001\u000b\u0004\u000bM\b\u000b\u000b\u000b\f\u000bN\u0001\f"+
		"\u0001\f\u0001\f\u0000\u0000\r\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u0001\u0000\u0004\u0002\u0000<<>>\u0003\u0000\t\n\r\r"+
		"  \u0001\u0000--\u0001\u000009Y\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0001\u001b\u0001"+
		"\u0000\u0000\u0000\u0003!\u0001\u0000\u0000\u0000\u0005#\u0001\u0000\u0000"+
		"\u0000\u0007%\u0001\u0000\u0000\u0000\t\'\u0001\u0000\u0000\u0000\u000b"+
		")\u0001\u0000\u0000\u0000\r+\u0001\u0000\u0000\u0000\u000f/\u0001\u0000"+
		"\u0000\u0000\u00112\u0001\u0000\u0000\u0000\u0013?\u0001\u0000\u0000\u0000"+
		"\u0015B\u0001\u0000\u0000\u0000\u0017I\u0001\u0000\u0000\u0000\u0019P"+
		"\u0001\u0000\u0000\u0000\u001b\u001c\u0005W\u0000\u0000\u001c\u001d\u0005"+
		"H\u0000\u0000\u001d\u001e\u0005E\u0000\u0000\u001e\u001f\u0005R\u0000"+
		"\u0000\u001f \u0005E\u0000\u0000 \u0002\u0001\u0000\u0000\u0000!\"\u0005"+
		"*\u0000\u0000\"\u0004\u0001\u0000\u0000\u0000#$\u0005/\u0000\u0000$\u0006"+
		"\u0001\u0000\u0000\u0000%&\u0005+\u0000\u0000&\b\u0001\u0000\u0000\u0000"+
		"\'(\u0005-\u0000\u0000(\n\u0001\u0000\u0000\u0000)*\u0005%\u0000\u0000"+
		"*\f\u0001\u0000\u0000\u0000+,\u0005A\u0000\u0000,-\u0005N\u0000\u0000"+
		"-.\u0005D\u0000\u0000.\u000e\u0001\u0000\u0000\u0000/0\u0005O\u0000\u0000"+
		"01\u0005R\u0000\u00001\u0010\u0001\u0000\u0000\u000023\u0005N\u0000\u0000"+
		"34\u0005O\u0000\u000045\u0005T\u0000\u00005\u0012\u0001\u0000\u0000\u0000"+
		"67\u0005=\u0000\u00007@\u0005=\u0000\u000089\u0005<\u0000\u00009@\u0005"+
		">\u0000\u0000:@\u0007\u0000\u0000\u0000;<\u0005>\u0000\u0000<@\u0005="+
		"\u0000\u0000=>\u0005<\u0000\u0000>@\u0005=\u0000\u0000?6\u0001\u0000\u0000"+
		"\u0000?8\u0001\u0000\u0000\u0000?:\u0001\u0000\u0000\u0000?;\u0001\u0000"+
		"\u0000\u0000?=\u0001\u0000\u0000\u0000@\u0014\u0001\u0000\u0000\u0000"+
		"AC\u0007\u0001\u0000\u0000BA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000"+
		"\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EF\u0001\u0000"+
		"\u0000\u0000FG\u0006\n\u0000\u0000G\u0016\u0001\u0000\u0000\u0000HJ\u0007"+
		"\u0002\u0000\u0000IH\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000"+
		"JL\u0001\u0000\u0000\u0000KM\u0007\u0003\u0000\u0000LK\u0001\u0000\u0000"+
		"\u0000MN\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000"+
		"\u0000\u0000O\u0018\u0001\u0000\u0000\u0000PQ\u0005i\u0000\u0000QR\u0005"+
		"t\u0000\u0000R\u001a\u0001\u0000\u0000\u0000\u0005\u0000?DIN\u0001\u0006"+
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