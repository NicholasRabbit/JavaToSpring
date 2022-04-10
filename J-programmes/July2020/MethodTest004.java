public class MethodTest004{
    public static void main(String[] args){
	   //MethodTest004.multiple(2,5);           //此行语句不写也可以，不影响下面语句接收，因为接收前会先自动调用
	   int c=MethodTest004.multiple(2,5);       //接收返回值写法，可以写全称，也可以不写:类名.
	   long d=multiple(5,5);                    //此处发生自动类型转换
	   System.out.println(c);
	   System.out.println(d);
	   System.out.println(multiple(6,6));       //每接收一次返回值，就会调用一次Multiple方法，即“Hi”也要输出一次

	}
	public static int multiple(int a,int b){
	     System.out.println("Hi");            ///System.out语句写在这里          
		 int k=a*b;
		 return k;
		 //System.out.println("Hi");          //错误，上面return语句执行完，整个方法结束，这行永远执行不到
	
	}


}