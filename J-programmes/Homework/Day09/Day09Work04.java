public class Day09Work04 {

    public static void main(String[] args){
	
	    java.util.Scanner get=new java.util.Scanner(System.in);
		System.out.print("请输入一个正整数：");
		int m=get.nextInt();
		int a=m;
		primeTest(a);
		

	}
	public static int primeTest(int a){
	
	    if(a>=0&&a<2){
		
		    System.out.println(a+"不是质数");

		}else if(a>=2){
		    boolean isPrime=true; 
		    for(int b=2;b<a;b++){
			    
			    if(a%b==0){
				
		           isPrime=false;
				   break;
				   
				}
			}
			/*
			if(isPrime){
			
			    System.out.println(a+"是质数");   //此处代码可以简化为三元运算符的形式。
			}
			*/
			String k=isPrime?"是质数":"不是质数";
			System.out.println(k);

		}else{
		
		    System.out.println("输入错误"+a+"不是正整数");
		}
		return a;
	
	}

	
}