public class BoxTest001 {

    public static void main(String[] args){
	    
		                                //���ְ�װ�����������������ͣ�������չ�����������͵Ĺ��ܡ�
										//������IntegerΪ��������byte,short������

	    Integer i=new Integer(123);    //װ�䣬���ѻ����������͵�����ת��Ϊ������������
		System.out.println("Integer��װ�����i:"+i);
		

		String s="6300";               //Ҳ���԰�String���͵������������Ͱ�װ��Integer������
		Integer i2=new Integer(s);
		System.out.println(s);
		

		
		int retValue=i.intValue();      //���䣬�������������͵�����ת��Ϊ��������int��������
		System.out.println(retValue);   //123
		
		float retValue_f=i2.floatValue();  //���䣬�������������͵�����ת��Ϊ��������float��������
		System.out.println(retValue_f);    //6300.0
        
		byte num=120;
		Byte b=new Byte(num);      //Byte��װ�࣬��Ӧbyte���÷���Integerһ����
		System.out.println(b);     //�˴�numֱ��д120���У����뱨����Ϊ��Ȼ120Ĭ��int���ͣ���byte�෶Χ�ڣ�
		                           //��ֱ�Ӹ�ֵ������Byte��Ĺ��췽���β��б��Ͽɣ���˱���
        
		//MAX_VALUE��MIN_VALUE
		System.out.println(b.MAX_VALUE);  //Byte��װ������byte���͵����ֵ�������ԣ�127����ֱ�ӵ��á�Integer��װ��һ���÷���
		System.out.println(b.MIN_VALUE);  //��Сֵ-128


      
	
	
	}

}