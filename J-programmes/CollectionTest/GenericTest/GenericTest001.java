import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


public class GenericTest001 {

    public static void main(String[] args){
	
	   genericMethod();   
	
	}

	public static void genericMethod(){
	                                                //JDK5�Ժ������˷���
	    List <String> ls=new ArrayList <String>();  //�����﷨�����涨�ü�����ʲô���ͣ��Ժ�ֻ�ܴ�����������

		ls.add("���");
		ls.add("����");

		Iterator<String> it=ls.iterator();   //ǰ�漯�Ϲ涨�÷��ͺ�ʹ�õ�����ҲҪ�涨��ͬ�������� 
                                             //������涨���������Ĭ�Ϸ���Object���ͣ������String str���վͱ�����
		while (it.hasNext()){
			String str=it.next();
			System.out.println(str);
		}

	
	}

}