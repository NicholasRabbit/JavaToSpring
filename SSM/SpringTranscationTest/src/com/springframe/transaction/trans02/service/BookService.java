package com.springframe.transaction.trans02.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.springframe.transaction.trans02.dao.BookDaoInterface;
import com.springframe.transaction.trans02.myException.NotEnoughMoneyException;

@Service
public class BookService implements BookServiceInterface {
	
	@Autowired
	BookDaoInterface bookDao;
	
	/*(1)@Transactional(propagation=..)propagation:定义事务的传播性，如果不写，其默认值是Propagation.REQUIRED，即有传播性
	 * 设置在被调用的方法上,即这里的BookService里的buyBook(..)上,不是CheckOut.java里的方法
	 * =Propagation.REQUIRES_NEW表示不具有传播性 
	 *(2)noRollbackFor需和REQUIRES_NEW连用(个人总结,待验证)
	 *(3)timeout需和REQUIRES_NEW连用(个人总结,待验证),当赋值时REQUIRES_NEW时,timeout超时后才报异常
	 * */
	
	/*只要在这里开启事务机制，则不会发生买不成书库存减少的情况，因为事务机制下purchase(..)里的方法要失败都失败，必须具有一致性。
	 * */
	//@Transaction        
	@Transactional(propagation=Propagation.REQUIRES_NEW, timeout=2,noRollbackFor= {NullPointerException.class,NotEnoughMoneyException.class})
	public void purchase(Integer bid,Integer pid) {
		/*try{					         
			Thread.sleep(1000*5);        //程序执行到这里休眠线程5秒,但timeout=2,两秒后事务强制回滚,报异常:TransactionTimedOutException
		}catch(InterruptedException e){	 //当赋值时REQUIRES_NEW时,timeout超时后才报异常
			e.printStackTrace();
		}*/
		Integer price=bookDao.bookPrice(bid,pid);
		System.out.println("price==>"+price);
		bookDao.updateStock(bid);
		bookDao.updateBalance(price,pid);
		
	}
	
}
