import java.util.Map;
import java.util.HashMap;


public class HashMapTest003 {

    public static void main(String[] args){
	
         Map myMap=new HashMap();
		 
		 myMap.put(null,null);   //HashMap��������key��valueΪnull
         myMap.put(null,120);    //���ǣ�ֻ����keyλ��ֻ��һ��null��Ϊ���Ժ�ͨ��key��ȡvalue������������������   

		 Object i=myMap.get(null);  //��ͨ��key��ֵnull����ȡvalue��û�з��ͣ�ͳһ����ΪObject
		 System.out.println(i);

	
	}

}