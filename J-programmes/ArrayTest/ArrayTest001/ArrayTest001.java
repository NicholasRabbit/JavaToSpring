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


    }

}
