public class MethodTest007{
    public static void main(String[] args){
	    int a,b;
		    a=30;
			b=20;
		int retValue01=MethodTest007.sum(a,b);                //接受返回值是注意声明变量的类型不要忘记 int retValue01
		System.out.println("返回值retValue01: "+retValue01);

	
	
	}
	public static int sum(int m,int n){                       //形式参数列表里的变量不要忘记声明sum(int m,int n)
	    int g=m+n;
		int h=5;
		int retValue02=MethodTest007.devide(g,h);
		return retValue02;
	
	
	}
	public static int devide(int x,int y){
	    int z=x/y;
		return z;
	
	
	}


}