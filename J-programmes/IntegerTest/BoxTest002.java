public class BoxTest002 {

    public static void main(String[] args){
	
	    Integer a=1000;          //�Զ�װ��
		Integer b=1000;
		boolean o=a==b;         //a==b��������()Ҳ���ԣ���Ϊ������Ⱥš�=���ұߵģ�a==b���ٸ�ֵ����ߡ�
		System.out.println(o);  //flase����Ϊa��b�����ڴ��ַ��ͬ������ʹ��˫�Ⱥ�"=="��Զ�Ƚϵ����ڴ��ַ��

		
		//�����ͳ����ظ���
		Integer c=128;              
		Integer d=128;
	    System.out.println(c==d);   //false,����Ƚϵ�Ҳ������

		Integer e=127;           //Integer����һ���������Զ�������256�������ڷ���ȡ�����ͳ������127�ڷ�������"�����ͳ�����"ȡֵ��Χ��-128~127�������������true,
		Integer f=127;           //��128������Χ����������pΪfalse��
		System.out.println(e==f);  //true
	
	}

}