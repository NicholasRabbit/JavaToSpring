

/*
* 通过super来研究动态绑定和静态绑定
* Java多态中：父类中的属性属于静态绑定，编译时就确定了，
* 因此使用多态无法调用子类特有的属性。
* 而方法属于动态绑定，运行时会动态指向子类对象
* unfinished...
*/
public class SuperTest005 {

	public static void main(String[] args){
		
		User user = new User();
		int id = user.getId();
		System.out.println("id==>" + id);
	}
}


abstract class BaseEntity{
	//私有的属性不会被继承，但是get方法是公共的，可以被继承。
	private int id;
	private String name;

	public int getId(){
		return this.id;
	}
}

class User extends BaseEntity {

}
