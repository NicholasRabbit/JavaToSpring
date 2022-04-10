public class Day16Work01 {

    public static void main(String[] args){
	    A a=new A(100);
		B b=new B(a);
		  

        java.util.Scanner scan=new java.util.Scanner(System.in);
		
		while(true){
		   System.out.print("请输入猜测数字：");
		   int num=scan.nextInt();
		   b.compare(num);
		}
		 
	}

}

class A {

    private int v;

	public A(){
	
	}

	public A(int v){
	
	   this.v=v;
	}

	public void setA(int v){
	
	   this.v=v;
	}

	public int getA(){
	
	   return v;
	}


}

class B {

    A a;      //此处声明一个class A类型的变量a,目的是为了把上面的新创建的对象a的地址传进来。然后用a.getA()代用A里属性v的值，来比较

	public B(){
	  System.out.println(a);
	}
	public B(A a){
	
	   this.a=a;
	   
	}
    
	//int vNum=a.getA();   //空指针异常,a是空的，这行是属性，没有实例化，即没有创建对象,这里的a没有被调用，不属于任何对象，因此为空。
	                       //编译时并不赋值，因此编译时a为null，执行main方法时compare()不调用此行，因此运行时就空指针异常报错。
    public void compare(int num){
	    int vNum=a.getA();       //执行main方法时调用，执行此行，此时把a的地址赋值进来            
	    if(num==vNum){
		
		    System.out.println("相等");
			      
			//return;             //此处猜对以后，用return只能终止方法执行，但while语句里一直在重复调用，所以return在这里没作用
		    System.exit(0);       //这行代码表示直接终止JVM运行。

		}else if(num>vNum){
		
		    System.out.println("大了");
		}else{
		
		    System.out.println("小了");
		}

	}


}