import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest006 {

    public static void main(String[] args){
	
	    method01();

	}

	public static void method01(){
	
	    try{
		    FileInputStream fis=new FileInputStream("D:\\file");
			fis.read();
		
		}catch(IOException e){
		    System.out.println("IOException���");
		}catch(FileNotFoundException e){                     //���б�����ΪIOException��FileNotFoundException�ĸ��࣬�����Ѿ�����׽
		    System.out.println("FileNotFoundException���"); //���������д���ͳ�ͻ��
		}                                                    //����catch����У��쳣��ѭ���ϵ��£������ൽ������������
	
	}

}