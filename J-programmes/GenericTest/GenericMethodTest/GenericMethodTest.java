
import java.util.*;
/*
* 方法中使用泛型：
* 1，泛型方法跟泛型类或接口是相互独立的，即泛型方法不一定在泛型类或接口中。
* 2，其它见BaseDao.java。
*/
public class GenericMethodTest {

	public static void main(String[] args){
		
		//类的泛型是String
		BaseDao<String> baseDao = new BaseDao<>();
		
		//方法的泛型是Integer
		Integer[] array = new Integer[]{1,2,3,4,5};
		List<Integer> list = baseDao.toList(array);
		System.out.println(list);
	
	}


}



