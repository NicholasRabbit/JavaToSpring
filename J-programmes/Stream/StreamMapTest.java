package com.test.stream.map;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamMapTest {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        /**
         * 使用Arrays的stream().map可以把每次调用方法获取到的结果放到一个IntStream里，
         * 这个IntStream可以转化成数组，数组内包含的是所有返回值。
         * */
        IntStream intStream = Arrays.stream(numbers).map(it -> multiply(it, 10));
        int[] results = intStream.toArray();
        System.out.println(Arrays.toString(results));

    }

    private static int multiply(int i, int j) {
        return i * j;
    }


}
