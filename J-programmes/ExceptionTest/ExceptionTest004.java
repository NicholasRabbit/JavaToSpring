import java.io.FileInputStream;
import java.io.FileNotFoundException;   //����java.lang��������쳣�࣬�赼�롣

public class ExceptionTest004 {

    public static void main(String[] args){
	
	    
		try{
		   method01();
		   System.out.println("���б�����󣬴����Ƿ�ִ�У�");    //try����У���һ�б������������䲻ִ��
		}catch(FileNotFoundException e){
		   System.out.println("�ļ�·������");
		}
	
	}

	public static void method01() throws FileNotFoundException {
	 
	    FileInputStream fne=new FileInputStream("F:\\My-Works\\Java\\J-programmes");  //˫б����һ����ת���
	} 

}