public class Homework004 {

    public static void main(String[] args){
	
	     java.util.Scanner read=new java.util.Scanner(System.in);
		 System.out.print("�����һ����: ");
		 int num01=read.nextInt();

		 System.out.print("����ڶ�����: ");
		 int num02=read.nextInt();
		 
		 String k=compare(num01,num02);
		 System.out.println("�ȽϽ��Ϊ: "+k);


	}

    public static String compare(int a,int b){
	
	    if(a>b){
		
		   return ">";
		}else if(a<b){
		
		   return "<";
		}else{
		
		    return "=";
		}
	
	}


}