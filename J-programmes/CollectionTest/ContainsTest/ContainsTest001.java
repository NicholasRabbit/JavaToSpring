import java.util.Collection;
import java.util.ArrayList;


public class ContainsTest001 {

    public static void main(String[] args){
	
	   containsMethod();

	   containsMethod2();
	}

	public static boolean containsMethod(){
	
       Collection  c=new ArrayList();
	   String s1=new String("Churchill");
	   String s2=new String("Linclon");
	   String z=new String("Churchill");

	   c.add(s1);
	   c.add(s2);
       
	   //集合类中contains(..)方法底层源码最终调用的是equals方法来验证是否含有某一对象
	   //因为String类里重写了equals方法，所以下面b为true。
	   boolean b=c.contains(z);   //验证集合c中是否含有String类对象:z
	   System.out.println(b); 
	   
	   return b;
	
	}

	public static boolean containsMethod2(){
	 
	      User u1=new User("Tom");    
		  User u2=new User("Jerry");
		  User m=new User("Tom");

		  Collection c=new ArrayList();
		  c.add(u1);
		  c.add(u2);
	      
		  //User类里没有重写equals(..)方法，因此contains(..)方法最终调用equals(..)时，
		  //比较的是两个对象的内存地址，不是所含内容，而m和u1的内存地址不相同。
		  boolean b=c.contains(m);
		  System.out.println("User里没重写equals方法的情况:"+b);

		  return b;
	} 

}

class User {
	private String name;
	public User(){
	
	}
	public User(String name){
	    this.name=name;
	}
}