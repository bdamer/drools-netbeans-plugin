/*
 * Copyright (c) 2013, Benjamin Damer
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
grammar DroolsRule;

options {
	output=AST;
	backtrack=true;
	memoize=true;
}

@lexer::header {
package com.afqa123.drools.grammar;
}

@lexer::members {
	@Override
	public void emitErrorMessage(String msg) {
	}	
}

@members {
	@Override
	public void emitErrorMessage(String msg) {
	}
}

@header {
package com.afqa123.drools.grammar;
}

program
	:	declaration* WS*
	;
	
declaration
	:	WS!*
		( packageDeclaration | importDeclaration | globalDeclaration | dialectDeclaration | typeDeclaration | ruleDeclaration )
		WS!* SEMICOLON?
	;

packageDeclaration
	:	 PACKAGE WS!+ FQN 
	;
	
dialectDeclaration
	:	DIALECT WS!+ STRING
	;
	
importDeclaration
	:	IMPORT WS!+ FQN
	;
	
globalDeclaration
	:	GLOBAL WS+ FQN WS+ ID
	-> GLOBAL FQN ID
	;
	
typeDeclaration
	:	DECLARE WS!+ ID WS!+ (EXTENDS FQN)? (WS* memberDeclaration)* WS+ END
	;
	
memberDeclaration
	:	ID WS!* COLON WS!* (PRIMITIVE | FQN)
	;

ruleDeclaration
	:	RULE WS!+ (STRING WS!+)? WHEN WS!+ ruleLHS THEN WS!+ ruleRHS END 
	; 
	
ruleLHS
	:	
	;
	
ruleRHS
	:
	;
	
DECLARE
	:	'declare'
	;

DIALECT
	:	'dialect'
	;

END
	: 	'end'
	;

EXTENDS
	:	'extends'
	;
	
GLOBAL
	:	'global'
	;

IMPORT
	:	'import'
	;

PACKAGE
	: 	'package'
	;

RULE
	:	'rule'
	;

THEN
	:	'then'
	;

WHEN
	:	'when'
	;
	
PRIMITIVE
	:	'byte' | 'short' | 'int' | 'long' | 'float' | 'double' | 'boolean' | 'char'
	;	
	
KEYWORD
	:	'and' | 'or' | 'not' | 'matches' | 'contains' |
		DECLARE | DIALECT | END | EXTENDS | GLOBAL | IMPORT | PACKAGE | RULE | THEN | WHEN | PRIMITIVE |
		// Java keywords
		'new' | 'return' | 'if' | 'else' | 'do' | 'while' | 'for'
	;

SEMICOLON
	:	';'
	;
	
COLON
	:	':'
	;

SEPARATOR
	:	'.'| '(' | ')' | '[' | ']' | ',' | COLON | SEMICOLON
	;
		
OPERATOR
	:	'==' | '!=' | '>' | '<' | '>=' | '<=' | '+' | '-' | '/' | '*' | '%' | '|' | '&' | '||' | '&&' | '!' | ':' | '='
	;
	
ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;	

BINDING
	:	'$' ID
	;
	
FQN	:	ID ('.' ID)*
	;
        
INT :	'0'..'9'+
    ;

FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
    ;
    
SINGLELINE_COMMENT
	:	'//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
	;
    
MULTILINE_COMMENT
	:	'/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
	;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;
	
STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

CHAR:  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\''
    ;

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;
