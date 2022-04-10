public class ExceptionTest002 {

    public static void main(String[] args){
	
	    int a=100/0;               //编译时不报错，运行时报错，属于运行时异常，可管可不管，发生概率较低。
		System.out.println("此行是否运行?");  //发生异常后，此行就不运行了。    
	}

}