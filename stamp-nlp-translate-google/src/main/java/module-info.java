module stamp.translate.google {
    requires stamp.core;
    requires google.cloud.translate;

    provides com.ixeption.ml.stamp.translate.Translator with com.ixeption.ml.stamp.translate.impl.GoogleToEnglishTranslator;
    exports com.ixeption.ml.stamp.translate.impl;
}