public class IntegerTest001 {

    public static void main(String[] args){
	
	    //String, int, Integer�������ͻ�ת����
		
		//String =====>int
		int a=Integer.parseInt("200");
		System.out.println(a+2);    //���202��˵����������ѧ���㣬ת���ɹ�.

		//int====>String
		int b=200;
		String s=200+"";
		System.out.println(s+2);   //���2002��˵���������ַ���ƴ�ӣ�ת���ɹ���

		//String====>Integer
		Integer i=new Integer("300");
		System.out.println(i.intValue()+3);   //i���Ե���Integer��ķ���intValue()����int���ͣ��˴�������ѧ���㣬���303
		Integer j=Integer.valueOf("300");     //���ߵ���Integer���valueOf(String s)����������ֵ��Integer����

		//Integer====>String
		String t=String.valueOf(j);
		System.out.println(t+4);       //���3004���ַ���������ƴ�ӣ�ת���ɹ�

		//int====>Integer
		Integer n=new Integer(400);  //�ֶ� װ�����
		System.out.println(n+1);     //���401����������ѧ���㣬ת���ɹ�
        
		Integer m=500;               //�Զ�װ��
		System.out.println(m+1);     //���501����������ѧ���㣬ת���ɹ�

		//Integer====>int
		int c=n.intValue();        //�ֶ� �������
		System.out.println(c+2);   //���402����������ѧ���㣬ת���ɹ�

		int d=m;                   //�Զ�����
		System.out.println(d+2);   //���502,��������ѧ���㣬ת���ɹ�

	
	}

}