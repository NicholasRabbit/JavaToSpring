public class ExtendsTest003 {

    public static void main(String[] args){
		//1,连续继承范例，这里新建对象D，调用的是D里的“System.out.println(d)”   
		//D继承于C，C继承于B,B继承于A
		D d=new D();
		char a=d.methodA('X');   

		//2,连续继承时，子类实例化时，会产生连锁反应，每个层级的父类构造方法都会被其子类调用。
	}                             
}

class A{
	public A(){
		System.out.println("A");
	}
	public char methodA(char d){
	    System.out.println(d);
		return d;
	}
}

class B extends A{
	public B(){
		System.out.println("B");
	}
}

class C extends B{
	public C(){
		System.out.println("C");
	}
}

class D extends C{
	public D(){
		System.out.println("D");
	}
}

