public class IfTest010{
    public static void main(String[] args){
	
	    java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.print("���������䣺 ");
		int age=scan.nextInt();

		if(age>0&age<=10){
		
		    System.out.println("�׶�");
		
		}else if(age>10&age<=30){
		
		    System.out.println("����");
		
		}else if(age>30&age<=60){
		
		    System.out.println("����");
		
		}else if(age>60&age<150){
		
		    System.out.println("����");
		
		}else{
		
		    System.out.println("�������");
		
		}

        

	
	}


}