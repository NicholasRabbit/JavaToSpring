public class Army {

    Weapon[] w;
	int index;

	public Army (){
	
	}
    public Army(int i){
	    w=new Weapon[i];
	}

	public void addWeapon (Weapon wp) throws OutOfBoundException{
	    if(index < w.length){
		    w[index]=wp;
			index++;
			return;
		}

		OutOfBoundException o=new OutOfBoundException ("数组已满");  //自定义数组已满异常，并抛出。
		throw o;

	}

	public void allAttack(){
	    System.out.println("所有武器开始攻击");
		for(int i=0; i<w.length; i++){
		    
			//instanof关键字，判断一个对象（即引用）是否为某个类的实例，或某个“父类的子类”的实例，或某个接口的实现的实例。
			//本例判断w[i]是否为接口Assautable的实现类的实例
			if(w[i] instanceof Assaultable){  //如果w[i]里所含地址指向Assaultable接口类,则结果为true
			    
				Assaultable as=(Assaultable)w[i];
				as.attack();
			}

		}
	}

	public void allMove(){
	    System.out.println("所有能移动的武器开始移动");
		for(int i=0; i<w.length; i++){
		    if(w[i] instanceof Mobility){
			    Mobility m=(Mobility)w[i];
				m.move();
			}
		}
	}



	


}