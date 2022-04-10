public class Homework005 {

    public static void main(String[] args){
	     
		 java.util.Scanner read=new java.util.Scanner(System.in);
		 
		 System.out.print("输入num01: ");
		 int num01=read.nextInt();

		 System.out.print("输入num02: ");
		 int num02=read.nextInt();

		 System.out.print("输入num03: ");
		 int num03=read.nextInt();

		 compare(num01,num02,num03);  //此处num01,02,03与下面的不是同一个作用域的变量，可以重名。


	
	}
    public static void compare(int num01, int num02, int num03){
	
	    int max=(num01>num02)? num01:num02;
		int min=(num01<num02)? num01:num02;

		if(num03<min){
		
		   System.out.println(num03+"<"+min+"<"+max);
		}else if(num03>max){
		
		   System.out.println(min+"<"+max+"<"+num03);
		}else{
		
		   System.out.println(min+"<"+num03+"<"+max);  //num03在两个数之间。
		}
	
	} 



}