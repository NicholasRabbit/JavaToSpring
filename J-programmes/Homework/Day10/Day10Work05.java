public class Day10Work05 {

    public static void main(String[] args){
	
	    num();
	}
    
	public static int num(){
	    int abcd=1000;
	    for(;abcd<10000;abcd++){
		
		    int a=abcd/1000;
			int bcd=abcd-a*1000;
			if(abcd==bcd*3){
			
			   System.out.println(abcd);
			   break;
			}
		
		}
		return abcd;
	
	}

}