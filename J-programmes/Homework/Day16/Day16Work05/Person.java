public class Person {

    private String name;
	private byte   age;

	public Person(){
	
	}

	public Person(String name, byte age){
	
	    this.name=name;
		this.age=age;
	}

	public void display(){
	 
	    System.out.println(name+age);   
	}

}