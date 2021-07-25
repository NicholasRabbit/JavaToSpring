import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class ComparableTest202 {

	public static void main(String[] args){
		
		Set<User> mySet=new TreeSet<User>();

		mySet.add(new User("Tom",003));
		mySet.add(new User("Jack",001));
		mySet.add(new User("Alex",001));
		mySet.add(new User("Ben",002));
		mySet.add(new User("Zoe",005));

		Iterator<User> it=mySet.iterator();
		while(it.hasNext()){
			User u=it.next();
			System.out.println(u);
		}
	}

}

class User implements Comparable<User>{
	private String name;
	private int id;

	public User(){
	
	}
	public User(String name, int id){
		this.name=name;
		this.id=id;
	}

	public String toString(){
		return name+":"+id;
	}

	
	public int compareTo(User u){
		if(this.id != u.id){
			return this.id-u.id;
		}else{
			int i=this.name.compareTo(u.name);
			return i;
		}
	}
	
}