public class SubClass extends SuperClass {
	
	int age;
	String name;

	/*
	 * 1,既然Java规定super()和this()不能同时存在一个构造方法里，同时也规定每个子类的构造器默认有一个super()。
	 *   那么下面的无参构造就是super()和this()同时存在了，是否互相矛盾？
	 *   个人总结分析：
	 *   1) 如果写了this(...)那么默认的super()就没有了，this(...)调用的有参构造里就有一个默认或者手写的super()方法。
	 *   这种机制可能是为了保证父类的构造器只被调用一次，或者不要被子类的不同参数的super(...)调用，导致冲突。 
	 *   2) Java的这种机制是为了保证子类在一次实例化的过程中，只能调用一次父类的构造器。
	 *   参考：https://stackoverflow.com/questions/10381244/why-cant-this-and-super-both-be-used-together-in-a-constructor
	 *
	 * */
	public SubClass(){
		//Compilatioin fails. !!
		//The method super() must be written at the first line of a constructor. So is this().
		//One of the two methods must be delete;
		//super("Hello");
		this(10,"Tom");

		//super(name);  //The instance variable is not allowed to used as parameter because the SubClass has not been intialised yet.

	}

	public SubClass(int age, String name){
		this.age = age;
		this.name = name;
	}


}
