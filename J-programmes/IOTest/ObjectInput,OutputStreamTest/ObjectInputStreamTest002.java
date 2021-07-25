import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


public class ObjectInputStreamTest002 {

    public static void main(String[] args){
	
	    ObjectInputStream ois=null;
		try{                           //从ObjectOutputStreamTest002写好的文件进行反序列化 
		    ois=new ObjectInputStream(new FileInputStream("objetStudent"));  
			
			/*
			Object obj=ois.readObject();     //此处进行验证，readObject()方法返回的Object对象其实是一个集合对象
			boolean b=obj instanceof ArrayList;
			System.out.println(b);           //结果为true
			*/

			
			ArrayList myList=(ArrayList)ois.readObject();  //根据上面的结论可得，把Object对象obj向下转型为ArrayList
			Iterator it=myList.iterator();
			while(it.hasNext()){
			    Student stu=(Student)it.next();
				System.out.println(stu);
			}
			
			
		}catch(IOException e){
			    e.printStackTrace();
		}catch(ClassNotFoundException e){
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