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
		myTreeSet.add(u1);     //TreeSet�ڲ�Ԫ��������Ĳ����ظ��ģ���������TreeSet�����ӽ���Ԫ���Զ�����
		myTreeSet.add(u2);     //�Զ���Ԫ������Userû��ʵ��Comparable�ӿڣ��ڲ�û����дʵ��compareTo()������
		myTreeSet.add(u3);     //���޷��ȽϺ�������������ͨ����������ʱCastException�쳣��
		*/

		myTreeSet.add(100);
		myTreeSet.add(120);       //java�Դ���Integer,String��ʵ����Comparable�ӿڣ�����д��compareTo()��������˲�����
		//myTreeSet.add("abc");   //ע����б�����Ϊǰ����Integer ���ͣ������ٴ�String���ͣ�TreeSet�ڲ��޷��Ƚ������࣬����ʱCastException�쳣
        int size=myTreeSet.size();
		System.out.println(size);
	
	}

}


class User {
	private int age;
}