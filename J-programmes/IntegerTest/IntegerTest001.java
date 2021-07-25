public class IntegerTest001 {

    public static void main(String[] args){
	
	    //String, int, Integer三种类型互转方法
		
		//String =====>int
		int a=Integer.parseInt("200");
		System.out.println(a+2);    //结果202，说明进行了数学运算，转换成功.

		//int====>String
		int b=200;
		String s=200+"";
		System.out.println(s+2);   //结果2002，说明进行了字符串拼接，转换成功。

		//String====>Integer
		Integer i=new Integer("300");
		System.out.println(i.intValue()+3);   //i可以调用Integer里的方法intValue()返回int类型，此处进行数学运算，结果303
		Integer j=Integer.valueOf("300");     //或者调用Integer里的valueOf(String s)方法，返回值是Integer对象。

		//Integer====>String
		String t=String.valueOf(j);
		System.out.println(t+4);       //结果3004，字符串进行了拼接，转换成功

		//int====>Integer
		Integer n=new Integer(400);  //手动 装箱操作
		System.out.println(n+1);     //结果401，进行了数学运算，转换成功
        
		Integer m=500;               //自动装箱
		System.out.println(m+1);     //结果501，进行了数学运算，转换成功

		//Integer====>int
		int c=n.intValue();        //手动 拆箱操作
		System.out.println(c+2);   //结果402，进行了数学运算，转换成功

		int d=m;                   //自动拆箱
		System.out.println(d+2);   //结果502,进行了数学运算，转换成功

	
	}

}