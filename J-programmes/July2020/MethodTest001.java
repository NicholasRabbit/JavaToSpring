public class MethodTest001{
    public static void main(String[] args){
		
		                             
		MethodTest001.sum(10,20);   //��һ��д����������ʵ�ʲ����б�����ֱ��д����ֵ���ã�ע������Ҫ����ʽ�����б�һ��
		                            //main����ִ�е��������ͣ�ˣ�ִ��������sum����������ִ������int h���У��ٵ���sum����
		                            //����������Ϊ10+10=30,100+200=300,20+30=50����������֮ǰ����ֻ�������20+30=50
		int h=100;
		MethodTest001.sum(h,200);   //�ڶ���д�������������ظ�����

		int a=20;
		int b=30;
		MethodTest001.sum(a,b);     //������д����Ҳ�����������������������ٵ���





	
	}
	
	public static void sum(int m,int n){         //(int m,int n)����ʽ�����б�
	    System.out.println(m+"+"+n+"="+(m+n));
	
	
	}
	    


}