public class SelectTest {

    public static void main(String[] args){
	
	    int[] arr={3,26,16,12,0,1};         //选择排序法原理，把最小的数放到最左边

		for(int i=0;i<arr.length-1;i++){    //做法：把最左边的数与右边的所有数比较，第一次比较最左边数下表0，第二次是1，依次类推。   
		                                    //因此，i=0,为初始值。length-1表示比较5次，比数组长度小1。
		    int min=i;
			for(int j=i+1;j<arr.length;j++){   //紧邻下表i的数j=i+1为初始值，开始循环比较。
			    if(arr[j]<arr[min]){
				    min=j;                  //如果if语句成立，把min赋值为j
				}
				if(min != i){               //此处成立说明有比arr[i]更小的数，则进行左移。
				   int temp;
				   temp=arr[i];
				   arr[i]=arr[min];
				   arr[min]=temp;
				}
				
			}
		}

		for(int i=0;i<arr.length;i++){
		    System.out.println(arr[i]);
		}
	
	}

}