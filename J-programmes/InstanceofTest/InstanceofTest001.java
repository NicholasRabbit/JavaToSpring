public class InstanceofTest001 {

    /*
	instanceof������� ǰһ����������һ�����ñ�������һ��������ͨ����һ���ࣨ�����ǽӿڣ���
	�����ж�ǰ��Ķ����Ƿ��Ǻ�����࣬���������ࡢʵ�����ʵ��������Ƿ���true�����򷵻�false ��
	
	Ҳ����˵��ʹ��instanceof�ؼ������ж�ʱ�� instanceof �������� ���Ҳ����������м̳л�ʵ�ֹ�ϵ

    */
	
	
	public static void main(String[] args){
	
	    Animal a=new Dog();
		System.out.println(a instanceof Dog);       //instanceof �������ж�����a������ʵ�����Ƿ�ΪDog���ࣩ��ʵ��,���Ϊtrue
		System.out.println(a instanceof Animal);    //instanceof �������ж�����a�Ƿ�Ϊ����Animal�������ʵ��,���Ϊtrue

		Animal a2=new Snoopy();
		System.out.println(a2 instanceof Animal);   //instanceof �������ж�����a�Ƿ�Ϊ����Animal�������ʵ��,���Ϊtrue 
		System.out.println(a2 instanceof Snoopy);
		
		Move m1=new Dog();
		if(m1 instanceof Move){                     //instanceof �������ж�����a�Ƿ�ΪMove�ӿ�ʵ����Dog��ʵ�������Ϊtrue
		   System.out.println(m1+"�ǽӿ�Move��ʵ��");
		}
		

	}

}

class Animal {


}

interface Move{

    public abstract void move();
}

class Dog extends Animal implements Move {
	public void move(){
	   
	}

}

class Snoopy extends Dog {
	

}