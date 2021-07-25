public class UserThread extends Thread {
    User u;

	public UserThread(){
	}
	public UserThread(User u){
	    this.u=u;
	}
	
	public void run(){
	   
	   u.doSome();      //doSome()是静态方法，加了synchronized关键字，相当于在类层面加了一把锁，
	                    //属于同一个类的对象执行完，别的对象才可以执行
	   
	   //u.doOther();   //doOther()是实例方法加了synchronized关键字，是对象层面的，不同的对象不同的锁，可同时执行
	}
}