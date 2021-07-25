package com.springframe.transaction.trans01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springframe.transaction.trans01.controller.BookController;
import com.springframe.transaction.trans01.controller.BookControllerInterface;

/*本代码先演示没有开启事务机制的方式，数据库书本库存数据会出现问题
 * 如果不开启事务，当用户买一本书，钱不够时，其账户余额并没有减少，但是updateStock(..)方法已执行，库存却减少了，不符合事务的一致性要求
 * 三层代码的书写顺序，DAO层==>Service层==>Controller层，这样写起来逻辑通顺
 * */
public class SpringTransactionTest001 {
	
	public static void main(String[] args) {
		
		ApplicationContext  app=new ClassPathXmlApplicationContext("transaction01.xml");
		BookControllerInterface bookController=app.getBean("bookController",BookControllerInterface.class);   //这里可写接口名.class, BookServiceInterface.class,兼容其实现类
		bookController.buyBook();                          //@Controller注解的对象的默认id是其类名的首字母改为小写
	}
}
