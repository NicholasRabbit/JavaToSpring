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

		//����TreeMap���ϣ����ȵõ�key���ֵļ��ϣ��� Set����,Ȼ��ͨ��key����value����
		Set<Integer>  mySet=myTreeMap.keySet();

		
		for(Iterator<Integer> it=mySet.iterator();it.hasNext(); ){  //whileѭ��Ҳ�ɸ���forѭ��
		    Integer key=it.next();
			String value=myTreeMap.get(key);
            System.out.println(key+"="+value);
		}

	
	}

}