public class WhileTest001{
    public static void main(String[] args){
	
	    /*
		 while (true){
		    System.out.println("Endless loop");
		 
		 }
		 System.out.println("output or not?");   //此行编译报错，前面编译器已经识别出死循环，因此此行永远无法执行，因此报错
	
	
	    
		
		
		int a,b;
	       a=20;
		   b=30;
		   while(a<b){                                  //此行可编译通过，因为编译器不计算，因此下面的不会编译报错
		       
			  
			  System.out.println("Endless loop.");   
		   
		   
		   }
	       System.out.println("could it be output?");    
		   
	       */
	
	     while(10<20){                                      //此行编译器已识别出结果，因为是字面值
		     System.out.println("Endless loop");
		 
		 }
	
	     System.out.println("output or not?");            //因此这行编译报错，以为永远无法执行
	
	
	}

}
