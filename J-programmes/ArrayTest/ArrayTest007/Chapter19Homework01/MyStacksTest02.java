public class MyStacksTest02 {

    public static void main(String[] args){
	
	    MyStacks02 ms=new MyStacks02(5);
        Object o1=new Object();
		
		ms.push(o1);
		ms.push(new Object());   //可以直接把new Object()写在参数里。
		ms.push(o1);
		ms.push(o1);
		ms.push(o1);

		ms.push(o1);   //前面数组已经写满5个对象，此处调用push方法是出现："栈已满"。
		System.out.println("~~~~~~~~~~~~~~");

		ms.pop();
		ms.pop();
		ms.pop();
		ms.pop();
		ms.pop();

		ms.pop();
	}

}