package com.ixeption.ml.stamp.api;

import com.ixeption.ml.stamp.translate.Translator;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.Assert.assertEquals;


@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = SpringConfiguration.class)
public class SampleTest {
    @Autowired
    Translator translator;

    @Test
    public void myFirstTest() {
        assertEquals(translator.transform("whatever"), "test");

    }

}