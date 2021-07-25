import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;


//遍历Map集合的两种方法。
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

		//第一种遍历Map集合方法，通过先得到key,然后在通过key来遍历value

		Set<Integer> mySet=myMap.keySet();
		Iterator<Integer> it=mySet.iterator();   //用迭代器遍历
		while(it.hasNext()){               
		    Integer key=it.next();
			String value=myMap.get(key);
			System.out.println(key+"="+value); 
		}

		for(Integer key : mySet){       //此处循环也可用foreach，遍历
		    String value = myMap.get(key);
			System.out.println(key+"="+value);
		}

		//第二种，使用Set< Map.Entry<K,v> >  entrySet()方法，把Map集合转换为Set类型集合，然后通过get()方法得到属性key,value
        Set<Map.Entry<Integer, String>>  mySet2=myMap.entrySet();
		Iterator<Map.Entry<Integer, String>> it2 = mySet2.iterator();   //注意这里Entry是Map集合的一个内部类，通过Map调用时写作Map.Entry<K,V>，带有泛型
		while(it2.hasNext()){                                           //把Map.Entry<K,V>看做一个整体，是一个类，如String一样。
		    Map.Entry<Integer, String> node= it2.next();                //key,value是node对象的两个属性，不再是元素个体了。
			Integer keyArguement = node.getKey();
			String valueArguement = node.getValue();
			
			System.out.println(keyArguement+"="+valueArguement);
			//System.out.println(node);  //也可以直接输出node,默认后跟node.toStirng()，HashMap内部类Node实现了Entry接口，并重写了toString()方法。
		}
	
	}

}