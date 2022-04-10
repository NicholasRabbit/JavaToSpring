import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.Iterator;

public class ComparatorTest003 {

    public static void main(String[] args){
	
       //Set<User>  mySet=new TreeSet<User>(new UserComparator());

	   //以下是采用匿名内部类方式添加比较器，
	   //Comparator是借口，按说不可以new，但是匿名内部类中可以，生成了没有名字的对象类:ComparatorTest003$1.class
	   Set<User> mySet=new TreeSet<User>(new Comparator<User>(){   
	                                           public int compare(User u1, User u2){
											      return u1.getAge()-u2.getAge();
											   }
											}
										 );
	   mySet.add(new User(10));
	   mySet.add(new User(60));
	   mySet.add(new User(30));
	   mySet.add(new User(20));
	   mySet.add(new User(70));

	   Iterator<User> it=mySet.iterator();
	   while(it.hasNext()){
	       User u=it.next();
           System.out.println(u); 
	   }
	}

}

class User {

    private  int age;
	
	public User(){
	
	}
	public User(int age){
	    this.age=age;    
	}

	
	//set和get方法，因为前面属性私有化
	public void setAge(int age){
	    this.age=age;
	}
	public int getAge(){
	    return this.age;
	}

	public String toString(){
	    return "age: "+this.age;
	}
}


/*  以下代码可改为匿名内部类的方式写

class UserComparator implements Comparator<User> {

    public int compare(User u1, User u2){
	    return u1.getAge()-u2.getAge();
	}
}

*/