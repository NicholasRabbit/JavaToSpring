import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class CollectionsTest001 {

    public static void main(String[] args){
	
	    collectionsMethod();
	
	}

	public static void collectionsMethod(){
	
	    List<Integer>  myList = new ArrayList<Integer>();
		
		myList.add(12);
		myList.add(3);
		myList.add(63);
		myList.add(32);
		myList.add(10);

        Collections.synchronizedList(myList);     //��List����ת�����̰߳�ȫ�ġ�

		for(Integer i : myList){
		    System.out.println(i);    // ���12,3,63,32,10��˵��List���ϴ�ȡ�������
		}
		
		Collections.sort(myList);   //ʹ��sort()��̬�����Լ�����Ԫ�ؽ�������,ע��sort(List)ֻ�ܶ�List��������
	    Iterator<Integer> it=myList.iterator();   //Iterator������һ��Ҫ�ӷ��ͣ����򱨴�
		while(it.hasNext()){
		    Integer i=it.next();    //��������ñ���i,����Ϊǰ��forѭ����ɺ��ڴ����ͷţ�for�ڵ�i�ͷ���
			System.out.println(i);
		}
	}

}