//����һ�������ϵ�ע��

package com.javase.annotation;

import java.lang.reflect.Method;

public class ReflectAnnotationTest002 {

	public static void main(String[] args){
	
		Class c=null;
		try{
			c=Class.forName("com.javase.annotation.User");
			
			//����getDeclaredMethod(String name,Class..)��ȡ����ʱ�������ڵ�һ������ʱ���������������ʵ���б�                                     
			Method userMethod=c.getDeclaredMethod("methodOfUser",int.class,String.class);
			
			if(userMethod.isAnnotationPresent(MyAnno.class)){
				MyAnno ma=(MyAnno)userMethod.getAnnotation(MyAnno.class);
				String name=ma.name();
				System.out.println("ע����name()����ֵ:"+name);
			}
			

		}catch(ClassNotFoundException e){
		    e.printStackTrace(); 
		}catch(NoSuchMethodException | SecurityException e){
			e.printStackTrace();
		}
	
	}

}