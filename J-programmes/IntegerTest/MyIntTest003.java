public class MyIntTest003 {

    public static void main(String[] args){
	
	      int a=100;                       //���������ֶ�����һ����װ��MyInt���������java�Դ���װ�����;
                                           //int���a=100,�޷�����doSome(Object obj)�������ʽ������ͬ����˴���һ��MyInt������װ����
		  MyInt mi=new MyInt(100);         //MyInt������д��toString()�������ǵ�100ת��ΪString���ͣ�����װ�����ˡ�

		  doSome(mi);

	}

	public static void doSome(Object obj){  //�˴���Object�������������ͣ�Object��������ĸ��࣬�漰����̬����Object obj=new MyInt(100);
	
	     System.out.println(obj);
	}

}

class MyInt {

    private int value;

	public MyInt (int value){
	 
	    this.value=value;
	}

	public String toString(){
	
	    return String.valueOf(value);
	}

}