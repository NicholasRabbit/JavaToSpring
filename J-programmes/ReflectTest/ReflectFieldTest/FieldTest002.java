//本例在FieldTest001基础上获取一个反射类的全部属性Field，得到一个属性数组Field[]

package com.javase.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class FieldTest002 {

	public static void main(String[] args){
		
		Class c=null;
		try{
		   c=Class.forName("com.javase.reflect.Student");  //forName(..)方法的参数是String类型的：全部包名加类名
		   
		   //获取全部属性的方式：getDeclaredFields()，是一个无参数方法，返回一个Field数组，包含这个类的全部属性
		   Field[] fields=c.getDeclaredFields();  
		   for(Field f : fields){    //foreach语句
		      
			  //获取属性修饰符
			  String fieldName=f.getName();
			  String modifier=Modifier.toString(f.getModifiers());
			  
			  //获取数据类型:int byte short等等
			  Class typeClass=f.getType();   //全称：例如，java.lang.String
			  String type=typeClass.getSimpleName();  //简称  例如 String

			  System.out.println(modifier+" "+type+" "+f.getName());
		   }
		}catch(ClassNotFoundException e){
		   e.printStackTrace();
		}
	
	}
}

