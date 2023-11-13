public class Date003{
    
	private int year;
	private int month;
	private int day;
    
	/*
	public Date003(){
		year=1900;
		month=10;
		day=25;
	    System.out.println(year+"年"+month+"月"+day+"日");

	}
	*/
	//以上的简洁写法：
	public Date003(){
	  //System.out.println("第一行"); //此行报错，this()必须在构造方法里的执行程序第一个语句，否则编译错误
	  								  //为什么必须在第一行？因为this()方法是调用构造方法进行实例化的，不实例化，别的跟对象相关操作都无法执行。
							          //由此推出，一个构造方法只能用一次this调用别的构造方法，因为this()不能出现在第二行
		this(1900,10,25);             //此处调用下面有参数的构造方法用this()，从而可以免于写过多代码
	                         
	
	}

	public  Date003(int year,int month,int day){
	    this.year=year;
		this.month=month;
		this.day=day;

		System.out.println(this.year+"年"+this.month+"月"+this.day+"日");
	
	}

}
