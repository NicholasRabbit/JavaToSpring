public class Rooms {

    private int roomNO;
	private String roomType;
	private boolean roomAvailable;

	
	public String toString(){
	    return "[���ţ�"+roomNO+"���ࣺ"+roomType+"״̬��"+roomAvailable+"]";   //�����Ƿ�ռ�ÿ�����Ԫ���������ʾ:(roomAvailabe ? "ռ��":"����";),true��ʾռ��
	}                                                                      //String s=roomAvailabe ? "ռ��":"����";����õ��Ľ����һ���ַ���
	
	
	
	
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