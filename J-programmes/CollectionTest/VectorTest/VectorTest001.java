import java.util.List;
import java.util.Vector;
import java.util.Iterator;
import java.util.Collections;    //Collections是一个工具类，注意不是Collection接口。
import java.util.ArrayList;


public class VectorTest001 {

    public static void main(String[] args){
	
	    List l=new Vector();   //Vector是线程安全的，但效率较低

		l.add(100);     //注意，此处int类型的数据自动装箱，转换为了Integer类型的引用。
		l.add(200);
		l.add(300);
		l.add(400);
		l.add(500);

		Iterator it=l.iterator();
		while(it.hasNext()){
		    Object obj=it.next();      //这里元素是Integer类型，自动向父类型转换，转换为了Object类
			System.out.println(obj);
		}


		List myList=new ArrayList();  //ArrayLlist是非线程安全的
		myList.add("a");
		myList.add("b");
        
		Collections.synchronizedList(myList);   //调用工具类Collections里的方法，把非线程安全的集合类myList转换为线程安全的。


	}

}