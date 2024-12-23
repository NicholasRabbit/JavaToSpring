
import java.util.*;

/*
根据Lamda课程，个人练习范例，初识Lambda。
Lambda的常见用途
*/
public class LambdaTest002 {

	public static void main(String[] args){
		
		anonymousTest();
		implementInterfaceWithLambda();

	}


	//1，用在匿名内部类的创建上
	public static void anonymousTest(){
		//(1),原来的创建匿名内部类的方式
		Comparator<String> comparator = new Comparator<String>(){
			public int compare(String o1,String o2){
				return Integer.compare(o1.length(),o2.length());
			}
		};

		TreeSet<String> set01 = new TreeSet<String>(comparator);  //复习，放进Set集合内的对象要继承Comparable或写一个比较器Comparator
		set01.add("ab");
		set01.add("hijkl");
		for(String s : set01){
			System.out.println("set01==>" + s);
		}
		//(2),使用Lambda表达式的方式创建匿名内部类
		Comparator<String> comparator02 = (x,y) -> Integer.compare(x.length(),y.length());   //注意Comparator要加泛型
		TreeSet<String> set02 = new TreeSet<>(comparator02);
		set02.add("123");
		set02.add("123456");
		for(String s : set02){
			System.out.println("set02==>" + s);
		}

	}

	// 2, To represent an instance of an interface with Lambda expression.  (Duplicate with LamdaTest001, but more elabrate)
    public static void implementInterfaceWithLambda() {
		// 2.1 The first approach to create an instace.
        StringParser sp = (String name) -> {
            int i = 10;
            return i;
        };

		// 2.2 The second approach which is more concise
        StringParser m2 = name -> name.length();
		// We can also use a static method in the lambda expression.
        StringParser m3 = name -> getLength(name); 

        int tom = sp.getLength("Tom");
        System.out.println(tom);
    }

    static int getLength(String str) {
        return str.length();
    }
	

}


// An interface
interface StringParser {
    int getLength(String name);
}
