public class MyExceptionTest001 {

    public static void main(String[] args){
	
	    MyException001 me = new MyException001("自定义异常");  //这里只是创建异常对象，还没有抛出。
		
		String str = me.getMessage();
		System.out.println(str);
		
		me.printStackTrace();
		
	
	}

}