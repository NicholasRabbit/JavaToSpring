public class OuterClass02 {

	//类内，方法外同名内部类
	public class InnerClass02{
		public InnerClass02(){
			System.out.println("innerclass out of method.");
		}
	}
	



	//3.1，方法中也可以定义内部类
	public void createInnerClassInMethod(){

		//注意：方法内的内部类不可用public修饰符,方法外的内部类可以用。
		//方法被调用时也不会默认实例化这个内部类，需要手写
		/*public*/ class InnerClassInMethod {
			public InnerClassInMethod(){
				System.out.println("InnerClassInMethod constructor.");
			}
		}

		new InnerClassInMethod();  //手动实例化

		//3.2如果类内部方法外有同名的内部类，这里new对象采取就近原则，实例化的时方法内的内部类。
		class InnerClass02{
			public InnerClass02(){
				System.out.println("innerclass in method");
			}
		}

		new InnerClass02();  //这里会调用方法内的内部类。

	}


}
