public class StringTest010 {

    public static void main(String[] args){
	
	    stringMethods();
	
	}

	public static void stringMethods(){
	    
	    boolean b="".isEmpty();    //isEmpty()�������ж��ַ����Ƿ�Ϊ��,��ֵ�򷵻�ture��
		System.out.println(b);

		char c="�ж�����ǿ".charAt(2);   //charAt()�������ַ���"�ж�����ǿ"��ת��Ϊ��char[] chars={'��','��'....}�����±�Ϊ2��Ԫ�ء�
		System.out.println(c);

		String s1="abc";                      //compareTo()������
		int result1=s1.compareTo("def");      //�Ƚ�����ĸ����ĸ�����˳��a��dС3��������-3����������������������Ƚ���һ����ĸ��ȫ�������Ϊ0
		int result2=s1.compareTo("adf");      //�˴���һ������a,�ǾͱȽϵڶ�����b��dС2,���-2
		int result3="123".compareTo("456");   //����ͬ���˴����-3
        int result4="����".compareTo("ߥ��"); //�˴����-2353������Ҳ��һ����˳��
		System.out.println(result1);          
		System.out.println(result2);          //���÷�����������s1��Ҳ���ԣ�ֱ�����ַ���"abc"����Ҳ���ԣ�
		System.out.println(result3);          //��Ϊ"abc"�ﲻ�Ǻ���abc����һ�����ã�����һ���ڴ��ַ��ָ�򷽷����ַ���������
		System.out.println(result4);

        String s2="ExcuseMe";
		boolean b1=s2.contains("Me");   //contains()�������ж�һ���ַ������Ƿ������һ���ַ�����
		System.out.println(b1);         //�����������true
	    
        boolean b2="abcdef".endsWith("ef");  //endsWith()�������ж�ĳ���ַ����Ƿ����ض����ַ���Ϊ��β��
		System.out.println(b2);              //���ԡ�ef����β�����true
        
		System.out.println("++++++++++++++++");
		boolean b3="�����".equals("�����");   //equals()�������ж��ַ����Ƿ���ȡ�
		System.out.println(b3);

		boolean b4="ABCdeF".equalsIgnoreCase("abcDEF");  //equalsIgnoreCase()���������Դ�Сдȥ�Ƚ��ַ�����
		System.out.println(b4);

		byte[] bytes="abcd".getBytes();    //getBytes()���������ַ�����ÿ����ת��Ϊ�ַ����룬����byte[]���飬����
		for(int i=0;i<bytes.length;i++){
		    System.out.println(bytes[i]);  //���97,98,99,100��������abcd��ϵͳĬ�ϱ��롣
		}
        
        System.out.println("++++++++++++++++");   

        int a="abcdef".indexOf("de");      //indexOf()�������ж�һ���ַ���������һ���ַ����е�һ�γ��ֵ��±ꡣ����ֵint���͡�
		System.out.println(a);             //���d���±꣺3

		String str="����ϸ����";
		int l=str.length();                //length()�������ж��ַ������ȣ�ע��:�������ŵ�lengh�����ԣ����Ƿ�����
		System.out.println(str.length());  //����5



	}

}