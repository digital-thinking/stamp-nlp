package com.ixeption.ml.stamp.api;

import com.ixeption.ml.stamp.translate.Translator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/v1")
public class TranslateController {

    @Autowired
    Translator translator;

    @RequestMapping("/translate")
    public String translate(@RequestParam(value="text") String name) {
        return "hallo";
    }
}
