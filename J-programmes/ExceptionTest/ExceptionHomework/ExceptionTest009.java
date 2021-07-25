public class ExceptionTest009 {

    public static void main(String[] args){
	
	    UserService u=new UserService();
		try{
		    u.register("tom", "123");
		}catch (RegisterException e){
		    String str=e.getMessage();  //这个getMessage()方法可以调到super(s)里的s被赋予的值,
 			                            //这里不可单独写：e.getMessage(),这么写只是调用getMessage()方法，还没接收返回值。
			System.out.println(str);
			e.printStackTrace();
		}
	}

}