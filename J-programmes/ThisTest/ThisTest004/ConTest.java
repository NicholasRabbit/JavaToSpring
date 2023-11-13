public class ConTest{
    
	public static void main(String[] args){    //习题练习，原题件ppt笔记
	     
		 ConTest.method1();
		         method1();
 
         ConTest m2=new ConTest();
		         m2.method2();

	
	}
	
	int i=10;

	public static void method1(){
	    ConTest.doSome();              
		        doSome();

        ConTest d1=new ConTest();
		        d1.doOther();
         
		ConTest iVisit=new ConTest();
		        //iVisit.i;                     //此处只写iVisit.i为什么不行？原因：iVisit.i是调用了一个属性，不能单独成句，可以当作等号右边赋值，或者当作实参等。
				System.out.println(iVisit.i);   
	
	}
	public void method2(){
	    ConTest.doSome();     //这里是调用ConTest类的方法,用类名.方法名；
		        
				doSome();     //这里是调用ConTest对象的doSome方法省略的是当前对象的引用名字,不是类名
                              //即this.doSome();因为用引用.方法名也可以调用static方法，即使引用为null，
							  //完整写法，"ConTest c=new ConTest(); c=null(c为空也可以); c.doSome();或this.doSome;"
							  //这里引用c等效于类名了（SUN内部程序认可）
        this.doOther();
		     doOther();

             System.out.println(this.i);

        
	
	}

	public static void doSome(){
	
	    System.out.println("doSome方法输出");
	}

	public void doOther(){
	
	    System.out.println("doOther方法输出");
	}
	

}
