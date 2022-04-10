

/**
 * ����
 *
 * ����ǿ������ת�������У��������ת���ɽӿ����͡�
 * ��ô��ͽӿ�֮�䲻��Ҫ���ڼ̳й�ϵ��Ҳ����ת����
 * java�﷨������
 */
public class Army {
    /**
     * ��������
     */
    private Weapon[] weapons;

    /**
     * �������ӵĹ��췽����
     * @param count ��������
     */
    public Army(int count){
        // ��̬��ʼ��������ÿһ��Ԫ��Ĭ��ֵ��null��
        // �������������ˣ���������������û�з�������
        weapons = new Weapon[count];
    }

    /**
     * ��������������
     * @param weapon
     */
    public void addWeapon(Weapon weapon) throws AddWeaponException {
        for(int i = 0; i < weapons.length; i++){
            //if(null == weapons[i]) {
            if(weapons[i] == null) {          //(�����ܽ�)ע�⣬����if���д��forѭ����ߣ���������ߣ������Ϳ����𵽲������ж����Ԫ�����ظ���Ӷ��������
                // ��������ӵ��յ�λ���ϡ�
                weapons[i] = weapon;
                System.out.println(weapon + "��������ӳɹ�");
                return;
            }
        }
        // �������ִ�е��˴�˵��������û����ӳɹ�
        throw new AddWeaponException("���������Ѵﵽ���ޣ�");
    }

    /**
     * ���пɹ���������������
     */
    public void attackAll(){
        // ��������
        for(int i = 0; i < weapons.length; i ++){
            if(weapons[i] instanceof Shootable){
                // �������������еķ���������ת�͡�
                Shootable shootable = (Shootable)weapons[i];
                shootable.shoot();
            }
        }
    }

    /**
     * ���п��ƶ��������ƶ�
     */
    public void moveAll(){
        // ��������
        for(int i = 0; i < weapons.length; i ++){
            if(weapons[i] instanceof Moveable){
                // �������������еķ���������ת�͡�
                Moveable moveable = (Moveable)weapons[i];
                moveable.move();
            }
        }
    }
}
