public class BoxTest002 {

    public static void main(String[] args){
	
	    Integer a=1000;
		Integer b=1000;
		boolean o=a==b;         //a==b��������()Ҳ���ԣ���Ϊ������Ⱥš�=���ұߵģ�a==b���ٸ�ֵ����ߡ�
		System.out.println(o);

		Integer c=128;
		Integer d=128;
		boolean p=c==d;
		System.out.println(p);   //false

		Integer e=127;           //127�ڷ�������"�����ͳ�����"ȡֵ��Χ��-128~127�������������true,
		Integer f=127;           //��128������Χ����������pΪfalse��
		System.out.println(e==f);  //true
	
	}

}