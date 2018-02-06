module stamp.api {
    requires spring.beans;
    requires spring.web;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires java.sql;

    requires stamp.core;
    uses com.ixeption.ml.stamp.translate.Translator;

    exports com.ixeption.ml.stamp.api;
    opens com.ixeption.ml.stamp.api to spring.core;

}
