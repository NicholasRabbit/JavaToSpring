public class FatherClass {

      int age=60;
      String name="Father";

	public FatherClass(){
	    System.out.println("���๹�췽��ִ��");
	}

	public FatherClass(int age, String name){
	    this.age=age;
		this.name=name;
		System.out.println(age+name);
	}

	public void method(){
	    System.out.println("�����Ա����ִ��");
	}

}