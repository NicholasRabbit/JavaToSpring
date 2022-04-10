public class SwitchTest002{
    public static void main(String[] args){
	    java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.print("请输入数字(1-7):");
		int number=scan.nextInt();

		switch(number){
		   case 1: case 2: case 3:  case 4: case 5: case 6: case 7:
		   System.out.println("回答正确");
		   break;
		   default:
		   System.out.println("输入错误");
		}

	
	
	}
		

}