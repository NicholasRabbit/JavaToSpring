import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ForeachTest001 {

    public static void main(String[] args){
	
	    //foreach�﷨������forѭ������ǿ�棬�﷨�����
		//���ܣ���1���������飻��2�������ϣ�
		//�﷨��ʽ�� for(�������� ������ : ����򼯺���){}

		int[]  arr={1,2,3,4,5,6,7,8,9};

		for(int i : arr){              //ʹ��foreach��������
		    System.out.println(i);
		}

		
		List<Integer> myList=new ArrayList<Integer>();
        
		 myList.add(10);     //����int���������Զ�װ��, Integer i=new Integer(10)��ʡ����ʽ:Integer i=100;
		 myList.add(30);
		 myList.add(20);
		 myList.add(65);
		 myList.add(230);

		 for(Integer i : myList){    //ʹ��foreach��������
		     System.out.println(i);
		 }

		 
		 //List������Ԫ�ض����±꣬��˿���һ��forѭ������
		 for(int i=0; i<myList.size(); i++){
		     Integer value=myList.get(i);
			 System.out.println(value);
		 }

       	
	}

}