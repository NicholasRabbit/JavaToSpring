import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileOutputStreamTest001 {

    public static void main(String[] args){
	
	    FileOutputStream  fos=null;
		
		try{
		    fos=new FileOutputStream("writefile.txt");  //���·�����ڱ�����ͬĿ¼��
			byte[] bytes={97,98,99,100,101};  //abcd
		           
			                      //���writefile.txtԭ�ļ��У����������ݣ�����й����ᱻ����
			fos.write(bytes);     //ע�⣬�˴�write�����Ḳ��Ŀ¼��ͬ���ļ�,ɾ�������´���������ʹ��
            fos.write(bytes,0,2); //��������bytes���飬�������ab, �������abcdab
            
			fos.flush();          //ÿ�������֮��Ҫˢ�����
		}catch(FileNotFoundException e){
		    e.printStackTrace();
		}catch(IOException e){
		    e.printStackTrace();
		}
	}

}