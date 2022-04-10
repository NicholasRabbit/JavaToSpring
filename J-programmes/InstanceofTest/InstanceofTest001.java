public class InstanceofTest001 {

    /*
	instanceof运算符的 前一个操作符是一个引用变量，后一个操作数通常是一个类（可以是接口），
	用于判断前面的对象是否是后面的类，或者其子类、实现类的实例。如果是返回true，否则返回false 。
	
	也就是说：使用instanceof关键字做判断时， instanceof 操作符的 左右操作数必须有继承或实现关系

    */
	
	
	public static void main(String[] args){
	
	    Animal a=new Dog();
		System.out.println(a instanceof Dog);       //instanceof 可用于判断引用a（对象，实例）是否为Dog（类）的实例,结果为true
		System.out.println(a instanceof Animal);    //instanceof 可用于判断引用a是否为父类Animal的子类的实例,结果为true

		Animal a2=new Snoopy();
		System.out.println(a2 instanceof Animal);   //instanceof 可用于判断引用a是否为父类Animal的孙类的实例,结果为true 
		System.out.println(a2 instanceof Snoopy);
		
		Move m1=new Dog();
		if(m1 instanceof Move){                     //instanceof 可用于判断引用a是否为Move接口实现类Dog的实例，结果为true
		   System.out.println(m1+"是接口Move的实例");
		}
		

	}

}

class Animal {


}

interface Move{

    public abstract void move();
}

class Dog extends Animal implements Move {
	public void move(){
	   
	}

}

class Snoopy extends Dog {
	

}