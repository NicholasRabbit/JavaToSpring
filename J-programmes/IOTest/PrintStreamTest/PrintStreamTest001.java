import java.io.PrintStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PrintStreamTest001 {

    public static void main(String[] args){
	
	    //��������̨�����ֿ�д
		System.out.println("A");

		//�ֿ�д����Ϊout��һ����System�����PrintStream���͵�һ����̬����
		//println��PrintStream���һ�����������Կ��Էֿ�д
        PrintStream ps=System.out;
		ps.println("A");
		ps.println("B");

		//�ı��������
		PrintStream ps2=null;
		try{
		   ps2=new PrintStream(new FileOutputStream("printfile.txt"));
		   System.setOut(ps2);   //System.setOut(..)�ı��������ps2������ļ�printfile.txt
		   ps2.println('C');
		   ps2.println("�һ�");
	
		}catch(FileNotFoundException e){
		    e.printStackTrace();
		}finally{
		    ps2.close();
				
		}
		
	}

}