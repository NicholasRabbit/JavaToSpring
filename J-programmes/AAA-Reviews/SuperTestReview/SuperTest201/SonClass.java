public class SonClass extends FatherClass {

    int age=20;
	String name="Son";
	
	public SonClass(){
	   //super();           //java系统默认给一个super()，调用父类无参构造方法，写不写都行
	}

	public void method(){
	  
	  System.out.println(this.name);  //输出子类中的名字"Son"

	  System.out.println(super.name); //super.name强制调用父类中的属性，"Father"
	}




}