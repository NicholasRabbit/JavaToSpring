public class OOTest101 {
    
	public static void main(String[] args){
	     
			
		 Owner01 jean=new Owner01();
				 jean.name="Jean";
				 jean.age=25;
				 jean.idCard=1300001;
			
		 House house01=new House();
		 house01.area=100;
		 house01.ownerA=jean;
		 
		 System.out.println("��������� "+house01.area+"��������: "+house01.ownerA.name+"���䣺"+house01.ownerA.age+"���֤��"+house01.ownerA.idCard);

	
	}
	

}