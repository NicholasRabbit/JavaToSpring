public class FatherClass {

      int age=60;
      String name="Father";

	public FatherClass(){
	    System.out.println("父类构造方法执行");
	}

	public FatherClass(int age, String name){
	    this.age=age;
		this.name=name;
		System.out.println(age+name);
	}

	public void method(){
	    System.out.println("父类成员方法执行");
	}

}