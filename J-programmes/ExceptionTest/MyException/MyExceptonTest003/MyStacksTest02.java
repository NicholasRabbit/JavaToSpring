public class MyStacksTest02 {

    public static void main(String[] args){
	
	    MyStacks02 ms=new MyStacks02(5);
        Object o1=new Object();
		
		
		try{                         //MyStacks02��ʹ�����Զ����쳣����ʾջ������գ�����push(),pop()����ʱ�����쳣�׳�����˴˴�����try,catch���
		    ms.push(o1);
			ms.push(new Object());   //����ֱ�Ӱ�new Object()д�ڲ����
			ms.push(o1);
			ms.push(o1);
			ms.push(o1);

			ms.push(o1);   //ǰ�������Ѿ�д��5�����󣬴˴�����push�����ǳ��֣�"ջ����"��
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