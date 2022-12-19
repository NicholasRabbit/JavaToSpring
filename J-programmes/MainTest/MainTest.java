
/*
* java MainTest  111 222  333 : 后面参数用空格隔开，会自动传入数组String[] args
*/
public class MainTest {

	public static void main(String[] args){
		System.out.println(args.length);
		for(int i = 0; i < args.length; i++){
			System.out.println(args[i]);
		}
	}
}