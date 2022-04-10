public class OuterClassTest {

	public static void main(String[] args){
		//创建实力内部类对象的方式
		//1,首先要创建外部类对象
		OuterClass outer = new OuterClass();
		outer.setName("Tom");
		//2,通过外部类.new的方式创建内部类对象，注意，这里的内部类是由public修饰的，如果是private修饰不能用此方式创建
		OuterClass.InnerClass inner = outer.new InnerClass();
		inner.inMethod();

		//3,获取private修饰的内部类
		//OuterClass.PrivateInnerClass  privateInner = outer.getPrivate();  //OuterClass.PrivateInnerClass写法错误，不能直接访问私有内部类
		outer.setName("Jerry");
		//使用多态来声明私有内部类
		MyAbstractClass pirvateInner = outer.getPrivate();
		pirvateInner.doSome();
	}
}