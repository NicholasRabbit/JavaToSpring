public class MyExceptionTest002 {

    public static void main(String[] args){
	
	    try{
		    method();
		}catch(MyException002 me){
		    String s=me.getMessage();
			System.out.println(s);

			me.printStackTrace();
		}

	}
	public static void method() throws MyException002 {   //�˴�throws�׸������ߡ�
	
	    MyException002 me = new MyException002("�Զ����쳣����ʾ��Ϣ");   //�����Զ����쳣����ʾ��Ϣ
		throw me;    //�ֶ��׳��쳣���������о�ֻ�� new���쳣�����쳣��û�г���
	}

}