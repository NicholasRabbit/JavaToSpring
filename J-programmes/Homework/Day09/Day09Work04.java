public class Day09Work04 {

    public static void main(String[] args){
	
	    java.util.Scanner get=new java.util.Scanner(System.in);
		System.out.print("������һ����������");
		int m=get.nextInt();
		int a=m;
		primeTest(a);
		

	}
	public static int primeTest(int a){
	
	    if(a>=0&&a<2){
		
		    System.out.println(a+"��������");

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
			
			    System.out.println(a+"������");   //�˴�������Լ�Ϊ��Ԫ���������ʽ��
			}
			*/
			String k=isPrime?"������":"��������";
			System.out.println(k);

		}else{
		
		    System.out.println("�������"+a+"����������");
		}
		return a;
	
	}

	
}