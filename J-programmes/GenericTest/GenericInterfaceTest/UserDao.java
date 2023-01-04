
//如果查询User数据就写个UserDao;
//UserDao实现BaseDao时要确定好泛型，否则报错;
//								BaseDao<T> 这里还写形参就报错;
//注意：实际开发中xxxDao是接口，这里写为class仅作演示效果。
public class UserDao implements BaseDao<User> {

	//查询单条数据
	//注意：这个不是泛型方法，是普通的方法
	public User get(User user){ 
		System.out.println("查询中..." + user);
		return user;
	}


}