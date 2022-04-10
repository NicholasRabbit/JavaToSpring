public class StringTest011 {

    public static void main(String[] args){
	
	    stringMethods();   
	
	}

	public static void stringMethods(){
	
	    int a="abdecdefg".lastIndexOf("de");  //lastIndexOf()�������ж�һ���ַ����ڸ��ַ���������ʱ���±�,����ֵint���͡�
		System.out.println(a);                //��������de,������һ��de����ʱ��d���±꣺5

		String[] str="2010-8-15".split("-");  //split()��������һ���ַ������ض��ַ���ֳ��ַ������飬����ֵString[]����
		for(int i=0;i<str.length;i++){
		    System.out.println(str[i]);    //���������{2010,8,15}
		}


		boolean b="abcdefg".startsWith("ab");  //startsWith()�������ж�ĳ���ַ����Ƿ����ض��ַ���Ϊ��ͷ������ֵboolean���͡�
		System.out.println(b);


		String s1="abcdef".substring(2);     //substring()����(ע��string��sСд)���������±�2(��c)Ϊ��㣬��ȡ�����õ����ַ���
		System.out.println(s1);              //�����cdef
		
		String s2="abcdef".substring(2,4);   //substring()�������أ���ʽ�����б�ͬ���������β��ȡ��������ʼ���±꣬�����������±�
        System.out.println(s2);              //���:cd��ע�⣬�������±�Ϊ4��Ԫ��e

        System.out.println("****************");
		char[] chars="��Ӣ����������".toCharArray();   //toCharArray()���������ַ���ת��Ϊ�ַ����飬����ֵchar[]��������
		for(int i=0;i<chars.length;i++){               //�����{'��','Ӣ','��','��','��','��',��'}
		    System.out.println(chars[i]);  
		}
        System.out.println("****************");

		String s3="ABCD".toLowerCase();     //toLowerCase()�������Ѵ�д��Ļת��ΪСд
		System.out.println(s3);
 
		String s4="abcd".toUpperCase();    //toUpperCase()��������Сдת��Ϊ��д
		System.out.println(s4);
 
		String s5="  ab  cd   ".trim();    //trim()�������޽��ַ�����β�Ŀո��м䲻�޼�
		System.out.println(s5);            //�����"ab  cd"

		//��̬��������static
		String sta=String.valueOf(true);   //valueOf(),��̬�����������༶��ķ��������������͵�����ֵ��ת��Ϊ�ַ������͵�
		System.out.println(sta);

		String stg=String.valueOf(new User());
		System.out.println(stg);

	
	}

}

class User
{

	public String toString(){
	
	    return "User";
	}
}