package com.test.interface_default_method;

public interface TimeClient {

    public abstract String getTime();

    // A default method can be declared in an interface.
    default String getDefaultTimeZone() {
        return "GMT+8";
    }



}
