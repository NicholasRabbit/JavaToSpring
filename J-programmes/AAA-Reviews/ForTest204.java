public class ForTest204{
    public static void main(String[] args){
	   int k=ForTest204.ballBounce(5.0);
	   System.out.println(k);
	
	
	}
	public static int ballBounce(double a){
	    int count=0;
		    a*=0.3;                     //��Ϊ����forѭ������count++�������������һ�μ�5*0.3�������ͽ�����һ�μ���
		for(;a>0.1;a*=0.3){
		    count++;
		   	
		}
	    return count;
	}


}