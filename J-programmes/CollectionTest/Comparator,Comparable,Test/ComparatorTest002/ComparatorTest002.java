import java.util.Comparator;
import java.util.TreeSet;
import java.util.Iterator;

public class ComparatorTest002 {

    public static void main(String[] args){
	
	    UserComparator01  c01=new UserComparator01();   //自定义构建两个比较器，里面已写好比较规则
		UserComparator02  c02=new UserComparator02();

		TreeSet<User>  mySet=new TreeSet<>(c01);    //使用比较器1的规则比较
	    
		User u1=new User(12,"Zoe");
		User u2=new User(23,"Jack");
		User u3=new User(46,"Ben");
	    User u4=new User(12,"Alex");
		User u5=new User(67,"Constantine");

		mySet.add(u1);
		mySet.add(u2);
		mySet.add(u3);
		mySet.add(u4);
		mySet.add(u5);                //注意，如果比较器的compare()方法只比较年龄，那么第一次添加"12,Zoe"
                                      //第二次添加u4"12,Alex"就添加不进去了，TreeSet元素不可重复。
		for(User u : mySet){
		    System.out.println("第一次:"+u);    
		}
		/*
		  12:Zoe
          23:Jack
          46:Ben
          67:Constantine
		*/
        

		mySet.clear();              //移除所有元素
		mySet=new TreeSet<>(c02);    //使用比较器2的规则比较,年龄相同则比较姓名

		mySet.add(u1);
		mySet.add(u2);
		mySet.add(u3);
		mySet.add(u4);
		mySet.add(u5);

		for(User u : mySet){
		    System.out.println(u);
		}
		/*
		12:Alex
		12:Zoe
		23:Jack
		46:Ben
		67:Constantine
		*/


	}

}

class User {

	int age;
	String name;

	public User(){
	
	}

	public User(int age, String name){
	    this.age=age;
		this.name=name;
	}

	public String toString(){
	    return  this.age +":"+this.name;
	}

	
}

class UserComparator01 implements Comparator<User> {    //比较规则 1:只比较年龄大小。！！注意:Comparator<T>加泛型
    public int compare(User u1, User u2){               //否则报错 
	    return u1.age - u2.age;
	}
}

class UserComparator02 implements Comparator<User> {    //比较规则 2：先比较年龄如果年龄相同，则比较名字字幕顺序
    public int compare(User u1, User u2){
	    
		if(u1.age==u2.age){
		   return u1.name.compareTo(u2.name);
		}
		return u1.age-u2.age;
		
	}

}