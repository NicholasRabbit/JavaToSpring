public class Homework005 {

    public static void main(String[] args){
	     
		 java.util.Scanner read=new java.util.Scanner(System.in);
		 
		 System.out.print("����num01: ");
		 int num01=read.nextInt();

		 System.out.print("����num02: ");
		 int num02=read.nextInt();

		 System.out.print("����num03: ");
		 int num03=read.nextInt();

		 compare(num01,num02,num03);  //�˴�num01,02,03������Ĳ���ͬһ��������ı���������������


	
	}
    public static void compare(int num01, int num02, int num03){
	
	    int max=(num01>num02)? num01:num02;
		int min=(num01<num02)? num01:num02;

		if(num03<min){
		
		   System.out.println(num03+"<"+min+"<"+max);
		}else if(num03>max){
		
		   System.out.println(min+"<"+max+"<"+num03);
		}else{
		
		   System.out.println(min+"<"+num03+"<"+max);  //num03��������֮�䡣
		}
	
	} 



}