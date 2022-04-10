public class BubbleTest {

    public static void main(String[] args){
	
	    bubbleMethod();    
	
	}

	public static void bubbleMethod(){
	
	   int[] arrs={6,5,4,3,2,1}; 
       int count=0;
	   for(int i=arrs.length-1;i>0;i--){
	       
	       for(int j=0;j<i;j++){
               count++;  		   
		       if(arrs[j]>arrs[j+1]){
			       int temp;
			       temp=arrs[j];      //此处temp必须写在前面，因为要给局部变量赋值，写成arrs[j]=temp就错了。
				   arrs[j]=arrs[j+1]; //因为java先计算等号右边的结果，再把得到的值赋给左边，temp不能在左边。
				   arrs[j+1]=temp;
			   
			   }

		   }

	   }
       
	   System.out.println("比较次数："+count);
	   for(int i=0;i<arrs.length;i++){
	       System.out.println(arrs[i]);
	   }
	
	}

}