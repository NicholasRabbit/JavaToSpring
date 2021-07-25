public class RecursionTest201 {

    public static void main(String[] args){
	
	    recursionMethod();
	}

	public static void recursionMethod(){
	    System.out.println("调用递归方法前执行");
		recursionMethod();
		System.out.println("调用递归方法后执行");
	}

}