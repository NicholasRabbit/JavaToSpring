public class IfTest005{
    public static void main(String[] args){
     
    java.util.Scanner scan=new java.util.Scanner(System.in);
	System.out.print("�������������꣺1 ���죺0 :");
	byte weather=scan.nextByte();
	System.out.print("�����Ա��У�1 Ů��0 :");
	byte gender=scan.nextByte();
	
	
	
		 
		 
		 if(weather==1){
               if(gender==1){
               System.out.println("��ɫɡ"); 
               }else if(gender==0){
               System.out.println("��ɫɡ");
               }else{
			   System.out.println("���������Ƿ���ȷ");
			   }
         }else if(weather==0){
					   System.out.print("�����¶�");
					   byte degree=scan.nextByte();
					   
					   if(degree<=50&&degree>30){
						       if(gender==1){
							   System.out.println("��ī��");
							   }else if(gender==0){
							   System.out.println("������ɡ"); 
							   }
		 
		               }else if(degree>=-50&&degree<=30){
					           System.out.println("ɶ�����ô�");
					   }else{
					           System.out.println("���������Ƿ���ȷ");
					   }
		 }else{
		      System.out.println("��������");
		 }



    
	            
	}

}