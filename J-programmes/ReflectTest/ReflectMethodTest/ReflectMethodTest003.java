/*重点，利用反射机制调用一个类User的方法,首先这个类User必须先实例化
  注意静态方法，实方法都可以用 Method类里的方法public Object invoke(Object obj,Object... args)调用，本例obj是一个User类对象
  只不过调用静态方法时obj=null,没有影响，这是可变参数方法，obj后面可以无参数
  因为Object... args时引用数据类型，所以基本数据类型int,byte等会自动转换为相应包装类Integer,Byte
*/

package com.javase.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

public class ReflectMethodTest003 {

	public static void main(String[] args){
		
		Class userClass=null;

		try{
		   //获取类
		   userClass=Class.forName("com.javase.reflect.User");   //forName()方法有泛型机制
		  
		   //实例化类，得到对象
		   Object obj=userClass.newInstance();

		   //(1)先调用静态方法doSome(),无参方法
		   Method doSome=userClass.getDeclaredMethod("doSome");  
		   doSome.invoke(obj);   //invoke(Object obj,Object... args) obj后面没有参数就不写

		   //(2)调用实例方法method01(String name, double weight);
		   Method method01=userClass.getDeclaredMethod("method01",String.class,double.class);  //注意getDeclaredMethod( String name, Class<?>... parameterTypes)
		   method01.invoke(obj,"Tom",70.50);                          //括号内参数要写全，写上形参类型，否则同名方法无法区分重载，不能只写方法名，报错
		   
		   //(3)非公开的方法可以获取并调用，注意invoke(Object obj,Object... args)参数args时引用数据类型
		   //因此原方法的byte要转换为包装类Byte调用
		   Method protectedMethod=userClass.getDeclaredMethod("protectedMethod",byte.class);
		   Byte bb2=12;  //自动打包
		   protectedMethod.invoke(obj,bb2);  

		}catch(ClassNotFoundException e){
		   e.printStackTrace();	
		}catch(InstantiationException | IllegalAccessException e){
		   e.printStackTrace();	
		}catch(NoSuchMethodException | SecurityException e){
		   e.printStackTrace();	
		}catch(IllegalArgumentException | InvocationTargetException e){
		   e.printStackTrace();	
		}
	}

}