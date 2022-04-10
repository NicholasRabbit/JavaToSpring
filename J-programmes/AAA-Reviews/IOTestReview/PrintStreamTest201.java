import java.io.PrintStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class PrintStreamTest201 {

	public static void main(String[] args){
		System.out.println("A");
		PrintStream ps=System.out;
		ps.println("B");

		FileOutputStream fis=null;
		try{
			fis=new FileOutputStream("printStream.txt");  //µ±Ç°Â·¾¶
			PrintStream ps2=new PrintStream(fis);
			System.setOut(ps2);
			ps2.println("C");
			ps2.println("D");
			ps2.println("E");
			
			ps2.flush();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}

}