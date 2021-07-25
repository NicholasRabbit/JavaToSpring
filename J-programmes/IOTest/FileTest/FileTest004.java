import java.io.File;


public class FileTest004 {

    //用递归的方法判断一个文件夹的大小
	public static void main(String[] args){
	
	      File file=new File("D:\\dell");
		  long size=fileSize(file);
		  System.out.println(size/1024/1024+"MB");
	
	}

	public static long fileSize(File file){
	         
			 long size=0;     //局部变量size必须写在这里，每次递归是调用的是一个新的fileSize(File file)方法
             
			 File[] fileArr=file.listFiles();
			 for(int i=0; i<fileArr.length; i++){   //这里每个元素是fileArr[i]，不是形式参数列表里的file
			     if(fileArr[i].isFile()){
			         size+=fileArr[i].length();
			     }else if(fileArr[i].isDirectory()){
				     size+=fileSize(fileArr[i]);
				 }
			 }
			  return size;
			 
	         
	}

}