
/*
* 接口和类中使用泛型注意事项：
* 1，泛型类不能在静态方法中使用，因为泛型是在实例化的时候才确定的，
*    而静态方法是在类加载的时候就确定了。
*	 泛型类中的泛型必须在实例化的时候指定，否则默认都是Oject.
*
* 2，异常类及其子类是不能指定泛型的。
* 3，泛型如果不指定就会默认是Object，因此要用就一直用，别前面用，后面不用的话就变成Object了。
* 4，子类可以不保留父类的泛型等情况参照 ：二
*/
public class GenericClassTest {

	public static void main(String[] args){
		
		//一，这里泛型参数就可以传不同的java类型，而不用为每个类重写一个CrudDao了。
		//泛型使用User
		CrudDao<User> dao = new  CrudDao<User>();
		dao.get(new User(1001,"Tom"));
		//泛型改为Student
		CrudDao<Student> dao2 = new  CrudDao<Student>();
		dao2.get(new Student(1003,"Lily",30.6));
		
		
		//二，继承中泛型使用的几种情况：见BaseDao
		new BaseDao<User,Student>();
		



	}
}

