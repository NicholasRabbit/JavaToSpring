public class TestHomeworkDay24 {

    public static void main(String[] args){
	
	    Army a=new Army(3);    //��ʼ�趨��3������

		Weapon pistol=new Pistol();
		Weapon fighter=new Fighter();
		Weapon canon=new Canon();

		Weapon pistol2=new Pistol();

		try{  
			a.addWeapon(pistol);
		    a.addWeapon(fighter);
		    a.addWeapon(canon);
		
			a.addWeapon(pistol2);  //�˴����һ��������ȥ���������������Ƿ�ᱨ����
		}
		catch (OutOfBoundException e){
            String str=e.getMessage();
			System.out.println(str);
		}

		a.allAttack();
		a.allMove();
		
	
	
	}

}