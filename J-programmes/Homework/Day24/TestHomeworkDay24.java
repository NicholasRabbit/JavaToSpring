public class TestHomeworkDay24 {

    public static void main(String[] args){
	
	    Army a=new Army(3);    //初始设定有3种武器

		Weapon pistol=new Pistol();
		Weapon fighter=new Fighter();
		Weapon canon=new Canon();

		Weapon pistol2=new Pistol();

		try{  
			a.addWeapon(pistol);
		    a.addWeapon(fighter);
		    a.addWeapon(canon);
		
			a.addWeapon(pistol2);  //此处多加一种武器进去，测试数组满后是否会报警。
		}
		catch (OutOfBoundException e){
            String str=e.getMessage();
			System.out.println(str);
		}

		a.allAttack();
		a.allMove();
		
	
	
	}

}