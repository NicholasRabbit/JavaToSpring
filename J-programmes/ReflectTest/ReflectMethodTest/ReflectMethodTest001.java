package com.javase.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
/*反射一个类中的单个方法范例：getDeclaredMethd(String name, Class<?>... parametherTypes)
  Class<?>... parametherTypes可变长度参数，可以为空
  这个办法可以得到非公开(protected,defalut,private)的方法
  
  还有一个getDeclaredMethods(..)是复数Methods,返回的是数组，注意区分
*/

public class ReflectMethodTest001 {

	public static void main(String[] args){
	
		Class c=null;
		try{
			
			c=Class.forName("com.javase.reflect.User");
                                                                                   //这里用到了可变长度参数，可以为空
			/*得到方法的第一种办法：调用Class类中 public Method getDeclaredMethd(String name, Class<?>... parametherTypes)
			  返回一个doSome的方法Method对象m1                                              Class有泛型
			  以下为步骤：
			*/
			//获取一个Method对象m1
			Method m1=c.getDeclaredMethod("doSome");
			System.out.println(m1.getName());
			
			//获取m1（代表的doSome()）方法的修饰符，与获取属性Field修饰符的办法一样
			int numModifier=m1.getModifiers();
			String modifiers=Modifier.toString(numModifier);
			System.out.println(numModifier+"代码:"+modifiers);

			//获取返回值类型，得到的是Class类。源码：public Class<?> getReturnType(){},有泛型
			Class returnTypeClass=m1.getReturnType();
			System.out.println(returnTypeClass);

			//获取参数列表，返回值是Class[]数组，源码：public Class<?>[] getParameterTypes()
			//如果没有形参，则返回值是0
			Class[] paraArr=m1.getParameterTypes();
			System.out.println("形参列表数组长度："+paraArr.length);  //doSome()形参列表是空的，所以输出0

			//获取User非公开的方法privateMethod(int i)
			Method  privateMethod=c.getDeclaredMethod("privateMethod",int.class);





		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(NoSuchMethodException | SecurityException e){
			e.printStackTrace();
		}
	}



}