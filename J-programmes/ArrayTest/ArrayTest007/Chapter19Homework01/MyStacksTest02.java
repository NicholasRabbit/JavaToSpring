public class MyStacksTest02 {

    public static void main(String[] args){
	
	    MyStacks02 ms=new MyStacks02(5);
        Object o1=new Object();
		
		ms.push(o1);
		ms.push(new Object());   //����ֱ�Ӱ�new Object()д�ڲ����
		ms.push(o1);
		ms.push(o1);
		ms.push(o1);

		ms.push(o1);   //ǰ�������Ѿ�д��5�����󣬴˴�����push�����ǳ��֣�"ջ����"��
		System.out.println("~~~~~~~~~~~~~~");

		ms.pop();
		ms.pop();
		ms.pop();
		ms.pop();
		ms.pop();

		ms.pop();
	}

}