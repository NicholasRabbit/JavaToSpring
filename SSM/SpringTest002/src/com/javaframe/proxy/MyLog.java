package com.javaframe.proxy;

public class MyLog {
	      
	public static void beforeHandler(String methodName,String numbers) {   //numbers是要进行运算的数
		System.out.println("运算方法："+methodName+"，算数: "+numbers);
	}
	
	public static void afterHandler(String methodName,Object result) {  //result要用Object类型，因为MyHandler.java中方法invoke(..)返回值，即计算结果是Object类型
		System.out.println("运算方法: "+methodName+"，结果==>"+result);
	}
}
