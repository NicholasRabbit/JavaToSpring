public class MyExceptionTest001 {

    public static void main(String[] args){
	
	    MyException001 me = new MyException001("�Զ����쳣");  //����ֻ�Ǵ����쳣���󣬻�û���׳���
		
		String str = me.getMessage();
		System.out.println(str);
		
		me.printStackTrace();
		
	
	}

}