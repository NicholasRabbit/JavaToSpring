public class DataType001{
  public static void main(String[] args){
    long a=100L;
	int  b=(int)a;
    long c=2147483648L;   //数值超度int范围，后边输出d会错误，输出值是-2147483648。
	int  d=(int)c;

	System.out.println(b);
	System.out.println(d);
	
  
  
  }

}
