/*
ע���е����ԣ�
(1)public @interface MyAnnotation003 {
	String  name();  ע��д����ע�������������Ž�β����һ������д����ͬ
	int age();
	byte bb() default 30;
(2)ע�������Ե����Ϳ����ǻ����������ͣ������������ͣ��Լ����ǵ����飬ö��Ҳ����	
  
*/

@MyAnno003(name="Tom", age=25)    //(1)ע��ʹ��ʱ�����ڲ����Ա���ȫ����ֵ�����򱨴����ע��������b��Ĭ��ֵ���򲻸�ֵҲ�С�
public class AnnotationTest003 {

	static String name="Jerry";   //(2)����ͬ������������ע�⸳ֵ��Ҳ������,ע��ֻ���ṩ�����ֵ������ǿ���Ը�ֵ
	static int age;

	public static void main(String[] args){
	
		System.out.println(name+age);  	
	
	}

	@MyAnno003(name="Jerry",age=60,bb=100)  //(3)Ĭ������bb���¸�ֵҲ����
	public void method01(){
		System.out.println("method01 execute");
	}

	@MyAnno004    //(4)MyAnno������Ա���ȫ����ֵ�ſ�ʹ�ã�����ʹ��defalutָ��Ĭ��ֵ����MyAnno003�byte bb() default 30;
	@MyAnno003(name="Tom", age=25,arr={4,5,6})  //(5)���������飬�ô����Ÿ�ֵ�� ���ֻ��һ�����ԣ������ſɲ�д����arr=4
	public void method02(){                     //   ���︳ֵ������ʹ�ó�ʼ����ʽ��ֵ����arr=new int[5]����
		System.out.println("method02 execute");
	}
}
