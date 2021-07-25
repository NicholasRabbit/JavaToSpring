package com.springframe.transaction.trans03_xml.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.springframe.transaction.trans03_xml.service.BookServiceInterface;

@Controller
public class BookController implements BookControllerInterface{

	@Autowired
	BookServiceInterface bookService;
	/*(1)如果BookService实现了BookServiceInterface接口，这里声明变量类型必须是BookServiceInterface，不可是实现类BookService,否则报异常
	 *(2)想要用类来声明变量，那就不要实现接口
	 **/
	
	@Override
	public void buyBook() {
		bookService.purchase();
	}
	
}
