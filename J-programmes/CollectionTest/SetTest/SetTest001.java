import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;


public class SetTest001 {

    public static void main(String[] args){
	
	    SetTest001.hashSetMethod(); 
		
		treeSetMethod();
	
	}

	//HashSet��������ϰ
	public static void hashSetMethod(){
	    
		Set<String> myHashSet = new HashSet<String>();
		myHashSet.add("hello");
		myHashSet.add("���");
		myHashSet.add("there");
		myHashSet.add("hello");   //Set������Ԫ�ز����ظ���Ҳ�����ظ���Ӳ���ȥ

		Iterator<String> it=myHashSet.iterator();
		while(it.hasNext()){
		    String str=it.next();
			System.out.println(str);
		}
	}

	//TreeSet��������ϰ������SortedSet�ӿ�ʵ���࣬SortedSet���ڲ�Ԫ�����򲻿��ظ�������Ԫ�ػ��Զ�����,���������������������д�С˳��ġ�
	public static void treeSetMethod(){
	
	   Set<Integer>  myTreeSet = new TreeSet<Integer>();
	   myTreeSet.add(5);
	   myTreeSet.add(2);
	   myTreeSet.add(4);
	   myTreeSet.add(1);
	   myTreeSet.add(3);

	   Iterator<Integer> it2=myTreeSet.iterator();
	   while(it2.hasNext()){
	       Integer i=it2.next();
		   System.out.println(i);      //���˳����:1,2,3,4,5��˵���������Զ�����
	   }


	}

}