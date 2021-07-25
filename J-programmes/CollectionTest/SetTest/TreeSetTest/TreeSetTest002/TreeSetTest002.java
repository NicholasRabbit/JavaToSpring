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
	  
	  //Set<Person> mySet=new TreeSet<Person>();    //ע�⣬������Set����̬�﷨������TreeSet<Person>���Person����ʡ�ԣ��޷��Զ��жϣ�����ʱ����������쳣
	                                                //Set��TreeSet��үү�࣬TreeSet����ֱ��ʵ��Set�Ľӿڣ����Դ˴����У������Ʋ⣩��
	 
	  TreeSet<Person>  mySet=new TreeSet<>();       //���в��ö�̬�﷨�������ʡ�ԣ����Զ��ж����ͣ�����ʯ���﷨��
	  //SortedSet<Person>  mySet=new TreeSet<>();   //SortedSet��̬�﷨������Ҳ��ʡ�ԣ����Զ��жϡ�Set���С� 
	  mySet.add(p1);
	  mySet.add(p2);
	  mySet.add(p3);
	  mySet.add(p4);
	  mySet.add(p5);

	  int size=mySet.size();
	  System.out.println("������Ԫ�ظ���:"+size);

	  for(Person p : mySet){          //foreachѭ���������ϣ���������ź�˳��ģ�
	      System.out.println(p);      //�Ȱ����䣬������ͬ������˳��
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
			}else{             //�˴���this.age>p.ageʱ���������ȵ�������������г�
			    return 1;
			}
		}
	}



	public String toString(){
	
	   return age+name;
	
	}

}