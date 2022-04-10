import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;

//�Ѷ���������л��ķ��������Ѷ���Ž�������ٰѼ���д��Ӳ����������л�
public class ObjectOutputStreamTest002 {

    public static void main(String[] args){
	 
	     ObjectOutputStream oos=null;
		 try{
		     oos=new ObjectOutputStream(new FileOutputStream("objetStudent"));
			 
			 List<Student> myList=new ArrayList<Student>();
			 Student stu01=new Student("�ŷ�",45);
             Student stu02=new Student("����",46);
			 Student stu03=new Student("����",55);
			 Student stu04=new Student("�ܲ�",60);
			 myList.add(stu01);
			 myList.add(stu02);
			 myList.add(stu03);
			 myList.add(stu04);

			 oos.writeObject(myList);  //�����������ֱ��д���϶������֣����Ѷ��������������л�

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