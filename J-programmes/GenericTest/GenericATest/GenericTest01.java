
import java.util.*;

/*
* 1,什么是泛型？
* 泛型的本质是为了参数化类型，即在不创建新类的情况下可设置属性的类型。
* 也就是说在泛型使用过程中，操作的数据类型被指定为一个参数，
* 
* 2,为什么使用泛型？
* 类：减少新类的创建，例如List<..>指定好泛型后，也可以指定其他的泛型，不用再新写一个List类了。
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
		BaseEntity[] arr1 = new User[10];
		//(3)但是对于泛型不行，泛型不适用于多态语法，这里list1和list2是平级关系，不是继承。
		List<BaseEntity> entityList = null;
		List<User> userList = new ArrayList<User>();

		//list1 = list2;   //报错：无法赋值，错误: 不兼容的类型: List<User>无法转换为List<BaseEntity>
	
		BaseDao baseDao = new BaseDao();

		baseDao.saveBatch(entityList); //不报错

		//baseDao.saveBatch(userList);  //错误: 不兼容的类型: List<User>无法转换为List<BaseEntity>
								   
		//(4)解决(3)中的问题, 可以使用上界通配符<? extends BaseEntity> 表示参数可以是BaseEntity的子类。
		baseDao.update(userList);  //这里不报错
		
		//(5)还有下界通配符<? super Student>，表示参数可以是指定泛型的类型，或者其父类直到Object都可以。
		List<Student> studentList = new ArrayList<>();
		baseDao.find(studentList);
		baseDao.find(entityList);   //可以是其父类

		
	}


}

class BaseEntity {

}

class User extends BaseEntity{

}

class Student extends BaseEntity {

}

class BaseDao {


	//这里只能传入特定的<BaseEntity>泛型，不能传BaseEntity的子类
	public boolean saveBatch(List<BaseEntity> list){
		System.out.println("saveBatch");
		return true;
	}
		
	//使用<? extends ..>的形式，这样入参中List的泛型可以是BaseEntity的子类了。
	public boolean update(List<? extends BaseEntity> list){
		System.out.println("update...");
		return true;
	}

	public boolean find(List<? super Student> list){
		System.out.println("find...");
		return true;
	}


}
