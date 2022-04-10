public class Vehicle {

    private int speed;
    private String brand;
	private float litre;       //排量单位：升,一位小数
    

	public void setSpeed(int speed){
	
	    this.speed=speed;
	}
	public int getSpeed(){
	
	    return speed;
	}

	public void setBrand(String brand){
	
	    this.brand=brand;
	}
	public String getBrand(){
	
	    return brand;
	}

    
	

	public void speedUp(int speedPickUp){
	    
	      speed+=speedPickUp;
	}
	public void speedDown(int speedSlow){
	
	      speed-=speedSlow;
	}


	public void move(){
	
	   System.out.println("品牌:"+brand+",速度:"+speed+"在移动,move方法");
	}
     
}