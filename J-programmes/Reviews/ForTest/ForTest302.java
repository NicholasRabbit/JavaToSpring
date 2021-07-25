public class ForTest302 {

    public static void main(String[] args){
	
	     test();
         
	}

	public static float test(){
       int count=0;
	   for(int m=5;m>0.1;count++){
	   
	         m*=0.3;
	   }
       System.out.println("第"+count+"次弹起为0.1");
	   return count;
    }
}