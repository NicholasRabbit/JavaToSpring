public class InterfaceTest003 {

    public static void main(String[] args){
	
	    A a=new D();     //��̬�﷨��
		B b=new D();
		C c=new D();

		a.mA();        //��������D������ʵ�ֵ�A�ӿ���ķ�����
      
	  //a.mB();        //A�ӿ�a���õ���B��ķ������������﷨����ͨ��������ʹaָ��D()����D����mB()����Ҳ����
	    B b2=(B)a;     //ǿ������ת��ΪB���;Ϳ��ԣ��ӿ�A,B֮��û�м̳й�ϵҲ����ת����
        b2.mB();

		D d=(D)a;     //Ҳ���Ը���������ǿ��ת��������mB();
		  d.mB();
	}

}

interface A{
  public void mA();
}

interface B {
  public void mB();
}

interface C {
  public void mC();
}

class D implements A,B,C {
    
  public void mA(){
      System.out.println("�ӿ�A��mA����ʵ��");
  }

  public void mB(){
      System.out.println("�ӿ�B��mB����ʵ��");
  }

  public void mC(){
      System.out.println("�ӿ�C��mC����ʵ��");
  }

}