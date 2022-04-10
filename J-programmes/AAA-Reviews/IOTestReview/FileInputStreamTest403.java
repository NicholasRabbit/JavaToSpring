
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest403 {

    public static void main(String[] args) {
        FileInputStream in = null;

        try {
            in = new FileInputStream("file.txt");
            byte[] bytes = new byte[1024];
            int count = 0;
            while( (count = in.read(bytes)) != -1 ){
                System.out.println(new String(bytes,0,count));
            }
        } catch (FileNotFoundException  e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } finally {
			
        }
    }
}
