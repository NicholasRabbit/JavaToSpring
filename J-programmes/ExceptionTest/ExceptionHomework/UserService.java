public class UserService {

    public void register (String username, String code) throws RegisterException {
	
	    if (username != null & username.length()>=6 & username.length() <=14 ){    //"username!=null"��username=null��һ������ж���������ǰ�棬���жϣ�
		    System.out.println("��ϲ��ע��ɹ�!");                                 //��ֹ�����������ֿ�ָ���쳣  
			return;
		}
		RegisterException r=new RegisterException("ע��ʧ�ܣ��û���������6-14֮��");
		throw r;
	}

	

}