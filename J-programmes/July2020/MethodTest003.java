public class MethodTest003{
    public static void main(String[] args){
	    MethodTest003.m();
		              m();  //修饰符列表有static关键字的情况下，同类（MethodTest003）下，可以不写“类名.”，就能调用方法
					  n();
					A.k();  //跨类调用方法必须写全"类名.",省略类名的话，这道程序只会在本类里找程序调用
					  k();  //这个实参列表调用的是MethodTest003类里的k方法

	}
	public static void m(){
	    System.out.println("m method excute.");
		              
	}
	public static void n(){
	    System.out.println("n method excute.");
		            A.k();
	}
	public static void k(){
	    System.out.println("MethodTest003: k method excute.");
	}



}
class A{
	public static void k(){
	    System.out.println("A class: k method excute.");
	}
}