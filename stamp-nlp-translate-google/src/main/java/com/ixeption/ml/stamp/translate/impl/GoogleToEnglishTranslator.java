package com.ixeption.ml.stamp.translate.impl;

import com.google.cloud.translate.Translate;
import com.google.cloud.translate.Translate.TranslateOption;
import com.google.cloud.translate.TranslateOptions;
import com.ixeption.ml.stamp.translate.Translator;

public class GoogleToEnglishTranslator implements Translator {

    private Translate translate = TranslateOptions.getDefaultInstance().getService();

    @Override
    public String transform(String in) {
        return translate.translate(in, TranslateOption.targetLanguage("en")).getModel();
    }
}
