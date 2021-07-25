import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class CollectionTest002 {

    public static void main(String[] args){
	
	   iteratorMethod(); 
	
	}

	public static void iteratorMethod(){
	    
		//List集合，存进去什么顺序，取出还是什么顺序，且可重复。
	    Collection c=new ArrayList();   //迭代器跟接口Collection有关，与后面的ArrayList等无关。
		c.add("你好");    
		c.add("中国");
		c.add("ABC");
		c.add(123);        //注意：int类型123在这里自动装箱，变成了Integer类型，实际上放进去了一个内存地址，即 Integer i=new Integer(123);
		c.add(true);
		c.add(new User());
		c.add(123);        //List集合存进去的元素可重复

		//迭代器只适用于Collection集合及其子类，不适用于Map集合及其子类
		Iterator  it=c.iterator();  //通过调用Collection里的iterator()方法，返回一个迭代器对象，即it
                                    //刚开始迭代器不指向任何元素，指向第一个元素前一位
        
		//~~~~~~~~~~~~~~~~~~~~~
		boolean b=it.hasNext();  //迭代器Iterator里的方法，判断it指向的下一位有没有对象，有就返回true     
		System.out.println(b);   //判断完之后，如果有，用next()方法取出来。

		Object obj1=it.next();    //不管起初存什么类型进集合里，用迭代器取出来都是Object类型。
		System.out.println(obj1);

		boolean b2=it.hasNext();     
		System.out.println(b);

		Object obj2=it.next();
		System.out.println(obj2);

	    Object obj3=it.next();
		System.out.println(obj3);

		while(it.hasNext()){          //以上的迭代方法可以写成 while循环
		    Object obj=it.next();     //注意前面迭代完出来元素之后，后面继续往后迭代，而不会从头开始
			System.out.println(obj);  //List集合，存进去什么顺序，取出还是什么顺序 
		}
   
   
	
	}

}

class User{

}