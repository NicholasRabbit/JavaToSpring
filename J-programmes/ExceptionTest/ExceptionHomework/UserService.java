public class UserService {

    public void register (String username, String code) throws RegisterException {
	
	    if (username != null & username.length()>=6 & username.length() <=14 ){    //"username!=null"或“username=null”一般放在判断条件的最前面，先判断，
		    System.out.println("恭喜你注册成功!");                                 //防止后面条件出现空指针异常  
			return;
		}
		RegisterException r=new RegisterException("注册失败，用户名长度在6-14之间");
		throw r;
	}

	

}