public class OverloadTest002{
    public static void main(String[] args){
	    
		OverloadTest002.sum();
		OverloadTest002.sum(20);
        System.out.println("分割线~~~~~~~~~~~~~~~~~~~~~~~~~");
        /*
		sum02(30,40);                          //此处无法调用下面方法，进行重载
		*/
	
	
	}
	
	public static void sum(){
	   
	   System.out.println("sum:overload01");
	
	}
    public static void sum(int u){
	   
	   System.out.println("sum:overloda02+"+u);
	}
	
	
	/*
	public static int sum02(int v, int w){       //此处两个方法仅仅返回值类型不同，其它方法名，参数列表都相同
	     return v+w;                             //因此无法进行方法重载,上面的程序也无法调用
	}                                            //方法重载与返回值类型无关，即返回值类型一样或不一样，都不影响重载
	public static double sum02(int x, int y){    //而方法名和参数列表起决定性作用
	      double z=x+y;
		  System.out.println(z);
	     return z;
	}
	*/

}