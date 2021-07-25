package com.springframe.transaction.trans02.checkout;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.springframe.transaction.trans02.dao.BookDaoInterface;
import com.springframe.transaction.trans02.service.BookServiceInterface;

//通过本代码来研究事务的传播性，即@Transactional注解内propagation属性的使用方法
@Component
public class CheckoutLayer {
	
	@Autowired
	BookServiceInterface bookService;    //这里声明BookService类型变量，下面要调用它的对象的方法，注意这里不能直接掉BookDao里的方法，因为他们都没有注解@Transactional,即没有开启事务
	
	/*@Transactional(propagation=..)propagation:定义事务的传播性，如果不写，其默认值是Propagation.REQUIRED，即有传播性
	 * 设置在被调用的方法上,即BookService里的buyBook(..)上,不是这里的checkout()方法
	 * =Propagation.REQUIRES_NEW表示不具有传播性 
	 * */
	/*如果这个方法不加@Transactional的话，不开启事务，即只有BookService中purchase(..)方法加，
	 *那么如果买两本书，但余额只够买一本，就会发生只能买一本，库存也相应减少一本，余额减去一本的价格，这与实际购物情况不符，实际要买都买，不买都不买
	 *因此须在checkout()方法上加@Transactional,也开启事务，事务会传播到被调用的BookService中purchase(..)方法，即有了传播性，就不会发生只买一本的情况
	 */
	@Transactional
	public void checkout() {
		//这里指定1001的用户一次买两本书，但是余额只够一本
		List<Integer>  bids=new ArrayList<>();
		bids.add(1);
		bids.add(2);
		Integer pid=1001;
		for(int i=0;i<bids.size();i++) {
			Integer bid=bids.get(i);
			bookService.purchase(bid,pid);  
		}
	}
}
