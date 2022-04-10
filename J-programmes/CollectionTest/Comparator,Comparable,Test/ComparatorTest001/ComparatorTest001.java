import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

//��Ϊ�Ž�TreeSet�����е�Ԫ�ػᱻ�Զ����������Զ�����Ԫ����Ҫ����ȽϹ���
//����ʹ�ù����Զ���Ƚ����ķ�������ʵ��Comparator�ӿڣ���д�ӿ��е�compare()������
public class ComparatorTest001 {

    public static void main(String[] args){
	
	    Set<Student> mySet=new TreeSet<>(new StudentComparator());   //ע�⣬�����½����϶����Ǳ�����Զ���ı�
		                                                             //��������ȥ,�����вι��촫
		mySet.add(new Student(15));
		mySet.add(new Student(40));
		mySet.add(new Student(23));
		mySet.add(new Student(60));
		mySet.add(new Student(10));

        for(Student stu : mySet){
	        System.out.println(stu);  	
		}

	}

}

class Student {

    private int age;

	public Student(){
	
	}
	public Student(int age){
	    this.age=age;
	}

	public int getAge(){
	    return this.age;
	}

	public String toString(){
	    return "age: "+age;
	}
}
                                                            //!!ע��Ƚ���Comparator<>����Ӿ���ķ���
class StudentComparator implements Comparator<Student> {    //��д�Ƚ���������ȽϹ���

    public int compare(Student s1, Student s2){
	    return s1.getAge()-s2.getAge();
	}
	//���return s2.getAge()-s1.getAge()�Ļ�����õ�Ԫ���ǽ���˳���෴��
}