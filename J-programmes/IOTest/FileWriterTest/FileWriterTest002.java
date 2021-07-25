import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileWriterTest002 {

    public static void main(String[] args){
	
	    FileWriter fw=null;
        try{
		    fw =new FileWriter("writerfile02.txt",true);  //ʹ������вι��췽����fw.write(..)���Ḳ��ͬ�����ļ�����
            char[] chars={'A','B','C','D','E'};
			fw.write(chars);
			fw.write("�����л�");

			fw.flush();  //write()д��ǵ�ˢ��
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