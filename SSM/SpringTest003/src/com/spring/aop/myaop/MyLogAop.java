package com.spring.aop.myaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class MyLogAop {

    @Before(value = "execution(public int com.spring.aop.caculator.MyCalculator.add(int,int))")
    //@Before(value = "execution(public int com.spring.aop.caculator.MyCalculator.*(..))")
    public void beforeHandler(JoinPoint joinPoint){
        System.out.println("joinPoint==> " + joinPoint);
        Object[] args = joinPoint.getArgs();
        System.out.println("args==>" + Arrays.toString(args));
        Signature sig = joinPoint.getSignature();
        String name = sig.getName();
        System.out.println("method name==>" + name + ",args==>" + Arrays.toString(args));




    }
}
