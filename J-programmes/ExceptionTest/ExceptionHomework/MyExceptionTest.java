public class MyExceptionTest {

    public static void main(String[] args){
	    
		UserService u=new UserService();
		
		try{
			u.register("tom","123");
		}catch (MyException me){
		    String str=me.getMessage();
			System.out.println(str);
		}



	}

}

class UserService {

    private String username;
	private String code;

	public void register(String username, String code) throws MyException {
	
	     if(username.length()>=6&username.length()<=14){     //����Ӧ�ü���username != nullʱ�������ȷ���Ͻ���
		     this.username=username;
			 this.code=code;
			 System.out.println("ע��ɹ�");
			 return;
		 }
		 MyException me=new MyException("�û������ȴ���Ӧ��6-14֮��");
		 throw me;
	
	}

}

class MyException extends Exception {

    public MyException(){
	
	}
	public MyException(String s){
	    super(s);
	}

}