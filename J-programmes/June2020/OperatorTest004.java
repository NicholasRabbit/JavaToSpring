public class OperatorTest004{
    public static void main(String[] args){
        int a,b;
		    a=10;
			b=20;
        System.out.println(a<b);

		int c,d,e;
		    c=100;
			d=200;
			e=100;
        System.out.println(b>a&c>d);
		System.out.println(c>=e|a>b); 
		System.out.println(c==e);
		System.out.println(c==b);
		System.out.println(!true);
		System.out.println(!false);   //"�߼���"�������������ʾ�෴ 
		System.out.println(c!=e);
		//"^"���ֻҪ���߲�һ������true,����һ�����ó����Ϊfalse������
		System.out.println(c<d^a>b);  //ture^false����򣬽��Ϊtrue
		System.out.println(c==e^a<b);  
	    //��һ�У�true^true����򣬽��Ϊfalse,ע��˴�c==e����дһ���Ⱥš�=��
		//һ���Ⱥ��Ǹ�ֵ���㣬�����߼����㣬����ᱨ��

        
}


}