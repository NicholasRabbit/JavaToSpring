public class ReflectTest002 {

	public static void main(String[] args){
	
		try{
		   
		   /* forName(..)括号内参数不能是绝对路径，是包名+类名,这里User类在本代码同目录下，所以没有包名
		      一般cmd是在src目录下打开运行，如果在User类里加上package com.javse.reflect;那么User.class就会
			  被javac -d . *.java编译在../src/com/javase/reflect目录下，然后这里类名就是:com.javse.reflect
		   */
		   Class c=Class.forName("User");  
		   
		   /*newInstance()方法返回的是Object类型,底层调用了User对象这个无参构造方法,如果User没有无参构造方法
		     则会抛出IllegalAccessException异常
		     这个方法是个泛型方法
		   */
		   User u=(User)c.newInstance();  //如果不设定泛型，返回的是一个Object   
		   System.out.println(u);          

		}catch(ClassNotFoundException | InstantiationException  | IllegalAccessException e){
		   e.printStackTrace();  //catch语句可以多个异常一起捕捉，注意写法，只有一个变量:e
		}

		//System.out.println(obj);  try{}里的变量这里捕捉不到，sout语句应写道try{}大括号里

		
		
	}

}