public class ArmyTest {

    public static void main(String[] args){
	
	    Army a=new Army(5);

		Weapon wa=new Pistol("��ǹ");  //��̬�﷨ 
		
		System.out.println(wa.name);  //�˴���������е�ֵ����������Ȼ�����Ƕ��̬�﷨�����ɶ���wa(�ڴ��ַָ��Pistol����)��
		                              //����Weapon�������ʵ����������Pistol�̳��˸�������name��ֵ�����wa.nameΪ��"����"����ʹ��������Pistolʵ������ֵ������ǹ��Ҳ������á�
		System.out.println(wa);       //�ص�������Pistol�̳��˸���Weapon��ֵ����ʹ�����ֵΪ�գ�Ҳ�̳С�

		a.addWeapon(wa);

		wa.attack();
	}

}