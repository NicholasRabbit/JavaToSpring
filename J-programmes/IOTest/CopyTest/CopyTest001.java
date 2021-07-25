import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CopyTest001 {

    public static void main(String[] args){
	
	    FileInputStream fis=null;
		FileOutputStream fos=null;
        try{
		    fis=new FileInputStream("F:\\Music\\为你受尽冷风吹.mp3");
			fos=new FileOutputStream("E:\\Learning\\Computer\\Java\\J-programmes\\IOTest\\CopyTest\\为你受尽冷风吹.mp3");

			byte[] bytes=new byte[1024];  //1kb=1024bytes,每次复制1kb，直到复制完
			while(true){
			    int readCount=fis.read(bytes);
				if(readCount==-1){
				    break;
				}
				fos.write(bytes,0,readCount());
			}
			
		}catch(FileNotFoundException e){
		    e.printStackTrace();
		}catch(IOException e){
		    e.printStackTrace();
		}finally{
		    try{
			   fis.close();     //这里输入和输出流不建议写在一起try运行，一旦上面的fis.close()异常出现，并抛出
			   fos.close();     //那么方法体结束，这行的语句永远无法执行。流就无法关闭了。
			}catch(IOException e){
			   e.getMessage();
			} 
			    
			
		}

	
	}

}