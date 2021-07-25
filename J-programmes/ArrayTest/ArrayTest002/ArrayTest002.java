public class ArrayTest002 {

    public static void main(String[] args){
	     
		 //传静态初始化的数组进方法的参数里：
	     int[] num={10,20,50,40};
		 arrayMethod02(num);                      //间接传静态数组格式
         arrayMethod02(new int[] {10,20,50,40});  //也可以这样直接传进去，注意加new int[]。
         
         System.out.println("~~~~~~~~~~~~~~");
		
		 int[] no=new int[5];
	     arrayMethod02(no);           //动态数组当做参数传进方法里。
		 arrayMethod02(new int[5]);   //也可以直接传进去方法的参数里。
		 
		 System.out.println("~~~~~~~~~~~~~~");

		 
		 String[] strs={"abc","def","你好"};          //引用数据String类型，也可以穿件数组。
		 arrayMethod01(strs);                         //数组做为参数，调用方法。                      

		 
  

	
	}

	public static void arrayMethod01(String[] a){    //这里形参列表为数组，数组也可以像一般参数一样传进方法里，调用跟一般方法调用一样。
	
	   for (int m=0;m<3;m++){
	   
	       System.out.println(a[m]);
	   }
		
	}

	
	public static void arrayMethod02(int[] b){
	
	    for (int i=0;i<b.length;i++){
		
		    System.out.println(b[i]);
		}
	}

}