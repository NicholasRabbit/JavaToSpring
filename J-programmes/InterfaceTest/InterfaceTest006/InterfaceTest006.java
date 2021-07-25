public class InterfaceTest006 {

    public static void main(String[] args){
	
         Vehicle vios=new Car();  //威驰
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


class Car extends Vehicle implements Move{     //extends和implements可以同时使用。 

    public void run(){
	
	   System.out.println("轿车在奔跑");
	}

}