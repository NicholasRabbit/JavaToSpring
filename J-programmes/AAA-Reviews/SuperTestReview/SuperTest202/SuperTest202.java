public class SuperTest202 {

    public static void main(String[] args){
	
	   B bb=new B();
	   B bb2=new B(50,"父类");
	
	}

}


class A {

    private int age;
	private String name;

	public A(){
	}

	public A(int age, String name){
	
	    this.age=age;
		this.name=name;
		System.out.println("父类有参构造执行："+age+name);
	}

}

class B extends A {
    
    public B(){
	 super(60,"Father");
	}

	public B(int a, String name){
	
	    super(a,name);
	}

	



}