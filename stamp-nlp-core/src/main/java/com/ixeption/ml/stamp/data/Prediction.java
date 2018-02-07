package com.ixeption.ml.stamp.data;

public class Prediction {
    private final int label;
    private final double[] posteriori;

    public Prediction(int label, double[] posteriori) {
        this.label = label;
        this.posteriori = posteriori;
    }
}
