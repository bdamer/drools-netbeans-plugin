// $ANTLR 3.5.1 C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g 2013-12-03 19:54:35

package com.afqa123.drools.grammar;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


/**
 * Copyright (c) 2013 Benjamin Damer
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software 
 * and associated documentation files (the "Software"), to deal in the Software without restriction, 
 * including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, 
 * and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, 
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial 
 * portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT 
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. 
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, 
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE 
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
@SuppressWarnings("all")
public class DroolsRuleParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BINDING", "CHAR", "COMMENT", 
		"ESC_SEQ", "EXPONENT", "FLOAT", "HEX_DIGIT", "ID", "INT", "KEYWORD", "OCTAL_ESC", 
		"OPERATOR", "SEPARATOR", "STRING", "UNICODE_ESC", "WS"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public DroolsRuleParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public DroolsRuleParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
		this.state.ruleMemo = new HashMap[9+1];


	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return DroolsRuleParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g"; }


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:36:1: program : ( statement )* ( WS )* ;
	public final DroolsRuleParser.program_return program() throws RecognitionException {
		DroolsRuleParser.program_return retval = new DroolsRuleParser.program_return();
		retval.start = input.LT(1);
		int program_StartIndex = input.index();

		Object root_0 = null;

		Token WS2=null;
		ParserRuleReturnScope statement1 =null;

		Object WS2_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }

			// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:37:2: ( ( statement )* ( WS )* )
			// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:37:4: ( statement )* ( WS )*
			{
			root_0 = (Object)adaptor.nil();


			// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:37:4: ( statement )*
			loop1:
			while (true) {
				int alt1=2;
				alt1 = dfa1.predict(input);
				switch (alt1) {
				case 1 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:37:4: statement
					{
					pushFollow(FOLLOW_statement_in_program51);
					statement1=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement1.getTree());

					}
					break;

				default :
					break loop1;
				}
			}

			// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:37:15: ( WS )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==WS) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:37:15: WS
					{
					WS2=(Token)match(input,WS,FOLLOW_WS_in_program54); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					WS2_tree = (Object)adaptor.create(WS2);
					adaptor.addChild(root_0, WS2_tree);
					}

					}
					break;

				default :
					break loop2;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 1, program_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "program"


	public static class statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:40:1: statement : ( WS )* ( KEYWORD | SEPARATOR | OPERATOR | BINDING | ID ) ;
	public final DroolsRuleParser.statement_return statement() throws RecognitionException {
		DroolsRuleParser.statement_return retval = new DroolsRuleParser.statement_return();
		retval.start = input.LT(1);
		int statement_StartIndex = input.index();

		Object root_0 = null;

		Token WS3=null;
		Token set4=null;

		Object WS3_tree=null;
		Object set4_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

			// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:41:2: ( ( WS )* ( KEYWORD | SEPARATOR | OPERATOR | BINDING | ID ) )
			// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:41:4: ( WS )* ( KEYWORD | SEPARATOR | OPERATOR | BINDING | ID )
			{
			root_0 = (Object)adaptor.nil();


			// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:41:4: ( WS )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==WS) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Development\\NetBeansProjects\\DroolsModule\\src\\com\\afqa123\\drools\\grammar\\DroolsRule.g:41:4: WS
					{
					WS3=(Token)match(input,WS,FOLLOW_WS_in_statement67); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					WS3_tree = (Object)adaptor.create(WS3);
					adaptor.addChild(root_0, WS3_tree);
					}

					}
					break;

				default :
					break loop3;
				}
			}

			set4=input.LT(1);
			if ( input.LA(1)==BINDING||input.LA(1)==ID||input.LA(1)==KEYWORD||(input.LA(1) >= OPERATOR && input.LA(1) <= SEPARATOR) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set4));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 2, statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "statement"

	// Delegated rules


	protected DFA1 dfa1 = new DFA1(this);
	static final String DFA1_eotS =
		"\4\uffff";
	static final String DFA1_eofS =
		"\2\2\2\uffff";
	static final String DFA1_minS =
		"\2\4\2\uffff";
	static final String DFA1_maxS =
		"\2\23\2\uffff";
	static final String DFA1_acceptS =
		"\2\uffff\1\2\1\1";
	static final String DFA1_specialS =
		"\4\uffff}>";
	static final String[] DFA1_transitionS = {
			"\1\3\6\uffff\1\3\1\uffff\1\3\1\uffff\2\3\2\uffff\1\1",
			"\1\3\6\uffff\1\3\1\uffff\1\3\1\uffff\2\3\2\uffff\1\1",
			"",
			""
	};

	static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
	static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
	static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
	static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
	static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
	static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
	static final short[][] DFA1_transition;

	static {
		int numStates = DFA1_transitionS.length;
		DFA1_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
		}
	}

	protected class DFA1 extends DFA {

		public DFA1(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 1;
			this.eot = DFA1_eot;
			this.eof = DFA1_eof;
			this.min = DFA1_min;
			this.max = DFA1_max;
			this.accept = DFA1_accept;
			this.special = DFA1_special;
			this.transition = DFA1_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 37:4: ( statement )*";
		}
	}

	public static final BitSet FOLLOW_statement_in_program51 = new BitSet(new long[]{0x000000000009A812L});
	public static final BitSet FOLLOW_WS_in_program54 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_WS_in_statement67 = new BitSet(new long[]{0x000000000009A810L});
	public static final BitSet FOLLOW_set_in_statement71 = new BitSet(new long[]{0x0000000000000002L});
}
