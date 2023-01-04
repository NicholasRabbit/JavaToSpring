
import java.util.*;

//方法中使用泛型
public class BaseDao<T> {

	private T t;
	
	/*
	* 1,泛型方法的参数可以和类中的泛型参数不同，因为泛型方法是独立的。
	* 2,泛型方法也可以出现在不带泛型的类或接口中。
	* 3,注意写法，public后的<E>表示这个方法是个泛型方法，不写则报错。类似于static的位置。
	*/
	public <E> List<E> toList(E[] e){
		List<E> list = new ArrayList<>();
		for(int i = 0; i < e.length; i++){
			list.add(e[i]);
		}
		return list;

	}

	//这个不是泛型方法
	public int add(T t){
		System.out.println("add");
		return 0;
	}

}