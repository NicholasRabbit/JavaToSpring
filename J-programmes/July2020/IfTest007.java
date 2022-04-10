public class IfTest007{
    
	public static void main(String[] args){
	  java.util.Scanner scan=new java.util.Scanner(System.in);
	  System.out.print("ÇëÊäÈëÄêÁä£º");
	  double age=scan.nextDouble();
	  System.out.print("ÇëÊäÈëĞÔ±ğ(ÄĞ£º1£¬Å®£º0)£º");
	  byte  gender=scan.nextByte();

	  if(age>=0&age<12){
	     if(gender==1){
		    System.out.println("ÔùËÍÄĞÑ§Éú·ş");
		 }else if(gender==0){
		    System.out.println("ÔùËÍÅ®Ñ§Éú·ş");
		 }else{
		    System.out.println("ÊäÈë´íÎó");
		 }
	  }else if(age>=12&age<18){
	      if(gender==1){
		    System.out.println("ÔùËÍÄĞĞİÏĞ·ş");
		  }else if(gender==0){
		    System.out.println("ÔùËÍÅ®ĞİÏĞ·ş");
		  }else{
		    System.out.println("ÊäÈë´íÎó");
		  }
	  
	  }else if(age>=18&age<=150){
	      if(gender==1){
		    System.out.println("ÔùËÍÄĞÎ÷·ş");
		  }else if(gender==0){
		    System.out.println("ÔùËÍÍíÀñ·ş");
		  }else{
		    System.out.println("ÊäÈë´íÎó");
		  }
	  }else{
	    System.out.println("ÊäÈë²ÎÊıÓĞÎó£¡");
	  }
	
	
	}



}