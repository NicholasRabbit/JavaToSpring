public class StringTest001 {

    public static void main(String[] args){
	
	    String s1="123";
		System.out.println("s1:"+s1);

		String s2=new String("456");
		System.out.println(s2);       //�˴����"456",˵��String������д��toString()������s2��Ĭ�ϵ���toString()����������ʡ��ûд��

		byte[] bytes={56,60,75,98};   //����Ҳ��������д: byte bytes[] = {..};�����ſ���д���������档
		String s3=new String(bytes);
		System.out.println(s3);   //�����8<Kb��java�Դ�String�����вι��췽����������public String(byte[] bytes){}
                                  //���ղ���ϵͳĬ�ϱ��룬������bytes�����˽��롣
        String s4=new String(bytes, 0, 3);  //������һ���вι��췽��public String(byte[] bytes,int offset,int length){}	
		System.out.println(s4);             //��ʾbytes���飬�±���ʼλ��0���������3�����:8<k
	

        char[] chars={'��','��','��','ͬ','־',};
		String s5=new String(chars);    //char[]����ͬ��,��char����ϲ����ַ���
 		System.out.println(s5);         //����������ͬ־
	}

}