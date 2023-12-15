import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ExceptionTest005 {

    public static void main(String[] args){
	
	    method01();
	
	}

	public static void method01() {
	   
		method02();
		
	}

	public static void method02()  {
	    try{
			method03();    
			System.out.println("in try??");
		}catch(FileNotFoundException e){
		   System.out.println("FileNotFoundException异常已捕捉");
		}catch(IOException f){
		   System.out.println("IOException异常已捕捉"); //此行不执行，因为method03()里有两个异常，在try{}里第一个异常(FileNotFoundExpn)尝试语句执行之后，第二个就不执行了，     
		}                                               //因此第二个catch并没有捕捉任何异常，因此不执行。
														//IOException是FileNotFoundException的父类，多个catch语句使用时，父类异常不可写在子类之前，应按照从子类到父类的顺序从上到下写
		
		/*
		 * 注意：
		 * 1) 只要异常没有被准确捕捉，发生异常后无论是上报还是本行报错，方法内下面的代码都不会执行。
		 * 2) 如果准确捕捉的话则下面的代码还会执行。但是try语句块内报异常语句后面的代码就不执行了。
		 *
		 * 以上规则适用于Checked Exception(编译时异常) and unchecked exception(运行时异常)
		 * 
		 * */
		System.out.println("execute? ");


	}   

	public static void method03() throws FileNotFoundException, IOException {
	   FileInputStream fis=new FileInputStream("F:\\OM-WORKS\\DeBal\\FanJinJiao");
	   fis.read();
	}

}
