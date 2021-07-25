public class SuperTest002 {

    public static void main(String[] args){
	
	   Son s=new Son();   //调用子类里的无参构造，输出子类里super()调用的父类方法“父类无参构造方法执行。”
	   
	   Son t=new Son("名字",100,(byte)30);  //这里实参数值无意义，只是为了 调用子类有参构造方法，验证 super(实参)的赋值。
	}

}