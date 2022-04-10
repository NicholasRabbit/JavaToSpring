import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileWriterTest002 {

    public static void main(String[] args){
	
	    FileWriter fw=null;
        try{
		    fw =new FileWriter("writerfile02.txt",true);  //使用这个有参构造方法，fw.write(..)不会覆盖同名老文件内容
            char[] chars={'A','B','C','D','E'};
			fw.write(chars);
			fw.write("鱼樵闲话");

			fw.flush();  //write()写完记得刷新
		}catch(FileNotFoundException e){
		    e.printStackTrace();
		}catch(IOException e){
		    e.printStackTrace();
		}finally{
		   if(fw != null){ 
			   try{
		         fw.close();      
			   }catch(IOException e){
			     e.printStackTrace();
			   }
           }
		}
	
	}

}