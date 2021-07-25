public class ExceptionTest001 {

    public static void main(String[] args){
	    
		//java中异常以类的形式存在，跟String,Interger类一样，出现异常时JVM会自动创建异常对象，抛出异常，显示出来，供程序员查找
	    //异常类都在java.lang包下面
		NullPointerException npe=new NullPointerException();  //NullPointerException类在java.lang包下，自动导入，所以不用import
		System.out.println(npe);
	
	}

}