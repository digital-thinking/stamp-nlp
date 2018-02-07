module stamp.core {
    requires transitive smile.math;
    requires smile.core;

    exports com.ixeption.ml.stamp.translate;
    exports com.ixeption.ml.stamp.backend;
    exports com.ixeption.ml.stamp.data;

    provides com.ixeption.ml.stamp.backend.Classifier with com.ixeption.ml.stamp.backend.impl.SmileSVM;

}