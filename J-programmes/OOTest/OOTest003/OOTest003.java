public class OOTest003
{
    public static void main(String[] args){
	    Husband yuQuan=new Husband();      //����һ���ɷ�Ķ������ֽг���
		yuQuan.name="����";

		
		Wife    baiHe=new Wife();          //����һ�����ӵĶ������ֽаװٺ�
		baiHe.name="�װٺ�";


		yuQuan.w=baiHe;     //�����е������ǰ������������������ʹ��ͨ��Husband����֪����Wife,               
		baiHe.h=yuQuan;     //ͨ��WifeҲ�����ҵ�Husband��

		System.out.println("��������: "+baiHe.name);     //�˴�û�й��� 
		System.out.println("��������: "+yuQuan.w.name);  //�˴�yuQuan.w.name����ͨ��Husband�ҵ�Wife

		System.out.println("�ɷ�����: "+baiHe.h.name);   //�˴�ͨ�������ҵ��ɷ�
	
	
	}

}