public class BoxTest002 {

    public static void main(String[] args){
	
	    Integer a=1000;
		Integer b=1000;
		boolean o=a==b;         //a==b不加括号()也可以，因为先运算等号“=”右边的：a==b，再赋值给左边。
		System.out.println(o);

		Integer c=128;
		Integer d=128;
		boolean p=c==d;
		System.out.println(p);   //false

		Integer e=127;           //127在方法区里"整数型常量池"取值范围（-128~127）里，因此下面输出true,
		Integer f=127;           //而128超出范围，所以上面p为false。
		System.out.println(e==f);  //true
	
	}

}