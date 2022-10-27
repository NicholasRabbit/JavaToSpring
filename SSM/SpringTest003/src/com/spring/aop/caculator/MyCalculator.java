package com.spring.aop.caculator;

import com.spring.aop.annotaion.MyDataSource;
import org.springframework.stereotype.Component;

@Component
public class MyCalculator implements CalculatorInterface {
    @Override
    public int add(int i, int j) {
        System.out.println( i + "+" + j + "=" + (i + j));
        return 0;
    }

    @Override
    @MyDataSource(value = "slave1",num = 10)
    public int subtract(int i, int j) {
        return i - j;
    }
}
