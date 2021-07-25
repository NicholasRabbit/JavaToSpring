import java.util.Properties;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

/*
������Ƶ������,�����ǲ����޸Ĵ��룬ֻ�޸������ļ�info.properties�Ϳ��Դ�����ͬ�Ķ���
�߼���ܵײ���ǲ���������ԭ��
*/
public class ReflectTest003 {

    public static void main(String[] args){
	
	     
		    FileReader fr=null;
		 try{
            //��ȡ�ļ����ļ����ݣ�className=User,ֻ��Ҫ�޸��ļ���
			//��User��Ϊ����࣬��Student�ȣ�����Ĵ��벻�øĶ�,�Ϳ���ʵ������ͬ�Ķ���
			fr=new FileReader("info.properties");  
  		    
			//Properties���ֵ����String���ͣ��������淴����Ʒ����Ĳ�������
			Properties pro=new Properties();  
		    pro.load(fr);  //���ļ�������Ϊ����ŵ�����Properties����
			
			String className=pro.getProperty("className");   //ͨ��key�õ�value
			Class c=Class.forName(className);
			
			//ͨ������ʵ��������User
			Object obj=c.newInstance();
			System.out.println(obj);

		 }catch(FileNotFoundException  e ){  
			e.printStackTrace();
		 }catch(IOException e){
		    e.printStackTrace();
		 }catch(ClassNotFoundException | InstantiationException | IllegalAccessException e){
			e.printStackTrace();
		 }finally{
		    if(fr != null){
			   try{
			      fr.close();
			   }catch(IOException e){
			      e.printStackTrace();
			   }
			}
		 }
	     
		 	
		
		 
	
	}

}

class User{
}
class Student {
}