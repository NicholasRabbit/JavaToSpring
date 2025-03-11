public class User {

	private int id;
	private String name;
	private int age;
	private double salary;


	public User(){
	
	}

	public User(int id,String name,int age,double salary){
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return this.id;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public void setAge(int age){
		this.age = age;
	}

	public int getAge(){
		return this.age;
	}

	public void setSalary(double salary){
		this.salary = salary;
	}

	public double getSalary(){
		return this.salary;
	}

	public String toString(){
		return "User:{" + "id" + ":" + this.id + "," + "name:" + this.name + "," + "age:" + this.age + "," + "salary:" + this.salary + "}";
	}

}