public class StringMethod201 {

    public static void main(String[] args){
	
	     methodString();
	}

	public static void methodString(){
	
	    //String���вι��췽��
		byte[] bt={11,25,66,33,98};
		String str4=new String(bt);
		System.out.println(str4);    

		byte[] bt2={100,62,33,52,99,46,13,66};
		String str5=new String(bt2,0,4);   
		System.out.println(str5);

		char[] ch1={'��','��','��','��','��'};
		String str6=new String(ch1);
		System.out.println(str6);
		
		String str1="abcdef";
		char c1=str1.charAt(0);
		System.out.println(c1);

		String str2=String.valueOf(true);
		System.out.println(str2);

		String str3="hijklmn";
		int n1=str3.codePointAt(0);    //���ָ���±�Ԫ�ص�Unicode����ֵ������ֵint
		System.out.println(n1);        //�˴���"h"�����أ�104

		String str7="abcd";
		int n2="abcd".compareTo("efgh");
		System.out.println(n2);

		String str8=new String("cdefgh");
		boolean b1=str8.contains("a");      //����ַ������Ƿ����ĳ���ַ���
		boolean b2=str8.contains("");       //���ַ���Ҳ���������棬����ֵtrue
		boolean b3=str8.contains("cdefgh"); //�����ַ������������棬����ֵtrue
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);

		String str9=new String("helloworld!");
		boolean b4=str9.endsWith("hd!");
		boolean b5=str9.endsWith("");
		System.out.println(b4+" "+b5);

		String str10="÷�����Կຮ��";
        boolean b6=str10.equals("÷�����Կຮ��");
		System.out.println(b6);
       
	    System.out.println("==============");
		String str11="abcde";
		boolean b7=str11.equalsIgnoreCase("ABCDE");
		System.out.println(b7);

		String str12=new String("˪��ѩ��");  //��byte[]������ʽ����ָ���ַ�����Ĭ���ַ�����;
		byte[] bytes1=str12.getBytes();
		for(int i=0; i<bytes1.length; i++){
		    System.out.println(bytes1[i]);
		}
        
		
		int n3="�����ڸ�".indexOf("�ڸ�");  //���ڸա���һ�γ���ʱ�±�
		System.out.println(n3);

		int n4="��������������֮".length();  //���ַ������ȡ�
		System.out.println(n4);

		boolean b8="abc".isEmpty();   
		System.out.println(b8);

		int n5="abcdefdef".lastIndexOf("def");  //�ж����һ�γ��ֵ��±�
		System.out.println(n5);

		String str13="hellothere".replace("hello", "hi");  //�滻�ַ�����һ����
		System.out.println(str13);

		System.out.println("=======");
		String str14="2020-11-13";
		String[] strs=str14.split("-");  //���ض����Ų���ַ�����������String[]���飬���ء�
		for(int i=0; i<strs.length; i++){
		    System.out.println(strs[i]);
		}
		System.out.println("=======");

		boolean b9="�������߷�һ��֮��".startsWith("��������");
		System.out.println(b9);

		String str15="�������߷�һ��֮��".substring(4);  //���±�Ϊ4��Ԫ�ؿ�ʼ���
		System.out.println(str15);   //"��һ��֮��"

		String str16="�������߷�һ��֮��".substring(0,4);  //��ȡ0-3���±�Ԫ�أ�������4
		System.out.println(str16);

		char[] chars2="������漣".toCharArray();
		for(int i=0; i<chars2.length; i++){
		    System.out.println(chars2[i]);
		}

		String str17="ABCDEF".toLowerCase();   //ת��ΪСд
		System.out.println(str17);

		String str18="abcdef".toUpperCase();   //ת��Ϊ��д
		System.out.println(str18);
 
		String str19="   www.  cctv   ".trim();   //�޽��ַ���ǰ��ո��м�Ĳ��޼�
		System.out.println(str19);
        

		boolean b10=false;
		int i=200;
		User u=new User();
		String str20=String.valueOf(u);
		System.out.println(str20);
    

        


	
	}

}

class User {
  
    public String toString(){
	    return "User";
	}

}