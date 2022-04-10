import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;

public class ObjectInputStreamTest001 {

    public static void main(String[] args){
	
	    ObjectInputStream ois=null;
		try{
		    ois=new ObjectInputStream(new FileInputStream("objectOut"));  //此处读取ObjectOutputStream写入的含有对象的文件
		                                                                  //亦称作反序列化。
			Object o1=ois.readObject();
			Object o2=ois.readObject();
			User  u2=(User)o2;
			System.out.println(u2);
			
		}catch(FileNotFoundException e){
		    e.printStackTrace();
		}catch(ClassNotFoundException e){
		    e.printStackTrace();
		}catch(IOException e){
		    e.printStackTrace();
		}finally{
		   if(ois != null){
		       try{
			      ois.close();
			   }catch(IOException e){
			      e.printStackTrace();
			   }
		   }
		}
	
	}

}