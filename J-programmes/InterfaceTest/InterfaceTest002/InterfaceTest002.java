public class InterfaceTest002 {

    public static void main(String[] args){
	
         MyMath c01=new MyMathImpl();     //��̬�﷨��

		 System.out.println(c01.PI);
		 System.out.println(c01.NATIONALITY);

		 int k=c01.sum(10,20);
		 System.out.println(k);

		 int m=c01.divide(25,5);
		 System.out.println(m);
	}

}

interface MyMath {

    public static final double PI=3.14;
    String NATIONALITY="China";    //ǰ��Ĭ����public static final��дʱ����ʡ�ԡ�

	public abstract int sum(int a,int b);

	int divide(int a, int b);     //ǰ���public abstract����ʡ�ԡ�
	
	   

}

class MyMathImpl implements MyMath {

    public int sum(int a, int b){
	
	    return a+b;
	}
	public int divide(int a, int b){
	
	    return a/b;
	}

}