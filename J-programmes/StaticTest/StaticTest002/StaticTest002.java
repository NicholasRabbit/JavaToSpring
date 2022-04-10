public class StaticTest002{

    static{
	
	    System.out.println("静态代码块第一条");  //静态代码块一般写在程序第一条，作用是执行记录执行日期，数据初始化等
    }                                            //一般在main方法之前，每条只执行一次
                                                 
	static{
	
	    System.out.println("静态代码块第二条");
	}

	static{
	
	    System.out.println("静态代码块第三条");
	}

	public static void main(String[] args){
	
	    System.out.println("main方法输出");
	}

}