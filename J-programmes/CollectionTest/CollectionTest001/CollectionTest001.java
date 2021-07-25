import java.util.Collection;
import java.util.ArrayList;

/*
编译报警信息，但不影响运行
“注: CollectionTest001.java使用了未经检查或不安全的操
注: 有关详细信息, 请使用 -Xlint:unchecked 重新编译。”

原因：jdk1.5版本以后，集合类创建增加了泛型:<E>，就是对集合内元素的类型设定进行检查，需要指定数据类型，例如指定String ,int等类型
指定类型以后语法:  Collection <String> c = new ArrayList <String> ();只能添加String类型，这样可避免以后引用c调用实现类方法不需向下转型，减少运行时
异常，例如ClassCastException等的出现

有了泛型以后：

    代码更加简洁【不用强制转换】
	程序更加健壮【只要编译时期没有警告，那么运行时期就不会出现ClassCastException异常】
	可读性和稳定性【在编写集合的时候，就限定了类型】



*/

public class CollectionTest001 {

    public static void main(String args[]){
	
	    collectionMethod();
	}

	public static void collectionMethod(){
	
	    Collection  c=new ArrayList();   //Collection是一个接口，属于抽象类，不能new对象，只能使用多态语法。
		//这里可规定好泛型,这样编译器就不会报警了。如下：
		//Collection <String> c = new ArrayList <String> ();

		c.add("你好");     //Collection里的add()方法练习，返回值布尔类型，添加时有重复的元素则返回false
		c.add("朋友");     //add(..)方法自动把元素加到集合内末尾
		
		c.add(123);      //如果规定好泛型，类型是String那么添加别的类型则会编译异常。
		c.add(0.5f);
		c.add(true);  
		

		int a=c.size();   //检查集合中元素个数，返回值int类型。
		System.out.println(a);

		boolean b=c.contains(123);  //Collection里的contains方法，验证是否含有某个元素，返回值布尔类型。
		boolean b2=c.contains("你好不好");
		System.out.println("b: "+b+" b2:"+b2);

		Object[]  objArray=c.toArray();  //把集合中对象以Object类型数组的形式返回
		for(int i=0;i<objArray.length; i++){
		    Object o=objArray[i];
			System.out.println("Object数组遍历："+o);
		}

		c.remove(123);    //移除元素方法remove(实参);
		System.out.println("元素个数:"+c.size());

		c.clear();   //清空全部元素
		System.out.println("元素个数:"+c.size());   

		boolean b3=c.isEmpty();  //检查集合是否为空，空则返回true
		System.out.println(b3);

		
	
	}
    

}


class User {

}