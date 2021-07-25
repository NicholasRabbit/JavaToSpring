public class ForTest301 {

    public static void main(String[] args){
	     prime();
	
	}

	public static void prime(){
	    int count=0;
	    for(int m=2;m<=10000;m++){
		    boolean bePrime=true;   
			
			for(int n=2;n<m;n++){
			
			    if(m%n==0){
				   bePrime=false;
				   break;
				
				}
			}
			if(bePrime){
			    System.out.print(m+" ");

			    count++;
				if(count==8){
				   System.out.print('\n');
				   count=0;
				}
			}
		
		}
	}

}