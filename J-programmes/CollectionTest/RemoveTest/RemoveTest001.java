import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class RemoveTest001{

    public static void main(String[] args){
	
         Collection c=new ArrayList();
		 
		 c.add("123");
		 c.add("abc");
		 String s=new String("123");

		 //remove�ײ����equals��������String��������д��equals����
		 //��������Ƴ�s,ʵ���Ƴ���ͬ���ݵġ�123��
		 c.remove(s);      

		 Iterator it=c.iterator();

		 while(it.hasNext()){
		     Object o=it.next();
			 System.out.println(o);
		 }


	}

}