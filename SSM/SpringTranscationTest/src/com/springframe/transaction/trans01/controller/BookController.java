package com.springframe.transaction.trans01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.springframe.transaction.trans01.service.BookServiceInterface;

@Controller
public class BookController implements BookControllerInterface{

	@Autowired
	BookServiceInterface bookService;
	
	@Override
	public void buyBook() {
		bookService.purchase();
	}
	
}
