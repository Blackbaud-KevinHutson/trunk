/*
 * JCatpcha, open source java framework for captcha definition and integration
 * Copyright (c) 2005 jcaptcha.net. All Rights Reserved.
 * See the LICENSE.txt file ditributed with this package.
 */
package com.octo.captcha.component.word;

import java.util.Locale;

/**
 * <p><ul><li></li></ul></p>
 *
 * @author <a href="mailto:marc.antoine.garrigue@gmail.com">Marc-Antoine Garrigue</a>
 * @version $Id$
 */
public interface SizeSortedWordList {
    Locale getLocale();

    void addWord(String word);

    Integer getMinWord();

    Integer getMaxWord();

    String getNextWord(Integer lenght);
}