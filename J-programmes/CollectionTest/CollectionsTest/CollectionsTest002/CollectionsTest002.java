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

		Collections.sort(myList);    //使用sort()方法对List集合中自定义元素类型，如User等进行排序时，自定义类型元素
        //注意，此方法没有返回值     //要实现Comparable接口，或构建比较器Comparator，否则编译报错	

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
	
	//重写toString()方法
	public String toString(){
	    return String.valueOf(this.age);
	}
	
	//set,get方法
	public void setAge(int age){
	    this.age=age;
	}
	public int getAge(){
	    return this.age;
	}
}