package com.springframe.transaction.trans03_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springframe.transaction.trans03_xml.controller.BookController;
import com.springframe.transaction.trans03_xml.controller.BookControllerInterface;

/*用Spring自带的xml方式配置事务
 * */
public class SpringTransactionTest003 {
	
	public static void main(String[] args) {
		
		ApplicationContext  app=new ClassPathXmlApplicationContext("transaction03_xml.xml");
		BookControllerInterface bookController=app.getBean("bookController",BookControllerInterface.class);   
		bookController.buyBook();                          //@Controller注解的对象的默认id是其类名的首字母改为小写
	}
}
