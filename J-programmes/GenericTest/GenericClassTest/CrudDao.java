
//在类中使用泛型
public class CrudDao<T> {

	//查询单条数据
	//注意：这个不是泛型方法，是普通的方法
	public T get(T t){ 
		System.out.println("查询中..." + t);
		return t;
	}
}