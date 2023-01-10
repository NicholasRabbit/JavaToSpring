
/*
* 测试私有属性的访问，详见NodeDemo.java内笔记
*/
public class PrivateTest {

	public static void main(String[] args){
		//同名类可以直接访问私有属性
		NodeDemo n = new NodeDemo();
		int ret = n.getPrivateNum(new NodeDemo(10));
		System.out.println("number==> " +ret);
		//不同类中不可以访问
		User user = new User(new NodeDemo(20));
		user.getNum();

	}

}