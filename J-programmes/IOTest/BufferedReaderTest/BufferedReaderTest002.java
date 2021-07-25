import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

//字节流FileInputStream作为节点流在BufferedReader中的使用
//BufferedReader只针对字符流，字节流需要转换为字符流，使用InputStreamReader转换
public class BufferedReaderTest002 {

    public static void main(String[] args){
	
	    BufferedReader br=null;
         
		try{
                                     //ISR是FIS的包装流            <<<<<  //FIS是ISR的节点流
		   br=new BufferedReader(new InputStreamReader(new FileInputStream("bufferReadFile002.txt")));
		                             //<<<<  ISR是BR的节点流
		   String str=null;
		   while((str=br.readLine()) != null){
		       System.out.println(str);        //readLine()方法不会读取换行符，要保持原文排版，需用println()
		   }
		}catch(FileNotFoundException e){
		       e.printStackTrace();

		}catch(IOException e){
		       e.printStackTrace();
		}finally{
		       if(br != null){
			      try{
				     br.close();
				  }catch(IOException e){
				     e.printStackTrace();
				  }
			   }
		 }
		                            

	
	}

}