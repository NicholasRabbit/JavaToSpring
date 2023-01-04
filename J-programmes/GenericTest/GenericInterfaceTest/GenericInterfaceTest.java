
//接口中使用泛型范例
public class GenericInterfaceTest {

	public static void main(String[] args){
		
		BaseDao<User> userDao = new UserDao();
		userDao.get(new User(1001,"Tom"));

		BaseDao<Student> stuDao = new StudentDao();
		stuDao.get(new Student(1006,"Jack",33.5));


	}


}