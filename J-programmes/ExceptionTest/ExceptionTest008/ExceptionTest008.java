import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest008 {

    public static void main(String[] args){
	       
	   
	}

}

class A {
	public  void method() throws FileNotFoundException {
	    System.out.println("A's method.");
	}

	public void method02(){
	    System.out.println("A's method02");
	}

	public void method03(){
	    System.out.println("A's method03");
	}

	
}

class B extends A {
	
	/*
	public  void method() throws Exception {           //�˴����������Ϊ��д�����׳����쳣���ܸ��ֻ࣬�ܸ��٣���Χ��С��
	    System.out.println("B's rewrited method");     //���ң���������д�ķ���Ҳ���Բ��׳��쳣������Ҳ�Ǹ����׳��쳣
		return 1;
	}
	*/
	public void method() throws FileNotFoundException {   //��д���������׳���ͬ�쳣��
	    System.out.println("B's rewrited method.");
	}

	public void method02() throws RuntimeException {   //�����з���û���׳��쳣�������е���д���������׳�����ʱ�쳣��  
	    System.out.println("B's rewrited method02");
	}

    public void method03() throws Exception {          //������෽��"method03"��û���׳��쳣,����������д�ķ��������׳�����ʱ���쳣�����������׳����ࡣ
	    System.out.println("B's rewrited method03");   
	} 

}

