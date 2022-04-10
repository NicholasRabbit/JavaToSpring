public class DataTest103{

    public static void main(String[] args){
	    int m;
		System.out.println(m);  //输出报错，因为m是局部变量，上面没赋值，
		                        //系统不会自动初始化局部变量，即不会赋予默认值
	                            //因此报错。
	}

	
}