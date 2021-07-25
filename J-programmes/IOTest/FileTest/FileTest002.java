import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;

//File类里常用方法：
public class FileTest002  {

    public static void main(String[] args) throws Exception{
	
	
		File f3=new File("D:\\Movies\\八恶人.mp4");  
	
		
		String str=f3.getParent();           //获取返回值为String类型的f3代表的dir的父路径
		System.out.println(str);             //输出D:\\Movies\\
	    File parentFile=f3.getParentFile();  //获取返回值为File类型的f3父路径
		System.out.println("parentFile:"+parentFile);

		//获取绝对路径
		String absolutePath=f3.getAbsolutePath();
		System.out.println("f3的绝对路径："+absolutePath);

		String fileName=f3.getName();
		System.out.println("f3的fileName： "+fileName);  //获取文件名:dir

		boolean b2=f3.isFile();
		System.out.println("f3是否为文件？："+b2);   //判断book.txt是否为文件
		boolean b3=f3.isDirectory();
		System.out.println("f3是否为目录？："+b3);   //判断book.txt是否为目录 
		
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