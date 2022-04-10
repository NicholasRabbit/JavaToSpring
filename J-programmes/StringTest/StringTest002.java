public class StringTest002 {

    public static void main(String[] args){
	
	    int a="abc".compareTo("def");  //String类里compareTo()方法，比较的是字符串的首字母顺序。
		System.out.println(a);         //输出-3，因为在字母表里，a比d的位置小3

		boolean b1="hijlmn".contains("i");     //String类里contains()方法，判断一个字符串中是否含有某个字符串。
		boolean b2="hijlmn".contains("ij");    //返回值是boolean类型
		boolean b3="hijlmn".contains("");      //如果判断空值:""或整个字符串"hijlmn"，则结果也为true  
		boolean b4="hijlmn".contains("hijlmn");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);

		boolean c1="opqrst".endsWith("t");   //String类里endsWith()方法，判断一个字符串是否是某个字符串结尾
		boolean c2="opqrst".endsWith("st");  //返回值：boolean类型
		boolean c3="opqrst".endsWith("");    //这里也一样，如果判断空值:""或整个字符串"hijlmn"，则结果也为true 
		boolean c4="opqrst".endsWith("opqrst");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);

        
	
	}

}