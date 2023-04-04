public class SpaceTabTest {

	/*
	* "\\s*" : 正则表达式，匹配一个或多个空格，换行符，缩进符号等任意空的字符
	* "\\s" : 是匹配一个
	* 注意：\s* ： 是正则，两个斜线“\\”第一个\是转义符
	*/
	public static void main(String[] args) {
        String c = "abc    \n\t\rxyz    ";
        String str = c.replaceAll("\\s*", "");
        System.out.println(str);

    }
}