public class OperatorTest201{

    public static void main(String[] args){
	
	    int k=operator201(5);
        System.out.println("����10���Ϊ1,С��10���Ϊ0: "+k);
	
	}
	public static int operator201(int a){
	    boolean b=(a>10);    //���a����10

		int m=b?1:0;

		return m;
	
	}

}