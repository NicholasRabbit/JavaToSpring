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
	
	     if(username.length()>=6&username.length()<=14){     //这里应该加上username != null时的情况，确保严谨性
		     this.username=username;
			 this.code=code;
			 System.out.println("注册成功");
			 return;
		 }
		 MyException me=new MyException("用户名长度错误，应在6-14之间");
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