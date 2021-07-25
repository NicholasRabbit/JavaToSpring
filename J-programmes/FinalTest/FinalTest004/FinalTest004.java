public class FinalTest004 {

    public static void main(String[] args){
	
	   Player player01=new Player(10);
	          player01=new Player(20);   //此行player01重新赋值，前边那个new Plyer(10)对象就没有引用指向了，会被当做垃圾回收
                                         //player01指向新的对象new Player(20)。
       
	   final Player player02=new Player();    //final修饰引用，其内含指向对象的地址不再改变
	                //player02=new Player();  //此行报错，引用player02内含的地址已经固定了,再让它指向新对象不可以。

                    player02.age=50;
					player02.age=60;          //虽然play02内地址不变，但对象内的变量可重新赋值，不影响
					
	         
	        
	       

	}

}