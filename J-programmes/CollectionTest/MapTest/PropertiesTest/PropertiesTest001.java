import java.util.Properties;
import java.util.Map;
import java.util.Hashtable;

//Properties�����ﳣ�÷���
public class PropertiesTest001 {

    
    public static void main(String[] args){    //Properties��Hashtable�����࣬��Hashtable����һ����Ҳ���̰߳�ȫ�ģ�����Ҫ��ҵ��Hashtableһ����������key,valueԪ��Ϊnull�ȵ�
	                                           //�������ڴ洢��Ԫ��key,value��Ҫ����String���͡�
	    
		Properties myPro=new Properties();     //��Properties���������Ԫ�أ�ע����Hashtable�ķ���put��һ��
        
		myPro.setProperty("1", "A");
		myPro.setProperty("2", "B");
		myPro.setProperty("3", "C");
		myPro.setProperty("4", "D");

		int size=myPro.size();                 //Ԫ�ظ���  
		System.out.println("��ֵ�Ը���:"+size);  

		String value=myPro.getProperty(2);     //ͨ����key��ȡֵvalue��
		System.out.println(value);
	
	}

}