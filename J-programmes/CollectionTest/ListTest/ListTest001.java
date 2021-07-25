import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

/*List�ӿ������з�����ϰ
  (1)void add(int index, E element); ��ָ���±�λ�����Ԫ��
  (2)E get(int index):  ����ָ���±��Ԫ��
  (3)int indexOf(Object o) :ָ��ĳ��Ԫ�ص�һ�γ���ʱ���±ꡣ
  (4)int lastIndexOf(Object o) :ָ��ĳ��Ԫ��������ʱ���±ꡣ
  (5)E set(int index, E element) :�滻ָ��λ��Ԫ��;
  (6)E remove(int index),�Ƴ�ָ���±��Ԫ�أ���������Ԫ�����ƣ����±�Ҳ��1��

*/
public class ListTest001{

    public static void main(String[] args){
	
	    listMethod();
	
	}
	
	public static void listMethod(){
	
	    List myList=new ArrayList();
		myList.add(0,'A');     
		myList.add(1,"b");    //add(int index, E element)����ָ���±����Ԫ��
		myList.add(2,"c");
		myList.add(3,"d");
		myList.add(4,"e");
		

		myList.add(2,'x');  //���ԭλ����Ԫ�أ������λ�ü�Ԫ�أ���ԭ��Ԫ��ͳһ�����һλ��ͬʱ�±�Ҳ�Զ���1��  
		                    //�˴����±�2����Ԫ�أ�ԭ2��Ԫ�غ��ƣ�����Ҳ˳�ơ�
                            
		myList.add("d");	//�̳���Collection�ķ���add(E e)�Զ��򼯺������һλ���Ԫ��
		

		Iterator it=myList.iterator();
		while(it.hasNext()){
		    Object o=it.next();
			System.out.println(o);
		}

        Object o=myList.get(1);
		System.out.println("�±�1��"+o);

		int i=myList.indexOf("d");
		System.out.println("d��һ�γ����±�: "+i);  //ע�⣬��Ϊ���±�2λ�ô������Ԫ���ˣ�����Ԫ�ض������ˣ��˴�iΪ4,����jΪ6

		int j=myList.lastIndexOf("d");
		System.out.println("d���һ�γ����±꣺"+j);

        myList.set(2,"Hello");    //�滻�±�Ϊ2��Ԫ��X
		it=myList.iterator();     //ǰ��������ˣ�����Ҫ���»�ȡ����������������it.hasNext()Ϊfalse,whileѭ������ȥ
		while(it.hasNext()){
		    Object o2=it.next();
			System.out.println(o2);
		}

		System.out.println("�ָ���~~~~~~~~~~~~~~");
		//List��remove����
		myList.remove(4);     //�Ƴ�ָ���±�Ԫ�أ�����Ԫ�������ƶ����±��һ
		it=myList.iterator();
		while(it.hasNext()){
		    Object o3=it.next();
			System.out.println(o3);
		}




	}

}