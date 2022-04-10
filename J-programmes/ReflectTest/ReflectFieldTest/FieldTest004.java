//重点内容，通过反射机制修改属性值，并获取属性的办法

package com.javase.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class FieldTest004{

	public static void main(String[] args){
	
		Class c=null;
		Object obj=null;
		try{
			c=Class.forName("com.javase.reflect.Student");
			obj=c.newInstance();        //通过反射实例化对象，要修改的就是这个对象的属性
			System.out.println(obj);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(InstantiationException | IllegalAccessException e){
			e.printStackTrace();
		}

		//注意反射机制修改属性值，获取属性值的方式与一般new 的方式不一样
		try{
			Field f=c.getField("name");     //获取name这个属性Filed f
     		f.set(obj, "Tom");              //调用Field类里的方法set(实例化的对象，修改值)
			String name=(String)f.get(obj); //调用Field类里的f.get(Object obj)，获取值，即获取对象obj里的属性f的值
			System.out.println(name);

			//修改非pbulic修饰的属性的方式，必须把这个属性变为可修改的，使用Field  f.setAccessable(boolean b)方法
			
			//Field f2=c.getField("age");          //使用c.getField("age")获取非public修饰的属性age会报异常，获取不到，
			Field f2=c.getDeclaredField("age");    //需使用getDeclaredField("age");
			f2.setAccessible(true);
			
			/*(1)注意，这里"25"实际时自动打包成Integer类了，因为set(obj,obj)形参是Object类型
			  (2)如果是byte,short类型等其它比int类型范围小的基本数据类型则不可以，因为int类型无法自动转换为小范围类型的，自然这里也无法自动打包了
			     需这样写:byte b=25; f2.set(obj,b); 实际b=25时，把int类型的25自动转换为byte类型并赋值与b(复习基本数据类型转换规则)
              (3)比int范围大的可自动打包
			*/
			f2.set(obj,25);  
							 
			//(4)Field类里属性field调用get(Object obj)方法的用法，获取属性值，obj表示实例化的对象引用				
			boolean  b=(f2.get(obj)  instanceof Integer);  
			System.out.println(b);					//get(obj)方法把基本数据int类型属性值转换成其对应的包装类后，返回一个Object对象，这里obj实际对应的是Integer
			Integer privateAge=(Integer)f2.get(obj);   
			System.out.println(privateAge);

		
			
		}catch(NoSuchFieldException e){
			e.printStackTrace();	
		}catch(IllegalArgumentException | IllegalAccessException e ){
			e.printStackTrace();
		}catch(SecurityException e){
			e.printStackTrace();
		}
	
	}

}