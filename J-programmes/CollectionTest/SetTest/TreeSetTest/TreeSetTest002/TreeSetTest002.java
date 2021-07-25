import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.SortedSet;

public class TreeSetTest002 {

    public static void main(String[] args){
	  
	  Person p1=new Person(25,"Alex");
	  Person p2=new Person(30,"Ben");
	  Person p3=new Person(25,"Clark");
	  Person p4=new Person(56,"Zoe");
	  Person p5=new Person(35,"Jerry");
	  
	  //Set<Person> mySet=new TreeSet<Person>();    //注意，这里用Set，多态语法，后面TreeSet<Person>里的Person不可省略，无法自动判断，运行时会出现类型异常
	                                                //Set是TreeSet的爷爷类，TreeSet并非直接实现Set的接口，所以此处不行（个人推测）。
	 
	  TreeSet<Person>  mySet=new TreeSet<>();       //此行不用多态语法，后面可省略，可自动判断类型，即钻石型语法。
	  //SortedSet<Person>  mySet=new TreeSet<>();   //SortedSet多态语法，后面也可省略，可自动判断。Set不行。 
	  mySet.add(p1);
	  mySet.add(p2);
	  mySet.add(p3);
	  mySet.add(p4);
	  mySet.add(p5);

	  int size=mySet.size();
	  System.out.println("集合中元素个数:"+size);

	  for(Person p : mySet){          //foreach循环遍历集合，输出的是排好顺序的，
	      System.out.println(p);      //先按年龄，年龄相同则按名字顺序
	  }
	}

}


class Person implements Comparable<Person> {

	private int age;
	private String name;

	public Person(){
	
	}
	public Person(int age, String name){
	    this.age=age;
		this.name=name;
	}
	
	
	public int compareTo(Person p){
	    
		if(this.age==p.age){
		    int i=this.name.compareTo(p.name);
            return i;
		}else{
		    if(this.age<p.age){
			    return -1;
			}else{             //此处是this.age>p.age时的情况，相等的情况在上面已列出
			    return 1;
			}
		}
	}



	public String toString(){
	
	   return age+name;
	
	}

}