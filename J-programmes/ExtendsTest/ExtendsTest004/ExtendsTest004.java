public class ExtendsTest004 {

    public static void main(String[] args){
		
		/*
		* 1,���಻�ܼ̳и����˽�����ԣ�������������й��еķ���Ӱ�쵽�˸���˽�����ԣ�
		* ��ô˽���������ܹ�������ʹ�õ�
		*/		
		Son s=new Son();
		//s.age=10;      //���뱨������ͨ������ֱ�Ӽ̳�,�������޸ĸ����˽������
		
		s.setAge(10);    //����̳��ุ���set,get�������Ϳ����޸ĺͷ��ʸ��������ˡ�
		int retValue=s.getAge();
		System.out.println(retValue);
		
		/*
		* 2,�̳���super���÷�
		*/
		Father father = new Son(35);
		System.out.println("father����" + father.getAge());
		father.doSome();   //ִ������ķ���
		//����ʹ�������������ö�̬��Ҳ���Է��ʸ�����˽�е����ԡ�
		Son son = new Son(45);
		System.out.println("son����" + son.getAge());

	}

}


class Father {

    private int age;

	public Father(){
	
	}
	/*
	* Ҳ�������вι���ʹ��super(..)�������˽�����Ը�ֵ��
	* ��̬����ʱʵ�ʸ�����������ָ����Ǹ����е����ԣ������÷���ʱָ���������ķ�����
	*/
	public Father(int age){
		this.age = age;
	}

	
	public void setAge(int age){
	    this.age=age;
	}
	
	public int getAge(){
	    return this.age;
	}

	
	public void doSome(){
		System.out.println("���� doSome()");
	}
}


class Son extends Father {

	public Son(){
	
	}
	/*
	* Ҳ�������вι���ʹ��super(..)�������˽�����Ը�ֵ��
	* ��̬����ʱʵ�ʸ�����������ָ����Ǹ����е����ԣ������÷���ʱָ���������ķ�����
	*/
	public Son(int age){
		super(age);
	}

	public void doSome(){
		System.out.println("���� doSome()");
	}
}