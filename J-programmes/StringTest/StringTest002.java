public class StringTest002 {

    public static void main(String[] args){
	
	    int a="abc".compareTo("def");  //String����compareTo()�������Ƚϵ����ַ���������ĸ˳��
		System.out.println(a);         //���-3����Ϊ����ĸ���a��d��λ��С3

		boolean b1="hijlmn".contains("i");     //String����contains()�������ж�һ���ַ������Ƿ���ĳ���ַ�����
		boolean b2="hijlmn".contains("ij");    //����ֵ��boolean����
		boolean b3="hijlmn".contains("");      //����жϿ�ֵ:""�������ַ���"hijlmn"������ҲΪtrue  
		boolean b4="hijlmn".contains("hijlmn");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);

		boolean c1="opqrst".endsWith("t");   //String����endsWith()�������ж�һ���ַ����Ƿ���ĳ���ַ�����β
		boolean c2="opqrst".endsWith("st");  //����ֵ��boolean����
		boolean c3="opqrst".endsWith("");    //����Ҳһ��������жϿ�ֵ:""�������ַ���"hijlmn"������ҲΪtrue 
		boolean c4="opqrst".endsWith("opqrst");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);

        
	
	}

}