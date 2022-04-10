public class SwitchTest201{
    public static void main(String[] args){
	    SwitchTest201.scoreLevel();
		              operation();
	
	}
	public static void scoreLevel(){
		java.util.Scanner scan=new java.util.Scanner(System.in);
	    System.out.println("请输入成绩： ");
	    double score=scan.nextDouble();
		int m=(int)score/10;
		switch(m){
		   case 9: case 10:
			   System.out.println("优秀");
			   break;
		   case 8: case 7:
			   System.out.println("良好");
		       break;
           case 6:
			   System.out.println("及格");
		       break;
		   case 5: case 4: case 3: case 2: case 1: case 0:
		       System.out.println("不及格");
			   break;
           default:
		       System.out.println("输入错误！");


	    }
    } 
	public static void operation(){
	     java.util.Scanner s=new java.util.Scanner(System.in);
		 System.out.println("第一个数： ");
		 int a=s.nextInt();
		 System.out.println("运算符+,-,*,/： ");
		 String m=s.next();
		 System.out.println("第二个数： ");
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