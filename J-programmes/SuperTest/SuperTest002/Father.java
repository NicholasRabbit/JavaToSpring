public class Father {
  
    private String name;
	private int age;

	public Father(){
	
	    System.out.println("�����޲ι��췽��ִ�С�");
	}

	public Father(String name, int age){
	    this.name=name;
		this.age=age;
		System.out.println(this.name+this.age);  //�������������super(ʵ��)�ĸ�ֵ��
		
	
	}
 
}