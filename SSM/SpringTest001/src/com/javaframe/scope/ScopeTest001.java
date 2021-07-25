package com.javaframe.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//通过在xml配置文件中设置scope属性，来确定bean的作用域,见xml配置文件注释
public class ScopeTest001 {
	public static void main(String[] args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("scope.xml");
		
		//(1)单例模式singleton测试，只允许创建一个bean对象
		Customer c1=app.getBean(Customer.class);
		c1.setAge(25);
		c1.setName("Andy");
		Customer c2=app.getBean(Customer.class);
		c2.setAge(36);
		c2.setName("Duppon");
		System.out.println("c1==>"+c1);
		System.out.println("c2==>"+c2);     
		System.out.println("c1==>"+c1.hashCode());
		System.out.println("c2==>"+c2.hashCode());
	  /*输出结果
	   * c1==>Customer [age=36, name=Duppon]
		 c2==>Customer [age=36, name=Duppon]
		 c1==>2081303229
		 c2==>2081303229
		 说明c2引用重新赋值，把原先c1赋值覆盖了，说明只有一个Customer对象，因此c1,c2中所含的内存地址相同，哈希值相同
		这种就是单例模式
	  */
	  
	   //(2)多例模式prototype，可以创建多个bean对象
		Customer02 c3=app.getBean(Customer02.class);
		c3.setAge(60);
		c3.setName("Niu");
		Customer02 c4=app.getBean(Customer02.class);
		c4.setAge(46);
		c4.setName("Yuan");
		System.out.println("c3==>"+c3+",HashCode==>"+c3.hashCode());  //多例模式，输出结果不同，内存地址也不同，说明有多个对象
		System.out.println("c4==>"+c4+",HashCode==>"+c4.hashCode());
		
		//(3)一次请求创建一个bean对象，后面再学scope=request,session的用法
		/*Customer03 c5=app.getBean(Customer03.class);
		System.out.println("c5==>"+c5);*/
		
		
		
	}
	
}
