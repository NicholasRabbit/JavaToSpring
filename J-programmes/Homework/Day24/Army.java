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

		OutOfBoundException o=new OutOfBoundException ("��������");  //�Զ������������쳣�����׳���
		throw o;

	}

	public void allAttack(){
	    System.out.println("����������ʼ����");
		for(int i=0; i<w.length; i++){
		    
			//instanof�ؼ��֣��ж�һ�����󣨼����ã��Ƿ�Ϊĳ�����ʵ������ĳ������������ࡱ��ʵ������ĳ���ӿڵ�ʵ�ֵ�ʵ����
			//�����ж�w[i]�Ƿ�Ϊ�ӿ�Assautable��ʵ�����ʵ��
			if(w[i] instanceof Assaultable){  //���w[i]��������ַָ��Assaultable�ӿ���,����Ϊtrue
			    
				Assaultable as=(Assaultable)w[i];
				as.attack();
			}

		}
	}

	public void allMove(){
	    System.out.println("�������ƶ���������ʼ�ƶ�");
		for(int i=0; i<w.length; i++){
		    if(w[i] instanceof Mobility){
			    Mobility m=(Mobility)w[i];
				m.move();
			}
		}
	}



	


}