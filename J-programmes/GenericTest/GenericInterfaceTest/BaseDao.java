

//定义一个接口，在此使用泛型
public interface BaseDao<T> {

	public abstract T get(T t); 
}