import java.util.Collection;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;

public class CollectionTest003 {

    public static void main(String[] args){
	
	    iteratorMethod();    
	
	}
	public static void iteratorMethod(){
	
	    Collection c=new HashSet();
        
		//Set集合存进去是一个顺序，取出不一定是相同的顺序。
		c.add(456);  //注意此处int类型字面值456，自动装箱，Integer i=new Integer(456);实际保存进去的是i的内存地址。
		c.add("Hello");
		c.add("Again");
		User u=new User("用户名自定义");
		c.add(u);
		c.add(3.1f);
		c.add(3.14);

		//Set集合不可存储重复元素，以下存不进去，但是也不报警出异常
		c.add("Hello");
		
		Iterator it=c.iterator();
		while(it.hasNext()){
		    Object obj=it.next();    //迭代器返回的元素都是Object类型
			System.out.println(obj); //这里println()方法调用了valueOf()方法，把所有类型都转为了String类型。 
		}
	
	}

}

class User {
    private String name;

	public User(){
	
	}
	public User(String name){
	    this.name=name;
	}
    public String toString(){
	    return  this.name;
	}
}