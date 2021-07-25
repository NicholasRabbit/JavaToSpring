import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class RemoveTest001{

    public static void main(String[] args){
	
         Collection c=new ArrayList();
		 
		 c.add("123");
		 c.add("abc");
		 String s=new String("123");

		 //remove底层调用equals方法，而String类里又重写了equals方法
		 //因此下面移除s,实际移除了同内容的“123”
		 c.remove(s);      

		 Iterator it=c.iterator();

		 while(it.hasNext()){
		     Object o=it.next();
			 System.out.println(o);
		 }


	}

}