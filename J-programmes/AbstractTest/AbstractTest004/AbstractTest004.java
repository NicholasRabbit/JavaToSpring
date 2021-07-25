public class AbstractTest004 {

   public static void main(String[] args){
       Animal a=new Dog();    //抽象类的多态语法，编译器a属于Animal类，但运行期实际调用的是Dog类里的方法。
	          a.move();       //此称作面向抽象编程。
   
   }
	
}

abstract class Animal {

   public abstract void move();

}

class Dog extends Animal {

   
   public void move(){        //非抽象类继承抽象类，必须把抽象类里的抽象方法覆盖（也称作：重写或实现）
   
       System.out.println("狗在奔跑。");
   
   }

 
}