//ͨ������õ�һ��ע�⣬�����ǵõ�Student���ϵ�ע��
//isAnnotationPresent(),getAnnotation()������ʹ��
public class ReflectAnnotationTest001 {

	public static void main(String[] args){
	
	    Class c=null;
		try{
			//��һ������ȡѧ����
			c=Class.forName("Student");   //Student������ظ�Ŀ¼�£��Ͳ���com.javase...�����ȫ����
            
			//�ڶ������ж�Student������û��MyAnno���ע��
			boolean b=c.isAnnotationPresent(MyAnno.class);  
			System.out.println(b);
            
			//����������ȡע��MyAnno���������������ԣ�ע��˴����ص�ֵ������Object������
			MyAnno ma=(MyAnno)c.getAnnotation(MyAnno.class);
			String name=ma.name();
			System.out.println(name);

		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}

}