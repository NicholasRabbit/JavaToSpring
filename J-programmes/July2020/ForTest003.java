public class ForTest003{
    public static void main(String[] args){
	    
		int e=0;
	    for(;e<10;e++){
		    for(int f=0;f<4;f++){
			    
				for(int g=0;g<3;g++){
				    System.out.println("g>>>>>"+g);    //for循环嵌套，把里面的for语句看成一个整体，
				}                                      //看成一个普通的java语句就行，结果3x4x10
			}                                         

		
		} 
	
	}


}
