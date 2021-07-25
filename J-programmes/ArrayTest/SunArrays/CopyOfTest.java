import java.util.Arrays;

public class CopyOfTest {
    
    public static void main(String[] args){
	 
	    //(1) 一维数组的复制使用copyOf方法，元素是基本数据类型
		int[] arr={1,2,3,4,5};                //Arrays里的copyOf静态方法，赋值数组，并且可增加长度，多增加的元素赋予数组类型的默认值。
		int[] retArr=Arrays.copyOf(arr,10);   //copyOf()方法重载，形参有多种类型的数组，此处返回int[]数组。使用copyOf方法的时候，为retArr赋予了新的内存地址。
		for (int i=0;i<retArr.length ;i++ ){  

            System.out.println(retArr[i]);   
		}
		System.out.println(arr);     //[I@15db9742   
		System.out.println(retArr);  //[I@6d06d69c   说明新数组与老数组的内存地址不一样
		
		
		char[] arr2={'a','b','c','d','e'};
		char[] retArr2=Arrays.copyOf(arr2,10);              //形参是char[]数组。     
		for (int i=0;i<retArr.length ;i++ ){  
            System.out.println(i+"下标的数:"+retArr2[i]);   //char类型默认值是,是一个空'\\u0000'，不是空格。 
		}
		
		
		//(2) 一维数组，元素是对象时，使用copyOf方法,验证copyOf()创建的新数组，其内对象地址是否与原先数组相同。
		User u1,u2,u3;
		     u1=new User();
			 u2=new User();
			 u3=new User();

		User[] uArr={u1,u2,u3};
		User[] uArrCopy=Arrays.copyOf(uArr, uArr.length);
		
		System.out.println(uArr==uArrCopy);     //引用类数组使用copyOf方法，新数组与旧数组地址不同

		for(int i=0;i<uArr.length;i++){
		    System.out.println(uArr[i]==uArrCopy[i]);   //遍历新旧数组比较引用内存地址,结果都为true
			                                            //当元素为引用时,新数组内元素地址与旧数组内元素引用地址相同，说明新数组使用了旧数组内的引用
		}
		



		//(3) 二维数组练习使用copyOf()方法。注意，在java中，一维数组是被当做对象，即引用数据类型来看待的。
		int[][] arr3={{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}, {13,14,15}};
		System.out.println("arr3[0][0]: "+arr3[0][0]);  //输出：arr3[0][0]: 1 (注意比较)
		
		int[][] arr4=Arrays.copyOf(arr3,arr3.length);  //新二维数组中的每个一维数组与原数组的地址是相同的，是直接拿过来的，没有新建
		
		arr4[0][0]=0;                                  //arr4[0][0]里arr4[0]所代表的一维数组的地址与原数组arr3[0]的地址相同，所以这里也把arr3[0][0]赋值为0了
		
		System.out.println("arr4[0][0]: "+arr4[0][0]);  //输出：arr4[0][0]: 0
		System.out.println("arr3[0][0]: "+arr3[0][0]);  //输出：arr3[0][0]: 0  (注意比较)

		 //由以上结论得知：复制或扩大二维数组，不能用copyOf()方法，因为如果对新的二维数组赋值，就同时改变了原数组内的一位数组。
		 //复制二维数组正确的方法是用for循环。

		int[][] arr5={{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}, {13,14,15}};
		int[][] arr6=new int[arr3.length][];   //此处创建新的二维数组,其内每个一位数组都是新的对象，默认值null,与旧数组不同
		System.out.println(arr6[0]);           //输出null,默认值
		
		for(int i=0;i<arr5.length;i++){
		     arr6[i]=Arrays.copyOf(arr5[i],arr5[i].length);   //使用Arrays.copyOf()方法是，为一位数组（元素）arr6[i]赋予的新的地址，且与原一维数组不同
			 System.out.println(arr6[i]==arr5[i]);            //全部为false。
		}
		arr6[0][0]=0;
		System.out.println("arr5[0][0]: "+arr5[0][0]);
		System.out.println("arr6[0][0]: "+arr6[0][0]);

	
	}

	

}

class User {

}