import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.Set;
import java.util.Iterator;



/*
Map接口中常用方法：
        V put(K key, V value) 向Map集合中添加键值对
        V get(Object key) 通过key获取value
        void clear()    清空Map集合
        boolean containsKey(Object key) 判断Map中是否包含某个key
        boolean containsValue(Object value) 判断Map中是否包含某个value
        boolean isEmpty()   判断Map集合中元素个数是否为0
        V remove(Object key) 通过key删除键值对
        int size() 获取Map集合中键值对的个数。
        Collection<V> values() 获取Map集合中所有的value，返回一个Collection

        Set<K> keySet() 获取Map集合所有的key（所有的键是一个set集合）

        Set<Map.Entry<K,V>> entrySet(): 将Map集合转换成Set集合,并且把键值对合成一个整体成为一个元素（对象，内含属性key,value）
*/
public class MapTest001 {

    public static void main(String[] args){
	
	    mapMethod();
	
	}

	public static void mapMethod(){
	
	    Map<Integer, String> myMap=new HashMap<Integer, String>();
        

		myMap.put(1,"Tom");       //注意，这里key值1自动装箱了，变成了Integer类型。即 Integer i=1; 下面一样道理
		myMap.put(2,"Jerry");
		myMap.put(3,"Jones");
		myMap.put(4,"Lee");
		myMap.put(5,"SuperBowl");

		String str = myMap.get(3);
		System.out.println(str);

        boolean b1=myMap.containsKey(6);     //containsKey和containsValue方法调用的是equals()方法，因此放进去的元素类型需要重写equals方法
		System.out.println("b1:"+b1);        //本例中java自带的Integer和String类都重写了equals方法，因此比较的是内容。

		boolean b2=myMap.containsValue("Lee");
		System.out.println("b2:"+b2);

		boolean b3=myMap.isEmpty();
		System.out.println("b3:"+b3);

		String str2=myMap.remove(2);    //移除指定键值key的 键值对，并返回此位置的值value
		System.out.println(str2);       //结果为：Jerry(其键值key为 2)

		String str3=myMap.get(2);
		System.out.println("str3:"+str3);  //移除键值对后，原位置的value值就变为了null


		int i=myMap.size();
		System.out.println("键值对个数: "+i);

		System.out.println("+++++++++++++++++++");
		Collection<String>  c=myMap.values();  //注意此处泛型要与前面value 的类型一致
		//使用foreach语句遍历
		for(String s :  c){     //此行String s注意，类型不可写作：Collection s               
		    System.out.println(s);
		}
        
		//用迭代器遍历也可以。
		Iterator<String> it = c.iterator();
		while(it.hasNext()){
		    String s=it.next();
			System.out.println(s);
		}

        
		System.out.println("分割线=================");
		
		
		//Set<K> keySet()方法
		Set<Integer>  mySet=myMap.keySet();
		for(Integer iKey : mySet){
		    System.out.println(iKey);
		}

		
		//Set<Map.Entry<K,V>> entrySet()方法，注意Entry是Map接口的一个内部类，在这里使用时写作Map.Entry,后面尖括号里是泛型，需与Map泛型一致
		//这个方法把Map集合里的key和value（两个对象）放到了一个对象Node里面，成为了一个整体，key和value分别成为了对象Node的属性。
		//此方法与迭代器，或者foreach联用，可用于遍历Map类型的集合。
		Set<Map.Entry<Integer,String>> mySet2=myMap.entrySet();
		Iterator<Map.Entry<Integer, String>> it2=mySet2.iterator();
		while(it2.hasNext()){
		    Map.Entry<Integer, String> node=it2.next();
			Integer key=node.getKey();
			String value=node.getValue();
			System.out.println(key+"="+value);
		}

		
		//void clear()方法，清空集合内元素
		myMap.clear();
		int capacity=myMap.size();
		System.out.println("容量:"+capacity);

		



       
        
	
	}

}