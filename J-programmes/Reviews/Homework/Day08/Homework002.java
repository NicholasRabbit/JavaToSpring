public class Homework002 {

    public static void main(String[] args){
	
	    java.util.Scanner read=new java.util.Scanner(System.in);
		System.out.println("���������֣�");
		int a=read.nextInt();
        
		String k=num(a);
		System.out.println(k);
	}

	public static String num(long a){
	     
		 if(a<0){
		 
		     return "����";
		 }else if(a>0){
		 
		     return "����";
		 }else{
		 
		     return "0������";
		 } 
	    
	
	}



}

