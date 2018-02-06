package com.ixeption.ml.stamp.api;

import com.ixeption.ml.stamp.translate.Translator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
}
