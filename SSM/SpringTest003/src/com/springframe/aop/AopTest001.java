package com.springframe.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*(1)Spring框架通过Java的AspectJ实现AOP范例,
 *(2)AspectJ是java中一个流行的AOP框架，主要是通过注解的方式实现的动态代理，进而实现切面编程AOP
 *(3)Spring实现AOP，还得用到IOC,因为要通过反射读取相关目标类，动态代理类等等，由此可知IOC是Spring的核心
 *(4)AOP各阶段通知见MyLogAop.java内注释
 * */
public class AopTest001 {
	
	public static void main(String[] args) {
		
		ApplicationContext app=new ClassPathXmlApplicationContext("aop.xml");
		CaculatorInterface cacu=app.getBean("cacu",CaculatorInterface.class);   //这里需写成:接口名.class，写Caculator.class报错，因为动态代理生成的是接口的实现类
		int result=cacu.divide(20,5);         
		System.out.println("cacu==>"+cacu);   //这里cacu实际还是Caculator对象，但通过配置Spring框架已经把AOP机制通过动态代理实现了，即前置通知后置通知都可输出 
		System.out.println("result==>"+result);
		
		System.out.println("Caculator02=========================");
		/*Caculator02.java没有继承任何接口，但Spring框架还是为其配置AOP，并执行了动态代理，输出前置通知，后置通知等等
		  因为它有个父类是Object，并且aop.xml文件中也启用了AOP切面编程机制。   */
		Caculator02 cacu02=app.getBean("caculator02",Caculator02.class);
		cacu02.doSome("immemorial time");    
	}
}
