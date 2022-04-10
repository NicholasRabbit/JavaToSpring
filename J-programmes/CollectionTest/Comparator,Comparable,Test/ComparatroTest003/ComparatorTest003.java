import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.Iterator;

public class ComparatorTest003 {

    public static void main(String[] args){
	
       //Set<User>  mySet=new TreeSet<User>(new UserComparator());

	   //�����ǲ��������ڲ��෽ʽ��ӱȽ�����
	   //Comparator�ǽ�ڣ���˵������new�����������ڲ����п��ԣ�������û�����ֵĶ�����:ComparatorTest003$1.class
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

	
	//set��get��������Ϊǰ������˽�л�
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


/*  ���´���ɸ�Ϊ�����ڲ���ķ�ʽд

class UserComparator implements Comparator<User> {

    public int compare(User u1, User u2){
	    return u1.getAge()-u2.getAge();
	}
}

*/