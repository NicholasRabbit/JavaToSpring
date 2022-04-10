import java.io.FileInputStream;
import java.io.FileNotFoundException;   //不在java.lang包下面的异常类，需导入。

public class ExceptionTest004 {

    public static void main(String[] args){
	
	    
		try{
		   method01();
		   System.out.println("上行编译错误，此行是否执行？");    //try语句中，有一行报错，则下面的语句不执行
		}catch(FileNotFoundException e){
		   System.out.println("文件路径错误");
		}
	
	}

	public static void method01() throws FileNotFoundException {
	 
	    FileInputStream fne=new FileInputStream("F:\\My-Works\\Java\\J-programmes");  //双斜线有一个是转义符
	} 

}