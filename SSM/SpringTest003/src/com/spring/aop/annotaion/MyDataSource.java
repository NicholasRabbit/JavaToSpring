package com.spring.aop.annotaion;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(value = ElementType.METHOD)
public @interface MyDataSource {
    String value() default "";
    int num();
}
