import java.util.Collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;


public class ArrayListTest001 {

    public static void main(String[] args){
	
	    //��HasSet����ת��ΪArrayList����
		hashSetToArrayList();
	
	}

	public static ArrayList hashSetToArrayList(){
	    
		Collection c=new HashSet();
		c.add(1);
		c.add(2);
		c.add(3);

		List myList=new ArrayList(c);  //����ArrayList�е�һ���вι��췽������Set���͵ļ���ת��ΪList���͵ļ��ϡ�

		Iterator it=myList.iterator();

		while(it.hasNext()){
		    Object obj=it.next();
			System.out.println(obj);
		}

		return (ArrayList)myList;
	}


}