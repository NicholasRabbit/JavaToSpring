public class SuperTest002 {

    public static void main(String[] args){
	
	   Son s=new Son();   //调用子类里的无参构造，输出子类里super()调用的父类方法“父类无参构造方法执行。”
	   
	   Son t=new Son("名字",100,(byte)30);  //这里实参数值无意义，只是为了 调用子类有参构造方法，验证 super(实参)的赋值。

	   //测试子类不写super(..)去掉父类唯一有参构造，导致报错。
		Honda h = new Honda();


	}

}


class Vehicle {
	
	int speed;
	String make;

	//父类只有一个有参构造方法，默认给的无参构造没有手写，也就没有了。
	public Vehicle(int speed,String make){
		this.speed = speed;
		this.make = make;
		System.out.println("Vehicle arguement constructor ==>" + speed + ":" + make);
	}
}


class Honda extends Vehicle {
	
	//子类必须写个super(..)去调用父类里唯一的有参构造
	//下面注释后就会报错:SuperTest002.java:32: 错误: 无法将类 Vehicle中的构造器 Vehicle应用到给定类型;
	//public Honda (){
	//	super(100,"civic");
	//}

}
