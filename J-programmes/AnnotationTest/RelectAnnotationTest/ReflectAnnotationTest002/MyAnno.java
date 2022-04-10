package com.javase.annotation;

import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;


//@Target(value={ElementType.method})   //Target ע���������һ�����飬����ֻ��һ�����Բ�������Ϊvalue����ʡ��value
@Target(ElementType.METHOD)     //�������ֻ��һ��Ԫ�أ�������Ҳ��ʡ��

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
 
    String name();
}