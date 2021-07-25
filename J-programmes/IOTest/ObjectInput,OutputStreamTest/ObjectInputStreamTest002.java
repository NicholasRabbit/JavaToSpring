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
		try{                           //��ObjectOutputStreamTest002д�õ��ļ����з����л� 
		    ois=new ObjectInputStream(new FileInputStream("objetStudent"));  
			
			/*
			Object obj=ois.readObject();     //�˴�������֤��readObject()�������ص�Object������ʵ��һ�����϶���
			boolean b=obj instanceof ArrayList;
			System.out.println(b);           //���Ϊtrue
			*/

			
			ArrayList myList=(ArrayList)ois.readObject();  //��������Ľ��ۿɵã���Object����obj����ת��ΪArrayList
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