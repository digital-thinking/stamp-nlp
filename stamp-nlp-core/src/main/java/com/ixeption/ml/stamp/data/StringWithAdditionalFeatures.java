package com.ixeption.ml.stamp.data;

import java.util.List;


public class StringWithAdditionalFeatures implements DataPoint{

    private final String text;
    private final List<Feature> features;

    public StringWithAdditionalFeatures(String text, List<Feature> features) {
        this.text = text;
        this.features = features;
    }

    @Override
    public double[] getFeatureVector() {
        return new double[0];
    }
}
