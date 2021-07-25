import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.Set;
import java.util.Iterator;



/*
Map�ӿ��г��÷�����
        V put(K key, V value) ��Map��������Ӽ�ֵ��
        V get(Object key) ͨ��key��ȡvalue
        void clear()    ���Map����
        boolean containsKey(Object key) �ж�Map���Ƿ����ĳ��key
        boolean containsValue(Object value) �ж�Map���Ƿ����ĳ��value
        boolean isEmpty()   �ж�Map������Ԫ�ظ����Ƿ�Ϊ0
        V remove(Object key) ͨ��keyɾ����ֵ��
        int size() ��ȡMap�����м�ֵ�Եĸ�����
        Collection<V> values() ��ȡMap���������е�value������һ��Collection

        Set<K> keySet() ��ȡMap�������е�key�����еļ���һ��set���ϣ�

        Set<Map.Entry<K,V>> entrySet(): ��Map����ת����Set����,���ҰѼ�ֵ�Ժϳ�һ�������Ϊһ��Ԫ�أ������ں�����key,value��
*/
public class MapTest001 {

    public static void main(String[] args){
	
	    mapMethod();
	
	}

	public static void mapMethod(){
	
	    Map<Integer, String> myMap=new HashMap<Integer, String>();
        

		myMap.put(1,"Tom");       //ע�⣬����keyֵ1�Զ�װ���ˣ������Integer���͡��� Integer i=1; ����һ������
		myMap.put(2,"Jerry");
		myMap.put(3,"Jones");
		myMap.put(4,"Lee");
		myMap.put(5,"SuperBowl");

		String str = myMap.get(3);
		System.out.println(str);

        boolean b1=myMap.containsKey(6);     //containsKey��containsValue�������õ���equals()��������˷Ž�ȥ��Ԫ��������Ҫ��дequals����
		System.out.println("b1:"+b1);        //������java�Դ���Integer��String�඼��д��equals��������˱Ƚϵ������ݡ�

		boolean b2=myMap.containsValue("Lee");
		System.out.println("b2:"+b2);

		boolean b3=myMap.isEmpty();
		System.out.println("b3:"+b3);

		String str2=myMap.remove(2);    //�Ƴ�ָ����ֵkey�� ��ֵ�ԣ������ش�λ�õ�ֵvalue
		System.out.println(str2);       //���Ϊ��Jerry(���ֵkeyΪ 2)

		String str3=myMap.get(2);
		System.out.println("str3:"+str3);  //�Ƴ���ֵ�Ժ�ԭλ�õ�valueֵ�ͱ�Ϊ��null


		int i=myMap.size();
		System.out.println("��ֵ�Ը���: "+i);

		System.out.println("+++++++++++++++++++");
		Collection<String>  c=myMap.values();  //ע��˴�����Ҫ��ǰ��value ������һ��
		//ʹ��foreach������
		for(String s :  c){     //����String sע�⣬���Ͳ���д����Collection s               
		    System.out.println(s);
		}
        
		//�õ���������Ҳ���ԡ�
		Iterator<String> it = c.iterator();
		while(it.hasNext()){
		    String s=it.next();
			System.out.println(s);
		}

        
		System.out.println("�ָ���=================");
		
		
		//Set<K> keySet()����
		Set<Integer>  mySet=myMap.keySet();
		for(Integer iKey : mySet){
		    System.out.println(iKey);
		}

		
		//Set<Map.Entry<K,V>> entrySet()������ע��Entry��Map�ӿڵ�һ���ڲ��࣬������ʹ��ʱд��Map.Entry,������������Ƿ��ͣ�����Map����һ��
		//���������Map�������key��value���������󣩷ŵ���һ������Node���棬��Ϊ��һ�����壬key��value�ֱ��Ϊ�˶���Node�����ԡ�
		//�˷����������������foreach���ã������ڱ���Map���͵ļ��ϡ�
		Set<Map.Entry<Integer,String>> mySet2=myMap.entrySet();
		Iterator<Map.Entry<Integer, String>> it2=mySet2.iterator();
		while(it2.hasNext()){
		    Map.Entry<Integer, String> node=it2.next();
			Integer key=node.getKey();
			String value=node.getValue();
			System.out.println(key+"="+value);
		}

		
		//void clear()��������ռ�����Ԫ��
		myMap.clear();
		int capacity=myMap.size();
		System.out.println("����:"+capacity);

		



       
        
	
	}

}