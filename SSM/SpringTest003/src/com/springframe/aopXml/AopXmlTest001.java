package com.springframe.aopXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*不使用AspectJ注解，使用配置xml文件的方式执行AOP
 * 
 * */

public class AopXmlTest001 {
	
	public static void main(String[] args) {
		
		ApplicationContext  app=new ClassPathXmlApplicationContext("aopXml.xml");
		CaculatorInterface cacu=app.getBean("caculator",CaculatorInterface.class);
		int result=cacu.plus(13, 16);
		System.out.println(result);
	}
}
