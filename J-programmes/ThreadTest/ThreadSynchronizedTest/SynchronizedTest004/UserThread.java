public class UserThread extends Thread {
    User u;

	public UserThread(){
	}
	public UserThread(User u){
	    this.u=u;
	}
	
	public void run(){
	   
	   u.doSome();      //doSome()�Ǿ�̬����������synchronized�ؼ��֣��൱������������һ������
	                    //����ͬһ����Ķ���ִ���꣬��Ķ���ſ���ִ��
	   
	   //u.doOther();   //doOther()��ʵ����������synchronized�ؼ��֣��Ƕ������ģ���ͬ�Ķ���ͬ��������ͬʱִ��
	}
}