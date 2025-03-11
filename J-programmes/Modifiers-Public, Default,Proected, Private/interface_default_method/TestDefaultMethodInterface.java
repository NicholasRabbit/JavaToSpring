package com.test.interface_default_method;

public class TestDefaultMethodInterface {

    public static void main(String[] args) {
        TimeClientImpl timeClient = new TimeClientImpl();
        String defaultTimeZone = timeClient.getDefaultTimeZone();
        System.out.println(defaultTimeZone);

    }
}
