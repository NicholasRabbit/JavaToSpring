public class InterfaceTest001 {

    public static void main(String[] args){
	
	    //User00 u=new User00();     //�ӿ����ڳ������һ�֣�����ʵ���������б���
		//       u.NUMBER;          
		System.out.println("�ӿڳ�������� "+User00.NUMBER);   //���ýӿ��ڳ���ֱ���ã�����.��������       
	}

}


interface User00{                        //interfaceǰ��ɼ�public�����½��������ļ��ֻ��������Ϊ�˷���ۿ���д��ͬһ�ļ���
    
	public static final int NUMBER=100;  //�ӿ�������Ԫ�ض���public���Σ����ǹ����ġ�
	
	public abstract int method01(int a,int b);

	
	String	COUNTRY_NAME="�й�";       //����ǰ��public static final����ʡ�ԣ����󷽷�ǰ��public abstractҲ����ʡ��
    int method02(int a,int b);         //��Ϊ�ӿ���ֻ�г����ͳ��󷽷������ʡ����ϵͳҲĬ�ϸ��ӡ�
 
}

interface User01 extends User00 {

}

interface User02 extends User00,User01 {    //�ӿ�֧�ֶ�̳С�

}
