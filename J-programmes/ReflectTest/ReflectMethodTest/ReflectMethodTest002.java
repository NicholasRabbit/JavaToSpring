//在ReflectMethodTest001的基础上，练习可以返回Method[]数组的范例,即返回全部的方法 
//两种方式：getMethods();  getDeclaredMethods();   注意这两种方式的区别
//两种方式得到的元素方法都没有一定的顺序，即不是按照源程序中的顺序来输出的

package com.javase.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectMethodTest002 {

	public static void main(String[] args){
	
		Class c=null;
		
		try{
			c=Class.forName("com.javase.reflect.User");

			/* 一，getMethods()方式
			   获取一个类中所有public修饰的方法,返回一个数组对象,包括User从父类Object继承的方法也一并返回
			   此方式获取的方法对象没有顺序，有可能不按照从上到下的方式排序在数组里
			   非公开方法（protected,defalut,private）无法获取
			*/
			Method[] methods=c.getMethods();   
			//遍历
			for(int i=0; i<methods.length; i++){
				//获取每个方法的修饰符
				int modifiedNum=methods[i].getModifiers();
				String modifier=Modifier.toString(modifiedNum);
				
				//获取返回值
				Class returnType=methods[i].getReturnType();   //这个方法有泛型Class<?>  getReturnType()
				String typeName=returnType.getSimpleName();

				//获取方法名
				String methodsName=methods[i].getName();
				System.out.print(modifier+" "+typeName+" "+methodsName+" (");
				
				//获取形参列表，返回值是一个Class<?>[]数组，有泛型
				Class[] parameterTypes=methods[i].getParameterTypes();
				
				//遍历形参列表
				for(int j=0; j<parameterTypes.length; j++){
					String parameterName=parameterTypes[j].getSimpleName();
					System.out.print(parameterName+" ");
				}

				System.out.print(")\n");
				
				
			}

			/*二，getDeclaredMethods();
				  这个方法返回User里声明的所有方法，包括public,protected,default,private，但不包括从父类或接口继承的方法	
			*/
			System.out.println("\n分隔符~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			Method[] declaredMethods=c.getDeclaredMethods();
			for(Method mm : declaredMethods){
				//获取修饰符
				int modifiedNum=mm.getModifiers();
				String modifiers=Modifier.toString(modifiedNum);
				//获取返回值类型
				Class  returnType=mm.getReturnType();
				String typeName=returnType.getSimpleName();
				//获取方法名
				String methodName=mm.getName();
				
				System.out.print(modifiers+" "+typeName+" "+methodName+" (");  //输出

				//获取形参列表  返回值是一个Class<?>[]数组，有泛型
				Class[]  parameterTypes=mm.getParameterTypes();
				for(Class paraName : parameterTypes){
					String simpleName=paraName.getSimpleName();
					System.out.print(simpleName+" ");
				}
			    System.out.print(")\n");

			}

		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SecurityException e){
			e.printStackTrace();
		}
	
	}


}