public class SuperTest002 {

    public static void main(String[] args){
	
	   Son s=new Son();   //������������޲ι��죬���������super()���õĸ��෽���������޲ι��췽��ִ�С���
	   
	   Son t=new Son("����",100,(byte)30);  //����ʵ����ֵ�����壬ֻ��Ϊ�� ���������вι��췽������֤ super(ʵ��)�ĸ�ֵ��

	   //�������಻дsuper(..)ȥ������Ψһ�вι��죬���±���
		Honda h = new Honda();


	}

}


class Vehicle {
	
	int speed;
	String make;

	//����ֻ��һ���вι��췽����Ĭ�ϸ����޲ι���û����д��Ҳ��û���ˡ�
	public Vehicle(int speed,String make){
		this.speed = speed;
		this.make = make;
		System.out.println("Vehicle arguement constructor ==>" + speed + ":" + make);
	}
}


class Honda extends Vehicle {
	
	//�������д��super(..)ȥ���ø�����Ψһ���вι���
	//����ע�ͺ�ͻᱨ��:SuperTest002.java:32: ����: �޷����� Vehicle�еĹ����� VehicleӦ�õ���������;
	//public Honda (){
	//	super(100,"civic");
	//}

}
