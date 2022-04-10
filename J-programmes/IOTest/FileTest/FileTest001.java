import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;

//File类里常用方法：
public class FileTest001  {

    public static void main(String[] args) throws Exception{
	
	    File f1=new File("E:\\Learning\\book.txt");
		
		boolean b=f1.exists();   //判断f1所代表的文件是否存在。
		System.out.println(b);
		
		f1.createNewFile();   //创建新的文件book.txt，这里抛出IOException,省略try,catch语句，在main方法抛出

		File f2=new File("directory1");  //在当前路径设定一个目录对象，用f2代表
		if(!f2.exists())  f2.mkdir();      //如果该目录不存在，则创建它。if后面只有一句，可不加大括号

		//递归创建文件夹用mkdirs()方法
		File f3=new File("a/b/c/dir");   //相对路径
		if(!f3.exists())  f3.mkdirs(); 
		
		String str=f3.getParent();           //获取返回值为String类型的f3代表的dir的父路径
		System.out.println(str);             //输出a/b/c
	    File parentFile=f3.getParentFile();  //获取返回值为File类型的f3父路径
		System.out.println("parentFile:"+parentFile);

		String fileName=f3.getName();
		System.out.println("fileName： "+fileName);  //获取文件名:dir

		boolean b2=f1.isFile();
		System.out.println("f1是否为文件？："+b2);   //判断book.txt是否为文件
		boolean b3=f1.isDirectory();
		System.out.println("f1是否为目录？："+b3);   //判断book.txt是否为目录 
		
		//lastModified()方法，判断文件最后一次修改的时间，放回currentTimeMillis()的毫秒值，从1970-01-01 00:00,000 起
	    //返回值为long类型
		File  f4=new File("D:\\Movies\\八恶人.mp4");
		long timeModified=f4.lastModified();
		Date dateModified=new Date(timeModified);    //把从1970年开始的毫秒值改为日期
        SimpleDateFormat  sdf=new SimpleDateFormat("yyyy,MM,dd  hh:mm:ss.SSS");  //设定中国习惯日期格式
		String dateChinaForm=sdf.format(dateModified);    //调用format()方法，把系统默认日期格式改为中国习惯的
		System.out.println(dateChinaForm);

		long size=f4.length();      //获取文件大小，返回值为long类型，单位为字节byte
		System.out.println(size);
		
		
	}

}