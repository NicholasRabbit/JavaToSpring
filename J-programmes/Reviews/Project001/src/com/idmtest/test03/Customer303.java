package com.idmtest.test03;

public class Customer303 {
    
	private int age;
    public void setAge(int a) {
    	if(a<0||a>150) {
    		System.out.println("输入参数错误，请检查！");
    		return;
    	}
    	age=a;
    	
    }
    public int getAge() {
    	return age;
    }
}
