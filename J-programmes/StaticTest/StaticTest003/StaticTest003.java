public class StaticTest003{
    
	public StaticTest003(){
	
	    System.out.println("缺省构造器");    //系统缺省构造器不写也可以，若写上则其在实例块执行后才执行，写前边也是实例代码块后执行
	}
	
	{
	    System.out.println("实例代码块一");   
	}

	
	{
	    System.out.println("实例代码块二");
	}


	{
	    System.out.println("实例代码块三");     //实例代码块只有在类实例化的时候才执行,且优先执行
	}
											     
    public static void main(String[] args){       //main方法无论放哪里也是等实例代码块，缺省构造方法执行完之后再执行 
	    StaticTest003 it01=new StaticTest003();   //执行顺序：实例代码块-->缺省构造器-->main方法。
        System.out.println("main方法输出");
	
	}



}