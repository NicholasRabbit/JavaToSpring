public class RecursionTest001{
    public static void main(String[] args){
	     recursion01();
	
	}
	public static void recursion01(){
	    System.out.println("recursion01 starts.");

		recursion01();

		System.out.println("recursion01 come to an end.");
	
	}


}