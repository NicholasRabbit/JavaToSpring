//package�﷨��ϰ��package�����������Чִ�г���ĵ�һ�䣬ǰ�������ע�͡�
package com.javase.file01; 

import com.javase.file02.User302;

public class PackageTest301 {

    
    public static void main(String[] args){
	
	     PackageTest301.method01();

		 User301 u1=new User301();
		         u1.UserMethod();
         
		 com.javase.file02.User302 u2=new com.javase.file02.User302();  
		 //User302��class�ļ���file02�ڣ�����PackageTest301.class��ͬһ���ļ�����´��������������д�� 
		 
		 User302 u3=new User302();
        
	}

	public static void method01(){
	
	    System.out.println("method01��ӡ���");
	}

}

