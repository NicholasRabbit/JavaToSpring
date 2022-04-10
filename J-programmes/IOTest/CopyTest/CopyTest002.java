import java.io.FileWriter;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

//ʹ���ַ���ֻ�ܸ��ơ���ͨ�ı����ļ�����ϰ����
public class CopyTest002 {

    public static void main(String[] args){
	
	    FileReader fr=null;
		FileWriter fw=null;

		try{
		   fr=new FileReader("E:\\Learning\\Computer\\Java\\PAT\\FileWriterReaderCopyFile.txt");
           fw=new FileWriter("FileWriterReaderCopyFile02.txt");  //���ƺ����ļ����Ը���...file02.txt��Ҳ���Բ���

           char[] chars=new char[512];  //��ʼ������512,��ÿ�θ���512���ַ�char(1024bytes(1kb)),
		   int readCount=0;             //ÿ���ַ�charռ2���ֽ�byte
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