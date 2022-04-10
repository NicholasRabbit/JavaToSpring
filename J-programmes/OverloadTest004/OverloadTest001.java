public class OverloadTest001{
    public static void main(String[] args){       //总结，方法重载与方法名，参数类别类型有关
	  int x=OverloadTest001.sum(10,20);           //与其他的像返回值类型，修饰符列表均无关
	  System.out.println(x);
	  
	  double y=OverloadTest001.sum(10.0,20.0);    //类名可以省略
	  System.out.println(y);
	  
	  long z=sum(20L,30L);                        
	  System.out.println(z);
	
	}
	public static int sum(int a,int b){
	    return a+b;
	
	}
	public static double sum(double c,double d){
	     return c+d;
	   
	}
	public static long sum(long e,long f){
	    return e+f;
	   
	}




}