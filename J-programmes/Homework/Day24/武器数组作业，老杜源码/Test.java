

public class Test {
    public static void main(String[] args) {
        // ����һ������
        Army army = new Army(4); // ����ֻ��4��������
        // ������������
        Fighter fighter = new Fighter();
        Fighter fighter2 = new Fighter();
        Tank tank = new Tank();
        WuZiFeiJi wuZiFeiJi = new WuZiFeiJi();
        GaoShePao gaoShePao = new GaoShePao();

        // �������
        try {
            army.addWeapon(fighter);
            army.addWeapon(tank);
            army.addWeapon(wuZiFeiJi);
            army.addWeapon(gaoShePao);
            army.addWeapon(fighter2);
        } catch (AddWeaponException e) {
            System.out.println(e.getMessage());
        }

        // �����п��ƶ����ƶ�
        army.moveAll();

        // �����пɹ����Ĺ���
        army.attackAll();

        // ����newһ���쳣����û���ֶ����쳣��������һ����ͨ��java�ࡣ
        // ����User��һ����û������
        /*AddWeaponException e = new AddWeaponException("���������Ѵﵽ���ޣ�");
        System.out.println(e.getMessage());*/
    }
}
