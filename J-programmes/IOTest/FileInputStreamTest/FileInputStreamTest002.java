import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileInputStreamTest002 {

    public static void main(String[] args){
	
	    FileInputStream fis=null;
		byte[] bytes=new byte[4];

		try{                         
		   fis=new FileInputStream("file02.txt"); //   相对路径在源码同文件下  
		   
		   int readCount1=fis.read(bytes);  //这里把读取到的字节放进一个byte[]数组里，但这里bytes数组里已经得到这些元素了
		   System.out.println(readCount1);  //但是返回值readCount是数组元素个数,不是数组。
		   String str1=new String(bytes);   //String类里有个有参构造函数，把数组变量bytes传进去，元素转成一个字符串
		   System.out.println(str1);        //abcd      

		   int readCount2=fis.read(bytes);  //再一次读取，再返回值得话，就剩2个元素了
		   System.out.println(readCount2);  //输出2
		   String str2=new String(bytes);   
		   System.out.println(str2);      //结果efcd,第二次读取输入流得到ef,但是这两个字节把bytes数组中abcd的ab覆盖了 


		}catch (FileNotFoundException e){
           e.printStackTrace();
		}catch (IOException e){
		   e.getMessage();
		}
		
	
	}

}