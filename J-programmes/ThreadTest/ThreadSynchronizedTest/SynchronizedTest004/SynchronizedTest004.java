//synchrnized用在static修饰的静态方法上，代表给类上了一把锁，一个线程把这个类用完，别的线程才可以用
public class SynchronizedTest004 {
    
    public static void main(String[] args){
	
	    User u1=new User();
		User u2=new User();
		UserThread t1=new UserThread(u1);  //不同的线程传进去不同的对象u1,u2
		t1.setName("t1");
		UserThread t2=new UserThread(u2);
		t2.setName("t2");

		t1.start();
		t2.start();

	
	}

}