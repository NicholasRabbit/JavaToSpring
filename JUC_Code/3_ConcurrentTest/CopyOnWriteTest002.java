import java.util.*;
import java.util.concurrent.*;

/*JUC的类CopyOnWriteArrayList/CopyOnWriteArraySet范例
  1，此范例解决了001中多线程边读边添加的报错的问题
  2，这两个类的底层原理是，边写边复制，即写的时候把原来的集合对象过来再添加元素，此种方式开销很大，
     在写操作频繁时不建议使用，在并发迭代操作多时可使用。
*/
public class CopyOnWriteTest002 {

	public static void main(String[] args){
		Runnable mr02 = new MyRunnable02();
		for(int i=0; i < 10; i++){
			Thread t = new Thread(mr02);
			t.start();
		}
	
	}
}

class MyRunnable02 implements Runnable {

	//private static List<String>  list = Collections.synchronizedList(new ArrayList<String>());   //使用集合工具类创建一个线程安全的的List集合类
	//解决方案
	private static CopyOnWriteArrayList<String>  list = new CopyOnWriteArrayList<String>();
	static {
		list.add("Tom");
		list.add("Jerry");
	}
	public void run(){
		Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			list.add("Lena");  
		}
		
	}
}