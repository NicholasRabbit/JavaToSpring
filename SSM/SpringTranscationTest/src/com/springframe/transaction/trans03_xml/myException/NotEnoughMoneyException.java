package com.springframe.transaction.trans03_xml.myException;

public class NotEnoughMoneyException extends RuntimeException{


	public NotEnoughMoneyException() {
		
	}
	
	public NotEnoughMoneyException(String s) {
		super(s);
	}

	
	
}
