
import java.util.*;
/*
1,是什么？
内部类是写在一个类内部的类；
2,为什么？
(1)使用内部类的目的是为了完成一些比较复杂的功能，同时对外部调用不可见，减少耦合；
(2)可写多个内部类继承不同的类，间接解决了Java中不可多继承的问题，因为使用实现多个接口的方式必须把接口内所有方法都实现，没必要
3,静态内部类中的静态方法可以直接访问外部类的一切静态属性，包括私有的，但不能访问实例属性变量；
*/
public class OuterClass {

	private static int id = 1001;
	private String name = "Tom"; 
	
	//内部类这里使用私有private修饰符，只能在外层类内部访问
	private static class InnerClass {
		
		//静态内部类中的静态方法
		public static void staticMethod(){
			System.out.println("静态内部类的静态方法, id ==>" + id);
			//System.out.println("静态内部类的静态方法, name ==>" + this.name);   //编译报错，静态方法不能访问实例变量
		}

		//静态内部类中的实例方法
		public void instanceMethod(){
			
			//System.out.println(name);   //编译报错，静态内部类不能直接方位外部类的实例变量,要创建外部类对象才行

			OuterClass outerClass = new OuterClass();
			System.out.println("静态内部类的实例方法 ==> " + outerClass.name);
		}
	}

	public static void main(String[] args){
		
		//1,调用静态内部类中的静态方法
		OuterClass.InnerClass.staticMethod();

		//2,创建一个静态内部类的对象的写法，可用这个对象访问静态内部类的实例方法
		OuterClass.InnerClass  innerClass = new OuterClass.InnerClass();  
		innerClass.instanceMethod();   //调用实例方法

		//3,内部类的使用, 把内部类当作集合的泛型
		Set<OuterClass.InnerClass> set01 = new HashSet<>();

		//4,模拟HashMap中的EntrySet
		Set<MyMap.MyEntry<Integer,String>> set02 = new HashSet<>();
		System.out.println("set02==>" + set02);
	}
}

//注意，MyMap不是内部类，只是写在这里方便阅读
class MyMap {
	//这里的内部类使用public修饰，在外层类的外部也可以访问
	public static class MyEntry<K,V> {

	}
}