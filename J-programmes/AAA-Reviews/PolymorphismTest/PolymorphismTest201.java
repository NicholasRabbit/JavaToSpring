public class PolymorphismTest201 {

	public static void main(String[] args){
	 
	    A a=new B(100);
		System.out.println(a.num);
	}
}

class A {
	int num;
}

class B extends A{
    int num;
	public B (int num){
	    this.num=num;
	}
}