public class MethodTest005{
    public static void main(String[] args){
	    int m=method01();
		System.out.println(m);
		int n=method02();
		System.out.println(n);
		int k=method03();
		System.out.println(k);
	}
	public static int method01(){
	     int a=20;
		 if(a<10){
		   return 1;
		 }else{
		   return 0;
		 }
	
	}
	//����Ҳ���԰�elseȥ��������Ҳ����ͨ��
	public static int method02(){
	     int b=20;
		 if(b<10){
		   return 1;
		 }
	     return 0;
	}
	//�����Чд����
	public static int method03(){
	    
		return 20>10 ? 1:0;         //��Ԫ�����
	}


}