

public class User {
	
	//这里不用private，仅为代码简洁。
	int id;
	String name;

	public User(){
	
	}
	public User(int id,String name){
		this.id = id;
		this.name = name;
	}

	

	//重写toString()
	public String toString(){
		return "{id:" + this.id + ",name:" + this.name + "}";
	}

}