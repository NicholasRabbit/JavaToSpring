/*
  资源绑定器ResourceBundle范例,ResourceBundle是一个抽象类
  用途：可以得到配置文件中的值value，这个值可能是一个类，或者一个MySql实现类等等

*/

import java.util.ResourceBundle;

public class ResourceBundleTest {

	public static void main(String[] args){
		
		
		/* 使用ResourceBundle绑定器的要求
		一，绑定的只能是以.properties为后缀的配置文件，其他的不行；
		二，在getBundle(String baseName)里参数是以类加载路径为起点的，即以src根目录为起点
		    而且，最后文件名称不要加后缀
		*/
		
		//第一步，调用ResourceBundle里的静态方法getBundle(..)
		ResourceBundle rb=ResourceBundle.getBundle("com/javase/reflect/bundleFile");
		
		//第二步，调用实例方法..String getString(String key)，通过key得到value这个返回值,String类型
		String value=rb.getString("key01");
		System.out.println(value);
	}

}