
import java.util.*;

/*
Lambda表达式：双冒号的用法
(1)类名::静态方法名，例：Integer::parseInt();
*/
public class DoubleColonTest {

	public static void main(String[] args){
		
		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.forEach(System.out::println);
	}
}