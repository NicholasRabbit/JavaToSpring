import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class FileTest003 {

    public static void main(String[] args){
	
	    //File[] listFile()方法,获取目录下面的所有文件，返回File[]数组

		File file=new File("D:\\Movies");

		File[] ff=file.listFiles();

		for(File i : ff){
		    System.out.println(i);
		}

		File file02=new File("oldDirectory");
		file02.mkdir();
		File file03=new File("renameDirectory");
		file02.renameTo(file03);
		String name=file03.getName();
		System.out.println(name);
	}

}