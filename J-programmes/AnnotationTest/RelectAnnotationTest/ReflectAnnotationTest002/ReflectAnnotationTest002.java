//反射一个方法上的注解

package com.javase.annotation;

import java.lang.reflect.Method;

public class ReflectAnnotationTest002 {

	public static void main(String[] args){
	
		Class c=null;
		try{
			c=Class.forName("com.javase.annotation.User");
			
			//调用getDeclaredMethod(String name,Class..)获取方法时，括号内第一个参数时方法名，后面才是实参列表。                                     
			Method userMethod=c.getDeclaredMethod("methodOfUser",int.class,String.class);
			
			if(userMethod.isAnnotationPresent(MyAnno.class)){
				MyAnno ma=(MyAnno)userMethod.getAnnotation(MyAnno.class);
				String name=ma.name();
				System.out.println("注解内name()属性值:"+name);
			}
			

		}catch(ClassNotFoundException e){
		    e.printStackTrace(); 
		}catch(NoSuchMethodException | SecurityException e){
			e.printStackTrace();
		}
	
	}

}