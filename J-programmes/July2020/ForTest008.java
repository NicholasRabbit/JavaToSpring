public class ForTest008{
    public static void main(String[] args){
	
	    for(int c=5;c<=10000;c*=5){
		
		    if(c<500){
			    break;
			}
		
		   System.out.println(c);   //�˴������������Ϊ������break,
		}                           //����С��500����ִ�У��Ժ��Ҳ��ִ����
	
	}



}