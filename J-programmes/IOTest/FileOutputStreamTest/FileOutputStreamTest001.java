import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileOutputStreamTest001 {

    public static void main(String[] args){
	
	    FileOutputStream  fos=null;
		
		try{
		    fos=new FileOutputStream("writefile.txt");  //相对路径，在本代码同目录下
			byte[] bytes={97,98,99,100,101};  //abcd
		           
			                      //如果writefile.txt原文件有，是其他内容：你好中国，会被覆盖
			fos.write(bytes);     //注意，此处write方法会覆盖目录下同名文件,删除后重新创建，谨慎使用
            fos.write(bytes,0,2); //连续调用bytes数组，这次输入ab, 最后结果是abcdab
            
			fos.flush();          //每次输出完之后，要刷新清除
		}catch(FileNotFoundException e){
		    e.printStackTrace();
		}catch(IOException e){
		    e.printStackTrace();
		}
	}

}