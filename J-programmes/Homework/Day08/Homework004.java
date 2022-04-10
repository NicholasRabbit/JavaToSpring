public class Homework004 {

    public static void main(String[] args){
	
	     java.util.Scanner read=new java.util.Scanner(System.in);
		 System.out.print("输入第一个数: ");
		 int num01=read.nextInt();

		 System.out.print("输入第二个数: ");
		 int num02=read.nextInt();
		 
		 String k=compare(num01,num02);
		 System.out.println("比较结果为: "+k);


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