public class MethodTest002{
    public static void sum(int a,int b){
	     System.out.println(a+"+"+b+"="+(a+b));
		 MethodTest002.doSome();
	
    }
	public static void main(String[] args){
	     MethodTest002.sum(10,20);
		 System.out.println("Hello again!");
	
	}
    public static void doSome(){
		System.out.println("你好");
	
	
	}

}
/*
输出顺序，注意调用的先后顺序,main方法是程序入口，先执行，
然后调用sum方法，sum方法里最后一句是调用doSome方法，最后
main方法里的Hello again!才输出
10+20=30
你好
Hello again!
*/