
import java.util.*;
/*
 * Will the metod of remove() remove all the elements which equal to the argument?
 * The answer is no.
 * After reading the source code in System.java, I learned that the first element will be removed and then the method is finished.
 * */
public class ListRemoveTest{
	
	public static void main(String[] args){
		remove();
	}	

	public static void remove(){
		String s1,s2,s3,s4,s5;
		s1 = "A";
		s2 = "B";
		s3 = "C";
		s4 = "A";
		s5 = "D";
		List<String> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.remove(s1);
		
		System.out.println("list==>" + list);

	
	}
}
