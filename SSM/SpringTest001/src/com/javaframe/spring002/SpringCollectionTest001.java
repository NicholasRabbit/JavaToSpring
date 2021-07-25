package com.javaframe.spring002;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//给对象中List,Map集合类属性复制范例练习，spring实现List接口的类是ArrayList(个人验证)
//标签写法见xml文件
public class SpringCollectionTest001 {
	public static void main(String[] args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("collectionTest.xml");
		
		//List集合内元素是String类型时范例
		Student002 stu10=app.getBean("stu10",Student002.class);
		System.out.println("stu10==>"+stu10);
		
		//List集合内元素是对象时的范例
		Student002 stu11=app.getBean("stu11",Student002.class);
		System.out.println("stu10==>"+stu11);
		
		//Map集合属性范例
		Student002 stu12=app.getBean("stu12",Student002.class);
		System.out.println("stu12==>"+stu12);
		
		/*<util:list>和<util:map>标签的用法范例，见xml文件中解释
		 * */
		Student002 stu13=app.getBean("stu13",Student002.class);
		System.out.println("stu13==>"+stu13);
		
	}
}
