public class OuterClass {
	
	private String name;

	//1，public修饰的实例内部类，实例内部类可以直接访问外部类是实例变量
	public class InnerClass {
		public void inMethod(){
			System.out.println("public实例内部类实例方法执行==>" + name);
		}		
	}

	
	//2，(1)private修饰的内部类, 继承一个抽象类，外部用多态来声明私有内部类对象，因为不能从外部直接访问私有类
	private class PrivateInnerClass extends MyAbstractClass{
		//重写抽象类的方法
		public void doSome(){
			System.out.println("pirvate实例内部类实例方法执行==>" + name);
		}
	}
	//2，(2)外部要获取private修饰的内部类，需要通过此方式，跟获取私有属性一样。
	public PrivateInnerClass getPrivate(){
		return new PrivateInnerClass();
	}

	
	public void setName(String name){
		this.name = name;
	}


	

}
