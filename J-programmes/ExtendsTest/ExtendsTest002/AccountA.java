public class AccountA {
    /*
	���಻�ܼ̳и����˽�����ԣ�������������й��еķ���Ӱ�쵽�˸���˽�����ԣ�
    ��ô˽���������ܹ�������ʹ�õ�
    */
    private int idNo;        //˽�����Բ��ܱ��̳�
	private long phoneNo;    
	private String name;

	public void setIdNo(int idNo){  //���췽�������Ա��̳У������������Լ̳�
	
	    this.idNo=idNo;
	}
	public int getIdNo(){
	
	    return idNo;
	}

	public void setPhoneNo(long phoneNo){
	    
        this.phoneNo=phoneNo;
	}
	public long getPhoneNo(){
	
	    return phoneNo;
	}

	public void setName(String name){
	
	    this.name=name;
	}
	public String getName(){
	
	    return name;
	}


	//���췽�������ܱ��̳�
	public AccountA(){
	
	}
	public AccountA(int idNo,long phoneNo,String name){
	    this.idNo=idNo;
		this.phoneNo=phoneNo;
		this.name=name;
	}

}
