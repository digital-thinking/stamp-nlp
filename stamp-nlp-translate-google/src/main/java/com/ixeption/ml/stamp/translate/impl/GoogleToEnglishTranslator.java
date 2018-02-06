package com.ixeption.ml.stamp.translate.impl;

import com.ixeption.ml.stamp.translate.Translator;
// Imports the Google Cloud client library
import com.google.cloud.translate.Translate;
import com.google.cloud.translate.Translate.TranslateOption;
import com.google.cloud.translate.TranslateOptions;
import com.google.cloud.translate.Translation;


public class GoogleToEnglishTranslator implements Translator {

    private Translate translate = TranslateOptions.getDefaultInstance().getService();

    @Override
    public String transform(String in) {
        return translate.translate(in, TranslateOption.targetLanguage("en")).getModel();
    }
}
