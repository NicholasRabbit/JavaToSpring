public class ForTest002{
    public static void main(String[] args){
	    int sum=0;               
		int c;
		for(c=0;c<=100;c+=2){
		//sum=0不要写在for语句里面，不然每次都清零，无法累加                         
		sum+=c;
		
		}
	    
		System.out.println(sum);
	    //此行写在for{}外面，若写里面，则每次累加都要输出，没必要
	}

}
