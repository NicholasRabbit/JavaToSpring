public class OverloadTest004{
    public static void main(String[] args){
	     Revoke001.r("Hello");       //直接跨文件调用Revoke001里的方法，Revoke001必须先编译才可进行调用
		 Revoke001.r('A');
		 Revoke001.r(true);
		 Revoke001.r(50.0);
		 Revoke001.r(2000L);
		 Revoke001.r(1000000000);    //此处数据自动转换为相应大容量数据类型，从而调用对应的方法
		 Revoke001.r("简单封装程序及其调用");
	
	}



}