public class Son extends Father {
    
	byte score;

    public Son(){
	
	//super();          //此处无参构造方法内，系统默认给一个super(),一般不显示，来调用父类里的无参构造方法。
	//super("10",100);  //一旦有在子类里的无参构造方法里有手写的super()或super(实参)，
				        //那么，系统默认给的super()就没有了。
	}

	public Son(String name,int age,byte score){
	
	    //this.name=name;      //此两行报错，父类中name,age是私有属性，无法被继承，因此this也无法使用。
		//this.age=age;

		super("父类名字",50);  //super调用父类有参构造方法，super的作用是：给当前子类的父类对象的特征赋值，即使这个属性是私有的，
		this.score=score;      //但是super(实参)并不会创建新的父类对象。 上面super()也不会。
		                       //super调用只能方法构造方法第一行。因此，只有一句。
	}

}