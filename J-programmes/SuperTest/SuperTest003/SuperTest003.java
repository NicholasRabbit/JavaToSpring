public class SuperTest003 {

    public static void main(String[] args){
	    A aa=new A();
	    B bb=new B();
		bb.method();
	
	}

}

class A {

    private int age;
	private String name;
	
	public A(){
	
	}
	public void method(int age ,String name){
	    this.age=age;
		this.name=name;
	    System.out.println("父类A中method方法执行:"+name+age);
	}
}

class B extends A{

    public B(){
	
	}
	public void method(){
	    super.method(10,"Tom");         //super可以在实例方法（成员方法中）使用，格式：super.方法名，调用父类中的方法 
	}

}