import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileOutputStreamTest301 {

	public static void main(String[] args){
		FileOutputStream fos=null;
		try{
			fos=new FileOutputStream("out.txt");
			fos.write(97);

			byte[] bytes={100,101,102,103,126};
			fos.write(bytes);
			
			fos.flush();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(fos != null){
				try{
					fos.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}
	}	

}