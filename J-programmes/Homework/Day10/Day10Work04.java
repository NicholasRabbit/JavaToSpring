public class Day10Work04 {

    public static void main(String[] args){
	
	    long distance=Day10Work04.basketball(100);
			System.out.println(distance);

	}

	public static long basketball(int x){
	    
		int k=x;  //初始高度
		int j=x;  //累加距离初始值，从100米落下，得加上100米。
		int n=1;
		while(n<10){
		   k/=2;
		   j+=k;
		   n++;
		}

		return j;    //注意：结果有int类型自动转换为long类型的过程。

	
	}

}