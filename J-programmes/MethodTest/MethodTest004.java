public class MethodTest004{
    public static void main(String[] args){
	   //MethodTest004.multiple(2,5);           //������䲻дҲ���ԣ���Ӱ�����������գ���Ϊ����ǰ�����Զ�����
	   int c=MethodTest004.multiple(2,5);       //���շ���ֵд��������дȫ�ƣ�Ҳ���Բ�д:����.
	   long d=multiple(5,5);                    //�˴������Զ�����ת��
	   System.out.println(c);
	   System.out.println(d);
	   System.out.println(multiple(6,6));       //ÿ����һ�η���ֵ���ͻ����һ��Multiple����������Hi��ҲҪ���һ��

	}
	public static int multiple(int a,int b){
	     System.out.println("Hi");            ///System.out���д������          
		 int k=a*b;
		 return k;
		 //System.out.println("Hi");          //��������return���ִ���꣬��������������������Զִ�в���
	
	}


}