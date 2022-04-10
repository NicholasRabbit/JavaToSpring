public class Father {
  
    private String name;
	private int age;

	public Father(){
	
	    System.out.println("父类无参构造方法执行。");
	}

	public Father(String name, int age){
	    this.name=name;
		this.age=age;
		System.out.println(this.name+this.age);  //这里输出子类里super(实参)的赋值。
		
	
	}
 
}