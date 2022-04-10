package com.springframe.transaction.trans01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springframe.transaction.trans01.dao.BookDaoInterface;

@Service
public class BookService implements BookServiceInterface {
	
	@Autowired
	BookDaoInterface bookDao;
	
	@Override
	public void purchase() {
		Integer price=bookDao.bookPrice(1,1001);
		System.out.println("price==>"+price);
		bookDao.updateStock(1);
		bookDao.updateBalance(price,1001);
		
	}
	
}
