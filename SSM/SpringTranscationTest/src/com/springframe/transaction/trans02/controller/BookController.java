package com.springframe.transaction.trans02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.springframe.transaction.trans02.service.BookServiceInterface;

@Controller
public class BookController implements BookControllerInterface{

	@Autowired
	BookServiceInterface bookService;
	
	@Override
	public void buyBook(Integer bid,Integer pid) {
		bookService.purchase(bid,pid);
	}
	
}
