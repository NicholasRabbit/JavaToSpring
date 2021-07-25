public class IfTest010{
    public static void main(String[] args){
	
	    java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.print("请输入年龄： ");
		int age=scan.nextInt();

		if(age>0&age<=10){
		
		    System.out.println("幼儿");
		
		}else if(age>10&age<=30){
		
		    System.out.println("青年");
		
		}else if(age>30&age<=60){
		
		    System.out.println("中年");
		
		}else if(age>60&age<150){
		
		    System.out.println("老年");
		
		}else{
		
		    System.out.println("输入错误！");
		
		}

        

	
	}


}