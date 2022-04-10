public class Day10Work02 {

    public static void main(String[] args){
	
	    int k=peach();
		System.out.println(k);
	
	}

	public static int peach(){
	    int n=1;
	    for (int day=10;day>1;day-- ){

             
			     n=(n+1)*2;   //第一天总数。

	    }
		return n/2+1;     
	
	}

}