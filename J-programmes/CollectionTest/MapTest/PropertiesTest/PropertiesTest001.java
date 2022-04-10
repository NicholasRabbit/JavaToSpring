import java.util.Properties;
import java.util.Map;
import java.util.Hashtable;

//Properties集合里常用方法
public class PropertiesTest001 {

    
    public static void main(String[] args){    //Properties是Hashtable的子类，与Hashtable特征一样，也是线程安全的，其他要求业余Hashtable一样，不允许key,value元素为null等等
	                                           //但是其内存储的元素key,value都要求是String类型。
	    
		Properties myPro=new Properties();     //往Properties集合内添加元素，注意与Hashtable的方法put不一样
        
		myPro.setProperty("1", "A");
		myPro.setProperty("2", "B");
		myPro.setProperty("3", "C");
		myPro.setProperty("4", "D");

		int size=myPro.size();                 //元素个数  
		System.out.println("键值对个数:"+size);  

		String value=myPro.getProperty(2);     //通过键key获取值value。
		System.out.println(value);
	
	}

}