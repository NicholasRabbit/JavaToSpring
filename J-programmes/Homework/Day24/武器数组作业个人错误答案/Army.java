public class Army {

    Weapon[] w;
	private int index;

	public Army (){
	
	}
	public Army (int i){
	    w=new Weapon[i];     //ע�⣬�˴���Ҫ�����д����Weapon[] w=new Weapon[i],��Ϊw����������������,ֻ��Ҫ��ֵ���С�
	}

	public void addWeapon(Weapon wa){
	    
		w[0]=wa;
		index++;
		
		
	}

	public Weapon[] allAttack (){
	    System.out.println("����������ʼ����");
		for(int i=0; i<w.length; i++){
			w[i].attack();
		}
		System.out.println("���������������");

		return w;
	}



}