public class OOTest004{
    public static void main(String[] args){
	   Pointer p=new Pointer();
	   p.idNum=110;
	   System.out.println(p.idNum);

	   p=null;                       //�˴�p=null�Ļ����������ͨ���������﷨����
	   System.out.println(p.idNum);  //����p��û�е�ַ������ָ��Pointer����
	                                 //���Ҳ�޷�����ʵ��������ľ�������idNum,����ᱨ��                              
	}   


}
