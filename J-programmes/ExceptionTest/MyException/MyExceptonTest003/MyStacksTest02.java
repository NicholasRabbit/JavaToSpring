public class MyStacksTest02 {

    public static void main(String[] args){
	
	    MyStacks02 ms=new MyStacks02(5);
        Object o1=new Object();
		
		
		try{                         //MyStacks02里使用了自定义异常来表示栈的满或空，调用push(),pop()方法时，有异常抛出，因此此处需用try,catch语句
		    ms.push(o1);
			ms.push(new Object());   //可以直接把new Object()写在参数里。
			ms.push(o1);
			ms.push(o1);
			ms.push(o1);

			ms.push(o1);   //前面数组已经写满5个对象，此处调用push方法是出现："栈已满"。
		}catch(MyException003 me){
		    String str=me.getMessage();
			System.out.println(str);
			me.printStackTrace();
		}

		
		System.out.println("~~~~~~~~~~~~~~");

		try {
		ms.pop();
		ms.pop();
		ms.pop();
		ms.pop();
		ms.pop();

		ms.pop();
			
		}
		catch (MyException003 me){
           String str=me.getMessage();
		   System.out.println(str);
		   me.printStackTrace();
		}
	}

}