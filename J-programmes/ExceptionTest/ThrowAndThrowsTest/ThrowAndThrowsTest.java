

public class ThrowAndThrowsTest{

	//throw用于方法内抛出异常，有别的方法调用本方法需要进行捕获或者继续上抛。
	//throws用于方法名后上抛异常，
	public static void main(String[] args){
		User u = new User();
		u.foo();
		try{
			//u.bar();
		}catch(RuntimeException e){
			e.printStackTrace();
		}
	}
}


class User{

	public void foo(){
		throw new RuntimeException();
	}
	
	public void bar() throws RuntimeException{
		throw new RuntimeException();
	}
}
