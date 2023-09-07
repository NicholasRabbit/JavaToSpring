
import java.io.*;

/*
 * File类里其它方法
 * 一个File对象对应一个文件夹或文件。
 *
 * */
public class FileTest005 {

	public static void main(String[] args){
		createFile();
	}


	public static void createFile(){

		File photos = new File("photos");
		photos.mkdir();

		try{
			//createNewFile()方法，会创建一个note代表的文件note.txt
			File note = new File(photos,"note.txt");
			note.createNewFile();
		}catch(IOException e){
			e.printStackTrace();
		}

		//renameTo()方法
		File images = new File("images");
		photos.renameTo(images);
		
	
	}

}
