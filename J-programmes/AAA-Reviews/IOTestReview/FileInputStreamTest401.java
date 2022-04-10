import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest401 {

	public static void main(String[] args){
		
		FileInputStream fis=null;
		try{
			fis=new FileInputStream("E:\\Learning\\Computer\\Java\\J-programmes\\AAA-Reviews\\IOTestReview\\file01.txt");
			
			int i=0;
			byte[] bytes=new byte[26];
			int index=0;
			while((i=fis.read()) != -1){
				bytes[index]=(byte)i;
				System.out.print(i+",");
				index++;
			}
			String alphabet=new String(bytes);
			
			System.out.println(alphabet);
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