
import java.util.Arrays;

/*
* 对数组进行从小到大排序：{6,5,4,3,2,1}
* 思路：
* 1,首先从第一个数开始，跟第二个进行比较，如果前者小则交换位置，
*   然后第二个和第三个比较，依次类推，直到最后一个，这样第一轮就把最大的数放到最后了
*   第一轮排序:
*   5,6,4,3,2,1
*	5,4,6,3,2,1
*	5,4,3,6,2,1
*	5,4,3,2,6,1
*   5,4,3,2,1,6  这轮从第一个数开始，排序了5次，比数组长度小1，数组最后一个是最大的数了现在。
*   第二轮排序：
*	4,5,3,2,1,6
*	4,3,5,2,1,6
*	4,3,2,5,1,6
*	4,3,2,1,5,6  //这轮最后两个数最大的确定了。排序比较了4次
*	第三轮排序
*	3,4,2,1,5,6
*	3,2,4,1,5,6
*	3,2,1,4,5,6  //最后三个数确定
*	第四轮排序
*	2,3,1,4,5,6  
*	2,1,3,4,5,6   //最后四个数确定
*	第五轮排序
*	1,2,3,4,5,6   //所有顺序排好
* 总结：总共进行5轮排序，比数组长度小1，比较的时候从下标0开始，跟后一位比较，比较次数从5递减
*/

public class BubbleTest {
    
	public static void main(String[] args){
	    bubbleMethod();
		bubbleMethod2(); 
	}
	
	//排序方法，此方法是一直检查到最后一轮，可以优化，如果有一轮已经排序完成后，后面不需要排序了。
	public static void bubbleMethod(){
	
	   int[] arrs={6,5,4,3,2,1}; 
       int count=0;
	   for(int i=arrs.length-1;i>0;i--){
	       /*
		   * 判断条件 j=0，j<i，表示每次都从第一个开始判断j和j+1位置的大小
		   * 例，第一轮，当i=5时，判断0-4 < 5，判断了5次，符合上面的思路分析。
		   */
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


	//冒泡测试优化，当排序完成后，后面就不要再进行检查了
	public static void bubbleMethod2(){
	
	   int[] arrs={3,2,1,6,5,4,}; 
       int count=0;
	   
	   for(int i=arrs.length-1;i>0;i--){
		   boolean flag = false;  //是否进行下一轮的标志
	       count ++;  //轮数
	       /*
		   * 判断条件 j=0，j<i，表示每次都从第一个开始判断j和j+1位置的大小
		   * 例，第一轮，当i=5时，判断0-4 < 5，判断了5次，符合上面的思路分析。
		   */
		   for(int j=0;j<i;j++){
                		   
		       if(arrs[j]>arrs[j+1]){
			       flag = true;  //如果进行了交换，则设置为true
				   int temp;
			       temp=arrs[j];      //此处temp必须写在前面，因为要给局部变量赋值，写成arrs[j]=temp就错了。
				   arrs[j]=arrs[j+1]; //因为java先计算等号右边的结果，再把得到的值赋给左边，temp不能在左边。
				   arrs[j+1]=temp;
			   
			   }

		   }
		   if(!flag){
			  break;
		   }
		   System.out.println("轮数==>" + count + ":" + Arrays.toString(arrs));

	   }
       
	
	}	



}