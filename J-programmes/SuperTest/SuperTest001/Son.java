public class Son extends Father {

    String name="Son";
	
	public void work(){
	
	   System.out.println("�����ڹ���");
	}

	public void methodOfSon(){
	
	   System.out.println(this.name);   //����this.name�����������name�������Son����
	   this.work();                     //����������ķ���work()������������ڹ�������
       
	   System.out.println("�ָ���~~~~~~~~~~~~~~~");
	   
	   //super�����ã�ǿ�Ƶ��ø������name��work(),��ʹ���ࣨ���ࣩ����nameҲ�����á�
	   System.out.println(super.name);   
	   super.work();                     


	}

}