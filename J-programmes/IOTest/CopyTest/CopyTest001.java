import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CopyTest001 {

    public static void main(String[] args){
	
	    FileInputStream fis=null;
		FileOutputStream fos=null;
        try{
		    fis=new FileInputStream("F:\\Music\\Ϊ���ܾ���紵.mp3");
			fos=new FileOutputStream("E:\\Learning\\Computer\\Java\\J-programmes\\IOTest\\CopyTest\\Ϊ���ܾ���紵.mp3");

			byte[] bytes=new byte[1024];  //1kb=1024bytes,ÿ�θ���1kb��ֱ��������
			while(true){
			    int readCount=fis.read(bytes);
				if(readCount==-1){
				    break;
				}
				fos.write(bytes,0,readCount());
			}
			
		}catch(FileNotFoundException e){
		    e.printStackTrace();
		}catch(IOException e){
		    e.printStackTrace();
		}finally{
		    try{
			   fis.close();     //��������������������д��һ��try���У�һ�������fis.close()�쳣���֣����׳�
			   fos.close();     //��ô��������������е������Զ�޷�ִ�С������޷��ر��ˡ�
			}catch(IOException e){
			   e.getMessage();
			} 
			    
			
		}

	
	}

}