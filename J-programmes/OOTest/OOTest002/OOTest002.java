public class OOTest002{
    public static void main(String[] args){
	   
	   Citizen002 c=new Citizen002();      //����ʱ��OOTest002��������Citizen002����䣬��Citizen002��������Address002����䣬
                                           //��ˣ�ֻ����룬OOTest002���ɣ�����Ļ��Զ���������class�ļ�
	   int m=c.no;

	   int n=c.age;

	   System.out.println(m);
	   System.out.println(n);
	   System.out.println(c.addr);

	   c.no=150;
	   c.age=25;
	   c.name="Tom Hanks";
	   c.addr=new Address002();
	   //c.addr="����";                //addrΪ����Address002�����������޷�ֱ�Ӹ�ֵ��

	   System.out.println(c.no);
	   System.out.println(c.age);
	   System.out.println(c.name);

	   //System.out.println(c.addr);


	   //java�п�����������

	   String  p=c.addr.province;
	   String  q=c.addr.city;
	   String  r=c.addr.county;
	   int     s=c.addr.streetNo;

	   System.out.println(p);
	   System.out.println(q);
	   System.out.println(r);
	   System.out.println(s);
	   System.out.println("�ָ���~~~~~~~~~~~~~~~~~~~~~");

	   //�������ø�ֵ��
	   c.name="Robert Browning";
	   c.addr.province="�ӱ�ʡ";
	   c.addr.city="������";
	   c.addr.county="������";
	   c.addr.streetNo=110;
	   System.out.println(c.name+"�ĵ�ַ:"+c.addr.province+c.addr.city+c.addr.county+c.addr.streetNo);





	
	
	}



}