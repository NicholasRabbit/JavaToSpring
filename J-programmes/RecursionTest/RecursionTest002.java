//ʹ�õݹ�����ۼ�
public class RecursionTest002{
    public static void main(String[] args){
	     
		 int k=RecursionTest002.sum(5);
	     System.out.println(k);
	
	}
	public static int sum(int m){
	     if(m==0){                   //�˴���Ϊm==1�����������Ϊreturn 1; Ҳ����
		    return 0;  
		 }
	     return m+sum(m-1);          //�˴�sum(m-1)����д��sum��m--�����ᱨ��java����������ʱ���Ǵ������ұ��룬   
                                     //sum(m--)��java�и��ڲ��������������Ϊi���нӣ�����sum(i=m--),�ǰ��չ���
	}                                //�����ȸ�ֵ�����Լ�һ�����m��Զ��֮ǰ�Ǹ������ݹ����


}