public class FinallyTest003 {

    public static void main(String[] args){
	
	    int retValue=method();
		System.out.println(retValue);   //�˴����100����return i;����ֵΪ100������101�� 
	}                                   //java����������Ҫ����1���������ڵĳ�����ѭ���϶���ִ�еĹ���2��return���ִ�У��������������
                                        //�˴���Υ������������
	public static int method(){
	
	    int i=100;
		try{
		    return i;    
		}finally{
		    i++;
		}
	
	}

}