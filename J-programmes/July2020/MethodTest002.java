public class MethodTest002{
    public static void sum(int a,int b){
	     System.out.println(a+"+"+b+"="+(a+b));
		 MethodTest002.doSome();
	
    }
	public static void main(String[] args){
	     MethodTest002.sum(10,20);
		 System.out.println("Hello again!");
	
	}
    public static void doSome(){
		System.out.println("���");
	
	
	}

}
/*
���˳��ע����õ��Ⱥ�˳��,main�����ǳ�����ڣ���ִ�У�
Ȼ�����sum������sum���������һ���ǵ���doSome���������
main�������Hello again!�����
10+20=30
���
Hello again!
*/