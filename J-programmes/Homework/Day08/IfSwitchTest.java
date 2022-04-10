public class IfSwitchTest {

    public static void main(String[] args){
	
	     ifMethod(6);
		 switchMethod(2);

		 java.util.Scanner get=new java.util.Scanner(System.in);
		 System.out.println("if∑Ω∑®«Î ‰»Î£∫");
		 int a=get.nextInt();
		 ifMethod(a);
         
		 System.out.println("switch∑Ω∑®«Î ‰»Î£∫");
		 int b=get.nextInt();
		 switchMethod(b);



	}


	public static void ifMethod(int a){
	
	     if(a==3|a==4|a==5){
		 
		     System.out.println("¥∫ºæ");
		 
		 }else if(a==6||a==7||a==8){
		 
		     System.out.println("œƒºæ");
			 
		 }else if(a==9|a==10|a==11){
		 
		     System.out.println("«Ôºæ");
		 }else if(a==12||a==1||a==2){
		 
		     System.out.println("∂¨ºæ");
		    
		 }else{
		 
		     System.out.println(" ‰»Î¥ÌŒÛ");
		 }
	
	}
	public static void switchMethod(int a){
	
	     switch(a){
		 
		    case 3: case 4: case 5:
			    System.out.println("¥∫ºæ");
			    break;
			case 6: case 7: case 8:
				System.out.println("œƒºæ");
			    break;
            case 9: case 10: case 11:
				System.out.println("«Ôºæ");
			    break;
            case 12: case 1: case 2:
				System.out.println("∂¨ºæ");
			    break;
            default:
				System.out.println(" ‰»Î¥ÌŒÛ");

			   
		 }
	}

}