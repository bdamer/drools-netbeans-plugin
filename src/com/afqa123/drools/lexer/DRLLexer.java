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

import com.afqa123.drools.grammar.DroolsRuleLexer;
import org.netbeans.api.lexer.Token;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

public class DRLLexer implements Lexer<DRLTokenId> {

    private final LexerRestartInfo<DRLTokenId> info;
    private final DroolsRuleLexer lexer;
    
    DRLLexer(LexerRestartInfo<DRLTokenId> info) {
        this.info = info;
        AntlrCharStream stream = new AntlrCharStream(info.input(), "DRLLexer", true);
        lexer = new DroolsRuleLexer(stream);
    }
    
    @Override
    public Token<DRLTokenId> nextToken() {
        org.antlr.runtime.Token token = lexer.nextToken();
        int tokenType = token.getType();
        Token<DRLTokenId> res = null;
        if (tokenType != -1) {
            DRLTokenId tokenId = DRLLanguageHierarchy.getToken(tokenType);
            res = info.tokenFactory().createToken(tokenId);
        } else if (info.input().readLength() > 0){
            DRLTokenId tokenId = DRLLanguageHierarchy.getToken(DroolsRuleLexer.WS);
            res = info.tokenFactory().createToken(tokenId);
        }
        return res;
    }

    @Override
    public Object state() {
        return null;
    }

    @Override
    public void release() {
    }    
}
