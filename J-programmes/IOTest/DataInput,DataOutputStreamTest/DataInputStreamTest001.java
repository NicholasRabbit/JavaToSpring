import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//数据流专属文件读取，输入流
public class DataInputStreamTest001 {

    public static void main(String[] args){
	
	    DataInputStream dis=null;
		try{
		    dis = new DataInputStream(new FileInputStream("datafile01.txt"));

			int i=dis.readInt();
			byte b=dis.readByte();
			short s=dis.readShort();
			char c=dis.readChar();
			boolean bo=dis.readBoolean();  //数据数据流专属的文件要按照它写入得顺序来

			System.out.println(i+":"+b+":"+s+":"+c+":"+bo);

		}catch(FileNotFoundException e){
		    e.printStackTrace();
		}catch(IOException e){
		    e.printStackTrace();
		}finally{
		    if(dis != null){
			   try{
			      dis.close();
			   }catch (IOException e){
			      e.printStackTrace();
			   }
			}
		}
	
	}

}