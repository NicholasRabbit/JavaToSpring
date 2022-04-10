package com.springframe.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(0)
public class MyLogAop02 {
	
	@Before(value="execution(public int com.springframe.aop.Caculator.divide(int,int))")
	public void beforeHander02() {
		System.out.println("MyLogAop02==>前置通知");
	}
}
