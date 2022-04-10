public class InterfaceTest002 {

    public static void main(String[] args){
	
         MyMath c01=new MyMathImpl();     //多态语法。

		 System.out.println(c01.PI);
		 System.out.println(c01.NATIONALITY);

		 int k=c01.sum(10,20);
		 System.out.println(k);

		 int m=c01.divide(25,5);
		 System.out.println(m);
	}

}

interface MyMath {

    public static final double PI=3.14;
    String NATIONALITY="China";    //前面默认有public static final，写时可以省略。

	public abstract int sum(int a,int b);

	int divide(int a, int b);     //前面的public abstract可以省略。
	
	   

}

class MyMathImpl implements MyMath {

    public int sum(int a, int b){
	
	    return a+b;
	}
	public int divide(int a, int b){
	
	    return a/b;
	}

}