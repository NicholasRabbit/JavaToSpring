import java.util.Date;
//��ȡ�ֽ����ļ������ַ�ʽ
//������ƾ��ǲ����ֽ����ļ�������ˣ���ô�����Ȼ�ȡ�ֽ����ļ�
public class ReflectTest001 {

    public static void main(String[] args){
	
	    //��һ�ַ�ʽ:
		   Class c1=null;   //д������Ϊ����c1��c3�Ƚ�
		try{
		         c1=Class.forName("java.lang.String");  //��̬����Class.forName("���������Ӱ���")  
    	   Class c2=Class.forName("MyClass");           //ͬĿ¼�£���ֱ��д����
		   System.out.println(c1);
		   System.out.println(c2);       
		}catch(ClassNotFoundException e){
		   String message=e.getMessage();
		   System.out.println(message);
		}

		//�ڶ��ַ�ʽ��������ü̳���Object����ķ���public final Class<?> getClass(),��final���Σ����Լ̳У����ɸ���
        String str=new String("abc");
		Class c3=str.getClass();
		System.out.println(c3==c1);  //true����Ϊc1,c3��ָ�򷽷����ڴ����String�ֽ����ļ�
		
		MyClass mc=new MyClass();
        Class c4=mc.getClass();   
		System.out.println(c4);

		//�����ַ�ʽ���κ����ͣ������������ͣ�.class
		Class c5=Date.class;
		Class c6=Integer.class;
		/*
		int i=20;
		Class c7=i.class;
		��
		Class c7=20.class;  ����
		*/
		Class c7=int.class;  //����

		Class c8=String.class;
		System.out.println(c8==c1);  //true����Ϊc1,c8Ҳ��ָ�򷽷����ڴ����String�ֽ����ļ� 
		
	}

}

class MyClass {

}