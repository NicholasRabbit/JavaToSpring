import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ExceptionTest005 {

    public static void main(String[] args){
	
	    method01();
	
	}

	public static void method01() {
	   
		method02();
		
	}

	public static void method02()  {
	    try{
			method03();    
			System.out.println("in try??");
		}catch(FileNotFoundException e){
		   System.out.println("FileNotFoundException�쳣�Ѳ�׽");
		}catch(IOException f){
		   System.out.println("IOException�쳣�Ѳ�׽"); //���в�ִ�У���Ϊmethod03()���������쳣����try{}���һ���쳣(FileNotFoundExpn)�������ִ��֮�󣬵ڶ����Ͳ�ִ���ˣ�     
		}                                               //��˵ڶ���catch��û�в�׽�κ��쳣����˲�ִ�С�
														//IOException��FileNotFoundException�ĸ��࣬���catch���ʹ��ʱ�������쳣����д������֮ǰ��Ӧ���մ����ൽ�����˳����ϵ���д
		
		/*
		 * ע�⣺
		 * 1) ֻҪ�쳣û�б�׼ȷ��׽�������쳣���������ϱ����Ǳ��б�������������Ĵ��붼����ִ�С�
		 * 2) ���׼ȷ��׽�Ļ�������Ĵ��뻹��ִ�С�����try�����ڱ��쳣������Ĵ���Ͳ�ִ���ˡ�
		 *
		 * ���Ϲ���������Checked Exception(����ʱ�쳣) and unchecked exception(����ʱ�쳣)
		 * 
		 * */
		System.out.println("execute? ");


	}   

	public static void method03() throws FileNotFoundException, IOException {
	   FileInputStream fis=new FileInputStream("F:\\OM-WORKS\\DeBal\\FanJinJiao");
	   fis.read();
	}

}
