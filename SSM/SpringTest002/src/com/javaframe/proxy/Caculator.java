package com.javaframe.proxy;

public class Caculator implements CaculatorInterface{

	@Override
	public int plus(int i, int j) {
		//System.out.println("加法："+i+"+"+j);   //sout输出日志信息，但写在这里的话，代码太过冗余，因此要用AOP,即切面编程，通过动态代理的方式来完成这部分功能
		return i+j;
	}

	@Override
	public int minus(int i, int j) {
		//System.out.println("减法："+i+"-"+j);
		return i-j;
	}

	@Override
	public int multiple(int i, int j) {
		//System.out.println("乘法："+i+"*"+j);
		return i*j;
	}

	@Override
	public int divide(int i, int j) {
		//System.out.println("除法："+i+"\/"+j);  
		return i/j;
	}
	
}
