package com.javase.reflect;

import java.io.File;

public class ReflectTest004 {

	public static void main(String[] args){
		
		//User u=new User();

		try{
			/* ��������˰����ƣ������User.class�����˴ӵ�ǰcmd����Ŀ¼�¿�ʼcom/javase/reflece/��
			   һ��cmd��srcĿ¼������ReflectTest004�ļ����൱��src�������������forName(..)����������������·����
			   �����·������src��Ŀ¼��ʼ:com.javase.reflect.ReflectTest004
               ע����srcĿ¼������java������������дȫ����������java  com.javase.reflect.ReflectTest004�����򱨴�			
			*/
			
			//forName()����������User��̬������ִ��,���޲ι��췽������ִ��
			//������ֻ��ִ��һ����ľ�̬������ʹ��forName()���ַ�����ͨ���õ�һ���ֽ���ķ�ʽֻ��static��̬�����ִ��
			Class c1=Class.forName("com.javase.reflect.User");

			Object obj=c1.newInstance();  //Class�����newInstance()����ִ��ȴ�������User���޲ι��췽������Ϊ���ﴴ�����¶���
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(InstantiationException | IllegalAccessException e){
			e.printStackTrace();
		}

		
	}
	
	

}