package com.springframe.transaction.trans01.myException;

public class NotEnoughMoneyException extends RuntimeException{


	public NotEnoughMoneyException() {
		
	}
	
	public NotEnoughMoneyException(String s) {
		super(s);
	}

	
	
}
