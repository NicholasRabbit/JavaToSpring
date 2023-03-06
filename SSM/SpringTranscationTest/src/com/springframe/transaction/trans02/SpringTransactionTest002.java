package com.springframe.transaction.trans02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springframe.transaction.trans02.checkout.CheckoutLayer;
import com.springframe.transaction.trans02.controller.BookControllerInterface;



/*使用@Transactional开启事务，避免tran01包内程序出现的书籍库存数据错误的情况
 * (1)@Transactional在方法上使用只对所在方法有效果，在类上使用则对类中所有方法有效果
 * (2)如果类和方法上都有的话，则采取就近原则，即方法上的@Transactional有作用，离得近
 * (3)事务注解@Transactional常用属性
 * 	   <1>propagation:决定事务是否具有传播性,其值是枚举Propagation的形式，详见CheckOut.java代码内分析
 * 		   =Propagation.REQUIRED，   设置事务具有传播性
 * 		   =Propagation.REQUIRES_NEW,  设置事务不具有传播性，即事务只对当前方法作用，不对其调用的方法起作用
 *     		注意这里是REQUIRES
 *     <2>isolation=1/2/4/8,int类型事务的隔离级别，从前到后依次是
 *     	  1：读未提交，即脏读
 *        2：读已提交，不可重复度
 *        4：可重复度，即幻读，MySQL默认级别
 *        8：串行化，线程安全，但是性能低，反应慢
 *     <3>timeout=5,int类型，单位是秒，设置事务强制回滚之前等待的时间.(timeout需和REQUIRES_NEW连用(个人总结,待验证))
 * 	   <4>readonly:在不管事务有无写入数据的情况下，设置为只读，一旦设置为只读，则MySQL在收到请求访问数据时都不加锁
 *  			        建议：如果设计到写的操作，切不可设置为只读readonly。
 *     <5>rollbackfor={..}，表示当前事务为指定的异常回滚，别的不回滚，赋值必须是异常类Exception.class数组
 * 		  noRollbackfor={..},表示不为指定异常回滚，发生这个异常不回滚,noRollbackFor需和REQUIRES_NEW连用(个人总结,待验证)
 *        rollbackforClassName,norollbackforClassName,与以上的作用一样，只是赋值只写写异常名，不加".class".
 * (4)@Transactional注解一般不要加在Controller层
 * 注意以上属性都在BookService.java里的方法buyBook(..)上,不是Checkout.java里
 * 结合CheckOut.java,BookService.java内使用的@Transactional理解
 * */     
public class SpringTransactionTest002 {
	
	public static void main(String[] args) {
		
		ApplicationContext  app=new ClassPathXmlApplicationContext("transaction02.xml");
		
		//一次只买一本书
		//BookControllerInterface bookController=app.getBean("bookController",BookControllerInterface.class);   //这里可写接口名.class, BookServiceInterface.class,兼容其实现类
		//bookController.buyBook(1,1001);                          //@Controller注解的对象的默认id是其类名的首字母改为小写
		
		//一次买两本数的情况
		CheckoutLayer checkout=app.getBean("checkoutLayer",CheckoutLayer.class);
		checkout.checkout();
	}
}
