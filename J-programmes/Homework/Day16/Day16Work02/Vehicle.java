public class Vehicle {

    private int speed;
    private String brand;
	private float litre;       //������λ����,һλС��
    

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
	
	   System.out.println("Ʒ��:"+brand+",�ٶ�:"+speed+"���ƶ�,move����");
	}
     
}