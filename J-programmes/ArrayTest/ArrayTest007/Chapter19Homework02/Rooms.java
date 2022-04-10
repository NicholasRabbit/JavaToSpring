public class Rooms {

    private int roomNO;
	private String roomType;
	private boolean roomAvailable;

	
	public String toString(){
	    return "[房号："+roomNO+"房类："+roomType+"状态："+roomAvailable+"]";   //房间是否占用可用三元运算符来表示:(roomAvailabe ? "占用":"空闲";),true表示占用
	}                                                                      //String s=roomAvailabe ? "占用":"空闲";这里得到的结果是一个字符串
	
	
	
	
	public void setRoomNO(int roomNO){
	    this.roomNO=roomNO;
	}
	public int getRoomNO(){
	    return roomNO;
	}
	
	public void setRoomType(String roomType){
	    this.roomType=roomType;
	}
	public String getRoomType(){
	    return roomType;
	}

	public void setRoomAvailable(boolean roomAvailable){
	    this.roomAvailable=roomAvailable;  
	}
	public boolean getRoomAvailable(){
	    return roomAvailable;
	}



}