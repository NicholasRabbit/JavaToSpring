

/**
 * ս�������������������ƶ����ɹ���
 */
public class Fighter extends Weapon implements Moveable, Shootable {

    @Override
    public void move() {
        System.out.println("ս�������");
    }

    @Override
    public void shoot() {
        System.out.println("ս�������ڣ�");
    }
}
