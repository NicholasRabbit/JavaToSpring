import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;

public class RemoveTest001 {

    public static void main(String[] args){
	
	    Collection c=new ArrayList();
		
		//Iterator it=c.iterator();  //在这里获取迭代器，则it指向的是空的集合，等于获取了一个空的集合快照
		                             //下面在添加元素，集合的结构就改变了，而快照没有改变，因此下面再用it
								     //进行迭代是就会出现异常：java.util.ConcurrentModificationException

		c.add(1);   //注意此处添加的是引用，int i=1自动装箱了，即Integer i=100;或Integer i=new Integer(1)
		c.add(2);
		c.add(3);
		c.add("你好");
		c.add('A');
		c.add("润物细无声");
        
		Iterator it=c.iterator();  //元素添加完毕之后，再获取迭代器，即所有元素定型后，再拍快照，
		                           //下面使用it.next()时，就不会出异常。
		while (it.hasNext()){
            
			Object obj=it.next();
            
			//c.remove(1);         //这里不可调用集合Collection类里的remove方法来移除元素，因为前面迭代器
			                       //已经定型了，集合改变元素，结构改变无法反应得到迭代器所拍摄的快照上面
            
			//迭代器调用方法:it.remove(),必须在it.next()方法后执行，否则 IllegalStateException异常
			it.remove();           //迭代过程中，移除元素只能调用迭代器的 remove()方法，这个方法可同时移除
			                       //集合中的元素和迭代器所拍摄快照中的元素（实际是modCount），保持一致，不会出异常
			
			System.out.println(obj);  //上面移除后还会在这里打印输出，因为obj是从集合里返回的，集合里的元素没了，
			                          //返回出来的该打印还是打印，不影响
		}

		int i=c.size();     //元素个数为0，因为上面while循环调用it.remove()方法，每返回一个元素就立即移除了。
		System.out.println(i);
	}   

}