public class SpaceTabTest {

	/*
	* 正则表达式:
	* "\\s" : 匹配一个空格
	* "\\s*" : 匹配一个或多个空格，换行符，缩进符号等任意空的字符
	* 注意：\s* ： 是正则，两个斜线“\\”第一个\是转义符
	*/
	public static void main(String[] args) {
		
		// \\s:用法
		String players = "Jim Ted Infi F91 ";
		String[] arr = players.split("\\s");
		for(String s : arr){
			System.out.println("player==>" + s);
		}

		// \\s*:用法
        String c = "abc    \n\t\rxyz    ";
        String str = c.replaceAll("\\s*", "");
        System.out.println(str);

    }
}
