/*
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
*/

public class FinallyTest002 {

    public static void main(String[] args){
	
	    method();    
	
	}

	public static void method(){
	 
	    try {
			System.out.println("try���ִ��");     //����ֻ��try,���finally��䣬����catchҲ���ԡ�
			                                       //���try�������return��Ҳ��Ӱ��finally�����ĳ���ִ�С���finally���ִ���꣬��ִ��return��䡣
			return;
        }
		finally {
		    System.out.println("finally���ִ��");
		}

	
	}

}