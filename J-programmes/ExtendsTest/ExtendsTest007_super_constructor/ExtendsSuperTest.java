public class ExtendsSuperTest{

	public static void main(String[] args){
	
		new Car("run",100);
	}
}



class Vehicle{

	String type = "Honda";
	int maxSpeed = 100;
	
	/*
	 * 父类中只有一个有参构造，那么默认的无参构造就没有了，所有继承它的子类的构造方法内都要写super(..)实参去调用这个有参
	 * 构造方法，否则会编译报错。
	 *
	 * 解决方案有两种：
	 * 1，如果子类只有一个无参构造，里边必须写super(..)调用父类的这个唯一且有参的构造方法。
	 * 2，或者在子类写个有参构造，里边写supter(..)调用父类的有参构造。
	 * */
	public Vehicle(String type,int maxSpeed){
		this.type = type;
		this.maxSpeed = maxSpeed;
	}


}


class Car extends Vehicle {


	public Car(){
		//super("A",200); //无参构造不写super(..)调用会报错
	}

	public Car(String type,int speed){
		//写在这里调用也可以
		super(type,speed);  //注意super必须写在方法的头一行
	}
	

	
}
