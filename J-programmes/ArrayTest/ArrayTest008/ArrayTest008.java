public class ArrayTest008 {

    public static void main(String[] args){
	
	    arrayMethod();
		System.out.println("~~~~~~~~~~~~~~");
		arrayMethod2();
	
	}

	public static void arrayMethod(){
	
	    int count=0;
		int[] arr={5,4,3,2,1};               //ð������

		for(int i=arr.length-1;i>0;i--){
		
		    for(int j=0;j<i;j++){
			
			    if(arr[j]>arr[j+1]){
				    
					int temp;
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
                   	count++;		
				}
				
			
			}
		
		}

		for(int k=0;k<arr.length;k++){
		    System.out.println(arr[k]);
		}
		System.out.println("count:"+count);
		
	
	}


	
	public static void arrayMethod2(){    //ѡ�����򷨷�����ע��i��j�Ĺ�ϵ��i��ÿ��ѭ���Ƚ�ʱ����ߵ������±�
	    
		int[] arr2={5,4,3,2,1};
		int count2=0;
		
		for(int i=0;i<arr2.length;i++){
		    
			int min=i;
			
			for(int j=i+1;j<arr2.length;j++){
			    
				if(arr2[j]<arr2[min]){
				    min=j;
				}
				
				
			}
			if(min!=i){
				  int temp;
				  temp=arr2[i];
				  arr2[i]=arr2[min];
				  arr2[min]=temp;
				  count2++;              //ʵ�ʾ��ǽ���2�Σ����һ����{1,4,3,2,5}��4��2������֮��3��ֻ�Ƚϲ������ˡ�                
			}
		}
			
		
		for(int i=0;i<arr2.length;i++){
		    System.out.println(arr2[i]);
		}
		System.out.println("count2:"+count2);  //���2.
		
		
	
	}

}