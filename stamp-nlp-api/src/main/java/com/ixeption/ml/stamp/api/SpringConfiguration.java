package com.ixeption.ml.stamp.api;

import com.ixeption.ml.stamp.backend.Classifier;
import com.ixeption.ml.stamp.translate.Translator;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Optional;
import java.util.ServiceLoader;

@Configuration
public class SpringConfiguration {

    @Bean
    public Translator TranslatorServiceLoaderFactory() {
        ServiceLoader<Translator> translators = ServiceLoader.load(Translator.class);
        Optional<Translator> first = translators.findFirst();
        return first.orElseThrow(RuntimeException::new);
    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Classifier ClassifierServiceLoaderFactory() {
        ServiceLoader<Classifier> classifier = ServiceLoader.load(Classifier.class);
        Optional<Classifier> first = classifier.findFirst();
        return first.orElseThrow(RuntimeException::new);
    }


}
