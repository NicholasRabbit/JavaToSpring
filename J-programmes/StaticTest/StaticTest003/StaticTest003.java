public class StaticTest003{
    
	public StaticTest003(){
	
	    System.out.println("ȱʡ������");    //ϵͳȱʡ��������дҲ���ԣ���д��������ʵ����ִ�к��ִ�У�дǰ��Ҳ��ʵ��������ִ��
	}
	
	{
	    System.out.println("ʵ�������һ");   
	}

	
	{
	    System.out.println("ʵ��������");
	}


	{
	    System.out.println("ʵ���������");     //ʵ�������ֻ������ʵ������ʱ���ִ��,������ִ��
	}
											     
    public static void main(String[] args){       //main�������۷�����Ҳ�ǵ�ʵ������飬ȱʡ���췽��ִ����֮����ִ�� 
	    StaticTest003 it01=new StaticTest003();   //ִ��˳��ʵ�������-->ȱʡ������-->main������
        System.out.println("main�������");
	
	}



}