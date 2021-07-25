import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileInputStreamTest003 {

    public static void main(String[] args){
	
	    FileInputStream fis=null;
		try{                                                                           //文件名要加后缀file02.txt
		    fis=new FileInputStream("E:\\Learning\\Computer\\Java\\J-programmes\\IOTest\\file03.txt");
			byte[] bytes=new byte[4];
			
			/*  
			while(true){
			    int readCount=fis.read(bytes);         
				if(readCount==-1){
				   break;
				}
				String str=new String(bytes,0,readCount);
				System.out.print(str);
			}
			*/

			//以上while循环简洁写法
			int readCount=0;
			while((readCount=fis.read(bytes))!=-1){
			    System.out.print(new String(bytes,0,readCount));  //此处想要输出连续则不换行print
			}
		}catch(FileNotFoundException e){
		    e.printStackTrace();
		}catch(IOException e){
		    e.printStackTrace();
		}
	
	}

}