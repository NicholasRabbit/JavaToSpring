public class FinalTest003 {

    public static void main(String[] args){
	     
		  FinalTest003.test();

		  TestA m=new TestA();
		    System.out.println(m.score);
		        
	    
	}
	public static void test(){
	
	    final int a=20;
		          //a=30;   //此行报错，final修饰的变量不能再次重新赋值。

	}


}

class TestA {

    // final int score;  //此行报错，实例变量本身有默认值，直接加final修饰会报错，
	final int score=10;  //必须手动赋值，且赋值后不可再重新赋值。
	          

}