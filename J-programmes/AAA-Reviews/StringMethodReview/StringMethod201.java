public class StringMethod201 {

    public static void main(String[] args){
	
	     methodString();
	}

	public static void methodString(){
	
	    //String类有参构造方法
		byte[] bt={11,25,66,33,98};
		String str4=new String(bt);
		System.out.println(str4);    

		byte[] bt2={100,62,33,52,99,46,13,66};
		String str5=new String(bt2,0,4);   
		System.out.println(str5);

		char[] ch1={'你','好','吗','朋','友'};
		String str6=new String(ch1);
		System.out.println(str6);
		
		String str1="abcdef";
		char c1=str1.charAt(0);
		System.out.println(c1);

		String str2=String.valueOf(true);
		System.out.println(str2);

		String str3="hijklmn";
		int n1=str3.codePointAt(0);    //求出指定下标元素的Unicode代码值，返回值int
		System.out.println(n1);        //此处求"h"，返回：104

		String str7="abcd";
		int n2="abcd".compareTo("efgh");
		System.out.println(n2);

		String str8=new String("cdefgh");
		boolean b1=str8.contains("a");      //检测字符串里是否包含某个字符串
		boolean b2=str8.contains("");       //空字符串也包含在里面，返回值true
		boolean b3=str8.contains("cdefgh"); //整个字符串包含在里面，返回值true
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);

		String str9=new String("helloworld!");
		boolean b4=str9.endsWith("hd!");
		boolean b5=str9.endsWith("");
		System.out.println(b4+" "+b5);

		String str10="梅花香自苦寒来";
        boolean b6=str10.equals("梅花香自苦寒来");
		System.out.println(b6);
       
	    System.out.println("==============");
		String str11="abcde";
		boolean b7=str11.equalsIgnoreCase("ABCDE");
		System.out.println(b7);

		String str12=new String("霜辱雪欺");  //以byte[]数组形式返回指定字符串的默认字符编码;
		byte[] bytes1=str12.getBytes();
		for(int i=0; i<bytes1.length; i++){
		    System.out.println(bytes1[i]);
		}
        
		
		int n3="外柔内刚".indexOf("内刚");  //求“内刚”第一次出现时下标
		System.out.println(n3);

		int n4="外柔内柔则人辱之".length();  //求字符串长度。
		System.out.println(n4);

		boolean b8="abc".isEmpty();   
		System.out.println(b8);

		int n5="abcdefdef".lastIndexOf("def");  //判断最后一次出现的下标
		System.out.println(n5);

		String str13="hellothere".replace("hello", "hi");  //替换字符串的一部分
		System.out.println(str13);

		System.out.println("=======");
		String str14="2020-11-13";
		String[] strs=str14.split("-");  //以特定符号拆分字符串，并声称String[]数组，返回。
		for(int i=0; i<strs.length; i++){
		    System.out.println(strs[i]);
		}
		System.out.println("=======");

		boolean b9="冰冻三尺非一日之寒".startsWith("冰冻三尺");
		System.out.println(b9);

		String str15="冰冻三尺非一日之寒".substring(4);  //从下标为4的元素开始输出
		System.out.println(str15);   //"非一日之寒"

		String str16="冰冻三尺非一日之寒".substring(0,4);  //截取0-3的下标元素，不包括4
		System.out.println(str16);

		char[] chars2="宇宙的奇迹".toCharArray();
		for(int i=0; i<chars2.length; i++){
		    System.out.println(chars2[i]);
		}

		String str17="ABCDEF".toLowerCase();   //转换为小写
		System.out.println(str17);

		String str18="abcdef".toUpperCase();   //转换为大写
		System.out.println(str18);
 
		String str19="   www.  cctv   ".trim();   //修建字符串前后空格，中间的不修剪
		System.out.println(str19);
        

		boolean b10=false;
		int i=200;
		User u=new User();
		String str20=String.valueOf(u);
		System.out.println(str20);
    

        


	
	}

}

class User {
  
    public String toString(){
	    return "User";
	}

}