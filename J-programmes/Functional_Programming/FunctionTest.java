package com.test.function;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Functional programming in Java.
 * The "functional programming" has been incorporated since Java 8.
 * */
public class FunctionTest {

    public static void main(String[] args) {
        lambdaAndFunction();
        stream();
        higherOrder();
        methodReferences();
        pureFunction();

    }

    /**
     * 1, Lambda expressions and functional interfaces.
     * */
    public static void lambdaAndFunction() {
        // The traditional way.
        Function<Integer, Integer> f1 = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return  x * x;
            }
        };
        System.out.println("traditional way; " +  f1.apply(3));

        // The lambda expression way
        Function<Integer, Integer> f2 = x -> x * x;
        System.out.println("lambda way: " +  f2.apply(5));

    }

    /**
     * 2, Using "stream" for data processing.
     * */
    public static void stream() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        // 2.1 Imperative way(traditional way).
        List<Integer> newList = new ArrayList<>();
        for (Integer i : list) {
            if (i % 2 == 0)
                newList.add(i * 2);
        }
        System.out.println("imperative way==> " + newList);

        // 2.2 Functional way with using streams.
        List<Integer> collect = list.stream()
                .filter(num -> num % 2 == 0)
                .map(num -> num * 2)
                .collect(Collectors.toList());
        System.out.println("functional way==>" + collect);

    }

    /**
     * 3, Higher order function.
     * In essence, treating functions as arguments, and the return value is also a function(method).
     * */
    public static void higherOrder() {
        // 3.1 The arguments are addOne and multiplyTwo which are all methods(functions);
        Function<Integer, Integer> addOne =  x -> x + 1;
        Function<Integer, Integer> multiplyTwo = x -> x * 2;

        // 3.2 The return value is addOneAndMultiplyTwo which is also a method or a function.
        Function<Integer, Integer> addOneAndMultiplyTwo = combineFunctions(addOne, multiplyTwo);
        Integer result = addOneAndMultiplyTwo.apply(5);
        System.out.println("higher order function ==> " + result);


    }

    private static <T, R> Function<T, R> combineFunctions(Function<T, R> f1, Function<T, R> f2) {
        return x -> f2.apply((T) f1.apply(x));
    }

    /**
     * 4, Method references.
     * */
    public static void methodReferences() {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        // 4.1 The traditional way.
        // for (...)

        // 4.2 The lambda way.
        list.forEach(e -> System.out.println("4-lambda way==>" + e));

        // 4.3 The method references way.
        list.forEach(System.out::println);

    }

    /**
     * 5, Pure function.
     * It is about the mutability and immutability of variables.
     * See: https://www.geeksforgeeks.org/functional-programming-in-java-with-examples/
     * */
    public static void pureFunction() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        int result = 0;
        // 5.1 In the following code we are muting the variable "result" again and again. So mutability is one of the
        // biggest issue in an imperative style of coding.
        for (Integer i : list) {
            if (i % 2 == 0)
                result += i * 2;
        }
        System.out.println("imperative and mutable way ==> " + result);

        // 5.2 Immutable way.
        // (..) is called Closure where the variables are immutable.
        int factor = 2;
        int sum = list.stream()
                .filter(e -> e % 2 == 0)
                .mapToInt(e -> e * factor)
                .sum();
        System.out.println("immutable way==>" + sum);

        // The "factor" is immutable.
        // If this line of code is not commented there would be an exception.
        // factor = 3;
    }

    /**
     * From the above code, we are not mutating any variable.
     * Instead, we are transforming the data from one function to another.
     * This is another difference between Imperative and Declarative.
     * Not only this but also in the above code of declarative style,
     * every function is a pure function and pure functions don’t have side effects.
     * In the above example, we are doubling the number with a factor 2,
     * that is called Closure. Remember, lambdas are stateless and closure has immutable state.
     * It means in any circumstances, the closure could not be mutable. Let’s understand it with an example.
     * Here we will declare a variable factor and will use inside a function as below.
     * */



}
