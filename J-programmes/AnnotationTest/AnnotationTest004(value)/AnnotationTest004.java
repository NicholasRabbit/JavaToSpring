//ע����value������ϰ

public class AnnotationTest004 {

	 /*(1)��һ��ע����������ֻ��һ�����ԣ�������Ϊvalueʱ����ʡ�Բ�д,����б�����ԾͲ�����
	   (2)����б�����ԣ��������԰���value���ڶ�������Ĭ��ֵ������£���ֻ��������valueʱ���ɲ�дvalue=200,ֱ��д200����
	      ��д���������Զ��ҵ�value�ˣ���ע�������Ե�����˳���޹�
       (3)����������Ϊvalue�����Ա��붨����Ĭ��ֵ�����򱨴�
	 */              
	@MyAnno(200)			  
	public static void main(String[] args){
		System.out.println("main execute!");
		doSome();
	}

	@MyAnno02("Tom")
	public static void doSome(){
		System.out.println("doSome execute!");
	}

}