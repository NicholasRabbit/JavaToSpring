//终止线程运行的一个合理方法：
//在分线程中声明一个布尔类型变量:run，并把run利用到if语句之中，然后在main方法主线程中通过改变run的值，来进行控制
public class ThreadStopTest002 {

    public static void main(String[] args){
	    MyRunnable003 mr03=new MyRunnable003();
		Thread t=new Thread(mr03);
		t.setName("分线程mr03");
		t.start();
		
		try{
		    Thread.sleep(1000*5);  
		}catch(InterruptedException e){
		    e.printStackTrace();
		}
        
		mr03.run=false;   //注意此处不可写作t.run，因为t不是Myrunnable003的引用，不能指向其属性:run
	}
}


class MyRunnable003 implements Runnable {

    boolean run=true;

	public void run(){
	    for(int i=0; i<20; i++){
		    if(run){
			    System.out.println(Thread.currentThread().getName()+"输出=>"+i);
				try{
				    Thread.sleep(1000);
				}catch (InterruptedException e){
				    e.printStackTrace();
				}
			}else{
			    /*   利用return来结束线程
				return语句执行则方法结束，整个线程也结束，若保存文件等，可写在return之前，当上面mr03.run=false时
				就执行这里的语句，就可保存完结束
				*/
				return;
			}
		}
	}

}