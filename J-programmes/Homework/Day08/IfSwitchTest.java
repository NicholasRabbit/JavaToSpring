public class IfSwitchTest {

    public static void main(String[] args){
	
	     ifMethod(6);
		 switchMethod(2);

		 java.util.Scanner get=new java.util.Scanner(System.in);
		 System.out.println("if���������룺");
		 int a=get.nextInt();
		 ifMethod(a);
         
		 System.out.println("switch���������룺");
		 int b=get.nextInt();
		 switchMethod(b);



	}


	public static void ifMethod(int a){
	
	     if(a==3|a==4|a==5){
		 
		     System.out.println("����");
		 
		 }else if(a==6||a==7||a==8){
		 
		     System.out.println("�ļ�");
			 
		 }else if(a==9|a==10|a==11){
		 
		     System.out.println("�＾");
		 }else if(a==12||a==1||a==2){
		 
		     System.out.println("����");
		    
		 }else{
		 
		     System.out.println("�������");
		 }
	
	}
	public static void switchMethod(int a){
	
	     switch(a){
		 
		    case 3: case 4: case 5:
			    System.out.println("����");
			    break;
			case 6: case 7: case 8:
				System.out.println("�ļ�");
			    break;
            case 9: case 10: case 11:
				System.out.println("�＾");
			    break;
            case 12: case 1: case 2:
				System.out.println("����");
			    break;
            default:
				System.out.println("�������");

			   
		 }
	}

}