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

import javax.swing.text.BadLocationException;
import org.netbeans.api.editor.mimelookup.MimeRegistration;
import org.netbeans.modules.editor.indent.spi.Context;
import org.netbeans.modules.editor.indent.spi.ExtraLock;
import org.netbeans.modules.editor.indent.spi.IndentTask;

public class DRLIndentTask implements IndentTask {

    @MimeRegistration(mimeType="text/x-drools-rule",service=IndentTask.Factory.class)
    public static class DRLIndentTaskFactory implements IndentTask.Factory {
        @Override
        public IndentTask createTask(Context cntxt) {
            return new DRLIndentTask(cntxt);
        }    
    }
    
    private final Context context;
    
    DRLIndentTask(Context context) {
        this.context = context;
    }
    
    // TODO: add indentation whenever there is a keyword in the previous
    // line. Ex: rule, when, then, etc
    @Override
    public void reindent() throws BadLocationException {
        // determine start offset of current line
        int lineStartOffset = context.lineStartOffset(context.startOffset());
        if (lineStartOffset <= 0) {
            return;
        }
        // determine offset of line before this one
        int priorOffset = context.lineStartOffset(lineStartOffset - 1);
        int lineIndent = context.lineIndent(priorOffset);
        // set current line's offset to that of prior
        context.modifyIndent(lineStartOffset, lineIndent);
        context.setCaretOffset(lineIndent);
    }
    
    @Override
    public ExtraLock indentLock() {
        return null;
    }
}