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
			       temp=arrs[j];      //�˴�temp����д��ǰ�棬��ΪҪ���ֲ�������ֵ��д��arrs[j]=temp�ʹ��ˡ�
				   arrs[j]=arrs[j+1]; //��Ϊjava�ȼ���Ⱥ��ұߵĽ�����ٰѵõ���ֵ������ߣ�temp��������ߡ�
				   arrs[j+1]=temp;
			   
			   }

		   }

	   }
       
	   System.out.println("�Ƚϴ�����"+count);
	   for(int i=0;i<arrs.length;i++){
	       System.out.println(arrs[i]);
	   }
	
	}

}