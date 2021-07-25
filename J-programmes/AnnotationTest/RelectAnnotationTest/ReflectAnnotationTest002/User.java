package com.javase.annotation;

public class User {

	@MyAnno(name="Tom")
	public void methodOfUser (int i,String name){
		System.out.println("methodOfUser execute.");
	}
}