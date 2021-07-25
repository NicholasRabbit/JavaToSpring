public class MethodTest008{
	public static void main(String[] args){
	     int a=10;
		 MethodTest008.method(a);              //两个局部变量a可以重复声明，不在一个作用域内，不冲突
		 System.out.println("main>>>"+a);      //此处输出a为10，因为method放法调用完之后，
                                               //就结束了，内存就释放了，此处a并没有接收到
         int b=20;
		     
         int c=method02(b);
		 System.out.println("method02: "+c);   //此处接收了返回值，则c输出为21.
	
	}
	public static void method(int a){
	     a++;
		 System.out.println("Method>>>"+a);   //此处输出a为11。
	
	}
	public static int method02(int b){
	     b++;
		 return b;
	
	}



}