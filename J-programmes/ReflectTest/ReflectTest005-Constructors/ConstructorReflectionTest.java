package com.tdd.practice;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;

public class ConstructorReflectionTest {

    /**
     * Reflecting constructors.
     *
     * */
    public static void main(String[] args) {
        // Getting the class file.
        Class<User> userClass = User.class;
        // 1, How many constructors does User have?
        Constructor<?>[] constructors = userClass.getConstructors();
        System.out.println("The number of constructors is " + constructors.length);
        // 2, The order of constructors is as same as the order in the source.
        for (Constructor c : constructors) {
            System.out.println(c.getParameters().length);
        }
        // 3, Get parameters of each constructor.
        for (Constructor c : constructors) {
            Parameter[] parameters = c.getParameters();
            System.out.println(parameters);
        }

        // 4, newInstance
        Constructor<?> c = constructors[2];  // The third constructor.
        try {
            User tom = (User)c.newInstance(1, "Tom");
            System.out.println(tom);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }




}


