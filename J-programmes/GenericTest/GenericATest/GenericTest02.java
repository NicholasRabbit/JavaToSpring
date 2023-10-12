public class GenericTest02 {

	public static void main(String[] args){
		//多个泛型
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
