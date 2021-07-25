import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;

//序列化：把对象存储到硬盘的过程称作序列化，这个过程JVM会给对象分配一个序列化唯一的版本号
//        前提是，对象类必须继承Serialable类，否则报错:NotSerializableException
//然后使用ObjectOutputStream把对象写进硬盘（输出）的过程就是序列化
public class ObjectOutputStreamTest001 {

    public static void main(String[] args){
	    	ObjectOutputStream oos=null;
			
			try{                           //形参是抽象类OutputStream, 这里用它的子类FileOutputStream
				oos=new ObjectOutputStream(new FileOutputStream("objectOut"));  //写的这个文件不能用记事本直接打开，会乱码
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