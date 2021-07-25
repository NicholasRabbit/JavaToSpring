public class Student {

    private String name;
	private int age;
	private String address;
	private String zipCode;
	private int mobileNo;

    public String getPostAddress(String address,String zipCode){
	
	    this.address=address;
		this.zipCode=zipCode;

		return address+zipCode;
	}

	public void setName(String a){
	
	    name=a;
	}
	public String getName(){
	
	    return name;
	}

	public void setAge(int age){
	
	    this.age=age;
	
	}
	public int getAge(){
	
	    return age;
	}

	public void setAddress(String b){
	
	   address=b;
	}
	public String getAddress(){
	
	   return address;
	}

	public void setZipCode(String zipCode){
	
	   this.zipCode=zipCode;
	}
    public String getZipCode(){
	
	   return zipCode;
	}

	public void setMobileNo(int mobileNo){
	
	   this.mobileNo=mobileNo;
	}
	public int getMobileNo(){
	
	   return mobileNo;
	}



}