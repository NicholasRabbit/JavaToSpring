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
	    System.out.println("����A��method����ִ��:"+name+age);
	}
}

class B extends A{

    public B(){
	
	}
	public void method(){
	    super.method(10,"Tom");         //super������ʵ����������Ա�����У�ʹ�ã���ʽ��super.�����������ø����еķ��� 
	}

}