package com.javase.file02;

import com.javase.file01.User;
public class User001 extends User {
    
    public void method(){
	
	   System.out.println("User001��method�������");
	   this.protectedData=100;    //protected���ε����ԣ������ȣ���ͬ����������Է��ʡ�
	   System.out.println(this.protectedData); 

	   //this.defaultData=20;     //default���ε��޷��ڲ�ͬ���·��ʡ�
	   //this.privateData=23;     //private���ε�ֻ���ڱ����з��ʡ�
	}
	
}