import java.util.Map;
import java.util.HashMap;


public class HashMapTest003 {

    public static void main(String[] args){
	
         Map myMap=new HashMap();
		 
		 myMap.put(null,null);   //HashMap集合允许key和value为null
         myMap.put(null,120);    //但是，只允许key位置只有一个null，为了以后通过key获取value不发生混淆，如下面   

		 Object i=myMap.get(null);  //可通过key的值null，获取value。没有泛型，统一类型为Object
		 System.out.println(i);

	
	}

}