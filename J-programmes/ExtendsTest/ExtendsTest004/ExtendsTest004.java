public class ExtendsTest004 {

    public static void main(String[] args){
		
		/*
		* 1,子类不能继承父类的私有属性，但是如果子类中公有的方法影响到了父类私有属性，
		* 那么私有属性是能够被子类使用的
		*/		
		Son s=new Son();
		//s.age=10;      //编译报错，不能通过子类直接继承,并访问修改父类的私有属性
		
		s.setAge(10);    //子类继承类父类的set,get方法，就可以修改和访问父类属性了。
		int retValue=s.getAge();
		System.out.println(retValue);
		
		/*
		* 2,继承中super的用法
		*/
		Father father = new Son(35);
		System.out.println("father年龄" + father.getAge());
		father.doSome();   //执行子类的方法
		//这里使用子类声明不用多态，也可以访问父类中私有的属性。
		Son son = new Son(45);
		System.out.println("son年龄" + son.getAge());

	}

}


class Father {

    private int age;

	public Father(){
	
	}
	/*
	* 也可以在有参构造使用super(..)给父类的私有属性赋值，
	* 多态调用时实际父类声明引用指向的是父类中的属性，但调用方法时指向的是子类的方法。
	*/
	public Father(int age){
		this.age = age;
	}

	
	public void setAge(int age){
	    this.age=age;
	}
	
	public int getAge(){
	    return this.age;
	}

	
	public void doSome(){
		System.out.println("父类 doSome()");
	}
}


class Son extends Father {

	public Son(){
	
	}
	/*
	* 也可以在有参构造使用super(..)给父类的私有属性赋值，
	* 多态调用时实际父类声明引用指向的是父类中的属性，但调用方法时指向的是子类的方法。
	*/
	public Son(int age){
		super(age);
	}

	public void doSome(){
		System.out.println("子类 doSome()");
	}
}