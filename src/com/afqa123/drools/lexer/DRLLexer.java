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
        //System.out.println("Found token: " + tokenType);
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
