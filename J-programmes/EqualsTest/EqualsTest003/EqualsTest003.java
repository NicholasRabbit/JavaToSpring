public class EqualsTest003 {

    public static void main(String[] args){
	
	    judgeString();
	}

	public static boolean judgeString(){
	
	    String s1="abc";    //大部分情况下，创建引用数据类型的字符串这么声明。
		String s2="xyz";    //实际变量s1,s2里所包含的不是字符串，而是一个引用地址，指向堆内存里的java自动创建的String类对象。

		//也可以这样创建,是为了判断字符串这种引用数据类型是否相等。
		String s3=new String("abc");
		String s4=new String("def");
		String s5=new String("abc");
        
		//以下验证String类里确实重写了equals()方法
		boolean b1=s3.equals(s4);     
		System.out.println(b1);     //输出为flase，abc!=def。

		boolean b2=s3.equals(s5);
		System.out.println(b2);     //输出为true，s3里的字符串与s5里的字符串相等。

		return b1;
	
	}

}