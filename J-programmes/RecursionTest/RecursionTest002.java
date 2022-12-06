//使用递归计算累加
public class RecursionTest002{
    public static void main(String[] args){
	     
		 int k=RecursionTest002.sum(5);
	     System.out.println(k);
	
	}
	public static int sum(int m){
	     if(m==0){                   //此处改为m==1，并且下面改为return 1; 也可以
		    return 0;  
		 }
	     return m+sum(m-1);          //此处sum(m-1)不可写作sum（m--），会报错，java编译器编译时，是从左向右编译，   
                                     //sum(m--)在java有个内部程序变量（假设为i）承接，例如sum(i=m--),那按照规则
	}                                //就是先赋值，再自减一，因此m永远是之前那个数，递归无穷尽


}