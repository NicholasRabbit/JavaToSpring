public class ReturnTest {

	public static void main(String[] args){
	
		//返回值只能做等号右边的赋值语句，不能做左语句。
		int i = doSome(5);
		System.out.println("i==>" + i);
	}


	public static int doSome(int x){
	
		if(x > 0)
			return -x;
		else 
			return x;
	}

	public static int doOther(int y){
		
		//缺少判断等于0的情况，27行会报错：缺少返回区语句
		if(y > 0)
			return -y;
		else if(y < 0)
			return y;
		
	}
}
