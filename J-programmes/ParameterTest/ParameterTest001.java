public class ParameterTest001{
    public static void main(String[] args){
	     int m=10;
		 ParameterTest001.sum(m);               //参数传递，永远只传递数值。
		 System.out.println("main------>"+m);   //结果10。

	
	}
	public static void sum(int m){
	     m++;
		 System.out.println("sum------->"+m);   //结果11。
	
	}

}