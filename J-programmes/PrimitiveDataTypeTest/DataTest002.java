public class DataTest002{
    public static void main(String[] args){
	
	    int m=10;
		    m+=m;
        System.out.println("m>>>>>>"+m);  //结果20
		
		int a=10;
		    a=a+(a+=a);
        System.out.println("a>>>>>>"+a);  //结果30

		int b=10;
		    b=(b+=b)+b;
        System.out.println("b>>>>>>"+b);  //结果40 

		int k=0;
		    k=k+(++k);                    // 如果此行++k改为k++,则结果为0,证明程序编译是从左往右的

        System.out.println("k>>>>>>"+k);  //结果为1,  

	
	}



}
/*
先上结论
由于运算是用栈实现的，虽然这里运算是从右向左，但计算机是从左往右读的，用栈来实现运算从右向左。

简单例子a=a+(a+=a)

先计算a+=a,但是在计算之前就把第一个加数push进栈了

所以即使后面对a赋值也无济于事

但改成a=(a+=a)+a就不一样了

先计算(a+=a)再把另一个加数push进栈，此时另一个加数就是赋值后的了
*/
