public class ExceptionTest009 {

    public static void main(String[] args){
	
	    UserService u=new UserService();
		try{
		    u.register("tom", "123");
		}catch (RegisterException e){
		    String str=e.getMessage();  //���getMessage()�������Ե���super(s)���s�������ֵ,
 			                            //���ﲻ�ɵ���д��e.getMessage(),��ôдֻ�ǵ���getMessage()��������û���շ���ֵ��
			System.out.println(str);
			e.printStackTrace();
		}
	}

}