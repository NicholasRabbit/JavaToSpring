//把ThreadTest002中的线程以匿名内部类的方式创建，因为Runnable是个接口，可以new(){}匿名内部类

public class ThreadTest003 {

    public static void main(String[] args){
	
	    Thread mt=new Thread(      
			         new Runnable(){        //匿名内部类
		                 public void run(){
						     for(int i=0; i<1000; i++){
						         System.out.println("匿名内部类分线程执行："+i);
						     }
						 }
					 }
		          );      //注意new完对象，这里不要漏分号“;”
          
            mt.start();

			for(int i=0; i<1000; i++){
			    System.out.println("主线程执行："+i);
			}

	
	}

}