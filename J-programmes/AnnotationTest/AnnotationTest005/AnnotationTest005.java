/*
Ԫע�⣺����ע���ϵ�ע�⣬��ΪԪע�⣬�����ǳ��õ�����Ԫע��

(1)Target({ElementType.Method}}) ���������ڱ�ʾһ��ע��ֻ�����ڷ�����,��������һ��ElementTypeö������

(2)Retention��RetentionPolicy.Class���������Եĵĺ���
	CLASS  ����������ע�ͼ�¼�����ļ��У���������ʱ VM ����Ҫ����ע�͡� 
	RUNTIME ����������ע�ͼ�¼�����ļ��У�������ʱ VM ������ע�ͣ���˿��Է����Եض�ȡ�� 
	SOURCE  ����ʱע�Ᵽ����Դ�ļ��У�������

(3) Deprecatedע���࣬�������࣬���ԣ���������ʾ�����ѹ�ʱ
*/

public class AnnotationTest005 {

	
	public static void main(String[] args){
	
		User u=new User();
		u.deprecatedMethod();
	}

	@MyAnno   //MyAnnoע��ֻ�����ڷ�����
	public static void method01(){
		System.out.println("method01 execute.");
	}

}


@Deprecated
class User {

	//@MyAnno  //���ע������Ԫע��Target��{ElementType.METHOD}��,˵����ֻ�����ڷ����ϣ�������������  
    int age;

	
	@Deprecated   
	public int deprecatedMethod(){
	   System.out.println("Deprecated method execute.");
	   return 1;
	}
}