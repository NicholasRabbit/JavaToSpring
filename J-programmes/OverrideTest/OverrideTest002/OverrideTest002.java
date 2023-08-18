public class OverrideTest002{

	public static void main(String[] args){
	
	 UserService us = new UserServiceImpl();
	 us.buy();

	 us.sell();

	}

}


interface UserService{

	public Vehicle buy();

	public Sedan sell();
}

class UserServiceImpl implements UserService{

	//重写接口或者父类中的方法，返回值的类型可以是上级的子类，例Sedan是Vehicle的子类，
	//但不能是父类
	public Sedan buy(){
		System.out.println("buy");
		return null;
	}

	//这里编译报错，因为这个实现方法的返回值是其接口中返回值的父类，返回值的范围只能更小不能更大。
	public Vehicle sell(){
		System.out.println("sell");
	}

}
