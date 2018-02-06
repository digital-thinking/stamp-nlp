package com.ixeption.ml.stamp.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/v1")
public class TranslateController {




    @RequestMapping("/translate")
    public String translate(@RequestParam(value="text") String name) {
        return "hallo";
    }
}
