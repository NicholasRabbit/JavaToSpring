import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class CollectionTest002 {

    public static void main(String[] args){
	
	   iteratorMethod(); 
	
	}

	public static void iteratorMethod(){
	    
		//List���ϣ����ȥʲô˳��ȡ������ʲô˳���ҿ��ظ���
	    Collection c=new ArrayList();   //���������ӿ�Collection�йأ�������ArrayList���޹ء�
		c.add("���");    
		c.add("�й�");
		c.add("ABC");
		c.add(123);        //ע�⣺int����123�������Զ�װ�䣬�����Integer���ͣ�ʵ���ϷŽ�ȥ��һ���ڴ��ַ���� Integer i=new Integer(123);
		c.add(true);
		c.add(new User());
		c.add(123);        //List���ϴ��ȥ��Ԫ�ؿ��ظ�

		//������ֻ������Collection���ϼ������࣬��������Map���ϼ�������
		Iterator  it=c.iterator();  //ͨ������Collection���iterator()����������һ�����������󣬼�it
                                    //�տ�ʼ��������ָ���κ�Ԫ�أ�ָ���һ��Ԫ��ǰһλ
        
		//~~~~~~~~~~~~~~~~~~~~~
		boolean b=it.hasNext();  //������Iterator��ķ������ж�itָ�����һλ��û�ж����оͷ���true     
		System.out.println(b);   //�ж���֮������У���next()����ȡ������

		Object obj1=it.next();    //���������ʲô���ͽ�������õ�����ȡ��������Object���͡�
		System.out.println(obj1);

		boolean b2=it.hasNext();     
		System.out.println(b);

		Object obj2=it.next();
		System.out.println(obj2);

	    Object obj3=it.next();
		System.out.println(obj3);

		while(it.hasNext()){          //���ϵĵ�����������д�� whileѭ��
		    Object obj=it.next();     //ע��ǰ����������Ԫ��֮�󣬺����������������������ͷ��ʼ
			System.out.println(obj);  //List���ϣ����ȥʲô˳��ȡ������ʲô˳�� 
		}
   
   
	
	}

}

class User{

}