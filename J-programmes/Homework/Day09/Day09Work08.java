
public class Day09Work08 {

    public static void main(String[] args){
	    java.util.Scanner num=new java.util.Scanner(System.in);
		System.out.print("���������֣�");
		int a=num.nextInt();
		int x=a;
		
		int b=method01(x);
		System.out.println("�ǵ���");
		System.out.println("�������"+b+"λ��");
	
	}

	public static int method01(int x){
	    int count=0;
		
		//ע������������ã������һλ�Ǹ�λʱ��x/=10Ϊ0����x==0��x!=0����������
		while(x!=0){                  
		    
			System.out.print(x%10);
			x/=10;
			count++;
		
		}
        
		return count;
	}

}