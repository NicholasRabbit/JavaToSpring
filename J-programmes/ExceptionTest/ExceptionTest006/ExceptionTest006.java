import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest006 {

    public static void main(String[] args){
	
	    method01();

	}

	public static void method01(){
	
	    try{
		    FileInputStream fis=new FileInputStream("D:\\file");
			fis.read();
		
		}catch(IOException e){
		    System.out.println("IOException输出");
		}catch(FileNotFoundException e){                     //此行报错，因为IOException是FileNotFoundException的父类，上面已经被捕捉
		    System.out.println("FileNotFoundException输出"); //因此这里再写，就冲突了
		}                                                    //多行catch语句中，异常遵循从上到下，从子类到父类的排序规则。
	
	}

}