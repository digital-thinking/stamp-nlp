module stamp.api {
    requires spring.beans;
    requires spring.web;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires java.sql;

    requires stamp.core;

    exports com.ixeption.ml.stamp.api;
    opens com.ixeption.ml.stamp.api to spring.core;

}