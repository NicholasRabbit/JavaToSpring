import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;


//����Map���ϵ����ַ�����
public class MapTest002 {

    public static void main(String[] args){
	
	    mapScanMethod();  
	  
	}

	public static void mapScanMethod(){
	
	    Map<Integer, String>  myMap = new HashMap<>();
		myMap.put(1,"A");
		myMap.put(2,"B");
		myMap.put(3,"C");
		myMap.put(4,"D");
		myMap.put(5,"E");

		//��һ�ֱ���Map���Ϸ�����ͨ���ȵõ�key,Ȼ����ͨ��key������value

		Set<Integer> mySet=myMap.keySet();
		Iterator<Integer> it=mySet.iterator();   //�õ���������
		while(it.hasNext()){               
		    Integer key=it.next();
			String value=myMap.get(key);
			System.out.println(key+"="+value); 
		}

		for(Integer key : mySet){       //�˴�ѭ��Ҳ����foreach������
		    String value = myMap.get(key);
			System.out.println(key+"="+value);
		}

		//�ڶ��֣�ʹ��Set< Map.Entry<K,v> >  entrySet()��������Map����ת��ΪSet���ͼ��ϣ�Ȼ��ͨ��get()�����õ�����key,value
        Set<Map.Entry<Integer, String>>  mySet2=myMap.entrySet();
		Iterator<Map.Entry<Integer, String>> it2 = mySet2.iterator();   //ע������Entry��Map���ϵ�һ���ڲ��࣬ͨ��Map����ʱд��Map.Entry<K,V>�����з���
		while(it2.hasNext()){                                           //��Map.Entry<K,V>����һ�����壬��һ���࣬��Stringһ����
		    Map.Entry<Integer, String> node= it2.next();                //key,value��node������������ԣ�������Ԫ�ظ����ˡ�
			Integer keyArguement = node.getKey();
			String valueArguement = node.getValue();
			
			System.out.println(keyArguement+"="+valueArguement);
			//System.out.println(node);  //Ҳ����ֱ�����node,Ĭ�Ϻ��node.toStirng()��HashMap�ڲ���Nodeʵ����Entry�ӿڣ�����д��toString()������
		}
	
	}

}