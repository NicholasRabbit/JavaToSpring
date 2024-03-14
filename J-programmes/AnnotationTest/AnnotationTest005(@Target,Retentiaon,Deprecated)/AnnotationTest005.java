/*
Ԫע��(meta annotation)������ע���ϵ�ע�⣬��ΪԪע�⣬�����ǳ��õ�����Ԫע��
https://docs.oracle.com/javase/8/docs/api/java/lang/annotation/Target.html

(1)@Target
	1,@Target({ElementType.Method}}) : 
	2,@Target(ElementType.TYPE) : It means that the annotation can only be used on type delclarations.
	3,ANNOTATION_TYPE : It can only be used on annotation type delcaration.
	e.g.
	@Target(ElementType.ANNOTATION_TYPE)  //@MyAnno can only be used on annotatiion type declarations.
	public @Interface @MyAnno{
	}
	4,TYPE_PARAMETER : 
	What is type parameter?
	public class Box<T> {
		public void set(@MyAnno T t){}  //T is a type parameter.
	}

	5,@Target({})
	This @Target meta-annotation indicates that the declared type is intended solely for use as a member type in complex annotation type declarations. 
	It cannot be used to annotate anything directly:
		@Target({})
		public @interface MemberType {
			...
		}

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
@DataAnno    //Throw an exception. @DataAnno cannot be used on anywhere because it has a @Target({})
class User {

	//@MyAnno  //���ע������Ԫע��Target��{ElementType.METHOD}��,˵����ֻ�����ڷ����ϣ�������������  
    int age;

	
	@Deprecated   
	public int deprecatedMethod(){
	   System.out.println("Deprecated method execute.");
	   return 1;
	}
}
