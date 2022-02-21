
import java.util.*;
/*
1,是什么？
内部类是写在一个类内部的类；
2,为什么？
(1)使用内部类的目的是为了完成一些比较复杂的功能，同时对外部调用不可见，减少耦合；
(2)可写多个内部类继承不同的类，间接解决了Java中不可多继承的问题，因为使用实现多个接口的方式必须把接口内所有方法都实现，没必要
*/
public class MyClassTest {

	//内部类这里使用私有private修饰符，只能在外层类内部访问
	private static class InnerClass {
		
		//静态内部类中的静态方法
		public static void staticMethod(){
			System.out.println("static innerClass ==> staticMethod execute!");
		}
		//静态内部类中的实例方法
		public void instanceMethod(){
			System.out.println("static innerClass ==> instanceMethod execute！");
		}
	}

	public static void main(String[] args){
		
		//1,调用静态内部类中的静态方法
		MyClassTest.InnerClass.staticMethod();

		//2,创建一个静态内部类的对象的写法
		MyClassTest.InnerClass  innerClass = new MyClassTest.InnerClass();
		innerClass.instanceMethod();   //调用实例方法

		//3,内部类的使用, 把内部类当作集合的泛型
		Set<MyClassTest.InnerClass> set01 = new HashSet<>();

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