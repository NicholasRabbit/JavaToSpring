public class ForTest014 {

    public static void main(String[] args){
	    java.util.Scanner num=new java.util.Scanner(System.in);
        System.out.print("�����������������");
		int x=num.nextInt();
        int n=x;

	    pyramid(n);

	}

	public static int pyramid(int n){       //��������ϰ
	  
		
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
		return 10;  //���������壬Ϊ����ϰ��������ֵ��䡣
	
	}

}