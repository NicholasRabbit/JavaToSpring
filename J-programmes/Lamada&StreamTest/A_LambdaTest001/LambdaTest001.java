package com.test.lambda;

//Lambda expression.
public class LambdaTest001 {

	public static void main(String[] args){
		// 1, Normally, we create a thread with an instance of "Runnable" with its subclass-MyRunner.
		Runnable runnable = new MyRunner();
		Thread t1 = new Thread(runnable);
		t1.start();

		// 2, We can create an anonymous class which implements "Runnable" with Lambda expression.
		Runnable lambdaRunnable = () -> System.out.println(Thread.currentThread().getName() + " Lambda runnable!");
		Thread t2 = new Thread(lambdaRunnable);
		t2.start();
	}

}

class MyRunner implements Runnable {

	public void run(){
		System.out.println(Thread.currentThread().getName() + " start!");
	}

}
