import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileOutputStreamTest002 {

    public static void main(String[] args){
	
	    //���������FOSTest001һ������ԭ�ļ���������ԭ���ݺ������д����ʹ�����������вι����½�����
	    FileOutputStream fos=null; 
        try{
		   fos=new FileOutputStream("writefile02.txt",true);
		   byte[] bytes={97,98,99,100,101,102};
		   fos.write(bytes);

		   String str=new String("С�������Ҵ�ı");
		   byte[] bt=str.getBytes();   //��String���ַ�ת��Ϊ���룬�Ž�byte���顣
		   fos.write(bt);

		   fos.flush();    //�������write()����д�꣬�ǵ����ˢ�£���չܵ�������
		}catch(FileNotFoundException e){
		   e.printStackTrace();
		}catch(IOException e){
		   e.printStackTrace();
		}finally{
		    if(fos != null){
			    try{
				   fos.close();   //���������ر���֮ǰ�ǵ�ˢ�����flush()�������п��ܶ�ʧ����.
				}catch(IOException e){
				   e.printStackTrace();
				}
			}
		}
	    
	}

}