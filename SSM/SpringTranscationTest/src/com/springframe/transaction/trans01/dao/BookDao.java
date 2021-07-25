package com.springframe.transaction.trans01.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springframe.transaction.trans01.myException.NotEnoughBookException;
import com.springframe.transaction.trans01.myException.NotEnoughMoneyException;

@Repository
public class BookDao implements BookDaoInterface{
	
	@Autowired
	JdbcTemplate jtp;
	
	public Integer bookPrice(Integer bid,Integer pid) {
		//获取价格
		String sql01="select price from t_price where bid=?";
		Object[] objs=new Object[] {bid};   		//第三种声明一维数组的方法
		Integer price=jtp.queryForObject(sql01,objs,Integer.class);
		return price;
	}

	public void updateStock(Integer bid) {
		String sql02="select stock from t_book where bid=?";
		Object[] objs=new Object[] {bid};
		int stock=jtp.queryForObject(sql02,objs,Integer.class);    //这里存在自动打包拆包
		if(stock <= 0) {
			throw new NotEnoughBookException("There isn't enough book in stock.");
		}
		stock-=1;
		String sql03="update t_book set stock=? where bid=?";
		jtp.update(sql03, stock,bid);      //这里使用JdbcTemplate.java里的update(String sql, Object.. args)，注意第二个不定长度参数的用法
	}

	public void updateBalance(Integer price,Integer pid) {
				//获取用户余额，看是否购买的了书
				String sql11="select balance from t_purchaser where pid=?";
				Object[] objs2= {pid};     				//数组内只有一个元素
				Integer balance=jtp.queryForObject(sql11, objs2,Integer.class );
				System.out.println("balance==>"+balance);
				
				//进行判断
				if(balance < price) {
					throw new NotEnoughMoneyException("You don't have enough money,madam or sir.");  //余额不足时，自定义异常，要继承运行时异常，最好别继承编译时异常父类Exception，还得抛出
				}else {
					balance=balance-price;
					String sql13="update t_purchaser set balance=? where pid=?";
					jtp.update(sql13, balance,pid);   
				}
	}
	
	
}
