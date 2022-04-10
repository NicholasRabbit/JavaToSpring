public class Day09Work03 {

   
	public static void main(String[] args){
	
	    int k=multiple();
		System.out.println(k);

	}
	public static int multiple(){
	
	    
		java.util.Scanner get=new java.util.Scanner(System.in);
        System.out.print("请输入阶乘数： ");
		int num=get.nextInt();
        


		int n=1;
		for(int m=num;m>0;m--){    //100的阶乘值超过int取值范围，最后结果为0，以后算阶乘时注意，不要超过数值类型的取值范围。
		   
		   n*=m;
		
		}
		
		return n;
	
	}

}



