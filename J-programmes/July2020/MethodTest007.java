public class MethodTest007{
    public static void main(String[] args){
	    int a,b;
		    a=30;
			b=20;
		int retValue01=MethodTest007.sum(a,b);                //���ܷ���ֵ��ע���������������Ͳ�Ҫ���� int retValue01
		System.out.println("����ֵretValue01: "+retValue01);

	
	
	}
	public static int sum(int m,int n){                       //��ʽ�����б���ı�����Ҫ��������sum(int m,int n)
	    int g=m+n;
		int h=5;
		int retValue02=MethodTest007.devide(g,h);
		return retValue02;
	
	
	}
	public static int devide(int x,int y){
	    int z=x/y;
		return z;
	
	
	}


}