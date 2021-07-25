import java.io.FileInputStream;
import java.io.FileNotFoundException;

//异常对象里常用的两个方法:一，String str=e.getMessage();  二， e.printStackTrace();
//
public class ExceptionTest007 {

    public static void main(String[] args)  {
	
	     //getMessagee()使用范例
		 NullPointerException  npe = new NullPointerException("空指针异常(自定义提示信息)");   //可在调用异常对象有参构造方法是输入自定义信息，用getMessage()方法调用。
		 String str = npe.getMessage();
		 System.out.println(str);
		 
		 //printStackTeace()使用范例
		 try{
		    method01();
		 }catch(FileNotFoundException e){
		    
			e.printStackTrace();           //打印异常追踪的堆栈信息，实际开发中常用此方式书写。

		 }
		 
		 
	}

	public static void method01() throws FileNotFoundException {
	
	    method02();
	}

	public static void method02() throws FileNotFoundException {
	
	    FileInputStream fis = new FileInputStream("D:\\jdk\\javase");
	}

	

}