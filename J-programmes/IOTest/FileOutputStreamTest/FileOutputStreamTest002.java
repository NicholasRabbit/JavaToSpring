import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileOutputStreamTest002 {

    public static void main(String[] args){
	
	    //如果不想像FOSTest001一样覆盖原文件，而是在原内容后面接着写，则使用下面这种有参构造新建对象
	    FileOutputStream fos=null; 
        try{
		   fos=new FileOutputStream("writefile02.txt",true);
		   byte[] bytes={97,98,99,100,101,102};
		   fos.write(bytes);

		   String str=new String("小不忍则乱大谋");
		   byte[] bt=str.getBytes();   //把String类字符转换为编码，放进byte数组。
		   fos.write(bt);

		   fos.flush();    //输出流的write()方法写完，记得清空刷新，清空管道内数据
		}catch(FileNotFoundException e){
		   e.printStackTrace();
		}catch(IOException e){
		   e.printStackTrace();
		}finally{
		    if(fos != null){
			    try{
				   fos.close();   //在输出流里，关闭流之前记得刷新清空flush()，否则有可能丢失数据.
				}catch(IOException e){
				   e.printStackTrace();
				}
			}
		}
	    
	}

}