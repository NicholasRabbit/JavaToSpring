public class User {

	public synchronized static  void doSome(){   //静态方法
	     Thread t=Thread.currentThread();
		 for(int i=0; i<10; i++){
		     try{
			    Thread.sleep(1000);
			 }catch(InterruptedException e){
			    e.printStackTrace();
			 }
			 System.out.println("线程名称："+t.getName()+"线程执行:doSome=>"+i);
		 }
	}

	public synchronized void doOther(){   //实例方法
	     Thread t=Thread.currentThread();
		 for(int i=0; i<10; i++){
		     try{
			    Thread.sleep(1000);
			 }catch(InterruptedException e){
			    e.printStackTrace();
			 }
			 System.out.println("线程名称："+t.getName()+"线程执行:doOther=>"+i);
		 }
	}
	

}