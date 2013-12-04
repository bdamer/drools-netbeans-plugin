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
            new DRLTokenId("COMMENT", "comment", DroolsRuleLexer.COMMENT),
            new DRLTokenId("ID", "identifier", DroolsRuleLexer.ID),
            new DRLTokenId("KEYWORD", "keyword", DroolsRuleLexer.KEYWORD),
            new DRLTokenId("SEPARATOR", "separator", DroolsRuleLexer.SEPARATOR),            
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
