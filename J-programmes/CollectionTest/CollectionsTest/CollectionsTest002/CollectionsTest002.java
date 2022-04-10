import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class CollectionsTest002 {

    public static void main(String[] args){
	
        List<User>	myList=new ArrayList<User>();
		
		myList.add(new User(16));
        myList.add(new User(10));
		myList.add(new User(12));
		myList.add(new User(36));
		myList.add(new User(55));

		Collections.sort(myList);    //ʹ��sort()������List�������Զ���Ԫ�����ͣ���User�Ƚ�������ʱ���Զ�������Ԫ��
        //ע�⣬�˷���û�з���ֵ     //Ҫʵ��Comparable�ӿڣ��򹹽��Ƚ���Comparator��������뱨��	

        Iterator<User> it=myList.iterator();
		while(it.hasNext()){
		    User u=it.next();
			System.out.println(u);
		}
 	}

}

class User implements Comparable<User> {

    private int age;

	public User(){
	
	}
	public User(int age){
	    this.age=age;
	}

	public int compareTo(User u2){
	    return this.age-u2.age;
	}
	
	//��дtoString()����
	public String toString(){
	    return String.valueOf(this.age);
	}
	
	//set,get����
	public void setAge(int age){
	    this.age=age;
	}
	public int getAge(){
	    return this.age;
	}
}