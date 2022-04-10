public class MethodTest001{
    public static void main(String[] args){
		
		                             
		MethodTest001.sum(10,20);   //第一种写法，这里是实际参数列表，可以直接写入数值调用，注意类型要与形式参数列表一致
		                            //main方法执行到这里就暂停了，执行完下面sum方法语句后，再执行下面int h那行，再调用sum方法
		                            //所以输出结果为10+10=30,100+200=300,20+30=50，而不是像之前那样只输出最后的20+30=50
		int h=100;
		MethodTest001.sum(h,200);   //第二种写法，方法可以重复调用

		int a=20;
		int b=30;
		MethodTest001.sum(a,b);     //第三种写法，也可以现在外面声明变量，再调用





	
	}
	
	public static void sum(int m,int n){         //(int m,int n)是形式参数列表
	    System.out.println(m+"+"+n+"="+(m+n));
	
	
	}
	    


}