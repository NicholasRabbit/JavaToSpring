public class OOTest101 {
    
	public static void main(String[] args){
	     
			
		 Owner01 jean=new Owner01();
				 jean.name="Jean";
				 jean.age=25;
				 jean.idCard=1300001;
			
		 House house01=new House();
		 house01.area=100;
		 house01.ownerA=jean;
		 
		 System.out.println("房屋面积： "+house01.area+"主人名字: "+house01.ownerA.name+"年龄："+house01.ownerA.age+"身份证："+house01.ownerA.idCard);

	
	}
	

}