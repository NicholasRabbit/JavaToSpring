public class CaculationTest001{
    public static void main(String[] args){
	    java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.print("求n个整数累加之结果： ");
        int n=scan.nextInt();
		int m=(n+1)*n/2;
		System.out.println(m);

		System.out.print("另一种x的累加算法用for循环,输入x； ");
		int x=scan.nextInt();
		int sum=0;                //此处int sum必须赋初始值，否则下面sum+=x会报错
		for(x=1;x<=100;x+=1){
		    sum+=x;
		}
        System.out.println(sum);

	}


}