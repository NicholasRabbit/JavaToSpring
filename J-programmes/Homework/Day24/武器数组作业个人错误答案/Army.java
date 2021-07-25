public class Army {

    Weapon[] w;
	private int index;

	public Army (){
	
	}
	public Army (int i){
	    w=new Weapon[i];     //注意，此处不要错误地写作：Weapon[] w=new Weapon[i],因为w已在上面声明过了,只需要赋值就行。
	}

	public void addWeapon(Weapon wa){
	    
		w[0]=wa;
		index++;
		
		
	}

	public Weapon[] allAttack (){
	    System.out.println("所有武器开始攻击");
		for(int i=0; i<w.length; i++){
			w[i].attack();
		}
		System.out.println("所有武器攻击完毕");

		return w;
	}



}