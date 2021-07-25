package com.javaframe.factory_bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class FactoryBeanTest001 {
	
	public static void main(String[] args) {
		
		ApplicationContext app=new ClassPathXmlApplicationContext("factory_bean.xml");

		/*(1)这里获取的f01表示的是Factory对象，而下面输出的却是car对象, 因为Factory类实现了FactoryBean接口，重写了getObject()方法，所有从工厂里获得了汽车
		  (2)这种java设计模式属于工厂设计模式
		  (3)注意FactoryBean和BeanFactory是两个不用的接口，注意区分
	     */
		Object obj=app.getBean("f01");  
		System.out.println(obj);       //输出：Car [brand=Toyota, make=Crown, litre=2.5]
	}
	

}
