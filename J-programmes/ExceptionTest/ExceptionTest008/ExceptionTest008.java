import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest008 {

    public static void main(String[] args){
	       
	   
	}

}

class A {
	public  void method() throws FileNotFoundException {
	    System.out.println("A's method.");
	}

	public void method02(){
	    System.out.println("A's method02");
	}

	public void method03(){
	    System.out.println("A's method03");
	}

	
}

class B extends A {
	
	/*
	public  void method() throws Exception {           //此处编译错误，因为重写方法抛出的异常不能更多，只能更少（或范围更小）
	    System.out.println("B's rewrited method");     //而且，子类中重写的方法也可以不抛出异常，这样也是更少抛出异常
		return 1;
	}
	*/
	public void method() throws FileNotFoundException {   //重写方法可以抛出相同异常。
	    System.out.println("B's rewrited method.");
	}

	public void method02() throws RuntimeException {   //父类中方法没有抛出异常，子类中的重写方法可以抛出运行时异常。  
	    System.out.println("B's rewrited method02");
	}

    public void method03() throws Exception {          //如果父类方法"method03"中没有抛出异常,则子类中重写的方法不可抛出编译时的异常，即：不能抛出更多。
	    System.out.println("B's rewrited method03");   
	} 

}

