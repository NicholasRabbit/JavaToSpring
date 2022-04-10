public class OperatorTest201{

    public static void main(String[] args){
	
	    int k=operator201(5);
        System.out.println("大于10结果为1,小于10结果为0: "+k);
	
	}
	public static int operator201(int a){
	    boolean b=(a>10);    //如果a大于10

		int m=b?1:0;

		return m;
	
	}

}