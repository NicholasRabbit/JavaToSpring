public class IfTest007{
    
	public static void main(String[] args){
	  java.util.Scanner scan=new java.util.Scanner(System.in);
	  System.out.print("���������䣺");
	  double age=scan.nextDouble();
	  System.out.print("�������Ա�(�У�1��Ů��0)��");
	  byte  gender=scan.nextByte();

	  if(age>=0&age<12){
	     if(gender==1){
		    System.out.println("������ѧ����");
		 }else if(gender==0){
		    System.out.println("����Ůѧ����");
		 }else{
		    System.out.println("�������");
		 }
	  }else if(age>=12&age<18){
	      if(gender==1){
		    System.out.println("���������з�");
		  }else if(gender==0){
		    System.out.println("����Ů���з�");
		  }else{
		    System.out.println("�������");
		  }
	  
	  }else if(age>=18&age<=150){
	      if(gender==1){
		    System.out.println("����������");
		  }else if(gender==0){
		    System.out.println("���������");
		  }else{
		    System.out.println("�������");
		  }
	  }else{
	    System.out.println("�����������");
	  }
	
	
	}



}