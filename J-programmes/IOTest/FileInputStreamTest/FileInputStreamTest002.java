import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileInputStreamTest002 {

    public static void main(String[] args){
	
	    FileInputStream fis=null;
		byte[] bytes=new byte[4];

		try{                         
		   fis=new FileInputStream("file02.txt"); //   ���·����Դ��ͬ�ļ���  
		   
		   int readCount1=fis.read(bytes);  //����Ѷ�ȡ�����ֽڷŽ�һ��byte[]�����������bytes�������Ѿ��õ���ЩԪ����
		   System.out.println(readCount1);  //���Ƿ���ֵreadCount������Ԫ�ظ���,�������顣
		   String str1=new String(bytes);   //String�����и��вι��캯�������������bytes����ȥ��Ԫ��ת��һ���ַ���
		   System.out.println(str1);        //abcd      

		   int readCount2=fis.read(bytes);  //��һ�ζ�ȡ���ٷ���ֵ�û�����ʣ2��Ԫ����
		   System.out.println(readCount2);  //���2
		   String str2=new String(bytes);   
		   System.out.println(str2);      //���efcd,�ڶ��ζ�ȡ�������õ�ef,�����������ֽڰ�bytes������abcd��ab������ 


		}catch (FileNotFoundException e){
           e.printStackTrace();
		}catch (IOException e){
		   e.getMessage();
		}
		
	
	}

}