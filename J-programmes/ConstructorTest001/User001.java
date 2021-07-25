public class User001{
    

	//系统默认给如下类似无参数构造方法，也成缺省构造器；
	//但是在一个类里，如果手动写了一个构造方法（有参数或无参数的），如下面的User001(int m)方法，
	//那么系统不再给缺省构造器，就需要手写一个无参数构造方法，无参数构造方法很常用。
	public User001(){                  
	    System.out.println("System default User Constructor. ");
	
	}
 
	
	//此处方法写了的话，系统就不给缺省构造器了。
	public User001(int m){
		
		System.out.println("人为手写有参数构造方法测试："+m);
    
    
	}
}