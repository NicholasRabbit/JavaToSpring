import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class CollectionsTest001 {

    public static void main(String[] args){
	
	    collectionsMethod();
	
	}

	public static void collectionsMethod(){
	
	    List<Integer>  myList = new ArrayList<Integer>();
		
		myList.add(12);
		myList.add(3);
		myList.add(63);
		myList.add(32);
		myList.add(10);

        Collections.synchronizedList(myList);     //把List集合转换成线程安全的。

		for(Integer i : myList){
		    System.out.println(i);    // 输出12,3,63,32,10，说明List集合存取是有序的
		}
		
		Collections.sort(myList);   //使用sort()静态方法对集合内元素进行排序,注意sort(List)只能对List集合适用
	    Iterator<Integer> it=myList.iterator();   //Iterator迭代器一定要加泛型，否则报错
		while(it.hasNext()){
		    Integer i=it.next();    //这里可以用变量i,是因为前边for循环完成后，内存已释放，for内的i释放了
			System.out.println(i);
		}
	}

}