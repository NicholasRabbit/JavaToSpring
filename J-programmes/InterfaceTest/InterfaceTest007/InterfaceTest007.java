public class InterfaceTest007 {

    public static void main(String[] args){
	
	    //����ӿ�Bicycle��Customer��Honda Yamaha��������󣩽�����ˣ�������������Bicycle����̡�
        //����Customerֻ��Bicycle����ϵ��Honda,YamahaҲֻ��Bicycle����ϵ��
		Bicycle h=new Honda();
		Customer c1=new Customer(h);    //�ص���Customer�����h�����ڴ��ַ����ȥ������bikeMake��
		c1.purchase();

		Bicycle y=new Yamaha();
		Customer c2=new Customer(y);
		c2.purchase();

		Customer c3=new Customer();
		Bicycle y2=new Yamaha();
		c3.setBikeMake(y2);         //Ҳ������set���������ò�����
		c3.purchase();

	} 

}