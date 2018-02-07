package com.ixeption.ml.stamp.backend;

import com.ixeption.ml.stamp.data.Prediction;
import smile.math.SparseArray;

public interface Classifier {

    void train(SparseArray[] features, int[] labels);

    Prediction predict(SparseArray feature);
}
