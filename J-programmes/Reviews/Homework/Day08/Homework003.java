public class Homework003 {

    public static void main(String[] args){
	    
		java.util.Scanner number=new java.util.Scanner(System.in);
		System.out.print("�����룺");
		int k=number.nextInt();
		
		String j=num(k);
		System.out.println(j);
	
	}

	public static String num(int a){
	
	     if(a%2==0){
		 
		      return "ż��";

		 }else{
		 
		      return "����";
		 }

			
	}
}