public class EqualsTest003 {

    public static void main(String[] args){
	
	    judgeString();
	}

	public static boolean judgeString(){
	
	    String s1="abc";    //�󲿷�����£����������������͵��ַ�����ô������
		String s2="xyz";    //ʵ�ʱ���s1,s2���������Ĳ����ַ���������һ�����õ�ַ��ָ����ڴ����java�Զ�������String�����

		//Ҳ������������,��Ϊ���ж��ַ��������������������Ƿ���ȡ�
		String s3=new String("abc");
		String s4=new String("def");
		String s5=new String("abc");
        
		//������֤String����ȷʵ��д��equals()����
		boolean b1=s3.equals(s4);     
		System.out.println(b1);     //���Ϊflase��abc!=def��

		boolean b2=s3.equals(s5);
		System.out.println(b2);     //���Ϊtrue��s3����ַ�����s5����ַ�����ȡ�

		return b1;
	
	}

}