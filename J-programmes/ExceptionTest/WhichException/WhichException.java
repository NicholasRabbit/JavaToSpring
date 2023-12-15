
public class WhichException {

    /*
    * 输出结果：third
    * 原因：
    * 12行抛出IndexOutOfBoundException，下面catch中没有相应的接收，所以会上抛
    * 上抛后由main方法的Exception接收并处理。
    * display方法发生运行时异常上抛后，后面的语句不会执行。
    * */
    static void display(int[] num){
        try{
            System.out.println(num[1] / num[1] - num[2]);
        }catch (ArithmeticException e){
            System.err.println("first");
        }
        System.out.println("done");

    }

    public static void main(String[] args) {
        try {
            int[] arr = {100, 100};
            display(arr);
        }catch (IllegalArgumentException e){
            System.err.println("second");
        }catch (Exception e){
            System.err.println("third");
        }
    }
}
