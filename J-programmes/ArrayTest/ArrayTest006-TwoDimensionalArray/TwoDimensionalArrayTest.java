public class TwoDimensionalArrayTest {
    public static void main(String[] args){
         arrayMethod();

    }

    public static void arrayMethod(){



        //1，静态初始化二维数组。其内部每单个元素是一个数组，注意有两个中括号。
        int[][]  array1 = {
                {11,12,13,14,15},
                {21,22,23},
                {31,32,33,34,35,36},
                {41,42,43,44,45,46},
                {51,52,53,54,55}
        };

        //读取数组中的元素：
        int[] a=array1[0];
        int b=a[0];
        System.out.println(b);
        
		//上面的简洁写法:
        System.out.println(array1[0][0]);

        System.out.println("二维数组长度:"+array1.length);

        for(int i=0;i<array1.length;i++){
            System.out.println("第"+i+"个二维数组的元素的长度："+array1[i].length);
            //遍历二维数组：
            for (int j = 0; j <array1[i].length ; j++) {
                System.out.print(array1[i][j]+"  ");
            }
            System.out.print('\n');    //每个元素一维数组输出完后，换行。
        }
		

		//2，动态初始化二维数组的两种方式
		//二维数组的第二种声明方式
		int[][] array3 = new int[5][5];
		int[] array2[] = new int[2][5];

		//二维数组声明的时候，第一位必须指定容量，第二维可以不指定容量
		//如果第二维没有指定容量，那么第二维中的值全部是null，因为数组本身是一个引用

        //int[][] arr = new int[][];  //这里报错：缺少数组维度

		//第二维的arr[0],arr[1]没初始化，默认为null，相当于声明了两个null
		//因此不能赋值，报空指针
        int[][] arr = new int[2][]; 
        System.out.println(arr[0]);  

		//arr[0][0] = 15;  //给第一维第一个元素的第二维第一个位置赋值，编译时不报错，运行时报错nullPointer。

		//正确初始化赋值写法
		arr[0] = new int[5];

		/* 
		 * 下行不能用静态初始化的方式，
		 * 原因是第二维的数组已经声明且初始化为null了，{...}的形式只适用于初始化的时候赋值
		 * */
		//arr[1] = {1,2,3};   //报错

		System.out.println(arr[0][4]);
		
		//其它类型同理
        String[][] chs = new String[2][];




    }

}
