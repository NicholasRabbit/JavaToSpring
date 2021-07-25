public class OOTest102{
    public static void main(String[] args){
	     
		 PetDog dog01=new PetDog();
		        dog01.name="Ğ¡ºÚ";
				dog01.weight=15;
				dog01.gender=false;
		 
		 
		 
		 Someone sheridan=new Someone();
		         sheridan.name="Richard Sheridan";
				 sheridan.age=43;
				 sheridan.sex=true;
				 sheridan.dog=dog01;

				 System.out.println(sheridan);
				 System.out.println(sheridan.dog.name);
				 
				 if(sheridan.dog.gender){
				    System.out.println("¹«¹·");
				 
				 }else if(!(sheridan.dog.gender)){
				    System.out.println("Ä¸¹·");
				 
				 }else{
				    System.out.println("ÊäÈë´íÎó");
				 
				 }
				 
	
	
	}


}