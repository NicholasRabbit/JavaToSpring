public class InterfaceTest006 {

    public static void main(String[] args){
	
         Vehicle vios=new Car();  //����
                 vios.run();
         Move  corrola=new Car();
		       corrola.run();
	}

}

class Vehicle {
     public void run(){}
}

interface Move {

    public abstract void run();
}


class Car extends Vehicle implements Move{     //extends��implements����ͬʱʹ�á� 

    public void run(){
	
	   System.out.println("�γ��ڱ���");
	}

}