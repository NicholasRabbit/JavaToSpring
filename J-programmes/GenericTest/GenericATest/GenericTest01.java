
import java.util.*;

/*
* 1,什么是泛型？
* 泛型的本质是为了参数化类型，即在不创建新类的情况下可设置属性的类型。
* 也就是说在泛型使用过程中，操作的数据类型被指定为一个参数，
* 
* 2,为什么使用泛型？
* 类：减少新类的创建，例如List<..>指定好泛型后，也可以指定其他的泛型，不用再新写一个类了。
* 接口：接口确定泛型后，只需由其实现了确定泛型即可。
* 
* 3,其他
* 泛型如果不指定默认为Object。
* 建议使用有泛型的类时指定泛型类型。最好不要用默认的Object。
* 
* 4,泛型可用在哪里？
* 泛型结构可以用在类、接口和方法中，分别被称为泛型类、泛型接口、泛型方法
*
* 5,泛型使用注意事项：
* (1),泛型可以写多个用逗号隔开，BaseDao<User,Student,Customer>
* (2),泛型的属性不可以用在静态方法中，因为泛型是在实例化的时候才确定的，而静态方法在类加载的时候就确定了。
* (3),泛型不可使用基本数据类型，可使用其对应的包装类型。
* 
* 6,泛型方法注意事项：
* (1)泛型方法中指定的泛型可与类不一样，
* (2)另外泛型方法也可用在普通没有指定泛型的类或接口中，即只单独指定方法的泛型。
* 例：java集合类的接口
  public interface Collection<E> extends Iterable<E>{
	<T> T[] toArray(T[] a);  //这个是泛型方法，泛型参数和类或接口中的泛型参数没有任何关系，是独立的。
	boolean add(E e);  //这个不是泛型方法，是个普通方法。
  } 
*
*/
public class GenericTest01 {
	
	public static void main(String[] args){
		
		//1,泛型中的继承
		//(1)对于不使用泛型的情况，直接使用多态语法没错
		BaseEntity entity = null;
		entity = new User();  
		//(2)数组使用多态语法也没错，因为数组中的元素User是BaseEntity的子类。
		BaseEntity[] arr1 = null;
		User[] arr2 = new User[10];
		//(3)但是对于泛型不行，这里list1和list2是平级关系，不是继承。
		List<BaseEntity> list1 = null;
		List<User> list2 = new ArrayList<>();
		//list1 = list2;   //报错：错误: 不兼容的类型: List<User>无法转换为List<BaseEntity>
		
		//5.(4)多个泛型
		BaseDao<BaseEntity,User,Student> baseDao = new BaseDao<BaseEntity,User,Student>();
		baseDao.doSome(new BaseEntity(),new User(),new Student());
	}


}

class BaseEntity {

}

class User extends BaseEntity{

}

class Student extends BaseEntity {

}

//设置多个泛型
class BaseDao<T,E,M> {
	
	public void doSome(T t,E e,M m){
		System.out.println(t + ":" + e + ":" + m);
	}

}
