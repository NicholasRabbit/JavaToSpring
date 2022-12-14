public class SelectTest {

    public static void main(String[] args){
	
	    int[] arr={6,5,4,3,2,1};         //选择排序法原理，把最小的数放到最左边
		select(arr);
		list(arr);
	}


	public static void select(int[] arr){
		int count = 0; //比较次数
		int exchange = 0;  //交换次数
		
		for(int i=0;i<arr.length-1;i++){    //做法：把最左边的数与右边的所有数比较，第一次比较最左边数下表0，第二次是1，依次类推。   
		                                    //因此，i=0,为初始值。length-1表示比较5次，比数组长度小1。
		    int min=i;
			for(int j=i+1;j<arr.length;j++){   //紧邻下表i的数j=i+1为初始值，开始循环比较。
			    count ++;
				if(arr[j]<arr[min]){
				    min=j;                  //如果if语句成立，把min赋值为j
				}
				
				//写这里错误，这样没必要每次都交换，当内存for循环完之后，找到最小的再判断
				/*if(min != i){               //此处成立说明有比arr[i]更小的数，则进行左移。
				   exchange ++;
				   int temp;
				   temp=arr[i];
				   arr[i]=arr[min];
				   arr[min]=temp;
				}
				*/
				
			}

			//内存for判断完之后，在这里进行交换，此处成立说明有比arr[i]更小的数，则进行左移。
			if(min != i){               
			   exchange ++;
			   int temp;
			   temp=arr[i];
			   arr[i]=arr[min];
			   arr[min]=temp;
			}
		}

		System.out.println("选择排序法比较次数==>" + count);
		System.out.println("选择排序法交换次数==>" + exchange);
	
	}


	//遍历方法
	public static void list(int[] array){
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}


}