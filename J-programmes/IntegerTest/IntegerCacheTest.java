public class IntegerCacheTest {

    public static void main(String[] args){
	
	    Integer a=1000;          //�Զ�װ��
		Integer b=1000;
		boolean o=a==b;         //a==b��������()Ҳ���ԣ���Ϊ������Ⱥš�=���ұߵģ�a==b���ٸ�ֵ����ߡ�
		System.out.println(o);  //flase����Ϊa��b�����ڴ��ַ��ͬ������ʹ��˫�Ⱥ�"=="��Զ�Ƚϵ����ڴ��ַ��

		
		//�����ͳ����ظ���		
		/*
		 �����Զ����ʹ�õ���Integer.valueOf(int i)�ķ�������128<=i<=127ʱ�ӻ�����л�ȡ���ݣ�
		 ������ǵ��ڴ��ַ��������ͬ
		 Integer src:
		 public static Integer valueOf(int i) {
			if (i >= IntegerCache.low && i <= IntegerCache.high)
            return IntegerCache.cache[i + (-IntegerCache.low)];
		    return new Integer(i);
		}
		*/
		Integer c=128;              
		Integer d=128;
	    System.out.println(c==d);   //false,����Ƚϵ�Ҳ������

		Integer e=127;           //Integer����һ���������Զ�������256�������ڷ���ȡ�����ͳ������127�ڷ�������"�����ͳ�����"ȡֵ��Χ��-128~127�������������true,
		Integer f=127;           //��128������Χ����������pΪfalse��
		System.out.println(e==f);  //true
		
		//������������false
		Integer a = new Integer(127);
        Integer b = new Integer(127);
        System.out.println("a == b:" +  (a==b)); //���false,��Ϊ�ײ�ʹ�õ�Integer�вι��죬û��ʹ��valueOf(int i)��
	}

}