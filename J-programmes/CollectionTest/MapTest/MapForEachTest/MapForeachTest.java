
import java.util.*;



//The usage of Map forEach.
public class MapForeachTest {

	public static void main(String[] args){
	
		Map<String,String> userMap = new HashMap<>();
		userMap.put("1","Tom");
		userMap.put("2","Jerry");
		userMap.put("3","Dan");
		forEach(userMap);	
	}


	public static void forEach(Map<String,String> userMap){
		//1,use Entry
		for(Map.Entry<String,String> entry : userMap.entrySet()){
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

		//2,use forEach()
		userMap.forEach( (k,v) -> {
			System.out.println(k + "=" + v);
		} );
	}
}
