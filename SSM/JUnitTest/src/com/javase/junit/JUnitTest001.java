package com.javase.junit;

import org.junit.Test;

//JUnit模式下，右击方法名可单独测试该方法
public class JUnitTest001 {

	
	@Test
	public void doSome() {
		System.out.println("doSome execute!");
	}
	
	@Test
	public void doOther() {
		System.out.println("doOther execute!");
	}
}
