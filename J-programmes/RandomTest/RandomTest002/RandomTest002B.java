import java.util.Random;

public class RandomTest002B {                //随机生成5个不同的数，并放进数组，排序

    public static void main(String[] args){
	
	    Random rdm=new Random();
		int[] arr=new int[5];

		for(int j=0;j<arr.length;j++){   //把数组的初始值由0改为-1，防止下面随机生成0,与默认值相同，放不进去。
		    arr[j]=-1;   
		}

		int i=0;
		while(i<5){                   
		    
			int k=rdm.nextInt(5);    //这里含义是，生成0-4范围内仅仅5个随机数，不包括5，以此验证while循环是否正确，即5个不同随机数是否只要不生成，就一直循环。
			
			if(!contains(arr,k)){    //重点是if()括号的内的方法，学习这种思路，用方法的返回值来做为条件判断真假。
			   arr[i]=k;
			   i++;
			}
		}

		//上面生成的数组排序：选择排序法
		for(int m=0; m<arr.length; m++){
		    int min=m;
            for(int n=m+1; n<arr.length; n++){
			    if(arr[min]>arr[n]){
				    min=n;
				}
			}
			if(min!=m){
			    int temp;
				temp=arr[m];
				arr[m]=arr[min];
				arr[min]=temp;
			}
		}

		//数组遍历输出打印
		for(int a=0;a<arr.length;a++){
		    System.out.println(arr[a]);
		}
		
	
	}

	public static boolean contains(int[] arr, int k){     //判断数组中是否包含某个元素的方法，返回值布尔类型。
	
	    for(int i=0; i<arr.length; i++){
		    if(arr[i]==k){
			   return true;
			}
		}

		return false;
	
	}

}