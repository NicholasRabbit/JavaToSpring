public class StringTest010 {

    public static void main(String[] args){
	
	    stringMethods();
	
	}

	public static void stringMethods(){
	    
	    boolean b="".isEmpty();    //isEmpty()方法，判断字符串是否为空,空值则返回ture。
		System.out.println(b);

		char c="男儿当自强".charAt(2);   //charAt()方法，字符串"男儿当自强"，转换为了char[] chars={'男','儿'....}，求下标为2的元素。
		System.out.println(c);

		String s1="abc";                      //compareTo()方法，
		int result1=s1.compareTo("def");      //比较首字母在字母表里的顺序，a比d小3，因此输出-3，若大则输出正数，相等则比较下一个字母，全部相等则为0
		int result2=s1.compareTo("adf");      //此处第一个都是a,那就比较第二个，b比d小2,输出-2
		int result3="123".compareTo("456");   //数字同理，此处输出-3
        int result4="安本".compareTo("撺掇"); //此处输出-2353，汉字也有一定的顺序。
		System.out.println(result1);          
		System.out.println(result2);          //调用方法，用引用s1调也可以，直接用字符串"abc"调用也可以，
		System.out.println(result3);          //因为"abc"里不是含有abc，是一个引用，含有一个内存地址，指向方法区字符串常量池
		System.out.println(result4);

        String s2="ExcuseMe";
		boolean b1=s2.contains("Me");   //contains()方法，判断一个字符串里是否包含另一个字符串，
		System.out.println(b1);         //若包含则输出true
	    
        boolean b2="abcdef".endsWith("ef");  //endsWith()方法，判断某个字符串是否以特定的字符串为结尾。
		System.out.println(b2);              //若以“ef”结尾，输出true
        
		System.out.println("++++++++++++++++");
		boolean b3="你好吗".equals("你好吗");   //equals()方法，判断字符串是否相等。
		System.out.println(b3);

		boolean b4="ABCdeF".equalsIgnoreCase("abcDEF");  //equalsIgnoreCase()方法，忽略大小写去比较字符串。
		System.out.println(b4);

		byte[] bytes="abcd".getBytes();    //getBytes()方法，把字符串中每个字转换为字符编码，生成byte[]数组，返回
		for(int i=0;i<bytes.length;i++){
		    System.out.println(bytes[i]);  //输出97,98,99,100，它们是abcd的系统默认编码。
		}
        
        System.out.println("++++++++++++++++");   

        int a="abcdef".indexOf("de");      //indexOf()方法，判断一个字符串在另外一个字符串中第一次出现的下标。返回值int类型。
		System.out.println(a);             //输出d的下标：3

		String str="润物细无声";
		int l=str.length();                //length()方法，判断字符串长度，注意:不带括号的lengh是属性，不是方法。
		System.out.println(str.length());  //长度5



	}

}