public class SwitchTest201{
    public static void main(String[] args){
	    SwitchTest201.scoreLevel();
		              operation();
	
	}
	public static void scoreLevel(){
		java.util.Scanner scan=new java.util.Scanner(System.in);
	    System.out.println("������ɼ��� ");
	    double score=scan.nextDouble();
		int m=(int)score/10;
		switch(m){
		   case 9: case 10:
			   System.out.println("����");
			   break;
		   case 8: case 7:
			   System.out.println("����");
		       break;
           case 6:
			   System.out.println("����");
		       break;
		   case 5: case 4: case 3: case 2: case 1: case 0:
		       System.out.println("������");
			   break;
           default:
		       System.out.println("�������");


	    }
    } 
	public static void operation(){
	     java.util.Scanner s=new java.util.Scanner(System.in);
		 System.out.println("��һ������ ");
		 int a=s.nextInt();
		 System.out.println("�����+,-,*,/�� ");
		 String m=s.next();
		 System.out.println("�ڶ������� ");
		 int b=s.nextInt();
         int result=0;
		 switch(m){
		     case "+":
			 result=a+b;
			 break;
			 
			 case "-":
			 result=a-b;
			 break;
			 
			 case "*":
			 result=a*b;
			 break;
			 
			 case "/":
             result=a/b;
			 break;

			 default:
             System.out.println("Wrong data!");
		}
		System.out.println(a+m+b+"="+result);



	
	
	}

	

	    
	
	
	


}