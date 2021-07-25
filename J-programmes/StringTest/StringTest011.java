public class StringTest011 {

    public static void main(String[] args){
	
	    stringMethods();   
	
	}

	public static void stringMethods(){
	
	    int a="abdecdefg".lastIndexOf("de");  //lastIndexOf()方法，判断一个字符串在父字符串最后出现时的下标,返回值int类型。
		System.out.println(a);                //本例两个de,输出最后一个de出现时，d的下标：5

		String[] str="2010-8-15".split("-");  //split()方法，把一个字符串用特定字符拆分成字符串数组，返回值String[]数组
		for(int i=0;i<str.length;i++){
		    System.out.println(str[i]);    //输出：数组{2010,8,15}
		}


		boolean b="abcdefg".startsWith("ab");  //startsWith()方法，判断某个字符串是否已特定字符串为开头，返回值boolean类型。
		System.out.println(b);


		String s1="abcdef".substring(2);     //substring()方法(注意string的s小写)，本例以下标2(即c)为起点，截取到最后得到新字符串
		System.out.println(s1);              //输出：cdef
		
		String s2="abcdef".substring(2,4);   //substring()方法重载，形式参数列表不同，这次是首尾截取，包含开始的下标，不包含结束下标
        System.out.println(s2);              //输出:cd，注意，不包括下标为4的元素e

        System.out.println("****************");
		char[] chars="新英格兰爱国者".toCharArray();   //toCharArray()方法，把字符串转换为字符数组，返回值char[]数组类型
		for(int i=0;i<chars.length;i++){               //输出：{'新','英','格','兰','爱','国',者'}
		    System.out.println(chars[i]);  
		}
        System.out.println("****************");

		String s3="ABCD".toLowerCase();     //toLowerCase()方法，把大写字幕转换为小写
		System.out.println(s3);
 
		String s4="abcd".toUpperCase();    //toUpperCase()方法，把小写转换为大写
		System.out.println(s4);
 
		String s5="  ab  cd   ".trim();    //trim()方法，修建字符串首尾的空格，中间不修剪
		System.out.println(s5);            //输出："ab  cd"

		//静态方法，带static
		String sta=String.valueOf(true);   //valueOf(),静态方法，属于类级别的方法，把其他类型的字面值，转换为字符串类型的
		System.out.println(sta);

		String stg=String.valueOf(new User());
		System.out.println(stg);

	
	}

}

class User
{

	public String toString(){
	
	    return "User";
	}
}