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
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import javax.swing.event.DocumentEvent;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import org.netbeans.api.editor.fold.Fold;
import org.netbeans.api.editor.fold.FoldHierarchy;
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

    @MimeRegistration(mimeType = "text/x-drools-rule", service = FoldManagerFactory.class)
    public static class DRLFoldManagerFactory implements FoldManagerFactory {
        @Override
        public FoldManager createFoldManager() {
            return new DRLFoldManager();
        }
    }

    private final static Logger logger = Logger.getLogger(DRLFoldManager.class.getName());
    private FoldOperation operation;
    
    @Override
    public void init(FoldOperation operation) {
        this.operation = operation;
    }

    @Override
    public void initFolds(FoldHierarchyTransaction transaction) {
        updateFolds(transaction);
    }

    private void updateFolds(FoldHierarchyTransaction fht) {
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
                        addFold(FoldType.COMMENT, offset, offset + token.length(), fht, null);
                        break;
                    case DroolsRuleLexer.SINGLELINE_COMMENT: {
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
                            addFold(FoldType.COMMENT, start, stop, fht, null);
                        }
                        break;
                    }
                    case DroolsRuleLexer.RULE: {
                        // Start of the rule
                        int ruleStart = offset;
                        // Start of the fold; not the same as start of the rule.
                        int start = findRuleStart(ruleStart + token.length(), ts);
                        int stop = -1;
                        while (ts.moveNext()) {
                            token = ts.token();
                            id = token.id();
                        
                            if (id.ordinal() == DroolsRuleLexer.RULE) {
                                // found the next RULE before we saw the end 
                                // to the current one -> not a well-formed rule.
                                ruleStart = ts.offset();
                                start = findRuleStart(ruleStart + token.length(), ts);
                            } else if (id.ordinal() == DroolsRuleLexer.END) {
                                stop = ts.offset() + token.length();
                                break;
                            }
                        }
                        if (stop > -1) {
                            addFold(FoldType.CODE_BLOCK, start, stop, fht, (Integer)ruleStart);
                        }
                        break;
                    }
                    case DroolsRuleLexer.DECLARE: {
                        int declareStart = offset;
                        int start = declareStart + token.length();
                        skipWhitespace(ts);
                        token = ts.token();
                        if (token.id().ordinal() == DroolsRuleLexer.FQN
                                || token.id().ordinal() == DroolsRuleLexer.ID) {
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
                            addFold(FoldType.CODE_BLOCK, start, stop, fht, (Integer)declareStart);
                        }
                        break;
                    }
                }
            } catch (BadLocationException ex) {
                Exceptions.printStackTrace(ex);
            }
        }
    }
    
    private int findRuleStart(int offset, TokenSequence<DRLTokenId> ts) {
        skipWhitespace(ts);
        Token<DRLTokenId> token = ts.token();
        if (token.id().ordinal() == DroolsRuleLexer.STRING) {
            offset = ts.offset() + token.length();
        }
        return offset;
    }
    
    @Deprecated
    private void removeAllFolds(FoldHierarchyTransaction fht) {
        // need to collect first, since removeFromHierarchy changes 
        // the underlying collection
        Iterator<Fold> it = operation.foldIterator();
        List<Fold> folds = new ArrayList<Fold>();
        while (it.hasNext()) {
            folds.add(it.next());
        }
        for (Fold f : folds) {
            operation.removeFromHierarchy(f, fht);
        }
    }
    
    private void addFold(FoldType type, int start, int stop, FoldHierarchyTransaction fht, Object extraInfo) 
            throws BadLocationException {
        Iterator<Fold> it = operation.foldIterator();
        while (it.hasNext()) {
            Fold f = it.next();
            // don't replace existing folds unless they've changed
            if (f.getStartOffset() == start && f.getEndOffset() == stop &&
                    f.getType() == type) {
                //logger.info("Fold wasn't changed, skipping add...");
                return;
            }
            // remove if old fold was changed
            if (f.getStartOffset() >= start && f.getStartOffset() <= stop) {
                operation.removeFromHierarchy(f, fht);
            }
        }
        operation.addToHierarchy(type, start, stop, false, null, null, extraInfo, fht);
    }
     
    private void skipWhitespace(TokenSequence<DRLTokenId> ts) {
        while (ts.moveNext() && ts.token().id().ordinal() == DroolsRuleLexer.WS) {
        }
    }
    
    private void removeFoldAt(int offset, int length, FoldHierarchyTransaction fht) {
        Iterator<Fold> it = operation.foldIterator();
        List<Fold> folds = new ArrayList<Fold>();
        while (it.hasNext()) {
            Fold fold = it.next();
            Object extraInfo = null;
            try {
                // Why is this not a public method???
                Method m = Fold.class.getDeclaredMethod("getExtraInfo");
                m.setAccessible(true);
                extraInfo = m.invoke(fold);
            } catch (Exception e) {
                //logger.warning("Error getting extraInfo: " + e.getMessage());
            }
            int fstart = (extraInfo == null ? fold.getStartOffset() : (Integer)extraInfo);
            int fend = fold.getEndOffset();
            if (fend < offset || fstart > offset + length) {
                continue;
            }
            folds.add(fold);
        }
        for (Fold f : folds) {
            operation.removeFromHierarchy(f, fht);
        }
    }

    @Override
    public void insertUpdate(DocumentEvent de, FoldHierarchyTransaction fht) {
        removeFoldAt(de.getOffset(), de.getLength(), fht);
        updateFolds(fht);
    }

    @Override
    public void removeUpdate(DocumentEvent de, FoldHierarchyTransaction fht) {
        removeFoldAt(de.getOffset(), de.getLength(), fht);
        updateFolds(fht);
    }

    @Override
    public void changedUpdate(DocumentEvent de, FoldHierarchyTransaction fht) {
        // nothing to do, as updated are caught by insert and remove
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