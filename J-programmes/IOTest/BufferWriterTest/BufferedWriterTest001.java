import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedWriterTest001 {

    public static void main(String[] args){
	
	    BufferedWriter  bw=null;
		FileWriter  fw=null;

		try{
		    fw=new FileWriter("bufferedWriterfile.txt");  //�ڵ�ǰ·��дһ���ļ�bufferedWriterfile.txt
			bw=new BufferedWriter(fw);
			
			bw.write("���");  //ֱ��д�ַ������ӳ�����java.io.Writer�̳е�write(String str);����
			bw.write("ͬ־");
			bw.write("\r\n");
			bw.write("�ټ�");

			bw.flush();   //write()д��Ҫ�ǵ�ˢ��
		}catch(FileNotFoundException e){
		    e.printStackTrace();
		}catch(IOException e){
		    e.printStackTrace();
		}finally{
		    if(bw != null){
			    try{
				   bw.close();
				}catch(IOException e){
				   e.printStackTrace();
				}
			}
		}
	
	}

}