import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;



public class TreeSetTest001 {

    public static void main(String[] args){
	
	     treeSetMethod();
	
	}

	public static void treeSetMethod(){
	
	    User u1, u2, u3, u4, u5;
		u1=new User();
		u2=new User();
		u3=new User();
		u4=new User();
		u5=new User();
		
		Set myTreeSet=new TreeSet();

		/*
		myTreeSet.add(u1);     //TreeSet内部元素是无序的不可重复的，但是由于TreeSet会对添加进来元素自动排序
		myTreeSet.add(u2);     //自定义元素类如User没有实现Comparable接口，内部没有重写实现compareTo()方法，
		myTreeSet.add(u3);     //则无法比较和排序，因此虽编译通过，但运行时CastException异常。
		*/

		myTreeSet.add(100);
		myTreeSet.add(120);       //java自带的Integer,String类实现了Comparable接口，并重写了compareTo()方法，因此不报错。
		//myTreeSet.add("abc");   //注意此行报错，因为前面存的Integer 类型，后面再存String类型，TreeSet内部无法比较这两类，运行时CastException异常
        int size=myTreeSet.size();
		System.out.println(size);
	
	}

}


class User {
	private int age;
}