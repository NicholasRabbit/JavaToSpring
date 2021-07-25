public class ToStringTest007 {

    public static void main(String[] args){
	
	    method();
	}

	public static void method(){
	
	    String s1=new String("Hello again.");
		System.out.println(s1.toString());      //验证String类里重写了Object类里的toString()方法，此处输出“Hello again.”
		System.out.println(s1);                 //toString()不写也可以，java系统默认给加上。
	
	}

}