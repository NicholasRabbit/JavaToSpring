public class AccountA {
    /*
	子类不能继承父类的私有属性，但是如果子类中公有的方法影响到了父类私有属性，
    那么私有属性是能够被子类使用的
    */
    private int idNo;        //私有属性不能被继承
	private long phoneNo;    
	private String name;

	public void setIdNo(int idNo){  //构造方法不可以被继承，其他方法可以继承
	
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


	//构造方法，不能被继承
	public AccountA(){
	
	}
	public AccountA(int idNo,long phoneNo,String name){
	    this.idNo=idNo;
		this.phoneNo=phoneNo;
		this.name=name;
	}

}
