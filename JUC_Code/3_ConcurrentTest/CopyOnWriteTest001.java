import java.util.*;

/*JUC的类CopyOnWriteList/CopyOnWriteSet范例
  首先测试普通的List,边读边添加，看其出现的问题
*/
public class CopyOnWriteTest001 {

	public static void main(String[] args){
		Runnable mr = new MyRunnable();
		/*多线程对synchronizedList创建的同步集合类在多个线程添加时报异常：ConcurrentModificationException；
		 *因为一个线程在添加时，另外的在读，也在添加，这个集合虽然线程安全但不能保证同时添加元素； 
		 *解决方案见CopyOnWriteTest002.java
		 */
		for(int i=0; i < 10; i++){
			Thread t = new Thread(mr);
			t.start();
		}
	
	}
}

class MyRunnable implements Runnable {

	private static List<String>  list = Collections.synchronizedList(new ArrayList<String>());   //使用集合工具类创建一个线程安全的的List集合类
	
	static {
		list.add("Tom");
		list.add("Jerry");
	}
	public void run(){
		Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			list.add("Lena");  //这里多线程添加时报异常。
		}
	}
}