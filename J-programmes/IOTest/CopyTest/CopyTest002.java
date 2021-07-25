import java.io.FileWriter;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

//使用字符流只能复制“普通文本”文件，练习范例
public class CopyTest002 {

    public static void main(String[] args){
	
	    FileReader fr=null;
		FileWriter fw=null;

		try{
		   fr=new FileReader("E:\\Learning\\Computer\\Java\\PAT\\FileWriterReaderCopyFile.txt");
           fw=new FileWriter("FileWriterReaderCopyFile02.txt");  //复制后新文件可以改名...file02.txt，也可以不改

           char[] chars=new char[512];  //初始化容量512,即每次复制512个字符char(1024bytes(1kb)),
		   int readCount=0;             //每个字符char占2个字节byte
		   while((readCount=fr.read(chars)) !=-1){
		       fw.write(chars);
           }
		 }catch(FileNotFoundException e){
		       e.printStackTrace();
		 }catch(IOException e){
		       e.printStackTrace();
		 }finally{
		       if(fr != null){
			       try{
				      fr.close();
				   }catch(IOException e){
		             e.printStackTrace();
		           }
			   }
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