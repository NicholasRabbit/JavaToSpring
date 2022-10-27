package com.spring.aop.myaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class MyLogAop2 {

    @Before(value = "@annotation(com.spring.aop.annotaion.MyDataSource)")  //表明指定有@MyDataSource注解的方法
    public void beforeHandler(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        System.out.println("args==>" + Arrays.toString(args));

    }
}
