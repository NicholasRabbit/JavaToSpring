import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;


public class GenericTest002 {

    public static void main(String[] args){
	
	   List<Automobile> myList=new ArrayList<>();   //后面的尖括号可以什么也不写，jdk8以后，只要前面List写了泛型 
	                                                //那么，后面的就自动判断泛型。
													//另外如果后面不加尖括号，则出现报警信息,但不影响运行
	                                                //"注: GenericTest002.java使用了未经检查或不安全的操作。"
       
      
	   Automobile  b=new Saloon();
	   Automobile  c=new Pickup();
	 
	   myList.add(b);
	   myList.add(c);

	   Iterator<Automobile>  it=myList.iterator();

	   while(it.hasNext()){
	       Automobile auto=it.next();
		   if(auto instanceof Saloon){
		      auto.move();
			  
			  //auto.saloonGas();      //此行报错，泛型下，多态引用调用子类特有方法，仍需遵守多态语法规则，向下转型
			  Saloon s=(Saloon)auto;
			  s.saloonGas();
		   }else if(auto instanceof Pickup){
		      
			  auto.move();
			  
			  Pickup p=(Pickup)auto;
			  p.pickupGas();
		   }
       }                                             
         	
	}                                     

}

class Automobile {

    public void move(){
	    System.out.println("机动车在移动");
	}
}

class Saloon extends Automobile {

    public void move(){
	
	    System.out.println("轿车在开动");
	}

	public void saloonGas(){
	    System.out.println("轿车在加油");
	}

}

class Pickup extends Automobile {

    public void move(){
	    System.out.println("皮卡在前进");
	}

	public void pickupGas(){
	    System.out.println("皮卡在加油");
	}

}