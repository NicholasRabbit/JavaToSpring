import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileInputStreamTest003 {

    public static void main(String[] args){
	
	    FileInputStream fis=null;
		try{                                                                           //�ļ���Ҫ�Ӻ�׺file02.txt
		    fis=new FileInputStream("E:\\Learning\\Computer\\Java\\J-programmes\\IOTest\\file03.txt");
			byte[] bytes=new byte[4];
			
			/*  
			while(true){
			    int readCount=fis.read(bytes);         
				if(readCount==-1){
				   break;
				}
				String str=new String(bytes,0,readCount);
				System.out.print(str);
			}
			*/

			//����whileѭ�����д��
			int readCount=0;
			while((readCount=fis.read(bytes))!=-1){
			    System.out.print(new String(bytes,0,readCount));  //�˴���Ҫ��������򲻻���print
			}
		}catch(FileNotFoundException e){
		    e.printStackTrace();
		}catch(IOException e){
		    e.printStackTrace();
		}
	
	}

}