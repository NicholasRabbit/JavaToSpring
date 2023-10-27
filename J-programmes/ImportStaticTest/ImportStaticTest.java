
/*
 * 静态导入范例
 * 注意：CLI界面编译时用 -d . *.java
 * */

//手动编译时，静态导入的类不加包机制的话编译报错，必须把其放到一个有路径的报名下。原因待查。
//import static Calculator.add;
import static com.demo.Calculator.add;  //指定导入方法
import static com.demo.Calculator.*;  //可以用*全部导入

public class ImportStaticTest{

	public static void main(String[] args){
		//不使用静态导入调用静态方法，不用写import static语句
		//int r = Calculator.add(1,2);
		//System.out.println(r);

		int r = add(3,4);
		System.out.println(r);
		
			
	}


}
