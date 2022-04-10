import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;

//把多个对象序列化的方法，即把对象放进集合里，再把集合写进硬盘里，进行序列化
public class ObjectOutputStreamTest002 {

    public static void main(String[] args){
	 
	     ObjectOutputStream oos=null;
		 try{
		     oos=new ObjectOutputStream(new FileOutputStream("objetStudent"));
			 
			 List<Student> myList=new ArrayList<Student>();
			 Student stu01=new Student("张飞",45);
             Student stu02=new Student("关羽",46);
			 Student stu03=new Student("刘备",55);
			 Student stu04=new Student("曹操",60);
			 myList.add(stu01);
			 myList.add(stu02);
			 myList.add(stu03);
			 myList.add(stu04);

			 oos.writeObject(myList);  //这里参数可以直接写集合对象名字，即把多个对象进行了序列化

             oos.flush();
		 }catch(FileNotFoundException e){
		     e.printStackTrace();
		 }catch(IOException e){
		     e.printStackTrace();
		 }finally{
		     if(oos != null){
			    try{
				   oos.close();
				}catch(IOException e){
				   e.printStackTrace();
			    }
			 }
		 }
	    
	}
}

class Student implements Serializable {
 
    private String name;
	private int age;

	public Student(){
	
	}
	public Student(String name, int age){
	    this.name=name;
		this.age=age;
	}

	public String toString(){
	
	    return "User{"+"name:"+name+" age:"+age+"}";
	}
}