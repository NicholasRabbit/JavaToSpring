import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//������ר���ļ���ȡ��������
public class DataInputStreamTest001 {

    public static void main(String[] args){
	
	    DataInputStream dis=null;
		try{
		    dis = new DataInputStream(new FileInputStream("datafile01.txt"));

			int i=dis.readInt();
			byte b=dis.readByte();
			short s=dis.readShort();
			char c=dis.readChar();
			boolean bo=dis.readBoolean();  //����������ר�����ļ�Ҫ������д���˳����

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