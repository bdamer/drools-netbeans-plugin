// $ANTLR 3.5.1 C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g 2013-12-03 19:54:35

package com.afqa123.drools.grammar;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class DroolsRuleLexer extends Lexer {
	public static final int EOF=-1;
	public static final int BINDING=4;
	public static final int CHAR=5;
	public static final int COMMENT=6;
	public static final int ESC_SEQ=7;
	public static final int EXPONENT=8;
	public static final int FLOAT=9;
	public static final int HEX_DIGIT=10;
	public static final int ID=11;
	public static final int INT=12;
	public static final int KEYWORD=13;
	public static final int OCTAL_ESC=14;
	public static final int OPERATOR=15;
	public static final int SEPARATOR=16;
	public static final int STRING=17;
	public static final int UNICODE_ESC=18;
	public static final int WS=19;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public DroolsRuleLexer() {} 
	public DroolsRuleLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public DroolsRuleLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g"; }

	// $ANTLR start "KEYWORD"
	public final void mKEYWORD() throws RecognitionException {
		try {
			int _type = KEYWORD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:46:2: ( 'declare' | 'extends' | 'dialect' | 'end' | 'global' | 'import' | 'package' | 'rule' | 'then' | 'when' | 'and' | 'or' | 'not' | 'matches' | 'contains' | 'new' | 'return' | 'if' | 'else' | 'do' | 'while' | 'for' | 'byte' | 'short' | 'int' | 'long' | 'float' | 'double' | 'boolean' | 'char' )
			int alt1=30;
			switch ( input.LA(1) ) {
			case 'd':
				{
				switch ( input.LA(2) ) {
				case 'e':
					{
					alt1=1;
					}
					break;
				case 'i':
					{
					alt1=3;
					}
					break;
				case 'o':
					{
					int LA1_20 = input.LA(3);
					if ( (LA1_20=='u') ) {
						alt1=28;
					}

					else {
						alt1=20;
					}

					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'e':
				{
				switch ( input.LA(2) ) {
				case 'x':
					{
					alt1=2;
					}
					break;
				case 'n':
					{
					alt1=4;
					}
					break;
				case 'l':
					{
					alt1=19;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'g':
				{
				alt1=5;
				}
				break;
			case 'i':
				{
				switch ( input.LA(2) ) {
				case 'm':
					{
					alt1=6;
					}
					break;
				case 'f':
					{
					alt1=18;
					}
					break;
				case 'n':
					{
					alt1=25;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'p':
				{
				alt1=7;
				}
				break;
			case 'r':
				{
				int LA1_6 = input.LA(2);
				if ( (LA1_6=='u') ) {
					alt1=8;
				}
				else if ( (LA1_6=='e') ) {
					alt1=17;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 't':
				{
				alt1=9;
				}
				break;
			case 'w':
				{
				int LA1_8 = input.LA(2);
				if ( (LA1_8=='h') ) {
					int LA1_29 = input.LA(3);
					if ( (LA1_29=='e') ) {
						alt1=10;
					}
					else if ( (LA1_29=='i') ) {
						alt1=21;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 29, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'a':
				{
				alt1=11;
				}
				break;
			case 'o':
				{
				alt1=12;
				}
				break;
			case 'n':
				{
				int LA1_11 = input.LA(2);
				if ( (LA1_11=='o') ) {
					alt1=13;
				}
				else if ( (LA1_11=='e') ) {
					alt1=16;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 11, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'm':
				{
				alt1=14;
				}
				break;
			case 'c':
				{
				int LA1_13 = input.LA(2);
				if ( (LA1_13=='o') ) {
					alt1=15;
				}
				else if ( (LA1_13=='h') ) {
					alt1=30;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 13, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'f':
				{
				int LA1_14 = input.LA(2);
				if ( (LA1_14=='o') ) {
					alt1=22;
				}
				else if ( (LA1_14=='l') ) {
					alt1=27;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 14, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'b':
				{
				int LA1_15 = input.LA(2);
				if ( (LA1_15=='y') ) {
					alt1=23;
				}
				else if ( (LA1_15=='o') ) {
					alt1=29;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 15, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 's':
				{
				alt1=24;
				}
				break;
			case 'l':
				{
				alt1=26;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:46:4: 'declare'
					{
					match("declare"); 

					}
					break;
				case 2 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:46:16: 'extends'
					{
					match("extends"); 

					}
					break;
				case 3 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:46:28: 'dialect'
					{
					match("dialect"); 

					}
					break;
				case 4 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:46:40: 'end'
					{
					match("end"); 

					}
					break;
				case 5 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:46:48: 'global'
					{
					match("global"); 

					}
					break;
				case 6 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:46:59: 'import'
					{
					match("import"); 

					}
					break;
				case 7 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:46:70: 'package'
					{
					match("package"); 

					}
					break;
				case 8 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:46:82: 'rule'
					{
					match("rule"); 

					}
					break;
				case 9 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:46:91: 'then'
					{
					match("then"); 

					}
					break;
				case 10 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:46:100: 'when'
					{
					match("when"); 

					}
					break;
				case 11 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:47:3: 'and'
					{
					match("and"); 

					}
					break;
				case 12 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:47:11: 'or'
					{
					match("or"); 

					}
					break;
				case 13 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:47:18: 'not'
					{
					match("not"); 

					}
					break;
				case 14 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:47:26: 'matches'
					{
					match("matches"); 

					}
					break;
				case 15 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:47:38: 'contains'
					{
					match("contains"); 

					}
					break;
				case 16 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:49:3: 'new'
					{
					match("new"); 

					}
					break;
				case 17 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:49:11: 'return'
					{
					match("return"); 

					}
					break;
				case 18 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:49:22: 'if'
					{
					match("if"); 

					}
					break;
				case 19 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:49:29: 'else'
					{
					match("else"); 

					}
					break;
				case 20 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:49:38: 'do'
					{
					match("do"); 

					}
					break;
				case 21 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:49:45: 'while'
					{
					match("while"); 

					}
					break;
				case 22 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:49:55: 'for'
					{
					match("for"); 

					}
					break;
				case 23 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:49:63: 'byte'
					{
					match("byte"); 

					}
					break;
				case 24 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:49:72: 'short'
					{
					match("short"); 

					}
					break;
				case 25 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:49:82: 'int'
					{
					match("int"); 

					}
					break;
				case 26 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:49:90: 'long'
					{
					match("long"); 

					}
					break;
				case 27 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:49:99: 'float'
					{
					match("float"); 

					}
					break;
				case 28 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:49:109: 'double'
					{
					match("double"); 

					}
					break;
				case 29 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:49:120: 'boolean'
					{
					match("boolean"); 

					}
					break;
				case 30 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:49:132: 'char'
					{
					match("char"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD"

	// $ANTLR start "SEPARATOR"
	public final void mSEPARATOR() throws RecognitionException {
		try {
			int _type = SEPARATOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:53:2: ( ';' | '.' | '(' | ')' | '[' | ']' | ',' )
			// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:
			{
			if ( (input.LA(1) >= '(' && input.LA(1) <= ')')||input.LA(1)==','||input.LA(1)=='.'||input.LA(1)==';'||input.LA(1)=='['||input.LA(1)==']' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEPARATOR"

	// $ANTLR start "OPERATOR"
	public final void mOPERATOR() throws RecognitionException {
		try {
			int _type = OPERATOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:57:2: ( '==' | '!=' | '>' | '<' | '>=' | '<=' | '+' | '-' | '/' | '*' | '%' | '|' | '&' | '||' | '&&' | '!' | ':' | '=' )
			int alt2=18;
			switch ( input.LA(1) ) {
			case '=':
				{
				int LA2_1 = input.LA(2);
				if ( (LA2_1=='=') ) {
					alt2=1;
				}

				else {
					alt2=18;
				}

				}
				break;
			case '!':
				{
				int LA2_2 = input.LA(2);
				if ( (LA2_2=='=') ) {
					alt2=2;
				}

				else {
					alt2=16;
				}

				}
				break;
			case '>':
				{
				int LA2_3 = input.LA(2);
				if ( (LA2_3=='=') ) {
					alt2=5;
				}

				else {
					alt2=3;
				}

				}
				break;
			case '<':
				{
				int LA2_4 = input.LA(2);
				if ( (LA2_4=='=') ) {
					alt2=6;
				}

				else {
					alt2=4;
				}

				}
				break;
			case '+':
				{
				alt2=7;
				}
				break;
			case '-':
				{
				alt2=8;
				}
				break;
			case '/':
				{
				alt2=9;
				}
				break;
			case '*':
				{
				alt2=10;
				}
				break;
			case '%':
				{
				alt2=11;
				}
				break;
			case '|':
				{
				int LA2_10 = input.LA(2);
				if ( (LA2_10=='|') ) {
					alt2=14;
				}

				else {
					alt2=12;
				}

				}
				break;
			case '&':
				{
				int LA2_11 = input.LA(2);
				if ( (LA2_11=='&') ) {
					alt2=15;
				}

				else {
					alt2=13;
				}

				}
				break;
			case ':':
				{
				alt2=17;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:57:4: '=='
					{
					match("=="); 

					}
					break;
				case 2 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:57:11: '!='
					{
					match("!="); 

					}
					break;
				case 3 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:57:18: '>'
					{
					match('>'); 
					}
					break;
				case 4 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:57:24: '<'
					{
					match('<'); 
					}
					break;
				case 5 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:57:30: '>='
					{
					match(">="); 

					}
					break;
				case 6 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:57:37: '<='
					{
					match("<="); 

					}
					break;
				case 7 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:57:44: '+'
					{
					match('+'); 
					}
					break;
				case 8 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:57:50: '-'
					{
					match('-'); 
					}
					break;
				case 9 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:57:56: '/'
					{
					match('/'); 
					}
					break;
				case 10 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:57:62: '*'
					{
					match('*'); 
					}
					break;
				case 11 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:57:68: '%'
					{
					match('%'); 
					}
					break;
				case 12 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:57:74: '|'
					{
					match('|'); 
					}
					break;
				case 13 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:57:80: '&'
					{
					match('&'); 
					}
					break;
				case 14 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:57:86: '||'
					{
					match("||"); 

					}
					break;
				case 15 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:57:93: '&&'
					{
					match("&&"); 

					}
					break;
				case 16 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:57:100: '!'
					{
					match('!'); 
					}
					break;
				case 17 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:57:106: ':'
					{
					match(':'); 
					}
					break;
				case 18 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:57:112: '='
					{
					match('='); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OPERATOR"

	// $ANTLR start "BINDING"
	public final void mBINDING() throws RecognitionException {
		try {
			int _type = BINDING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:61:2: ( '$' ID )
			// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:61:4: '$' ID
			{
			match('$'); 
			mID(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BINDING"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:64:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:64:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:64:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop3;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:67:5: ( ( '0' .. '9' )+ )
			// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:67:7: ( '0' .. '9' )+
			{
			// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:67:7: ( '0' .. '9' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:71:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
			int alt11=3;
			alt11 = dfa11.predict(input);
			switch (alt11) {
				case 1 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:71:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
					{
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:71:9: ( '0' .. '9' )+
					int cnt5=0;
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt5 >= 1 ) break loop5;
							EarlyExitException eee = new EarlyExitException(5, input);
							throw eee;
						}
						cnt5++;
					}

					match('.'); 
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:71:25: ( '0' .. '9' )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop6;
						}
					}

					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:71:37: ( EXPONENT )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0=='E'||LA7_0=='e') ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:71:37: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:72:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
					{
					match('.'); 
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:72:13: ( '0' .. '9' )+
					int cnt8=0;
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt8 >= 1 ) break loop8;
							EarlyExitException eee = new EarlyExitException(8, input);
							throw eee;
						}
						cnt8++;
					}

					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:72:25: ( EXPONENT )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0=='E'||LA9_0=='e') ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:72:25: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:73:9: ( '0' .. '9' )+ EXPONENT
					{
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:73:9: ( '0' .. '9' )+
					int cnt10=0;
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt10 >= 1 ) break loop10;
							EarlyExitException eee = new EarlyExitException(10, input);
							throw eee;
						}
						cnt10++;
					}

					mEXPONENT(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:77:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0=='/') ) {
				int LA15_1 = input.LA(2);
				if ( (LA15_1=='/') ) {
					alt15=1;
				}
				else if ( (LA15_1=='*') ) {
					alt15=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 15, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:77:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:77:14: (~ ( '\\n' | '\\r' ) )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( ((LA12_0 >= '\u0000' && LA12_0 <= '\t')||(LA12_0 >= '\u000B' && LA12_0 <= '\f')||(LA12_0 >= '\u000E' && LA12_0 <= '\uFFFF')) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop12;
						}
					}

					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:77:28: ( '\\r' )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0=='\r') ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:77:28: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					_channel=HIDDEN;
					}
					break;
				case 2 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:78:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:78:14: ( options {greedy=false; } : . )*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0=='*') ) {
							int LA14_1 = input.LA(2);
							if ( (LA14_1=='/') ) {
								alt14=2;
							}
							else if ( ((LA14_1 >= '\u0000' && LA14_1 <= '.')||(LA14_1 >= '0' && LA14_1 <= '\uFFFF')) ) {
								alt14=1;
							}

						}
						else if ( ((LA14_0 >= '\u0000' && LA14_0 <= ')')||(LA14_0 >= '+' && LA14_0 <= '\uFFFF')) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:78:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop14;
						}
					}

					match("*/"); 

					_channel=HIDDEN;
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:81:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:81:9: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:89:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:89:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:89:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
			loop16:
			while (true) {
				int alt16=3;
				int LA16_0 = input.LA(1);
				if ( (LA16_0=='\\') ) {
					alt16=1;
				}
				else if ( ((LA16_0 >= '\u0000' && LA16_0 <= '!')||(LA16_0 >= '#' && LA16_0 <= '[')||(LA16_0 >= ']' && LA16_0 <= '\uFFFF')) ) {
					alt16=2;
				}

				switch (alt16) {
				case 1 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:89:14: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:89:24: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop16;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:92:5: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
			// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:92:8: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
			{
			match('\''); 
			// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:92:13: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0=='\\') ) {
				alt17=1;
			}
			else if ( ((LA17_0 >= '\u0000' && LA17_0 <= '&')||(LA17_0 >= '(' && LA17_0 <= '[')||(LA17_0 >= ']' && LA17_0 <= '\uFFFF')) ) {
				alt17=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:92:15: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:92:25: ~ ( '\\'' | '\\\\' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "EXPONENT"
	public final void mEXPONENT() throws RecognitionException {
		try {
			// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:97:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:97:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:97:22: ( '+' | '-' )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0=='+'||LA18_0=='-') ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:97:33: ( '0' .. '9' )+
			int cnt19=0;
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( ((LA19_0 >= '0' && LA19_0 <= '9')) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt19 >= 1 ) break loop19;
					EarlyExitException eee = new EarlyExitException(19, input);
					throw eee;
				}
				cnt19++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXPONENT"

	// $ANTLR start "HEX_DIGIT"
	public final void mHEX_DIGIT() throws RecognitionException {
		try {
			// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:100:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX_DIGIT"

	// $ANTLR start "ESC_SEQ"
	public final void mESC_SEQ() throws RecognitionException {
		try {
			// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:104:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
			int alt20=3;
			int LA20_0 = input.LA(1);
			if ( (LA20_0=='\\') ) {
				switch ( input.LA(2) ) {
				case '\"':
				case '\'':
				case '\\':
				case 'b':
				case 'f':
				case 'n':
				case 'r':
				case 't':
					{
					alt20=1;
					}
					break;
				case 'u':
					{
					alt20=2;
					}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
					{
					alt20=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 20, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}

			switch (alt20) {
				case 1 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:104:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
					{
					match('\\'); 
					if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:105:9: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:106:9: OCTAL_ESC
					{
					mOCTAL_ESC(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_SEQ"

	// $ANTLR start "OCTAL_ESC"
	public final void mOCTAL_ESC() throws RecognitionException {
		try {
			// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:111:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt21=3;
			int LA21_0 = input.LA(1);
			if ( (LA21_0=='\\') ) {
				int LA21_1 = input.LA(2);
				if ( ((LA21_1 >= '0' && LA21_1 <= '3')) ) {
					int LA21_2 = input.LA(3);
					if ( ((LA21_2 >= '0' && LA21_2 <= '7')) ) {
						int LA21_4 = input.LA(4);
						if ( ((LA21_4 >= '0' && LA21_4 <= '7')) ) {
							alt21=1;
						}

						else {
							alt21=2;
						}

					}

					else {
						alt21=3;
					}

				}
				else if ( ((LA21_1 >= '4' && LA21_1 <= '7')) ) {
					int LA21_3 = input.LA(3);
					if ( ((LA21_3 >= '0' && LA21_3 <= '7')) ) {
						alt21=2;
					}

					else {
						alt21=3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 21, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:111:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:112:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:113:9: '\\\\' ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OCTAL_ESC"

	// $ANTLR start "UNICODE_ESC"
	public final void mUNICODE_ESC() throws RecognitionException {
		try {
			// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:118:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:118:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
			{
			match('\\'); 
			match('u'); 
			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNICODE_ESC"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:1:8: ( KEYWORD | SEPARATOR | OPERATOR | BINDING | ID | INT | FLOAT | COMMENT | WS | STRING | CHAR )
		int alt22=11;
		alt22 = dfa22.predict(input);
		switch (alt22) {
			case 1 :
				// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:1:10: KEYWORD
				{
				mKEYWORD(); 

				}
				break;
			case 2 :
				// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:1:18: SEPARATOR
				{
				mSEPARATOR(); 

				}
				break;
			case 3 :
				// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:1:28: OPERATOR
				{
				mOPERATOR(); 

				}
				break;
			case 4 :
				// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:1:37: BINDING
				{
				mBINDING(); 

				}
				break;
			case 5 :
				// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:1:45: ID
				{
				mID(); 

				}
				break;
			case 6 :
				// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:1:48: INT
				{
				mINT(); 

				}
				break;
			case 7 :
				// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:1:52: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 8 :
				// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:1:58: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 9 :
				// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:1:66: WS
				{
				mWS(); 

				}
				break;
			case 10 :
				// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:1:69: STRING
				{
				mSTRING(); 

				}
				break;
			case 11 :
				// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:1:76: CHAR
				{
				mCHAR(); 

				}
				break;

		}
	}


	protected DFA11 dfa11 = new DFA11(this);
	protected DFA22 dfa22 = new DFA22(this);
	static final String DFA11_eotS =
		"\5\uffff";
	static final String DFA11_eofS =
		"\5\uffff";
	static final String DFA11_minS =
		"\2\56\3\uffff";
	static final String DFA11_maxS =
		"\1\71\1\145\3\uffff";
	static final String DFA11_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA11_specialS =
		"\5\uffff}>";
	static final String[] DFA11_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
			"",
			"",
			""
	};

	static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
	static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
	static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
	static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
	static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
	static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
	static final short[][] DFA11_transition;

	static {
		int numStates = DFA11_transitionS.length;
		DFA11_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
		}
	}

	protected class DFA11 extends DFA {

		public DFA11(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 11;
			this.eot = DFA11_eot;
			this.eof = DFA11_eof;
			this.min = DFA11_min;
			this.max = DFA11_max;
			this.accept = DFA11_accept;
			this.special = DFA11_special;
			this.transition = DFA11_transition;
		}
		@Override
		public String getDescription() {
			return "70:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
		}
	}

	static final String DFA22_eotS =
		"\1\uffff\21\26\1\30\1\uffff\1\23\2\uffff\1\72\4\uffff\2\26\1\76\5\26\1"+
		"\76\7\26\1\76\13\26\3\uffff\3\26\1\uffff\1\26\1\76\3\26\1\76\6\26\3\76"+
		"\3\26\1\76\11\26\1\76\3\26\1\76\1\26\2\76\3\26\1\76\1\26\1\76\2\26\1\76"+
		"\10\26\1\76\2\26\1\76\1\26\1\76\2\26\1\76\1\26\2\76\1\26\1\76\3\26\5\76"+
		"\1\26\2\76";
	static final String DFA22_eofS =
		"\u008d\uffff";
	static final String DFA22_minS =
		"\1\11\1\145\2\154\1\146\1\141\1\145\2\150\1\156\1\162\1\145\1\141\1\150"+
		"\1\154\1\157\1\150\1\157\1\60\1\uffff\1\52\2\uffff\1\56\4\uffff\1\143"+
		"\1\141\1\60\1\164\1\144\1\163\1\157\1\160\1\60\1\164\1\143\1\154\1\164"+
		"\2\145\1\144\1\60\1\164\1\167\1\164\1\156\1\141\1\162\1\157\1\164\2\157"+
		"\1\156\3\uffff\2\154\1\142\1\uffff\1\145\1\60\1\145\1\142\1\157\1\60\1"+
		"\153\1\145\1\165\2\156\1\154\3\60\1\143\1\164\1\162\1\60\1\141\1\145\1"+
		"\154\1\162\1\147\1\141\1\145\1\154\1\156\1\60\1\141\1\162\1\141\1\60\1"+
		"\162\2\60\1\145\1\150\1\141\1\60\1\164\1\60\1\145\1\164\1\60\1\162\1\143"+
		"\1\145\1\144\1\154\1\164\1\147\1\156\1\60\1\145\1\151\1\60\1\141\1\60"+
		"\1\145\1\164\1\60\1\163\2\60\1\145\1\60\1\163\2\156\5\60\1\163\2\60";
	static final String DFA22_maxS =
		"\1\174\1\157\1\170\1\154\1\156\1\141\1\165\2\150\1\156\1\162\1\157\1\141"+
		"\2\157\1\171\1\150\1\157\1\71\1\uffff\1\57\2\uffff\1\145\4\uffff\1\143"+
		"\1\141\1\172\1\164\1\144\1\163\1\157\1\160\1\172\1\164\1\143\1\154\1\164"+
		"\1\145\1\151\1\144\1\172\1\164\1\167\1\164\1\156\1\141\1\162\1\157\1\164"+
		"\2\157\1\156\3\uffff\2\154\1\142\1\uffff\1\145\1\172\1\145\1\142\1\157"+
		"\1\172\1\153\1\145\1\165\2\156\1\154\3\172\1\143\1\164\1\162\1\172\1\141"+
		"\1\145\1\154\1\162\1\147\1\141\1\145\1\154\1\156\1\172\1\141\1\162\1\141"+
		"\1\172\1\162\2\172\1\145\1\150\1\141\1\172\1\164\1\172\1\145\1\164\1\172"+
		"\1\162\1\143\1\145\1\144\1\154\1\164\1\147\1\156\1\172\1\145\1\151\1\172"+
		"\1\141\1\172\1\145\1\164\1\172\1\163\2\172\1\145\1\172\1\163\2\156\5\172"+
		"\1\163\2\172";
	static final String DFA22_acceptS =
		"\23\uffff\1\3\1\uffff\1\4\1\5\1\uffff\1\2\1\11\1\12\1\13\34\uffff\1\7"+
		"\1\10\1\6\3\uffff\1\1\116\uffff";
	static final String DFA22_specialS =
		"\u008d\uffff}>";
	static final String[] DFA22_transitionS = {
			"\2\31\2\uffff\1\31\22\uffff\1\31\1\23\1\32\1\uffff\1\25\2\23\1\33\2\30"+
			"\2\23\1\30\1\23\1\22\1\24\12\27\1\23\1\30\3\23\2\uffff\32\26\1\30\1\uffff"+
			"\1\30\1\uffff\1\26\1\uffff\1\11\1\17\1\15\1\1\1\2\1\16\1\3\1\26\1\4\2"+
			"\26\1\21\1\14\1\13\1\12\1\5\1\26\1\6\1\20\1\7\2\26\1\10\3\26\1\uffff"+
			"\1\23",
			"\1\34\3\uffff\1\35\5\uffff\1\36",
			"\1\41\1\uffff\1\40\11\uffff\1\37",
			"\1\42",
			"\1\44\6\uffff\1\43\1\45",
			"\1\46",
			"\1\50\17\uffff\1\47",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\56\11\uffff\1\55",
			"\1\57",
			"\1\61\6\uffff\1\60",
			"\1\63\2\uffff\1\62",
			"\1\65\11\uffff\1\64",
			"\1\66",
			"\1\67",
			"\12\70",
			"",
			"\1\71\4\uffff\1\71",
			"",
			"",
			"\1\70\1\uffff\12\27\13\uffff\1\70\37\uffff\1\70",
			"",
			"",
			"",
			"",
			"\1\73",
			"\1\74",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\24\26\1\75\5\26",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\102",
			"\1\103",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111\3\uffff\1\112",
			"\1\113",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\1\114",
			"\1\115",
			"\1\116",
			"\1\117",
			"\1\120",
			"\1\121",
			"\1\122",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\126",
			"",
			"",
			"",
			"\1\127",
			"\1\130",
			"\1\131",
			"",
			"\1\132",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\1\133",
			"\1\134",
			"\1\135",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\1\136",
			"\1\137",
			"\1\140",
			"\1\141",
			"\1\142",
			"\1\143",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\1\144",
			"\1\145",
			"\1\146",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\1\147",
			"\1\150",
			"\1\151",
			"\1\152",
			"\1\153",
			"\1\154",
			"\1\155",
			"\1\156",
			"\1\157",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\1\160",
			"\1\161",
			"\1\162",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\1\163",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\1\164",
			"\1\165",
			"\1\166",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\1\167",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\1\170",
			"\1\171",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\1\172",
			"\1\173",
			"\1\174",
			"\1\175",
			"\1\176",
			"\1\177",
			"\1\u0080",
			"\1\u0081",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\1\u0082",
			"\1\u0083",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\1\u0084",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\1\u0085",
			"\1\u0086",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\1\u0087",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\1\u0088",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\1\u0089",
			"\1\u008a",
			"\1\u008b",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\1\u008c",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26"
	};

	static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
	static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
	static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
	static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
	static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
	static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
	static final short[][] DFA22_transition;

	static {
		int numStates = DFA22_transitionS.length;
		DFA22_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
		}
	}

	protected class DFA22 extends DFA {

		public DFA22(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 22;
			this.eot = DFA22_eot;
			this.eof = DFA22_eof;
			this.min = DFA22_min;
			this.max = DFA22_max;
			this.accept = DFA22_accept;
			this.special = DFA22_special;
			this.transition = DFA22_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( KEYWORD | SEPARATOR | OPERATOR | BINDING | ID | INT | FLOAT | COMMENT | WS | STRING | CHAR );";
		}
	}

}
