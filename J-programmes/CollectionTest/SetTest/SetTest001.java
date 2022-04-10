import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;


public class SetTest001 {

    public static void main(String[] args){
	
	    SetTest001.hashSetMethod(); 
		
		treeSetMethod();
	
	}

	//HashSet集合类练习
	public static void hashSetMethod(){
	    
		Set<String> myHashSet = new HashSet<String>();
		myHashSet.add("hello");
		myHashSet.add("你好");
		myHashSet.add("there");
		myHashSet.add("hello");   //Set集合中元素不可重复，也无序，重复添加不进去

		Iterator<String> it=myHashSet.iterator();
		while(it.hasNext()){
		    String str=it.next();
			System.out.println(str);
		}
	}

	//TreeSet集合类练习，属于SortedSet接口实现类，SortedSet其内部元素无序不可重复，但是元素会自动排序,即迭代器迭代出来的是有大小顺序的。
	public static void treeSetMethod(){
	
	   Set<Integer>  myTreeSet = new TreeSet<Integer>();
	   myTreeSet.add(5);
	   myTreeSet.add(2);
	   myTreeSet.add(4);
	   myTreeSet.add(1);
	   myTreeSet.add(3);

	   Iterator<Integer> it2=myTreeSet.iterator();
	   while(it2.hasNext()){
	       Integer i=it2.next();
		   System.out.println(i);      //输出顺序是:1,2,3,4,5，说明经过了自动排序
	   }


	}

}