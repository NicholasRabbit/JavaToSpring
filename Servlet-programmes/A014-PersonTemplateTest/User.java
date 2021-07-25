public class User extends PersonTemplate {

	public void m1(){
		System.out.println("用户注册");  //这里按照模板类，即父类里的顺序执行方法，即使这里把m1()写最后也是先执行
	}

	public void m2(){
		System.out.println("用户登录");
	}

	public void m3(){
		System.out.println("用户退出");
	}
}