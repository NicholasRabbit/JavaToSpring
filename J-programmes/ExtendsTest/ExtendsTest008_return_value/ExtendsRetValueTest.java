

/**
 * 继承时，子类重写的方法的返回值范围只能更小，不能更大，
 * 即返回值可以是父类方法中返回值的子类，不能是其父类。
 *
 * 跟重写方法抛出异常一样的规则。
 * */

public class ExtendsRetValueTest {

	public static void main(String[] args){
		
		new B();
	
	}

}


class Vehicle {


}

class Car extends Vehicle {

}

class Honda extends Car{

}


class A {
	public Car run(){
		System.out.println("vehicle run");
		return null;
	}
}

class B extends A {

	//这里报错。子类这里写覆盖父类的同名方法，返回值不能是父类中方法返回值的父类，可以是子类
	public Vehicle run(){
		System.out.println("car run");
		return null;
	}
}
