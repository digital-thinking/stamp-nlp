package com.ixeption.ml.stamp.backend.impl;

import com.ixeption.ml.stamp.backend.Classifier;
import com.ixeption.ml.stamp.data.Prediction;
import smile.classification.SVM;
import smile.math.SparseArray;
import smile.math.kernel.SparseLinearKernel;

public class SmileSVM implements Classifier {

    private final static double softmarginPenaltyPositive = 0.25;
    private final static double softmarginPenaltyNegative = 0.02;
    private SVM<SparseArray> sparseArraySVM;


    public SmileSVM() {
        sparseArraySVM = new SVM<>(new SparseLinearKernel(), softmarginPenaltyPositive, softmarginPenaltyNegative);
    }

    @Override
    public void train(SparseArray[] features, int[] labels) {
        sparseArraySVM.learn(features, labels);
        sparseArraySVM.finish();
        sparseArraySVM.trainPlattScaling(features, labels);
    }

    @Override
    public Prediction predict(SparseArray feature) {
        double[] posteriori = new double[2];
        int predict = sparseArraySVM.predict(feature, posteriori);
        return new Prediction(predict, posteriori);
    }
}
