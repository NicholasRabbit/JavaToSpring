public class MethodTest003{
    public static void main(String[] args){
	    MethodTest003.m();
		              m();  //���η��б���static�ؼ��ֵ�����£�ͬ�ࣨMethodTest003���£����Բ�д������.�������ܵ��÷���
					  n();
					A.k();  //������÷�������дȫ"����.",ʡ�������Ļ����������ֻ���ڱ������ҳ������
					  k();  //���ʵ���б���õ���MethodTest003�����k����

	}
	public static void m(){
	    System.out.println("m method excute.");
		              
	}
	public static void n(){
	    System.out.println("n method excute.");
		            A.k();
	}
	public static void k(){
	    System.out.println("MethodTest003: k method excute.");
	}



}
class A{
	public static void k(){
	    System.out.println("A class: k method excute.");
	}
}