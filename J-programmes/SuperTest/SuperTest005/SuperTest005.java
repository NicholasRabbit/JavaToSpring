

/*
* 通过super来研究动态绑定和静态绑定
* Java多态中：父类中的属性属于静态绑定，编译时就确定了，
* 因此使用多态无法调用子类特有的属性。
* 而方法属于动态绑定，运行时会动态指向子类对象
*/
public class SuperTest005 {

	public static void main(String[] args){
		
	}
}


abstract class BaseEntity{
	//私有的属性不会被继承，但是get
	private int id;
	private String name;

	public 
}