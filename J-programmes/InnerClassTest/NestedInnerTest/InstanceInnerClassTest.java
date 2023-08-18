public class InstanceInnerClassTest{

	public static void main(String[] args){
		//创建实例内部类对象的方式
		//1,首先要创建外部类对象
		OuterClass outer = new OuterClass();
		outer.setName("Tom");
		//2.1,通过外部类.new的方式创建内部类对象，注意，这里的内部类是由public修饰的，如果是private修饰不能用此方式创建
		//注意实例内部类的声明方式，注意和创建静态内部类的方式区分。
		OuterClass.InnerClass inner = outer.new InnerClass();
		inner.inMethod();

		//2.2,获取private修饰的内部类
		//OuterClass.PrivateInnerClass  privateInner = outer.getPrivate();  //OuterClass.PrivateInnerClass写法错误，不能直接访问私有内部类
		outer.setName("Jerry");
		//使用多态来声明私有内部类
		MyAbstractClass pirvateInner = outer.getPrivate();
		pirvateInner.doSome();


		//3，方法内也可以声明内部类
		OuterClass02 outer02 = new OuterClass02();
		outer02.createInnerClassInMethod();


	}
}
