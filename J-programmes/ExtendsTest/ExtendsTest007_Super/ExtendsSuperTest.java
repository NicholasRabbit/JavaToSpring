public class ExtendsSuperTest{

	public static void main(String[] args){
	
		new Car("run");
	}
}



class Vehicle{

	String type = "Honda";
	int maxSpeed = 100;
	
	Vehicle(String type,int maxSpeed){
		this.type = type;
		this.maxSpeed = maxSpeed;
	}


}


class Car extends Vehicle {

	String trans;

	public Car(String trans){
		this.trans = trans;
	}
	
	public Car(String type,int maxSpeed,String trans){
		super(type,maxSpeed);
		this.trans = trans;
	}

	
}
