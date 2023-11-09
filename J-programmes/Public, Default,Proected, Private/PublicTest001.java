package com.javase.file01;

import com.javase.file02.User001;
public class PublicTest001 {

    public static void main(String[] args){
	
	    User u1=new User();
		        u1.publicData=11;   //User类里public修饰的属性，方法等哪里都可以访问修改。

				u1.protectedData=12;
				u1.defaultData=22;     //default修饰的数据，可以在同包下访问修改。
				//u1.privateData=30;   //private修饰的数据，无法在其类外部访问，只能在本类中访问。
        
		User001 u2=new User001();
		        u2.method();   
		        
	}

}