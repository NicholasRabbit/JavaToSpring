import java.util.Collection;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;

public class CollectionTest003 {

    public static void main(String[] args){
	
	    iteratorMethod();    
	
	}
	public static void iteratorMethod(){
	
	    Collection c=new HashSet();
        
		//Set���ϴ��ȥ��һ��˳��ȡ����һ������ͬ��˳��
		c.add(456);  //ע��˴�int��������ֵ456���Զ�װ�䣬Integer i=new Integer(456);ʵ�ʱ����ȥ����i���ڴ��ַ��
		c.add("Hello");
		c.add("Again");
		User u=new User("�û����Զ���");
		c.add(u);
		c.add(3.1f);
		c.add(3.14);

		//Set���ϲ��ɴ洢�ظ�Ԫ�أ����´治��ȥ������Ҳ���������쳣
		c.add("Hello");
		
		Iterator it=c.iterator();
		while(it.hasNext()){
		    Object obj=it.next();    //���������ص�Ԫ�ض���Object����
			System.out.println(obj); //����println()����������valueOf()���������������Ͷ�תΪ��String���͡� 
		}
	
	}

}

class User {
    private String name;

	public User(){
	
	}
	public User(String name){
	    this.name=name;
	}
    public String toString(){
	    return  this.name;
	}
}