import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;

//���л����Ѷ���洢��Ӳ�̵Ĺ��̳������л����������JVM����������һ�����л�Ψһ�İ汾��
//        ǰ���ǣ����������̳�Serialable�࣬���򱨴�:NotSerializableException
//Ȼ��ʹ��ObjectOutputStream�Ѷ���д��Ӳ�̣�������Ĺ��̾������л�
public class ObjectOutputStreamTest001 {

    public static void main(String[] args){
	    	ObjectOutputStream oos=null;
			
			try{                           //�β��ǳ�����OutputStream, ��������������FileOutputStream
				oos=new ObjectOutputStream(new FileOutputStream("objectOut"));  //д������ļ������ü��±�ֱ�Ӵ򿪣�������
				User u1=new User("Tom",30);
				User u2=new User("Jerry",25);
				oos.writeObject(u1);
				oos.writeObject(u2);

				oos.flush();
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


class User implements Serializable {
 
    private String name;
	private int age;

	public User(){
	
	}
	public User(String name, int age){
	    this.name=name;
		this.age=age;
	}

	public String toString(){
	
	    return "User{"+"name:"+name+" age:"+age+"}";
	}
}