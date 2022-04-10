import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileWriterTest001 {

    public static void main(String[] args){
	    FileWriter fw=null;
		try{
		   fw=new FileWriter("writerfile.txt");  //新建一个当前路径下的writerfile.txt文件，准备写入
		                                         
           char[] chars={'a','b','c','d','e',};
		   fw.write(chars);
		                         //因为有参构造方法不是FileWriter("路径",boolean append)，
		   fw.write(chars,3,2);  // 所以注意:FileWriter的write()方法和FileOutputStream的write()方法一样
           //此行写入：de,       //也会把原来老的且同名文件内容清空，并覆盖，
								 //但fw.write(chars,3,2)方法不会覆盖上一个fw.write(chaars)所写的
								 //即结果是abcdede
           
		   fw.write("有凤来仪"); //write(String str)方法重载，可以直接写字符串
		   fw.write("\r\n");     //fw.write(..)方法要换行，必须"\r\n"都写，且"\r"在前，否则还是不换行
		   fw.write("渔樵闲话");

		   fw.flush();           //写完之后记得刷新，清空流管道
		}catch(FileNotFoundException e){
		   e.printStackTrace();
		}catch(IOException e){
		   e.printStackTrace();
		}finally{
		   if(fw != null){
		      try{
			     fw.close();
			  }catch(IOException e){
			     e.printStackTrace();
			  }
		   }
		}
	}

}