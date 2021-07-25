package com.javase.annotation;

import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;


//@Target(value={ElementType.method})   //Target 注解的属性是一个数组，其中只有一个属性并且名字为value，可省略value
@Target(ElementType.METHOD)     //如果数组只有一个元素，大括号也可省略

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
 
    String name();
}