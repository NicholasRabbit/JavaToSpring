import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

//因为放进TreeSet集合中的元素会被自动排序，所以自定义类元素需要定义比较规则
//本例使用构建自定义比较器的方法，即实现Comparator接口，重写接口中的compare()方法；
public class ComparatorTest001 {

    public static void main(String[] args){
	
	    Set<Student> mySet=new TreeSet<>(new StudentComparator());   //注意，这里新建集合对象是必须把自定义的比
		                                                             //较器传进去,调用有参构造传
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
                                                            //!!注意比较器Comparator<>后面加具体的泛型
class StudentComparator implements Comparator<Student> {    //重写比较器，定义比较规则

    public int compare(Student s1, Student s2){
	    return s1.getAge()-s2.getAge();
	}
	//如果return s2.getAge()-s1.getAge()的话，则得到元素是降序，顺序相反。
}