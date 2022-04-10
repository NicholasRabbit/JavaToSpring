package com.javase.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

//Field类和反射机制范例,通过反射得到一个类，通过类的方法来得到属性的修饰符（Modifier），数据类型（Type）,变量名等
//注意和java.lang.reflect包下面的类结合使用
//本例获取单个属性Field
public class FieldTest001{

	public static void main(String[] args){
	 
		//Student stu=new Student();
		Class c=null;
		try{
			c=Class.forName("com.javase.reflect.Student");   //首先反射得到一个Student类c	
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		System.out.println(c);

		try{
		  
		   //（1） 通过类Class c.getField(Strig s)，通过名字返回一个属性(field01里面包括修饰符，类型，变量名等)	                                     
		   Field  field01=c.getField("name");     
		   
		   //Field  field02=c.getField("age");     //这个方法只能得到public修饰的属性,默认(defalut),protected,private修饰的都不行   
		                                           //但是getDeclaredField("age")可以获取非public修饰的属性
		   Field field02=c.getDeclaredField("age");   
		   
		   //（2）获取修饰符，得到int 1,再调用Modifier类静态方法，把 1转换为其代表的public,输出
		   //     getModifiers()是复数，说明修饰符是多个时可一并获取，例如 MAX_VALUE的修饰符public final static 
		   //  获取name修饰符
		   int  i01=field01.getModifiers();   
		   String   s01=Modifier.toString(i01);
		   System.out.println(i01+"==>"+s01);
		   
		   /*(3)注意default修饰符时什么也没有，不是空格，就是什么也没有
			 例：Student{double weight;} 
		   */
		   Field field03=c.getDeclaredField("weight");
		   int j=field03.getModifiers();
		   String modifiersDefault=Modifier.toString(j);
		   System.out.println("default is===>"+modifiersDefault+"<===");

		   //  获取MAX_VALUE修饰符
		   Field  field04=c.getField("MAX_VALUE");
		   int  i02=field04.getModifiers();    //这里int是：
		   String  s02=Modifier.toString(i02);
		   System.out.println(i02+"==>"+s02);


		   //（4）获取数据类型，返回值是Class
		   Class c01=field01.getType();
		   System.out.println("全称数据类型名："+c01);   //输出:java.lang.String 这个全称
		   String simpleName=c01.getSimpleName();
		   System.out.println("简称类型名："+simpleName);  //输出:String 这个简称
		}catch(NoSuchFieldException e){
		   e.printStackTrace();
		}catch(SecurityException e){
		   e.printStackTrace();
		}

		
		
	}

}