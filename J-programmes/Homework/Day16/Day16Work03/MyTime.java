public class MyTime {

    private int hour;
    private	int minute;
	private int second;
    
	public MyTime(){
	
	}

    public MyTime(int hour,int minute,int second){
	
	    this.hour=hour;
		this.minute=minute;
		this.second=second;

	}

	public void display(){
	
	   System.out.println("现在时刻："+hour+"点"+minute+"分"+second+"秒");
	}

	public void addSecond(int add){
	
	    second+=add;
	}
	public void subSecond(int sub){
	
	   second-=sub;
	}

    public void addMinute(int add){
	
	    minute+=add;
	}
	public void subMinute(int sub){
	
	   minute-=sub;
	}

	public void addHour(int add){
	
	    hour+=add;
	}
	public void subHour(int sub){
	
	    hour-=sub;
	}

}