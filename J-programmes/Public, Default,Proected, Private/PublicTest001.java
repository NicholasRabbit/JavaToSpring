package com.javase.file01;

import com.javase.file02.User001;
public class PublicTest001 {

    public static void main(String[] args){
	
	    User u1=new User();
		        u1.publicData=11;   //User����public���ε����ԣ����������ﶼ���Է����޸ġ�

				u1.protectedData=12;
				u1.defaultData=22;     //default���ε����ݣ�������ͬ���·����޸ġ�
				//u1.privateData=30;   //private���ε����ݣ��޷��������ⲿ���ʣ�ֻ���ڱ����з��ʡ�
        
		User001 u2=new User001();
		        u2.method();   
		        
	}

}