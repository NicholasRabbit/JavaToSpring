package com.test.optional;

import com.test.optional.pojo.Computer;

import java.util.Optional;

/**
 * The official documentation.
 * https://www.oracle.com/technical-resources/articles/java/java8-optional.html
 *
 * What is the "Optional"?
 * It gives a programmer a chance to handle the "NullPointerException" in an API.
 * The purpose of it is not to replace all the null value but rather to help design
 * better APIs in which-just by reading the signature of a method-users can know what
 * they can expect from the "Optional".
 * */
public class OptionalTest {

    public static void main(String[] args) {

        Computer computer = new Computer();
        String version = computer.getSoundCard().getUsb().getVersion();
        

    }

}


