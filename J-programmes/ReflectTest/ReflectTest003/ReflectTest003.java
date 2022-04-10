import java.util.Properties;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

/*
反射机制的灵活性,本例是不用修改代码，只修改配置文件info.properties就可以创建不同的对象
高级框架底层就是采用了这种原理
*/
public class ReflectTest003 {

    public static void main(String[] args){
	
	     
		    FileReader fr=null;
		 try{
            //读取文件，文件内容：className=User,只需要修改文件，
			//把User改为别的类，如Student等，下面的代码不用改动,就可以实例化不同的对象
			fr=new FileReader("info.properties");  
  		    
			//Properties里键值都是String类型，符合下面反射机制方法的参数类型
			Properties pro=new Properties();  
		    pro.load(fr);  //把文件内容作为对象放到集合Properties里面
			
			String className=pro.getProperty("className");   //通过key得到value
			Class c=Class.forName(className);
			
			//通过反射实例化对象User
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