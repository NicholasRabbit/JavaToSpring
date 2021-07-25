public class StringTest001 {

    public static void main(String[] args){
	
	    String s1="123";
		System.out.println("s1:"+s1);

		String s2=new String("456");
		System.out.println(s2);       //此处输出"456",说明String类里重写了toString()方法。s2后默认调用toString()方法，后面省略没写。

		byte[] bytes={56,60,75,98};   //此行也可以这样写: byte bytes[] = {..};中括号可以写变量名后面。
		String s3=new String(bytes);
		System.out.println(s3);   //输出：8<Kb，java自带String类里有参构造方法里其中有public String(byte[] bytes){}
                                  //按照操作系统默认编码，对数组bytes进行了解码。
        String s4=new String(bytes, 0, 3);  //调用另一个有参构造方法public String(byte[] bytes,int offset,int length){}	
		System.out.println(s4);             //表示bytes数组，下标起始位置0，输出长度3。输出:8<k
	

        char[] chars={'你','好','吗','同','志',};
		String s5=new String(chars);    //char[]数组同理,把char数组合并成字符串
 		System.out.println(s5);         //输出：你好吗同志
	}

}