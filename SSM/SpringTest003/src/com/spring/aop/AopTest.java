package com.spring.aop;

import com.spring.aop.caculator.CalculatorInterface;
import com.spring.aop.caculator.MyCalculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/*
指定注解进行切面编程范例
*/
public class AopTest {

    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("aop.xml");
        CalculatorInterface myCalculator = app.getBean("myCalculator", CalculatorInterface.class);   //默认id是类的名字头字母小写
        System.out.println("myCalcu==>" + myCalculator);
        myCalculator.add(10,20);
        System.out.println("==============================");

        myCalculator.subtract(5,3);

    }
}
