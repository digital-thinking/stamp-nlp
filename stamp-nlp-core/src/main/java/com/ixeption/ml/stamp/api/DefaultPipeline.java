package com.ixeption.ml.stamp.api;

import com.ixeption.ml.stamp.preprocessing.TextTransform;

import java.util.List;


public class DefaultPipeline {

   private List<TextTransform> transformList;

    public static void main(String[] args) {
        DefaultPipeline defaultPipeline = new DefaultPipeline();
        String s  = defaultPipeline.transform("test");
    }

    private String transform(String test) {
        return "TODO";
    }

}
