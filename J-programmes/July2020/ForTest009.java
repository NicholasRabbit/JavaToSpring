public class ForTest009{
    public static void main(String[] args){
	
	   
	   
	   int n=0;
	   for(float m=5.0f;m>0.135;m*=0.3){
	   
	             n+=1;             
			    
		}
		System.out.println(n);	   
	
	
	}
}
/*
篮球高度5.0进来，n+=1先计数，然后按照for循环规则，
5.0再乘以0.3，就完成了一次弹起，最后0.135时无需再弹起，
所以m>0.135，而不是m>0.1。
*/s
