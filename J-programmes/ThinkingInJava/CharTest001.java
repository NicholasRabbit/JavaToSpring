
/*
1, byte,char,short基本类型的数据都可以自动转型为int,其本质就是int类型的
2, char虽然是字符，但可以用int类型的数字表示，自动向上转型
*/
public class CharTest001 {

	public static void main(String[] args){
		int a = 'a';   //这里不报错,自动向上转型
		int b = 'b';
		int c = 'c';
		int x = 'x';
		System.out.println("a==>" + a);
		System.out.println("b==>" + b);
		System.out.println("c==>" + c);
		System.out.println("x==>" + x);

		int i = 10;
		int j = 20;
		System.out.println(i |= j);
	}
}