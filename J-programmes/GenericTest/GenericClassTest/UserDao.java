
public class UserDao<User> extends CrudDao<User> {  

}
//2,子类不使用父类的放行，只写<T>不报错。可以这么理解，我子类本身也是个独立的类，当然可以定自己的泛型。
class UserDao02<T> extends CrudDao{}


