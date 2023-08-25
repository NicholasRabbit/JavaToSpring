public class AnnoInnerTest001 {

    public static void main(String[] args){
	    
		Computer c=new ComputerImpl();    //多态
		MyCaculator mc1=new MyCaculator();
		mc1.sum(c,100,200);    //调用MyCaculator里的sum()方法求和。

		/*
		以下是用匿名内部类方式写代码求和：
		一般情况下接口Computer不可以new对象
		但是这里new Computer(){...}就是一个匿名内部类(AnnoInnerTest001$1)，
		没有名字，只是实现了接口Computer里的方法，不用再去写有名字的类去实现方法了。
		
		*/
		MyCaculator mc2=new MyCaculator();
		mc2.sum(
			new Computer(){
				public int plus(int a, int b){
					return a+b;
				}   
			},
			100,
			200);
							               
		                        
	
	}

}

interface Computer {

   public abstract int plus(int a, int b);

}

class ComputerImpl implements Computer{     //创建子类，实现接口里的方法。
     
   public int plus(int a, int b){
   
       return a+b;
   } 

}
class MyCaculator {

   public void sum(Computer c, int a, int b){
       int retValueOfPlus=c.plus(a,b);
	   System.out.println("和是："+retValueOfPlus);
   
   }

}
