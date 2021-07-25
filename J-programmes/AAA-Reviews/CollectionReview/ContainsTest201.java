import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

public class ContainsTest201 {

	public static void main(String[] args){
		
		String s1=new String("Mathias");
		String s2=new String("Ceasar");
		String x=new String("Mathias");

		List<String> myList=new LinkedList<>();  //contains方法底层调用的是equals(..)方法来进行比较的
		myList.add(s1);
		myList.add(s2);

		boolean b=myList.contains(x);  //true
		System.out.println(b);

		List<User> myList2=new LinkedList<>();
		myList2.add(new User("Tom",25));
		myList2.add(new User("Liam",30));
		
		User u=new User("Tom",25);
		boolean b2=myList2.contains(u);
		System.out.println(b2);


	}
}

class User {
	private String name;
	private int id;

	public User(){
	
	}
	public User(String name, int id){
		this.name=name;
		this.id=id;
	}

	public boolean equals(Object obj){
		if(obj ==null || !(obj instanceof User)){
			return false;
		}else if(this==obj){
			return true;
		}

		User u=(User)obj;
		if(this.name.equals(u.name) && this.id==u.id){
			return true;
		}

		return false;
	}

	public String toString(){
		return this.name+":"+this.id;
	}
	
	
}