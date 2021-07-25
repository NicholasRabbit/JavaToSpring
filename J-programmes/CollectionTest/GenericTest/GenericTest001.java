import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


public class GenericTest001 {

    public static void main(String[] args){
	
	   genericMethod();   
	
	}

	public static void genericMethod(){
	                                                //JDK5以后引入了泛型
	    List <String> ls=new ArrayList <String>();  //泛型语法，即规定好集合是什么类型，以后只能存贮此种类型

		ls.add("你好");
		ls.add("地球");

		Iterator<String> it=ls.iterator();   //前面集合规定好泛型后，使用迭代器也要规定好同样的类型 
                                             //如果不规定，则迭代器默认返回Object类型，后面的String str接收就报错了
		while (it.hasNext()){
			String str=it.next();
			System.out.println(str);
		}

	
	}

}