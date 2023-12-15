public class ArrayTest001 {
    public static void main(String[] args) {

        int[] array1={10,15,60,23,63};     //静态初始化数组。
        System.out.println("array1数组长度："+array1.length);

        System.out.println("数组第一个数值"+array1[0]);  //打印输出数组第一个值
        System.out.println("数组最后一个数值"+array1[4]); //最后一个值，是第五个，下标是4。
        System.out.println("数组最后一个值"+array1[array1.length-1]);  //最后一个值也是长度减1。

        //修改数组中的值：
        array1[0]=30;                       //修改第一个值
        System.out.println(array1[0]);

        array1[2]=120;                      //修改第三个
        System.out.println(array1[2]);

        byte[] b={11,22,33,44,55,66};
        System.out.println("byte数组第三个数:"+b[2]);
        b[2]=99;
        System.out.println("byte数组第三个数修改后:"+b[2]);


        int[] array2=new int[10];    //动态初始化数组，共十个数，其默认值是0。
        System.out.println("初始化默认值："+array2[0]);
        array2[0]=10;
        System.out.println("动态初始化数组，第一个数修改后："+array2[0]);


		//数组初始化，赋值注意事项。
		//注意：数组声明之后不能再用{...}的形式赋值，这种形式只能用于初始化赋值。
		//原因：个人推测可能跟C中的原因类似，{...}做右值时表示引用而不是数组类型, 而等号左边是数组类型。
		int[] array3;
		//array3 = {1,2,3};  //此行报错
		int[] array31 = {23,24,25};
		//array31 = {31,32,33};  //此行报错
		
		int[] array32;
		array32 = new int[5];   //使用动态初始化的方式赋值不报错。



		//可以用以下两种方式赋值
		int[] array4;
		array3 = new int[5];
		array4 = new int[]{4,5,6};

		//注意2：Java中不同数组引用间可以相互赋值，C语言中不可以
		//以下相互赋值都不报错
		int[] m = {1,2,3};
		int[] n = {4,5,6};
		int[] p = {7,8,9,10};
		int[] r = new int[10];
		m = n;
		p = m;
		r = m;
		for(int i = 0; i < n.length; i++){
			System.out.println("m:" + m[i]);		
		}
		for(int i = 0; i < p.length; i++){
			System.out.println("p:" + p[i]);		
		}
		for(int i = 0; i < r.length; i++){
			System.out.println("r:" + r[i]);		
		}




    }

}
