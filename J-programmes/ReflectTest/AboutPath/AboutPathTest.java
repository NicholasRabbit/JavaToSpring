
public class AboutPathTest {

	public static void main(String[] args){
		
		//跨平台获取文件绝对路径的通用方式
		//getResource("com/javase/reflect/info.properties")方法的参数是从类加载路径开始的，即src为根目录
		//在这里"AboutPath"目录相当于src
		//path.properties在src根目录下
		String path=Thread.currentThread().getContextClassLoader().getResource("path.properties").getPath();
		System.out.println(path);

		String path02=Thread.currentThread().getContextClassLoader().getResource("com/javase/reflect/info.properties").getPath();
		System.out.println(path02);

	}

}