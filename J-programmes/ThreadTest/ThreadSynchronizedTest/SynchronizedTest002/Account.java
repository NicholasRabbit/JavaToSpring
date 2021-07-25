public class Account {
    private String name;
	private double balance;
	//无参和有参构造方法
	public Account(){
	
	}
	public Account(String name, double balance){
	    this.name=name;
		this.balance=balance;
	}
	//set,get方法
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	public void setBalance(double balance){
	    this.balance=balance;
	}
	public double getBalance(){
		return this.balance;
	}

	//取钱方法
	public double withdraw(double money){

		synchronized(this){     //使用Synchronized(){}代码块，这样多个线程执行到这里，只能有一个线程进来，并加锁
								//直到一个线程执行完，别的线程才能进来，这样才能保证线程安全，
								//Synchronized(..)小括号内的参数必须是多个线程共享的数据才行
		    double current=this.getBalance();
            double remain=current-money;
			
			try{              
			   Thread.sleep(1000*2);  //这里模拟网络延迟 
			}catch(InterruptedException e){
			   e.printStackTrace();
			}
			
			this.setBalance(remain);
			return balance;
		}
	}

}