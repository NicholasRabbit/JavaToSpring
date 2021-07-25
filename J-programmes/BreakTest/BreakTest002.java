public class BreakTest002{
	public static void main(String[] args){
	
	   int g=10;                //若要最后一行for{}外面的程序识别g,
	   for(;g>=0;g--){          //则变量必须在for{}外声明，否则会报错
	   
	       if(g==5){
		   
		     break;
		   
		   }
	   
	       System.out.println(g);
	   } 

	    System.out.println(">>>>>>>>>>>>>>");
		System.out.println(g);
	
	}



}
