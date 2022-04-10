public class ForTest014 {

    public static void main(String[] args){
	    java.util.Scanner num=new java.util.Scanner(System.in);
        System.out.print("请输入金字塔行数：");
		int x=num.nextInt();
        int n=x;

	    pyramid(n);

	}

	public static int pyramid(int n){       //金字塔练习
	  
		
	    for(int a=1;a<=n;a++){
		      
		    for(int b=1;b<=(n-a);b++){
			
			    System.out.print(' ');
			}
            int k=1+2*(a-1);
			for(int c=1;c<=k;c++){
			    
			    System.out.print('*');
			}

			System.out.print('\n');
		
		
		}
		return 10;  //此行无意义，为了练习不忘返回值语句。
	
	}

}