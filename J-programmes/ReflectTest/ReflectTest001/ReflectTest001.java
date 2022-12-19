import java.util.Date;
//获取字节码文件的三种方式
//反射机制就是操作字节码文件，若如此，那么必须先获取字节码文件
public class ReflectTest001 {

    public static void main(String[] args){
	
	    //第一种方式:
		   Class c1=null;   //写在这里为了让c1和c3比较
		try{
		         c1=Class.forName("java.lang.String");  //静态方法Class.forName("完整类名加包名")  
    	   Class c2=Class.forName("MyClass");           //同目录下，就直接写类名
		   System.out.println(c1);
		   System.out.println(c2);       
		}catch(ClassNotFoundException e){
		   String message=e.getMessage();
		   System.out.println(message);
		}

		//第二种方式：对象调用继承自Object父类的方法public final Class<?> getClass(),有final修饰，可以继承，不可覆盖
        String str=new String("abc");
		Class c3=str.getClass();
		System.out.println(c3==c1);  //true，因为c1,c3都指向方法区内存里的String字节码文件
		
		MyClass mc=new MyClass();
        Class c4=mc.getClass();   
		System.out.println(c4);

		//第三种方式，任何类型（包括基本类型）.class
		Class c5=Date.class;
		Class c6=Integer.class;
		/*
		int i=20;
		Class c7=i.class;
		或
		Class c7=20.class;  不行
		*/
		Class c7=int.class;  //可以

		Class c8=String.class;
		System.out.println(c8==c1);  //true，因为c1,c8也都指向方法区内存里的String字节码文件 
		
	}

}

class MyClass {

}