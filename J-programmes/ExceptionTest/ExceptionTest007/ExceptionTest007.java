import java.io.FileInputStream;
import java.io.FileNotFoundException;

//�쳣�����ﳣ�õ���������:һ��String str=e.getMessage();  ���� e.printStackTrace();
//
public class ExceptionTest007 {

    public static void main(String[] args)  {
	
	     //getMessagee()ʹ�÷���
		 NullPointerException  npe = new NullPointerException("��ָ���쳣(�Զ�����ʾ��Ϣ)");   //���ڵ����쳣�����вι��췽���������Զ�����Ϣ����getMessage()�������á�
		 String str = npe.getMessage();
		 System.out.println(str);
		 
		 //printStackTeace()ʹ�÷���
		 try{
		    method01();
		 }catch(FileNotFoundException e){
		    
			e.printStackTrace();           //��ӡ�쳣׷�ٵĶ�ջ��Ϣ��ʵ�ʿ����г��ô˷�ʽ��д��

		 }
		 
		 
	}

	public static void method01() throws FileNotFoundException {
	
	    method02();
	}

	public static void method02() throws FileNotFoundException {
	
	    FileInputStream fis = new FileInputStream("D:\\jdk\\javase");
	}

	

}