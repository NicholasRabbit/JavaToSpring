public class ForTest008{
    public static void main(String[] args){
	
	    for(int c=5;c<=10000;c*=5){
		
		    if(c<500){
			    break;
			}
		
		   System.out.println(c);   //此处不会输出，因为上面有break,
		}                           //凡是小于500都不执行，以后的也不执行了
	
	}



}