public class PolymorphismTest001 {

    public static void main(String[] args){
	     
		 Animal a1=new Dog();    //a1属于Animal类，是父类，new Dog()是子类型对象，
	            a1.move();       //此处调用属于子类型向父类型转换，java中这种转换是自动转换，下面b1同理。

         Animal b1=new Bird();
		        b1.move();       
	
	     Animal a2=new Dog();
		    //  a2.bark();       //a2属于Animal类，Animal类是Dog的父类，"new Dog()"属于子类对象,"bark()"是其特有的方法
			                     //"a2.bark()"调用属于父类向子类转换,需加上强制类型转换符才可，如下行(Dog)
			Dog d2=(Dog)a2;      
			    d2.bark();

         
		 
		 
		 Animal a3=new Bird();   
		    
			//Dog d3=(Dog)a3;    //此行编译通过，运行报警“java.lang.ClassCastException”，这是一种著名的异常,
		                         //因为a3属于Animal类，编译时语法没有错误，但在后边运行时a3指向的事Bird()对象
								 //而Dog类和Bird类之间没有继承关系，用（Dog）强制转换后，d3指向Bird()对象，因此运行错误。
	
	     System.out.println("分割线~~~~~~~~~~~~~~~~~~~~~~");
		 
		 if(a3 instanceof Dog){         //意思是：a3的地址指向Dog类的对象。
		 
		      Dog d3=(Dog)a3;
			      d3.bark();

		 }else if(a3 instanceof Bird){  //意思是：a3的地址指向Bird类的对象。
		 
		     Bird b3=(Bird)a3;
			      b3.sing();
		 }
	}

}