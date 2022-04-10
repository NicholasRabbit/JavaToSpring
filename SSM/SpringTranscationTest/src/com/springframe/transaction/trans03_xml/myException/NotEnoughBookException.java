package com.springframe.transaction.trans03_xml.myException;

public class NotEnoughBookException extends RuntimeException{
	public NotEnoughBookException () {
		
	}
	public NotEnoughBookException (String s) {
		super(s);
	}
}
