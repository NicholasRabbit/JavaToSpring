public class ArmyTest {

    public static void main(String[] args){
	
	    Army a=new Army(5);

		Weapon wa=new Pistol("��ǹ");  //��̬�﷨ 
		
		System.out.println(wa.name);  //�˴���������е�ֵ����������̬�﷨�У�����Pistol������������name���������
		                              //��wa����Weapon���������Ȼʵ���ڴ��ַָ�����࣬�����ڱ���׶������Ǿ�̬�󶨵ģ���wa.name�ǵ��õĸ������name
									  //�������Pistol�ﲻ���������Ļ����򲻻�������־�̬�󶨡�
									
		System.out.println(wa);       //�ص�������Pistol�̳��˸���Weapon��ֵ����ʹ�����ֵΪ�գ�Ҳ�̳С�

		a.addWeapon(wa);

		wa.attack();
	}

}

/*
Person���࣬Son���࣬��������������������name�������
�����Ǿ�̬̬�󶨣������Ƕ�̬�󶨡�
��̬�󶨾��Ǳ�������ʲô���ͣ������ĸ�����ġ�
���磬���p.name��p��Person���ͣ���ôname����Person���е�name��
������Ƕ�̬�󶨣���ô��ӱ������Ϳ�ʼ�����Ͳ��ҡ�
���name�Ƿ�������ô����p��Son���һ���������Ի��Son��ʼ��name����������Ҳ����ٵ��������ҡ�

*/