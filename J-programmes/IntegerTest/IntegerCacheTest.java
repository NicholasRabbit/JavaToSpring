public class IntegerCacheTest {

    public static void main(String[] args){
	
	    Integer a=1000;          //自动装箱
		Integer b=1000;
		boolean o=a==b;         //a==b不加括号()也可以，因为先运算等号“=”右边的：a==b，再赋值给左边。
		System.out.println(o);  //flase，因为a和b里存的内存地址不同，引用使用双等号"=="永远比较的是内存地址。

		
		//整数型常量池概念		
		/*
		 这里自动打包使用的是Integer.valueOf(int i)的方法，当128<=i<=127时从缓存池中获取数据，
		 因此他们的内存地址，引用相同
		 Integer src:
		 public static Integer valueOf(int i) {
			if (i >= IntegerCache.low && i <= IntegerCache.high)
            return IntegerCache.cache[i + (-IntegerCache.low)];
		    return new Integer(i);
		}
		*/
		Integer c=128;              
		Integer d=128;
	    System.out.println(c==d);   //false,这里比较的也是引用

		Integer e=127;           //Integer对象一旦创建就自动生成了256个对象在方法取整数型常量池里，127在方法区里"整数型常量池"取值范围（-128~127）里，因此下面输出true,
		Integer f=127;           //而128超出范围，所以上面p为false。
		System.out.println(e==f);  //true
		
		//但是这里结果是false
		Integer a = new Integer(127);
        Integer b = new Integer(127);
        System.out.println("a == b:" +  (a==b)); //结果false,因为底层使用的Integer有参构造，没有使用valueOf(int i)。
	}

}