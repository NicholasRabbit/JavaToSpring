import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileWriterTest001 {

    public static void main(String[] args){
	    FileWriter fw=null;
		try{
		   fw=new FileWriter("writerfile.txt");  //�½�һ����ǰ·���µ�writerfile.txt�ļ���׼��д��
		                                         
           char[] chars={'a','b','c','d','e',};
		   fw.write(chars);
		                         //��Ϊ�вι��췽������FileWriter("·��",boolean append)��
		   fw.write(chars,3,2);  // ����ע��:FileWriter��write()������FileOutputStream��write()����һ��
           //����д�룺de,       //Ҳ���ԭ���ϵ���ͬ���ļ�������գ������ǣ�
								 //��fw.write(chars,3,2)�������Ḳ����һ��fw.write(chaars)��д��
								 //�������abcdede
           
		   fw.write("�з�����"); //write(String str)�������أ�����ֱ��д�ַ���
		   fw.write("\r\n");     //fw.write(..)����Ҫ���У�����"\r\n"��д����"\r"��ǰ�������ǲ�����
		   fw.write("�����л�");

		   fw.flush();           //д��֮��ǵ�ˢ�£�������ܵ�
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