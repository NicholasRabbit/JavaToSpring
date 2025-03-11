package com.test.interface_default_method;

import java.util.Date;


/**
 * Excerpt from the official documentation.
 *
 * The section Interfaces describes an example that involves manufacturers of computer-controlled
 * cars who publish industry-standard interfaces that describe which methods can be invoked to operate their cars.
 * What if those computer-controlled car manufacturers add new functionality, such as flight, to their cars?
 * These manufacturers would need to specify new methods to enable other companies (such as electronic guidance
 * instrument manufacturers) to adapt their software to flying cars. Where would these car manufacturers declare these
 * new flight-related methods? If they add them to their original interfaces, then programmers who have implemented
 * those interfaces would have to rewrite their implementations. If they add them as static methods, then programmers
 * would regard them as utility methods, not as essential, core methods.
 *
 * Default methods enable you to add new functionality to the interfaces of your libraries and ensure binary
 * compatibility with code written for older versions of those interfaces.
 *
 * Paraphrase:
 * If you want to declare a method in an interface, all its implementations should be modified in order to implement
 * the new method. Whereas, you can declare a default method(a concrete method) which is not need to be implemented
 * by its subclasses.
 *
 * https://docs.oracle.com/javase/tutorial/java/IandI/defaultmethods.html
 * */

public class TimeClientImpl implements TimeClient{
    @Override
    public String getTime() {
        return new Date().toString();
    }



}
