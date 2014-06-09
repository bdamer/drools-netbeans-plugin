// $ANTLR 3.5.1 C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g 2014-06-09 12:50:14

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
	public static final int COLON=6;
	public static final int DECLARE=7;
	public static final int DIALECT=8;
	public static final int END=9;
	public static final int ESC_SEQ=10;
	public static final int EXPONENT=11;
	public static final int EXTENDS=12;
	public static final int FLOAT=13;
	public static final int FQN=14;
	public static final int GLOBAL=15;
	public static final int HEX_DIGIT=16;
	public static final int ID=17;
	public static final int IMPORT=18;
	public static final int INT=19;
	public static final int KEYWORD=20;
	public static final int META=21;
	public static final int MULTILINE_COMMENT=22;
	public static final int OCTAL_ESC=23;
	public static final int OPERATOR=24;
	public static final int PACKAGE=25;
	public static final int PRIMITIVE=26;
	public static final int RULE=27;
	public static final int SALIENCE=28;
	public static final int SEMICOLON=29;
	public static final int SEPARATOR=30;
	public static final int SINGLELINE_COMMENT=31;
	public static final int STRING=32;
	public static final int THEN=33;
	public static final int UNICODE_ESC=34;
	public static final int WHEN=35;
	public static final int WS=36;

		@Override
		public void emitErrorMessage(String msg) {
		}	


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
	@Override public String getGrammarFileName() { return "C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g"; }

	// $ANTLR start "DECLARE"
	public final void mDECLARE() throws RecognitionException {
		try {
			int _type = DECLARE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:102:2: ( 'declare' )
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:102:4: 'declare'
			{
			match("declare"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DECLARE"

	// $ANTLR start "DIALECT"
	public final void mDIALECT() throws RecognitionException {
		try {
			int _type = DIALECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:106:2: ( 'dialect' )
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:106:4: 'dialect'
			{
			match("dialect"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIALECT"

	// $ANTLR start "END"
	public final void mEND() throws RecognitionException {
		try {
			int _type = END;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:110:2: ( 'end' )
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:110:5: 'end'
			{
			match("end"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "END"

	// $ANTLR start "EXTENDS"
	public final void mEXTENDS() throws RecognitionException {
		try {
			int _type = EXTENDS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:114:2: ( 'extends' )
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:114:4: 'extends'
			{
			match("extends"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXTENDS"

	// $ANTLR start "GLOBAL"
	public final void mGLOBAL() throws RecognitionException {
		try {
			int _type = GLOBAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:118:2: ( 'global' )
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:118:4: 'global'
			{
			match("global"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GLOBAL"

	// $ANTLR start "IMPORT"
	public final void mIMPORT() throws RecognitionException {
		try {
			int _type = IMPORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:122:2: ( 'import' )
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:122:4: 'import'
			{
			match("import"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IMPORT"

	// $ANTLR start "PACKAGE"
	public final void mPACKAGE() throws RecognitionException {
		try {
			int _type = PACKAGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:126:2: ( 'package' )
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:126:5: 'package'
			{
			match("package"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PACKAGE"

	// $ANTLR start "RULE"
	public final void mRULE() throws RecognitionException {
		try {
			int _type = RULE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:130:2: ( 'rule' )
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:130:4: 'rule'
			{
			match("rule"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RULE"

	// $ANTLR start "THEN"
	public final void mTHEN() throws RecognitionException {
		try {
			int _type = THEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:134:2: ( 'then' )
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:134:4: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THEN"

	// $ANTLR start "WHEN"
	public final void mWHEN() throws RecognitionException {
		try {
			int _type = WHEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:138:2: ( 'when' )
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:138:4: 'when'
			{
			match("when"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHEN"

	// $ANTLR start "SALIENCE"
	public final void mSALIENCE() throws RecognitionException {
		try {
			int _type = SALIENCE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:142:2: ( 'salience' )
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:142:4: 'salience'
			{
			match("salience"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SALIENCE"

	// $ANTLR start "PRIMITIVE"
	public final void mPRIMITIVE() throws RecognitionException {
		try {
			int _type = PRIMITIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:146:2: ( 'byte' | 'short' | 'int' | 'long' | 'float' | 'double' | 'boolean' | 'char' )
			int alt1=8;
			switch ( input.LA(1) ) {
			case 'b':
				{
				int LA1_1 = input.LA(2);
				if ( (LA1_1=='y') ) {
					alt1=1;
				}
				else if ( (LA1_1=='o') ) {
					alt1=7;
				}

				else {
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
			case 's':
				{
				alt1=2;
				}
				break;
			case 'i':
				{
				alt1=3;
				}
				break;
			case 'l':
				{
				alt1=4;
				}
				break;
			case 'f':
				{
				alt1=5;
				}
				break;
			case 'd':
				{
				alt1=6;
				}
				break;
			case 'c':
				{
				alt1=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:146:4: 'byte'
					{
					match("byte"); 

					}
					break;
				case 2 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:146:13: 'short'
					{
					match("short"); 

					}
					break;
				case 3 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:146:23: 'int'
					{
					match("int"); 

					}
					break;
				case 4 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:146:31: 'long'
					{
					match("long"); 

					}
					break;
				case 5 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:146:40: 'float'
					{
					match("float"); 

					}
					break;
				case 6 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:146:50: 'double'
					{
					match("double"); 

					}
					break;
				case 7 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:146:61: 'boolean'
					{
					match("boolean"); 

					}
					break;
				case 8 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:146:73: 'char'
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
	// $ANTLR end "PRIMITIVE"

	// $ANTLR start "KEYWORD"
	public final void mKEYWORD() throws RecognitionException {
		try {
			int _type = KEYWORD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:150:2: ( 'and' | 'or' | 'not' | 'matches' | 'contains' | DECLARE | DIALECT | END | EXTENDS | GLOBAL | IMPORT | PACKAGE | RULE | THEN | WHEN | PRIMITIVE | SALIENCE | 'new' | 'return' | 'if' | 'else' | 'do' | 'while' | 'for' | 'try' | 'catch' | 'finally' | 'break' | 'continue' )
			int alt2=29;
			switch ( input.LA(1) ) {
			case 'a':
				{
				alt2=1;
				}
				break;
			case 'o':
				{
				alt2=2;
				}
				break;
			case 'n':
				{
				int LA2_3 = input.LA(2);
				if ( (LA2_3=='o') ) {
					alt2=3;
				}
				else if ( (LA2_3=='e') ) {
					alt2=18;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'm':
				{
				alt2=4;
				}
				break;
			case 'c':
				{
				switch ( input.LA(2) ) {
				case 'o':
					{
					int LA2_20 = input.LA(3);
					if ( (LA2_20=='n') ) {
						int LA2_39 = input.LA(4);
						if ( (LA2_39=='t') ) {
							int LA2_43 = input.LA(5);
							if ( (LA2_43=='a') ) {
								alt2=5;
							}
							else if ( (LA2_43=='i') ) {
								alt2=29;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 2, 43, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 2, 39, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 20, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 'h':
					{
					alt2=16;
					}
					break;
				case 'a':
					{
					alt2=26;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'd':
				{
				switch ( input.LA(2) ) {
				case 'e':
					{
					alt2=6;
					}
					break;
				case 'i':
					{
					alt2=7;
					}
					break;
				case 'o':
					{
					int LA2_24 = input.LA(3);
					if ( (LA2_24=='u') ) {
						alt2=16;
					}

					else {
						alt2=22;
					}

					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 6, input);
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
				case 'n':
					{
					alt2=8;
					}
					break;
				case 'x':
					{
					alt2=9;
					}
					break;
				case 'l':
					{
					alt2=21;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'g':
				{
				alt2=10;
				}
				break;
			case 'i':
				{
				switch ( input.LA(2) ) {
				case 'm':
					{
					alt2=11;
					}
					break;
				case 'n':
					{
					alt2=16;
					}
					break;
				case 'f':
					{
					alt2=20;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'p':
				{
				alt2=12;
				}
				break;
			case 'r':
				{
				int LA2_11 = input.LA(2);
				if ( (LA2_11=='u') ) {
					alt2=13;
				}
				else if ( (LA2_11=='e') ) {
					alt2=19;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 11, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 't':
				{
				int LA2_12 = input.LA(2);
				if ( (LA2_12=='h') ) {
					alt2=14;
				}
				else if ( (LA2_12=='r') ) {
					alt2=25;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 12, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'w':
				{
				int LA2_13 = input.LA(2);
				if ( (LA2_13=='h') ) {
					int LA2_34 = input.LA(3);
					if ( (LA2_34=='e') ) {
						alt2=15;
					}
					else if ( (LA2_34=='i') ) {
						alt2=23;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 34, input);
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
							new NoViableAltException("", 2, 13, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'b':
				{
				int LA2_14 = input.LA(2);
				if ( (LA2_14=='o'||LA2_14=='y') ) {
					alt2=16;
				}
				else if ( (LA2_14=='r') ) {
					alt2=28;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 14, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 's':
				{
				int LA2_15 = input.LA(2);
				if ( (LA2_15=='h') ) {
					alt2=16;
				}
				else if ( (LA2_15=='a') ) {
					alt2=17;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 15, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'l':
				{
				alt2=16;
				}
				break;
			case 'f':
				{
				switch ( input.LA(2) ) {
				case 'l':
					{
					alt2=16;
					}
					break;
				case 'o':
					{
					alt2=24;
					}
					break;
				case 'i':
					{
					alt2=27;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 17, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:150:4: 'and'
					{
					match("and"); 

					}
					break;
				case 2 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:150:12: 'or'
					{
					match("or"); 

					}
					break;
				case 3 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:150:19: 'not'
					{
					match("not"); 

					}
					break;
				case 4 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:150:27: 'matches'
					{
					match("matches"); 

					}
					break;
				case 5 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:150:39: 'contains'
					{
					match("contains"); 

					}
					break;
				case 6 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:151:3: DECLARE
					{
					mDECLARE(); 

					}
					break;
				case 7 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:151:13: DIALECT
					{
					mDIALECT(); 

					}
					break;
				case 8 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:151:23: END
					{
					mEND(); 

					}
					break;
				case 9 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:151:29: EXTENDS
					{
					mEXTENDS(); 

					}
					break;
				case 10 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:151:39: GLOBAL
					{
					mGLOBAL(); 

					}
					break;
				case 11 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:151:48: IMPORT
					{
					mIMPORT(); 

					}
					break;
				case 12 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:151:57: PACKAGE
					{
					mPACKAGE(); 

					}
					break;
				case 13 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:151:67: RULE
					{
					mRULE(); 

					}
					break;
				case 14 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:151:74: THEN
					{
					mTHEN(); 

					}
					break;
				case 15 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:151:81: WHEN
					{
					mWHEN(); 

					}
					break;
				case 16 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:151:88: PRIMITIVE
					{
					mPRIMITIVE(); 

					}
					break;
				case 17 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:151:100: SALIENCE
					{
					mSALIENCE(); 

					}
					break;
				case 18 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:153:3: 'new'
					{
					match("new"); 

					}
					break;
				case 19 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:153:11: 'return'
					{
					match("return"); 

					}
					break;
				case 20 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:153:22: 'if'
					{
					match("if"); 

					}
					break;
				case 21 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:153:29: 'else'
					{
					match("else"); 

					}
					break;
				case 22 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:153:38: 'do'
					{
					match("do"); 

					}
					break;
				case 23 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:153:45: 'while'
					{
					match("while"); 

					}
					break;
				case 24 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:153:55: 'for'
					{
					match("for"); 

					}
					break;
				case 25 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:153:63: 'try'
					{
					match("try"); 

					}
					break;
				case 26 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:153:71: 'catch'
					{
					match("catch"); 

					}
					break;
				case 27 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:153:81: 'finally'
					{
					match("finally"); 

					}
					break;
				case 28 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:153:93: 'break'
					{
					match("break"); 

					}
					break;
				case 29 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:153:103: 'continue'
					{
					match("continue"); 

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

	// $ANTLR start "SEMICOLON"
	public final void mSEMICOLON() throws RecognitionException {
		try {
			int _type = SEMICOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:157:2: ( ';' )
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:157:4: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMICOLON"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:161:2: ( ':' )
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:161:4: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON"

	// $ANTLR start "SEPARATOR"
	public final void mSEPARATOR() throws RecognitionException {
		try {
			int _type = SEPARATOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:165:2: ( '.' | '(' | ')' | '[' | ']' | ',' | COLON | SEMICOLON )
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:
			{
			if ( (input.LA(1) >= '(' && input.LA(1) <= ')')||input.LA(1)==','||input.LA(1)=='.'||(input.LA(1) >= ':' && input.LA(1) <= ';')||input.LA(1)=='['||input.LA(1)==']' ) {
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
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:169:2: ( '==' | '!=' | '>' | '<' | '>=' | '<=' | '+' | '-' | '/' | '*' | '%' | '|' | '&' | '||' | '&&' | '!' | ':' | '=' )
			int alt3=18;
			switch ( input.LA(1) ) {
			case '=':
				{
				int LA3_1 = input.LA(2);
				if ( (LA3_1=='=') ) {
					alt3=1;
				}

				else {
					alt3=18;
				}

				}
				break;
			case '!':
				{
				int LA3_2 = input.LA(2);
				if ( (LA3_2=='=') ) {
					alt3=2;
				}

				else {
					alt3=16;
				}

				}
				break;
			case '>':
				{
				int LA3_3 = input.LA(2);
				if ( (LA3_3=='=') ) {
					alt3=5;
				}

				else {
					alt3=3;
				}

				}
				break;
			case '<':
				{
				int LA3_4 = input.LA(2);
				if ( (LA3_4=='=') ) {
					alt3=6;
				}

				else {
					alt3=4;
				}

				}
				break;
			case '+':
				{
				alt3=7;
				}
				break;
			case '-':
				{
				alt3=8;
				}
				break;
			case '/':
				{
				alt3=9;
				}
				break;
			case '*':
				{
				alt3=10;
				}
				break;
			case '%':
				{
				alt3=11;
				}
				break;
			case '|':
				{
				int LA3_10 = input.LA(2);
				if ( (LA3_10=='|') ) {
					alt3=14;
				}

				else {
					alt3=12;
				}

				}
				break;
			case '&':
				{
				int LA3_11 = input.LA(2);
				if ( (LA3_11=='&') ) {
					alt3=15;
				}

				else {
					alt3=13;
				}

				}
				break;
			case ':':
				{
				alt3=17;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:169:4: '=='
					{
					match("=="); 

					}
					break;
				case 2 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:169:11: '!='
					{
					match("!="); 

					}
					break;
				case 3 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:169:18: '>'
					{
					match('>'); 
					}
					break;
				case 4 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:169:24: '<'
					{
					match('<'); 
					}
					break;
				case 5 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:169:30: '>='
					{
					match(">="); 

					}
					break;
				case 6 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:169:37: '<='
					{
					match("<="); 

					}
					break;
				case 7 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:169:44: '+'
					{
					match('+'); 
					}
					break;
				case 8 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:169:50: '-'
					{
					match('-'); 
					}
					break;
				case 9 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:169:56: '/'
					{
					match('/'); 
					}
					break;
				case 10 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:169:62: '*'
					{
					match('*'); 
					}
					break;
				case 11 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:169:68: '%'
					{
					match('%'); 
					}
					break;
				case 12 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:169:74: '|'
					{
					match('|'); 
					}
					break;
				case 13 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:169:80: '&'
					{
					match('&'); 
					}
					break;
				case 14 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:169:86: '||'
					{
					match("||"); 

					}
					break;
				case 15 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:169:93: '&&'
					{
					match("&&"); 

					}
					break;
				case 16 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:169:100: '!'
					{
					match('!'); 
					}
					break;
				case 17 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:169:106: ':'
					{
					match(':'); 
					}
					break;
				case 18 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:169:112: '='
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

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:172:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:172:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:172:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||LA4_0=='_'||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:
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
					break loop4;
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

	// $ANTLR start "META"
	public final void mMETA() throws RecognitionException {
		try {
			int _type = META;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:176:5: ( '@' ID )
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:176:9: '@' ID
			{
			match('@'); 
			mID(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "META"

	// $ANTLR start "BINDING"
	public final void mBINDING() throws RecognitionException {
		try {
			int _type = BINDING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:180:2: ( '$' ID )
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:180:4: '$' ID
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

	// $ANTLR start "FQN"
	public final void mFQN() throws RecognitionException {
		try {
			int _type = FQN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:183:5: ( ID ( '.' ID )* )
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:183:7: ID ( '.' ID )*
			{
			mID(); 

			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:183:10: ( '.' ID )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0=='.') ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:183:11: '.' ID
					{
					match('.'); 
					mID(); 

					}
					break;

				default :
					break loop5;
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
	// $ANTLR end "FQN"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:186:5: ( ( '0' .. '9' )+ )
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:186:7: ( '0' .. '9' )+
			{
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:186:7: ( '0' .. '9' )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:
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
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
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
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:190:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
			int alt13=3;
			alt13 = dfa13.predict(input);
			switch (alt13) {
				case 1 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:190:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
					{
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:190:9: ( '0' .. '9' )+
					int cnt7=0;
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:
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
							if ( cnt7 >= 1 ) break loop7;
							EarlyExitException eee = new EarlyExitException(7, input);
							throw eee;
						}
						cnt7++;
					}

					match('.'); 
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:190:25: ( '0' .. '9' )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:
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
							break loop8;
						}
					}

					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:190:37: ( EXPONENT )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0=='E'||LA9_0=='e') ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:190:37: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:191:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
					{
					match('.'); 
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:191:13: ( '0' .. '9' )+
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
							// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:
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

					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:191:25: ( EXPONENT )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0=='E'||LA11_0=='e') ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:191:25: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:192:9: ( '0' .. '9' )+ EXPONENT
					{
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:192:9: ( '0' .. '9' )+
					int cnt12=0;
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:
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
							if ( cnt12 >= 1 ) break loop12;
							EarlyExitException eee = new EarlyExitException(12, input);
							throw eee;
						}
						cnt12++;
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

	// $ANTLR start "SINGLELINE_COMMENT"
	public final void mSINGLELINE_COMMENT() throws RecognitionException {
		try {
			int _type = SINGLELINE_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:196:2: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:196:4: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
			{
			match("//"); 

			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:196:9: (~ ( '\\n' | '\\r' ) )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( ((LA14_0 >= '\u0000' && LA14_0 <= '\t')||(LA14_0 >= '\u000B' && LA14_0 <= '\f')||(LA14_0 >= '\u000E' && LA14_0 <= '\uFFFF')) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:
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
					break loop14;
				}
			}

			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:196:23: ( '\\r' )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0=='\r') ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:196:23: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SINGLELINE_COMMENT"

	// $ANTLR start "MULTILINE_COMMENT"
	public final void mMULTILINE_COMMENT() throws RecognitionException {
		try {
			int _type = MULTILINE_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:200:2: ( '/*' ( options {greedy=false; } : . )* '*/' )
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:200:4: '/*' ( options {greedy=false; } : . )* '*/'
			{
			match("/*"); 

			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:200:9: ( options {greedy=false; } : . )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0=='*') ) {
					int LA16_1 = input.LA(2);
					if ( (LA16_1=='/') ) {
						alt16=2;
					}
					else if ( ((LA16_1 >= '\u0000' && LA16_1 <= '.')||(LA16_1 >= '0' && LA16_1 <= '\uFFFF')) ) {
						alt16=1;
					}

				}
				else if ( ((LA16_0 >= '\u0000' && LA16_0 <= ')')||(LA16_0 >= '+' && LA16_0 <= '\uFFFF')) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:200:37: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop16;
				}
			}

			match("*/"); 

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULTILINE_COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:203:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:203:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:211:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:211:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:211:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
			loop17:
			while (true) {
				int alt17=3;
				int LA17_0 = input.LA(1);
				if ( (LA17_0=='\\') ) {
					alt17=1;
				}
				else if ( ((LA17_0 >= '\u0000' && LA17_0 <= '!')||(LA17_0 >= '#' && LA17_0 <= '[')||(LA17_0 >= ']' && LA17_0 <= '\uFFFF')) ) {
					alt17=2;
				}

				switch (alt17) {
				case 1 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:211:14: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:211:24: ~ ( '\\\\' | '\"' )
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
					break loop17;
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
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:214:5: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:214:8: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
			{
			match('\''); 
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:214:13: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0=='\\') ) {
				alt18=1;
			}
			else if ( ((LA18_0 >= '\u0000' && LA18_0 <= '&')||(LA18_0 >= '(' && LA18_0 <= '[')||(LA18_0 >= ']' && LA18_0 <= '\uFFFF')) ) {
				alt18=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:214:15: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:214:25: ~ ( '\\'' | '\\\\' )
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
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:219:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:219:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:219:22: ( '+' | '-' )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0=='+'||LA19_0=='-') ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:
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

			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:219:33: ( '0' .. '9' )+
			int cnt20=0;
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( ((LA20_0 >= '0' && LA20_0 <= '9')) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:
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
					if ( cnt20 >= 1 ) break loop20;
					EarlyExitException eee = new EarlyExitException(20, input);
					throw eee;
				}
				cnt20++;
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
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:222:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:
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
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:226:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
			int alt21=3;
			int LA21_0 = input.LA(1);
			if ( (LA21_0=='\\') ) {
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
					alt21=1;
					}
					break;
				case 'u':
					{
					alt21=2;
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
					alt21=3;
					}
					break;
				default:
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
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:226:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:227:9: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:228:9: OCTAL_ESC
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
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:233:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt22=3;
			int LA22_0 = input.LA(1);
			if ( (LA22_0=='\\') ) {
				int LA22_1 = input.LA(2);
				if ( ((LA22_1 >= '0' && LA22_1 <= '3')) ) {
					int LA22_2 = input.LA(3);
					if ( ((LA22_2 >= '0' && LA22_2 <= '7')) ) {
						int LA22_4 = input.LA(4);
						if ( ((LA22_4 >= '0' && LA22_4 <= '7')) ) {
							alt22=1;
						}

						else {
							alt22=2;
						}

					}

					else {
						alt22=3;
					}

				}
				else if ( ((LA22_1 >= '4' && LA22_1 <= '7')) ) {
					int LA22_3 = input.LA(3);
					if ( ((LA22_3 >= '0' && LA22_3 <= '7')) ) {
						alt22=2;
					}

					else {
						alt22=3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 22, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:233:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
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
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:234:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
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
					// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:235:9: '\\\\' ( '0' .. '7' )
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
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:240:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:240:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
		// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:1:8: ( DECLARE | DIALECT | END | EXTENDS | GLOBAL | IMPORT | PACKAGE | RULE | THEN | WHEN | SALIENCE | PRIMITIVE | KEYWORD | SEMICOLON | COLON | SEPARATOR | OPERATOR | ID | META | BINDING | FQN | INT | FLOAT | SINGLELINE_COMMENT | MULTILINE_COMMENT | WS | STRING | CHAR )
		int alt23=28;
		alt23 = dfa23.predict(input);
		switch (alt23) {
			case 1 :
				// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:1:10: DECLARE
				{
				mDECLARE(); 

				}
				break;
			case 2 :
				// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:1:18: DIALECT
				{
				mDIALECT(); 

				}
				break;
			case 3 :
				// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:1:26: END
				{
				mEND(); 

				}
				break;
			case 4 :
				// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:1:30: EXTENDS
				{
				mEXTENDS(); 

				}
				break;
			case 5 :
				// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:1:38: GLOBAL
				{
				mGLOBAL(); 

				}
				break;
			case 6 :
				// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:1:45: IMPORT
				{
				mIMPORT(); 

				}
				break;
			case 7 :
				// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:1:52: PACKAGE
				{
				mPACKAGE(); 

				}
				break;
			case 8 :
				// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:1:60: RULE
				{
				mRULE(); 

				}
				break;
			case 9 :
				// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:1:65: THEN
				{
				mTHEN(); 

				}
				break;
			case 10 :
				// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:1:70: WHEN
				{
				mWHEN(); 

				}
				break;
			case 11 :
				// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:1:75: SALIENCE
				{
				mSALIENCE(); 

				}
				break;
			case 12 :
				// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:1:84: PRIMITIVE
				{
				mPRIMITIVE(); 

				}
				break;
			case 13 :
				// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:1:94: KEYWORD
				{
				mKEYWORD(); 

				}
				break;
			case 14 :
				// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:1:102: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 15 :
				// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:1:112: COLON
				{
				mCOLON(); 

				}
				break;
			case 16 :
				// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:1:118: SEPARATOR
				{
				mSEPARATOR(); 

				}
				break;
			case 17 :
				// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:1:128: OPERATOR
				{
				mOPERATOR(); 

				}
				break;
			case 18 :
				// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:1:137: ID
				{
				mID(); 

				}
				break;
			case 19 :
				// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:1:140: META
				{
				mMETA(); 

				}
				break;
			case 20 :
				// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:1:145: BINDING
				{
				mBINDING(); 

				}
				break;
			case 21 :
				// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:1:153: FQN
				{
				mFQN(); 

				}
				break;
			case 22 :
				// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:1:157: INT
				{
				mINT(); 

				}
				break;
			case 23 :
				// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:1:161: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 24 :
				// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:1:167: SINGLELINE_COMMENT
				{
				mSINGLELINE_COMMENT(); 

				}
				break;
			case 25 :
				// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:1:186: MULTILINE_COMMENT
				{
				mMULTILINE_COMMENT(); 

				}
				break;
			case 26 :
				// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:1:204: WS
				{
				mWS(); 

				}
				break;
			case 27 :
				// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:1:207: STRING
				{
				mSTRING(); 

				}
				break;
			case 28 :
				// C:\\Development\\NetBeansProjects\\drools-netbeans-plugin\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:1:214: CHAR
				{
				mCHAR(); 

				}
				break;

		}
	}


	protected DFA13 dfa13 = new DFA13(this);
	protected DFA23 dfa23 = new DFA23(this);
	static final String DFA13_eotS =
		"\5\uffff";
	static final String DFA13_eofS =
		"\5\uffff";
	static final String DFA13_minS =
		"\2\56\3\uffff";
	static final String DFA13_maxS =
		"\1\71\1\145\3\uffff";
	static final String DFA13_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA13_specialS =
		"\5\uffff}>";
	static final String[] DFA13_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
			"",
			"",
			""
	};

	static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
	static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
	static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
	static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
	static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
	static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
	static final short[][] DFA13_transition;

	static {
		int numStates = DFA13_transitionS.length;
		DFA13_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
		}
	}

	protected class DFA13 extends DFA {

		public DFA13(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 13;
			this.eot = DFA13_eot;
			this.eof = DFA13_eof;
			this.min = DFA13_min;
			this.max = DFA13_max;
			this.accept = DFA13_accept;
			this.special = DFA13_special;
			this.transition = DFA13_transition;
		}
		@Override
		public String getDescription() {
			return "189:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
		}
	}

	static final String DFA23_eotS =
		"\1\uffff\21\43\2\uffff\1\33\1\uffff\1\25\1\43\2\uffff\1\110\4\uffff\2"+
		"\43\1\114\1\43\2\uffff\6\43\1\114\23\43\1\114\3\43\6\uffff\3\43\1\uffff"+
		"\1\155\4\43\1\162\4\43\1\114\11\43\1\114\4\43\3\114\4\43\1\uffff\1\43"+
		"\1\114\2\43\1\uffff\1\43\1\u008c\1\43\1\u008e\1\u008f\3\43\1\162\2\43"+
		"\1\162\2\43\1\162\12\43\1\uffff\1\43\2\uffff\1\114\1\43\1\162\1\43\1\114"+
		"\1\162\3\43\1\114\3\43\1\162\1\43\1\u00ac\1\u00ad\1\43\1\114\6\43\1\u00b5"+
		"\1\u00b6\1\u00b7\2\uffff\1\u00b8\1\43\1\162\1\114\2\43\1\114\4\uffff\1"+
		"\u00bc\2\114\1\uffff";
	static final String DFA23_eofS =
		"\u00bd\uffff";
	static final String DFA23_minS =
		"\1\11\21\56\2\uffff\1\60\1\uffff\1\52\1\56\2\uffff\1\56\4\uffff\4\56\2"+
		"\uffff\36\56\6\uffff\3\56\1\uffff\40\56\1\uffff\4\56\1\uffff\31\56\1\uffff"+
		"\1\56\2\uffff\34\56\2\uffff\7\56\4\uffff\3\56\1\uffff";
	static final String DFA23_maxS =
		"\1\174\21\172\2\uffff\1\71\1\uffff\1\57\1\172\2\uffff\1\145\4\uffff\4"+
		"\172\2\uffff\36\172\6\uffff\3\172\1\uffff\40\172\1\uffff\4\172\1\uffff"+
		"\31\172\1\uffff\1\172\2\uffff\34\172\2\uffff\7\172\4\uffff\3\172\1\uffff";
	static final String DFA23_acceptS =
		"\22\uffff\1\16\1\17\1\uffff\1\21\2\uffff\1\23\1\24\1\uffff\1\20\1\32\1"+
		"\33\1\34\4\uffff\1\22\1\25\36\uffff\1\16\1\17\1\27\1\30\1\31\1\26\3\uffff"+
		"\1\15\40\uffff\1\3\4\uffff\1\14\31\uffff\1\10\1\uffff\1\11\1\12\34\uffff"+
		"\1\5\1\6\7\uffff\1\1\1\2\1\4\1\7\3\uffff\1\13";
	static final String DFA23_specialS =
		"\u00bd\uffff}>";
	static final String[] DFA23_transitionS = {
			"\2\34\2\uffff\1\34\22\uffff\1\34\1\25\1\35\1\uffff\1\31\2\25\1\36\2\33"+
			"\2\25\1\33\1\25\1\24\1\26\12\32\1\23\1\22\3\25\1\uffff\1\30\32\27\1\33"+
			"\1\uffff\1\33\1\uffff\1\27\1\uffff\1\16\1\12\1\15\1\1\1\2\1\14\1\3\1"+
			"\27\1\4\2\27\1\13\1\21\1\20\1\17\1\5\1\27\1\6\1\11\1\7\2\27\1\10\3\27"+
			"\1\uffff\1\25",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\4\42\1\37\3\42"+
			"\1\40\5\42\1\41\13\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\13\42\1\47\1"+
			"\42\1\45\11\42\1\46\2\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\13\42\1\50\16"+
			"\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\5\42\1\53\6\42"+
			"\1\51\1\52\14\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\1\54\31\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\4\42\1\56\17"+
			"\42\1\55\5\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\7\42\1\57\11"+
			"\42\1\60\10\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\7\42\1\61\22"+
			"\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\1\62\6\42\1\63"+
			"\22\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\16\42\1\65\2"+
			"\42\1\66\6\42\1\64\1\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\16\42\1\67\13"+
			"\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\10\42\1\72\2"+
			"\42\1\70\2\42\1\71\13\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\1\75\6\42\1\73"+
			"\6\42\1\74\13\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\15\42\1\76\14"+
			"\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\21\42\1\77\10"+
			"\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\4\42\1\101\11"+
			"\42\1\100\13\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\1\102\31\42",
			"",
			"",
			"\12\105",
			"",
			"\1\107\4\uffff\1\106",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"",
			"",
			"\1\105\1\uffff\12\32\13\uffff\1\105\37\uffff\1\105",
			"",
			"",
			"",
			"",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\2\42\1\111\27"+
			"\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\1\112\31\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\24\42\1\113\5"+
			"\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"",
			"",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\3\42\1\115\26"+
			"\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\23\42\1\116\6"+
			"\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\22\42\1\117\7"+
			"\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\16\42\1\120\13"+
			"\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\17\42\1\121\12"+
			"\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\23\42\1\122\6"+
			"\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\2\42\1\123\27"+
			"\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\13\42\1\124\16"+
			"\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\23\42\1\125\6"+
			"\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\4\42\1\126\25"+
			"\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\30\42\1\127\1"+
			"\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\4\42\1\130\3"+
			"\42\1\131\21\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\13\42\1\132\16"+
			"\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\16\42\1\133\13"+
			"\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\23\42\1\134\6"+
			"\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\16\42\1\135\13"+
			"\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\4\42\1\136\25"+
			"\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\15\42\1\137\14"+
			"\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\16\42\1\140\13"+
			"\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\21\42\1\141\10"+
			"\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\15\42\1\142\14"+
			"\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\1\143\31\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\15\42\1\144\14"+
			"\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\23\42\1\145\6"+
			"\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\3\42\1\146\26"+
			"\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\23\42\1\147\6"+
			"\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\26\42\1\150\3"+
			"\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\23\42\1\151\6"+
			"\42",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\13\42\1\152\16"+
			"\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\13\42\1\153\16"+
			"\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\1\42\1\154\30"+
			"\42",
			"",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\4\42\1\156\25"+
			"\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\4\42\1\157\25"+
			"\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\1\42\1\160\30"+
			"\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\16\42\1\161\13"+
			"\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\12\42\1\163\17"+
			"\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\4\42\1\164\25"+
			"\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\24\42\1\165\5"+
			"\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\15\42\1\166\14"+
			"\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\15\42\1\167\14"+
			"\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\13\42\1\170\16"+
			"\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\10\42\1\171\21"+
			"\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\21\42\1\172\10"+
			"\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\4\42\1\173\25"+
			"\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\13\42\1\174\16"+
			"\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\1\175\31\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\6\42\1\176\23"+
			"\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\1\177\31\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\1\u0080\31\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\21\42\1\u0081"+
			"\10\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\23\42\1\u0082"+
			"\6\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\2\42\1\u0083"+
			"\27\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\2\42\1\u0084"+
			"\27\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\1\u0085\31\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\4\42\1\u0086"+
			"\25\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\13\42\1\u0087"+
			"\16\42",
			"",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\15\42\1\u0088"+
			"\14\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\1\u0089\31\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\21\42\1\u008a"+
			"\10\42",
			"",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\1\u008b\31\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\21\42\1\u008d"+
			"\10\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\4\42\1\u0090"+
			"\25\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\4\42\1\u0091"+
			"\25\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\23\42\1\u0092"+
			"\6\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\4\42\1\u0093"+
			"\25\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\12\42\1\u0094"+
			"\17\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\23\42\1\u0095"+
			"\6\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\13\42\1\u0096"+
			"\16\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\1\u0097\7\42"+
			"\1\u0098\21\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\7\42\1\u0099"+
			"\22\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\7\42\1\u009a"+
			"\22\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\21\42\1\u009b"+
			"\10\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\2\42\1\u009c"+
			"\27\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\4\42\1\u009d"+
			"\25\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\3\42\1\u009e"+
			"\26\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\13\42\1\u009f"+
			"\16\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\23\42\1\u00a0"+
			"\6\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\6\42\1\u00a1"+
			"\23\42",
			"",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\15\42\1\u00a2"+
			"\14\42",
			"",
			"",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\15\42\1\u00a3"+
			"\14\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\1\u00a4\31\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\13\42\1\u00a5"+
			"\16\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\10\42\1\u00a6"+
			"\21\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\15\42\1\u00a7"+
			"\14\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\4\42\1\u00a8"+
			"\25\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\4\42\1\u00a9"+
			"\25\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\23\42\1\u00aa"+
			"\6\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\22\42\1\u00ab"+
			"\7\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\4\42\1\u00ae"+
			"\25\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\2\42\1\u00af"+
			"\27\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\15\42\1\u00b0"+
			"\14\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\30\42\1\u00b1"+
			"\1\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\15\42\1\u00b2"+
			"\14\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\24\42\1\u00b3"+
			"\5\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\22\42\1\u00b4"+
			"\7\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"",
			"",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\4\42\1\u00b9"+
			"\25\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\22\42\1\u00ba"+
			"\7\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\4\42\1\u00bb"+
			"\25\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"",
			"",
			"",
			"",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\44\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			""
	};

	static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
	static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
	static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
	static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
	static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
	static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
	static final short[][] DFA23_transition;

	static {
		int numStates = DFA23_transitionS.length;
		DFA23_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
		}
	}

	protected class DFA23 extends DFA {

		public DFA23(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 23;
			this.eot = DFA23_eot;
			this.eof = DFA23_eof;
			this.min = DFA23_min;
			this.max = DFA23_max;
			this.accept = DFA23_accept;
			this.special = DFA23_special;
			this.transition = DFA23_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( DECLARE | DIALECT | END | EXTENDS | GLOBAL | IMPORT | PACKAGE | RULE | THEN | WHEN | SALIENCE | PRIMITIVE | KEYWORD | SEMICOLON | COLON | SEPARATOR | OPERATOR | ID | META | BINDING | FQN | INT | FLOAT | SINGLELINE_COMMENT | MULTILINE_COMMENT | WS | STRING | CHAR );";
		}
	}

}
