public class AbstractTest004 {

   public static void main(String[] args){
       Animal a=new Dog();    //������Ķ�̬�﷨��������a����Animal�࣬��������ʵ�ʵ��õ���Dog����ķ�����
	          a.move();       //�˳�����������̡�
   
   }
	
}

abstract class Animal {

   public abstract void move();

}

class Dog extends Animal {

   
   public void move(){        //�ǳ�����̳г����࣬����ѳ�������ĳ��󷽷����ǣ�Ҳ��������д��ʵ�֣�
   
       System.out.println("���ڱ��ܡ�");
   
   }

 
}