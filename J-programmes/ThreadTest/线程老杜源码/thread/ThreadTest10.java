
/*
��ô�������ֹһ���̵߳�ִ�С����ַ�ʽ�Ǻܳ��õġ�
 */
public class ThreadTest10 {
    public static void main(String[] args) {
        MyRunable4 r = new MyRunable4();
        Thread t = new Thread(r);
        t.setName("t");
        t.start();

        // ģ��5��
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // ��ֹ�߳�
        // ����Ҫʲôʱ����ֹt��ִ�У���ô��ѱ���޸�Ϊfalse���ͽ����ˡ�
        r.run = false;
    }
}

class MyRunable4 implements Runnable {

    // ��һ���������
    boolean run = true;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            if(run){
                System.out.println(Thread.currentThread().getName() + "--->" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else{
                // return�ͽ����ˣ����ڽ���֮ǰ����ʲôû����ġ�
                // ��������Ա���ѽ��
                //save....

                //��ֹ��ǰ�߳�
                return;
            }
        }
    }
}
