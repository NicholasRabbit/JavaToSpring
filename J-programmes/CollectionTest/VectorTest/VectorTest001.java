import java.util.List;
import java.util.Vector;
import java.util.Iterator;
import java.util.Collections;    //Collections��һ�������࣬ע�ⲻ��Collection�ӿڡ�
import java.util.ArrayList;


public class VectorTest001 {

    public static void main(String[] args){
	
	    List l=new Vector();   //Vector���̰߳�ȫ�ģ���Ч�ʽϵ�

		l.add(100);     //ע�⣬�˴�int���͵������Զ�װ�䣬ת��Ϊ��Integer���͵����á�
		l.add(200);
		l.add(300);
		l.add(400);
		l.add(500);

		Iterator it=l.iterator();
		while(it.hasNext()){
		    Object obj=it.next();      //����Ԫ����Integer���ͣ��Զ�������ת����ת��Ϊ��Object��
			System.out.println(obj);
		}


		List myList=new ArrayList();  //ArrayLlist�Ƿ��̰߳�ȫ��
		myList.add("a");
		myList.add("b");
        
		Collections.synchronizedList(myList);   //���ù�����Collections��ķ������ѷ��̰߳�ȫ�ļ�����myListת��Ϊ�̰߳�ȫ�ġ�


	}

}