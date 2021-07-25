package com.springframe.transaction.trans01.myException;

public class NotEnoughBookException extends RuntimeException{
	public NotEnoughBookException () {
		
	}
	public NotEnoughBookException (String s) {
		super(s);
	}
}
