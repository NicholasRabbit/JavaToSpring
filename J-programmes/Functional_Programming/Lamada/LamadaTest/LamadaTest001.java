
//Lamada表达式练习，函数式编程
public class LamadaTest001 {

	public static void main(String[] args){
		//以创建线程为例，正常写法
		Thread mt = new MyThread();
		mt.start();
		System.out.println(Thread.currentThread().getName() + " execute!");

		//Lamada表达式写法，相对来说更简洁。
		new Thread(() -> System.out.println(Thread.currentThread().getName() + " lamada run!")).start();
	}

}

class MyThread extends Thread {

	public void run(){
		System.out.println(Thread.currentThread().getName() + " start!");
	}
}