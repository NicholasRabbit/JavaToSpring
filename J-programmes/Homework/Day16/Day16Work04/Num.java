public class Num {

    private long n1;
	private long n2;

	public Num(){
	
	}

	public Num(long n1, long n2){
	
	    this.n1=n1;
		this.n2=n2;
	}

	public long addition(){
	
	    long n3=n1+n2;
		System.out.println("ºÍ£º"+n3);
		return n3;
	}

	public long subtraction(){
	
	    long n3=n1-n2;
		return n3;
	}

	public long multiplication(){
	
	    long n3=n1*n2;
		return n3;
	}

	public long division(){
	
	    long n3=n1/n2;
	    return n3;
	}



}