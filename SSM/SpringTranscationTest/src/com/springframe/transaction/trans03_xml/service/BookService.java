package com.springframe.transaction.trans03_xml.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springframe.transaction.trans03_xml.dao.BookDao;


@Service
public class BookService implements BookServiceInterface {
	
	@Autowired
	BookDao bookDao;
	

	public void purchase() {
		Integer price=bookDao.bookPrice(1,1001);
		System.out.println("price==>"+price);
		bookDao.updateStock(1);
		bookDao.updateBalance(price,1001);
		
	}
	
}
