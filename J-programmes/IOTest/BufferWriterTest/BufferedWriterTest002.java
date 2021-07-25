import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStreamWriter;


public class BufferedWriterTest002 {

    public static void main(String[] args){
	
	    BufferedWriter bw=null;

		try{                                             
		   bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("bufferedWriterfile002.txt", true)));

		   bw.write("Could");
		   bw.write("\n");         //换行符没作用？？？？
		   bw.write("you");
		 
		   bw.flush();
		}catch(FileNotFoundException e){
		   e.printStackTrace();
		}catch(IOException e){
		   e.printStackTrace();
		}finally{
		   if(bw != null){
		      try{
			     bw.close();
			  }catch(IOException e){
			     e.printStackTrace();
			  }
		   }
		}
	
	}

}