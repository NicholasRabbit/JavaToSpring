public class ConTest02{

    public static void main(String[] args){
	    
		ConTest02.method02();

		ConTest02 c=new ConTest02();
		//��"����.����"�ĸ�ʽҲ���Ե��ú�static�ķ���
		//��ʹ���c=null����ַΪ�գ�������ֿ�ָ���쳣��������Ϊû��ͨ������ȥ����static����������cʵ���Ϻ�������Ч��
				  c=null;             
				  c.method02();       

	
	
	}
	public static void method02(){
	    
	    System.out.println("methdo01�������óɹ���");
	}
}