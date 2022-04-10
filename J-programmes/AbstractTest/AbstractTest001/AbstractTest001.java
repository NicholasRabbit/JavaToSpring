public  class AbstractTest001 {

    public static void main(String[] args){
	
	   // Car camry=new Car();   //抽象方法无法实例化，即无法创建对象。

	   new Sedan();              //但是子类，继承于抽象类的子类可以实例化。
	}

}

abstract class Car {

   
}

class Sedan extends Car {

    
}

abstract class Saloon extends Car {    //抽象类可以被连续继承，反过来讲，抽象类还可以被抽象。

}

abstract class Toyota extends Saloon {

}