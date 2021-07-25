import java.util.Comparator;
import java.util.TreeSet;
import java.util.Iterator;

public class ComparatorTest002 {

    public static void main(String[] args){
	
	    UserComparator01  c01=new UserComparator01();   //�Զ��幹�������Ƚ�����������д�ñȽϹ���
		UserComparator02  c02=new UserComparator02();

		TreeSet<User>  mySet=new TreeSet<>(c01);    //ʹ�ñȽ���1�Ĺ���Ƚ�
	    
		User u1=new User(12,"Zoe");
		User u2=new User(23,"Jack");
		User u3=new User(46,"Ben");
	    User u4=new User(12,"Alex");
		User u5=new User(67,"Constantine");

		mySet.add(u1);
		mySet.add(u2);
		mySet.add(u3);
		mySet.add(u4);
		mySet.add(u5);                //ע�⣬����Ƚ�����compare()����ֻ�Ƚ����䣬��ô��һ�����"12,Zoe"
                                      //�ڶ������u4"12,Alex"����Ӳ���ȥ�ˣ�TreeSetԪ�ز����ظ���
		for(User u : mySet){
		    System.out.println("��һ��:"+u);    
		}
		/*
		  12:Zoe
          23:Jack
          46:Ben
          67:Constantine
		*/
        

		mySet.clear();              //�Ƴ�����Ԫ��
		mySet=new TreeSet<>(c02);    //ʹ�ñȽ���2�Ĺ���Ƚ�,������ͬ��Ƚ�����

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

class UserComparator01 implements Comparator<User> {    //�ȽϹ��� 1:ֻ�Ƚ������С������ע��:Comparator<T>�ӷ���
    public int compare(User u1, User u2){               //���򱨴� 
	    return u1.age - u2.age;
	}
}

class UserComparator02 implements Comparator<User> {    //�ȽϹ��� 2���ȱȽ��������������ͬ����Ƚ�������Ļ˳��
    public int compare(User u1, User u2){
	    
		if(u1.age==u2.age){
		   return u1.name.compareTo(u2.name);
		}
		return u1.age-u2.age;
		
	}

}