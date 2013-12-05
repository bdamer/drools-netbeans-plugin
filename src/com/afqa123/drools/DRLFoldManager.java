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

package com.afqa123.drools;

import com.afqa123.drools.grammar.DroolsRuleLexer;
import com.afqa123.drools.lexer.DRLTokenId;
import javax.swing.event.DocumentEvent;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import org.netbeans.api.editor.fold.Fold;
import org.netbeans.api.editor.fold.FoldHierarchy;
import org.netbeans.api.editor.fold.FoldTemplate;
import org.netbeans.api.editor.fold.FoldType;
import org.netbeans.api.editor.mimelookup.MimeRegistration;
import org.netbeans.api.lexer.Token;
import org.netbeans.api.lexer.TokenHierarchy;
import org.netbeans.api.lexer.TokenSequence;
import org.netbeans.spi.editor.fold.FoldHierarchyTransaction;
import org.netbeans.spi.editor.fold.FoldManager;
import org.netbeans.spi.editor.fold.FoldManagerFactory;
import org.netbeans.spi.editor.fold.FoldOperation;
import org.openide.util.Exceptions;

public class DRLFoldManager implements FoldManager {
    
    @MimeRegistration(mimeType="text/x-drools-rule",service=FoldManagerFactory.class)
    public static class DRLFoldManagerFactory implements FoldManagerFactory {
        @Override
        public FoldManager createFoldManager() {
            return new DRLFoldManager();
        }
    }
    
    private FoldOperation operation;

    @Override
    public void init(FoldOperation operation) {
        this.operation = operation;
    }

    @Override
    public void initFolds(FoldHierarchyTransaction transaction) {
        FoldHierarchy hierarchy = operation.getHierarchy();
        Document document = hierarchy.getComponent().getDocument();
        TokenHierarchy<Document> hi = TokenHierarchy.get(document);
        TokenSequence<DRLTokenId> ts = (TokenSequence<DRLTokenId>) hi.tokenSequence();
        while (ts.moveNext()) {
            int offset = ts.offset();
            Token<DRLTokenId> token = ts.token();
            DRLTokenId id = token.id();   
            try {
                switch (id.ordinal()) {
                    case DroolsRuleLexer.MULTILINE_COMMENT:
                        operation.addToHierarchy(FoldType.COMMENT, offset, offset + token.length(), 
                                false, null, null, hierarchy, transaction);
                        break;
                    case DroolsRuleLexer.SINGLELINE_COMMENT:
                    {
                        int start = offset;
                        int stop = -1;
                        while (ts.moveNext()) {
                            token = ts.token();
                            if (token.id().ordinal() == DroolsRuleLexer.SINGLELINE_COMMENT) {
                                stop = ts.offset() + token.length() - 1;
                            } else {
                                ts.movePrevious();
                                break;
                            }
                        }
                        if (stop > -1) {
                            operation.addToHierarchy(FoldType.COMMENT, start, stop, 
                                false, null, null, hierarchy, transaction);
                        }
                        break;
                    }
                    case DroolsRuleLexer.RULE:
                    {
                        int start = offset + token.length();
                        skipWhitespace(ts);
                        token = ts.token();
                        if (token.id().ordinal() == DroolsRuleLexer.STRING) {
                            start = ts.offset() + token.length();
                        }
                        int stop = -1;
                        while (ts.moveNext()) {
                            token = ts.token();
                            id = token.id();
                            if (id.ordinal() == DroolsRuleLexer.END) {
                                stop = ts.offset() + token.length();
                                break;
                            }
                        }
                        if (stop > -1) {
                            operation.addToHierarchy(FoldType.CODE_BLOCK, start, stop, 
                                false, null, null, hierarchy, transaction);
                        }
                        break;
                    }
                    case DroolsRuleLexer.DECLARE:
                    {
                        int start = offset + token.length();
                        skipWhitespace(ts);
                        token = ts.token();
                        if (token.id().ordinal() == DroolsRuleLexer.FQN || 
                                token.id().ordinal() == DroolsRuleLexer.ID) {
                            start = ts.offset() + token.length();
                        }
                        int stop = -1;
                        while (ts.moveNext()) {
                            token = ts.token();
                            id = token.id();
                            if (id.ordinal() == DroolsRuleLexer.END) {
                                stop = ts.offset() + token.length();
                                break;
                            }
                        }
                        if (stop > -1) {
                            operation.addToHierarchy(FoldType.CODE_BLOCK, start, stop, 
                                false, null, null, hierarchy, transaction);
                        }
                        break;
                    }
                }
            } catch (BadLocationException ex) {
                Exceptions.printStackTrace(ex);
            }
        }
    }
    
    private void skipWhitespace(TokenSequence<DRLTokenId> ts) {
        while (ts.moveNext() && ts.token().id().ordinal() == DroolsRuleLexer.WS) { 
        }
    }
    
    @Override
    public void insertUpdate(DocumentEvent de, FoldHierarchyTransaction fht) {
        
    }
    
    @Override
    public void removeUpdate(DocumentEvent de, FoldHierarchyTransaction fht) {
        
    }

    @Override
    public void changedUpdate(DocumentEvent de, FoldHierarchyTransaction fht) {
        
    }

    @Override
    public void removeEmptyNotify(Fold fold) {
        
    }

    @Override
    public void removeDamagedNotify(Fold fold) {
        
    }

    @Override
    public void expandNotify(Fold fold) {
        
    }

    @Override
    public void release() {
        
    }
}
