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
	public static void method() throws MyException002 {   //此处throws抛给调用者。
	
	    MyException002 me = new MyException002("自定义异常类提示信息");   //输入自定义异常类提示信息
		throw me;    //手动抛出异常，否则上行就只是 new了异常对象，异常还没有出现
	}

}