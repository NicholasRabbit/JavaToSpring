package com.ocjp.silver.lambda;

import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {
        /*
        * "Predicate" is a functional interface which represents a predicate, which is boolean, of an argument.
        * (n) -> n % 2 == 0 is a function
        * */
        Predicate<Integer> isEven = (n) -> n % 2 == 0;   // The parentheses could be omitted in "n -> n % 2 == 0";
        /*
        * 1. test(...)
        * It is used to check whether the condition is true or not.
        * */
        boolean test1 = isEven.test(19);
        System.out.println("test1:" + test1);

        Predicate<Person> isOld = n -> n.age > 40;
        Person tom = new Person("Tom", 35);
        boolean test3 = isOld.test(tom);
        System.out.println("Is tom old? " + test3);


        // 2. negate() : to negate the test().
        Predicate<Integer> negate = isEven.negate();
        System.out.println("negate test1: " + negate.test(19));


    }
}

class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
