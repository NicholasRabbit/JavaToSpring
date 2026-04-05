public class Vehicle {

	int speed;
	String make;

	public Vehicle(){
		System.out.println("Vehicle non-constructor execute!");
	}

	public Vehicle(int speed,String make){
		this.speed = speed;
		this.make = make;
	}

}
