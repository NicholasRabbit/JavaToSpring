
/*
 * try...catch出现在for内部，如果出现异常是否会中断for循环
 * 1，如果异常被
 * */
public class ExceptionInFor{

    public static void main(String[] args) {
		
		testFor();
		testFor2();

    }


	public static void testFor(){
        String[] names = new String[3];
        names[0] = "Mary Brown";
        names[1] = "Nancy Red";
        names[2] = "Jessy Orange";
        try {
            for(String n : names){
                try {
                    String pwd = n.substring(0, 3) + n.substring(6, 10);
                    System.out.println(pwd);

				//这里的异常被精确捕捉到了，是捕捉的对的，因此不会中断for循环。如果捕捉不对则会中断循环，见下例
                }catch (StringIndexOutOfBoundsException e){    
                    System.out.println("string out of limits");
                }

            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("array out of limits");
        }
	
	}

	public static void testFor2(){
		int count = 0;
		for(int i = 0; i < 3; i++){
			try{
				int j = 10 / 0;

			//异常捕捉的不对，for会直接终止
			//}catch(StringIndexOutOfBoundsException e) {
			//异常ArithmeticException: byZero被准确捕捉，因此for循环不会被中断。
			}catch(ArithmeticException e) {
				count ++;
				System.out.println("catch..." + count);
			}
		}	

	}
}
