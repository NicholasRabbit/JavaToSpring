import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class TreeMapTest001{

    public static void main(String[] args){
	
	    Map<Integer,String>  myTreeMap=new TreeMap<Integer,String>();
        
		myTreeMap.put(2,"Tom");
		myTreeMap.put(1,"Alex");
		myTreeMap.put(4,"Zoe");
		myTreeMap.put(5,"Daniel");
		myTreeMap.put(3,"Kate");

		//遍历TreeMap集合，首先得到key部分的集合，即 Set集合,然后通过key遍历value部分
		Set<Integer>  mySet=myTreeMap.keySet();

		
		for(Iterator<Integer> it=mySet.iterator();it.hasNext(); ){  //while循环也可改做for循环
		    Integer key=it.next();
			String value=myTreeMap.get(key);
            System.out.println(key+"="+value);
		}

	
	}

}