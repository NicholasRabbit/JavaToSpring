import java.io.PrintStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PrintStreamTest001 {

    public static void main(String[] args){
	
	    //输出向控制台，不分开写
		System.out.println("A");

		//分开写，因为out是一个在System里面的PrintStream类型的一个静态引用
		//println是PrintStream里的一个方法。所以可以分开写
        PrintStream ps=System.out;
		ps.println("A");
		ps.println("B");

		//改变输出方向
		PrintStream ps2=null;
		try{
		   ps2=new PrintStream(new FileOutputStream("printfile.txt"));
		   System.setOut(ps2);   //System.setOut(..)改变输出方向到ps2流里的文件printfile.txt
		   ps2.println('C');
		   ps2.println("桃花");
	
		}catch(FileNotFoundException e){
		    e.printStackTrace();
		}finally{
		    ps2.close();
				
		}
		
	}

}