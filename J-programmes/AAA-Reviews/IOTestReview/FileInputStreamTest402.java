import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest402 {

	public static void main(String[] args){
		
		FileInputStream fis=null;
		try{
			fis=new FileInputStream("E:\\Learning\\Computer\\Java\\J-programmes\\AAA-Reviews\\IOTestReview\\file01.txt");
			byte[] bytes=new byte[5];

			int readCount=0;
			while((readCount=fis.read(bytes)) != -1){
				String s=new String(bytes,0,readCount);
				System.out.print(s);
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(fis != null){
				try{
				   fis.close();
				}catch(IOException e){
				   e.printStackTrace();
				}
			}
		}
	}

}