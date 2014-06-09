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
package com.afqa123.drools.lexer;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.netbeans.spi.lexer.LanguageHierarchy;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;
import com.afqa123.drools.grammar.DroolsRuleLexer;

public class DRLLanguageHierarchy extends LanguageHierarchy<DRLTokenId> {

    private final static List<DRLTokenId> tokens;
    private final static Map<Integer,DRLTokenId> idToToken;
    
    static {
        tokens = Arrays.<DRLTokenId>asList(new DRLTokenId[] {
            new DRLTokenId("BINDING", "binding", DroolsRuleLexer.BINDING),
            new DRLTokenId("CHAR", "character", DroolsRuleLexer.CHAR),
            new DRLTokenId("SINGLELINE_COMMENT", "comment", DroolsRuleLexer.SINGLELINE_COMMENT),
            new DRLTokenId("MULTILINE_COMMENT", "comment", DroolsRuleLexer.MULTILINE_COMMENT),
            
            new DRLTokenId("ID", "identifier", DroolsRuleLexer.ID),
            new DRLTokenId("FQN", "identifier", DroolsRuleLexer.FQN),
            
            new DRLTokenId("KEYWORD", "keyword", DroolsRuleLexer.KEYWORD),
            new DRLTokenId("DECLARE", "keyword", DroolsRuleLexer.DECLARE),
            new DRLTokenId("DIALECT", "keyword", DroolsRuleLexer.DIALECT),
            new DRLTokenId("EXTENDS", "keyword", DroolsRuleLexer.EXTENDS),
            new DRLTokenId("GLOBAL", "keyword", DroolsRuleLexer.GLOBAL),
            new DRLTokenId("IMPORT", "keyword", DroolsRuleLexer.IMPORT),
            new DRLTokenId("PACKAGE", "keyword", DroolsRuleLexer.PACKAGE),
            new DRLTokenId("RULE", "keyword", DroolsRuleLexer.RULE),
            new DRLTokenId("THEN", "keyword", DroolsRuleLexer.THEN),
            new DRLTokenId("WHEN", "keyword", DroolsRuleLexer.WHEN),
            new DRLTokenId("END", "keyword", DroolsRuleLexer.END),            
            new DRLTokenId("SALIENCE", "keyword", DroolsRuleLexer.SALIENCE),            
            new DRLTokenId("PRIMITIVE", "keyword", DroolsRuleLexer.PRIMITIVE),            
            new DRLTokenId("META", "keyword", DroolsRuleLexer.META),
            
            new DRLTokenId("SEPARATOR", "separator", DroolsRuleLexer.SEPARATOR),         
            new DRLTokenId("SEMICOLON", "separator", DroolsRuleLexer.SEMICOLON),         
            new DRLTokenId("COLON", "separator", DroolsRuleLexer.COLON),         
            
            new DRLTokenId("OPERATOR", "operator", DroolsRuleLexer.OPERATOR), 
            
            new DRLTokenId("FLOAT", "number", DroolsRuleLexer.FLOAT),
            new DRLTokenId("INT", "number", DroolsRuleLexer.INT),
            new DRLTokenId("EXPONENT", "number", DroolsRuleLexer.EXPONENT),
            new DRLTokenId("HEX_DIGIT", "number", DroolsRuleLexer.HEX_DIGIT),

            new DRLTokenId("STRING", "string", DroolsRuleLexer.STRING),
            new DRLTokenId("ESC_SEQ", "string", DroolsRuleLexer.ESC_SEQ),
            new DRLTokenId("OCTAL_ESC", "string", DroolsRuleLexer.OCTAL_ESC),
            new DRLTokenId("UNICODE_ESC", "string", DroolsRuleLexer.UNICODE_ESC),
            new DRLTokenId("WS", "whitespace", DroolsRuleLexer.WS),
        });
        idToToken = new HashMap<Integer, DRLTokenId>();
        for (DRLTokenId tok : tokens) {
            idToToken.put(tok.ordinal(), tok);
        }
    }
    
    static DRLTokenId getToken(int id) {
        return idToToken.get(id);
    }
    
    @Override
    protected Collection<DRLTokenId> createTokenIds() {
        return tokens;
    }

    @Override
    protected Lexer<DRLTokenId> createLexer(LexerRestartInfo<DRLTokenId> lri) {
        return new DRLLexer(lri);
    }

    @Override
    protected String mimeType() {
        return "text/x-drools-rule";
    }    
}
