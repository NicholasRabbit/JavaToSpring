public class ExtendsTest003 {

    public static void main(String[] args){
		//1,�����̳з����������½�����D�����õ���D��ġ�System.out.println(d)��   
		//D�̳���C��C�̳���B,B�̳���A
		D d=new D();
		char a=d.methodA('X');   

		//2,�����̳�ʱ������ʵ����ʱ�������������Ӧ��ÿ���㼶�ĸ��๹�췽�����ᱻ��������á�
	}                             
}

class A{
	public A(){
		System.out.println("A");
	}
	public char methodA(char d){
	    System.out.println(d);
		return d;
	}
}

class B extends A{
	public B(){
		System.out.println("B");
	}
}

class C extends B{
	public C(){
		System.out.println("C");
	}
}

class D extends C{
	public D(){
		System.out.println("D");
	}
}

