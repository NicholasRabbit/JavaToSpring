//synchrnized����static���εľ�̬�����ϣ������������һ������һ���̰߳���������꣬����̲߳ſ�����
public class SynchronizedTest004 {
    
    public static void main(String[] args){
	
	    User u1=new User();
		User u2=new User();
		UserThread t1=new UserThread(u1);  //��ͬ���̴߳���ȥ��ͬ�Ķ���u1,u2
		t1.setName("t1");
		UserThread t2=new UserThread(u2);
		t2.setName("t2");

		t1.start();
		t2.start();

	
	}

}