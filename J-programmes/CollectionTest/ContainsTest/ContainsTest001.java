import java.util.Collection;
import java.util.ArrayList;


public class ContainsTest001 {

    public static void main(String[] args){
	
	   containsMethod();

	   containsMethod2();
	}

	public static boolean containsMethod(){
	
       Collection  c=new ArrayList();
	   String s1=new String("Churchill");
	   String s2=new String("Linclon");
	   String z=new String("Churchill");

	   c.add(s1);
	   c.add(s2);
       
	   //��������contains(..)�����ײ�Դ�����յ��õ���equals��������֤�Ƿ���ĳһ����
	   //��ΪString������д��equals��������������bΪtrue��
	   boolean b=c.contains(z);   //��֤����c���Ƿ���String�����:z
	   System.out.println(b); 
	   
	   return b;
	
	}

	public static boolean containsMethod2(){
	 
	      User u1=new User("Tom");    
		  User u2=new User("Jerry");
		  User m=new User("Tom");

		  Collection c=new ArrayList();
		  c.add(u1);
		  c.add(u2);
	      
		  //User����û����дequals(..)���������contains(..)�������յ���equals(..)ʱ��
		  //�Ƚϵ�������������ڴ��ַ�������������ݣ���m��u1���ڴ��ַ����ͬ��
		  boolean b=c.contains(m);
		  System.out.println("User��û��дequals���������:"+b);

		  return b;
	} 

}

class User {
	private String name;
	public User(){
	
	}
	public User(String name){
	    this.name=name;
	}
}