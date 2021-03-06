/*
 * Copyright 2000-2009 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.r4intellij.editor;

import com.intellij.codeInsight.template.FileTypeBasedContextType;
import com.intellij.lang.Language;
import com.intellij.psi.PsiFile;
import com.r4intellij.lang.RFileType;
import com.r4intellij.lang.RLanguage;
import org.jetbrains.annotations.NotNull;


public class RContextType extends FileTypeBasedContextType {

    public RContextType() {
        super("R", "&R", RFileType.R_FILE_TYPE);
    }


    @Override
    public boolean isInContext(@NotNull PsiFile file, int offset) {
        return isMyLanguage(file.getLanguage());
    }


    static boolean isMyLanguage(Language language) {
        return language.isKindOf(RLanguage.INSTANCE) || language.isKindOf(RLanguage.INSTANCE);
    }
}