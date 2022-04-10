import java.util.Collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;


public class ArrayListTest001 {

    public static void main(String[] args){
	
	    //把HasSet集合转换为ArrayList集合
		hashSetToArrayList();
	
	}

	public static ArrayList hashSetToArrayList(){
	    
		Collection c=new HashSet();
		c.add(1);
		c.add(2);
		c.add(3);

		List myList=new ArrayList(c);  //调动ArrayList中的一个有参构造方法，把Set类型的集合转换为List类型的集合。

		Iterator it=myList.iterator();

		while(it.hasNext()){
		    Object obj=it.next();
			System.out.println(obj);
		}

		return (ArrayList)myList;
	}


}