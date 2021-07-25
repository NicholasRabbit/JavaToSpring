import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.Iterator;

public class ComparableTest201 {

	public static void main(String[] args){
		Set<User> mySet=new TreeSet<>(new UserComparator());
		mySet.add(new User("Tom"));
		mySet.add(new User("Jack"));
		mySet.add(new User("Adams"));

		Iterator<User> it=mySet.iterator();
		while(it.hasNext()){
			User str=it.next();
			System.out.println(str);
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

	public String getName(){
		return this.name;
	}

	public String toString(){
		return "User:"+this.name;
	}
}

class UserComparator implements Comparator<User>{
	User u1;
	User u2;

	public int compare (User u1, User u2){
		return u1.getName().compareTo(u2.getName());
	}
}