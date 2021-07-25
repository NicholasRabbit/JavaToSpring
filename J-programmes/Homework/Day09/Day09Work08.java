
public class Day09Work08 {

    public static void main(String[] args){
	    java.util.Scanner num=new java.util.Scanner(System.in);
		System.out.print("请输入数字：");
		int a=num.nextInt();
		int x=a;
		
		int b=method01(x);
		System.out.println("是倒序");
		System.out.println("这个数是"+b+"位数");
	
	}

	public static int method01(int x){
	    int count=0;
		
		//注意此条件的运用，当最后一位是个位时，x/=10为0，则x==0，x!=0条件不成立
		while(x!=0){                  
		    
			System.out.print(x%10);
			x/=10;
			count++;
		
		}
        
		return count;
	}

}