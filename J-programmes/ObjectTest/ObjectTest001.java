public class ObjectTest001 {

    public static void main(String[] args){
	
	    String[] str={"a","b","c","d"};

		method(str);

		method("tom","jerry","cat and mouse");   //��������ж���������в��������ķ��������Զ���ӵ����鵱��

		method("a","x");   //���в��������ķ����������б��ڲ��������ɱ�

        //method(1);
        Integer itg01=new Integer(100);
        Integer itg02=new Integer(200);
        Integer itg03=new Integer(300);
		method(100,false,itg01,itg02,itg03);  //���ÿɱ䳤�Ȳ�������������Ҳ�õ���method������������
	
	}
											      //�ɱ䳤�Ȳ���ֻ����һ��
	public static void method(String... str){    //������һ�����Զ���չ��һά���顣�������б��������ɱ�  ע��˴���String...��ֻ�ܴ�String���͵�ʵ��
	                                             //������������ͣ����ʹ��:method (Object... obj)
	    for(int i=0; i<str.length; i++){       
		    System.out.println(str[i]);  
		}
	}

	public static void method(int i, boolean b, Object... objs){  //�����ʽ�����б����������������򲻶������ŵ����Ҳ������ֻ��һ��
	    System.out.println("i+b:"+i+"+"+b);
		for(Object obj : objs){
		System.out.println(obj);
		}
	}



}