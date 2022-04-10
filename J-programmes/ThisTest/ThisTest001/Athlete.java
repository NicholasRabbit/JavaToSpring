public class Athlete{
    String name;

	public Athlete(){
	
	}

	public void running(){
	
	    System.out.println(this.name+"在赛跑"); //this在这里，当yaoMing调用时代表yamMing
		                                        //liuXiang调用时代表liuXiang,且可以省略。
		return;                                 //有this的话，修饰符列表里不能有static 
	}

	public static void doThis(){
	    
		//System.out.println(name);             //带static关键字的方法，不能直接访问实例变量name,此行报错
	    
		Athlete messi=new Athlete();            //这里是在堆内存新建的一块空间，新建的对象
		System.out.println(messi.name);         
	
	}

}