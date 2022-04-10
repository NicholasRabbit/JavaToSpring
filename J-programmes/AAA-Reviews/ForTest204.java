public class ForTest204{
    public static void main(String[] args){
	   int k=ForTest204.ballBounce(5.0);
	   System.out.println(k);
	
	
	}
	public static int ballBounce(double a){
	    int count=0;
		    a*=0.3;                     //因为进入for循环就先count++，所以球先落地一次即5*0.3，这样就进行了一次计数
		for(;a>0.1;a*=0.3){
		    count++;
		   	
		}
	    return count;
	}


}