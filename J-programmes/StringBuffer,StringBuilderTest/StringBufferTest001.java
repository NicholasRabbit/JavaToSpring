
//StringBuffer是线程安全的，StringBuilder非线程安全

public class StringBufferTest001 {

    public static void main(String[] args){
	
	    StringBuffer sb=new StringBuffer();   //拼接字符串高效率，节省内存方法：穿件StringBuffer对象，默认是生成容量16的byte[]数组，
		sb.append("a");                       //调用StringBuffer类里的append()方法,
		sb.append("b");                       //append()方法底层调用了valueOf()方法，把其他类型数据都转换为了字符串。
		sb.append(true);
		sb.append(1234567890);                //容量不够时，底层会调用ensureCapacity()方法扩容。
		System.out.println(sb);

		
		StringBuffer sb1=new StringBuffer(20);  //也可调用有参构造，自定容量，优化程序做法，预估准确数组容量，自定容量，减少扩容次数。
	    sb1.append("HelloAgain");               //StringBuffer里面的方法是synchronized关键字修饰的
		sb1.append('=');
		sb1.append(2020);
		System.out.println(sb1);

		StringBuilder sbx=new StringBuilder(10);    //StringBuilder用法和StringBuffer用法一样，
		sbx.append("你好吗中国");                   //只是StringBuffer里面的方法是synchronized关键字修饰的，代表多线程安全，而StringBuilder没有。
		System.out.println(sbx); 
	}

}