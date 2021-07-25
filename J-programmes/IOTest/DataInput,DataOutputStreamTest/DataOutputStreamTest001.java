import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//����ר������ϰ��������д����˳�򣬶���ҲҪ�������˳��
public class DataOutputStreamTest001 {

    public static void main(String[] args){
	
	    DataOutputStream  dos=null;
		try{                        //�вι��������һ�������࣬����new��������������
		    dos=new DataOutputStream(new FileOutputStream("datafile01.txt"));
			int a=100;                                  //����ļ����±������룬ֻ����DataInputStream���룬��ȡ
			byte b=12;
			short s=160;
			char c='A';
			boolean  bo=false;
			
			dos.writeInt(a);
			dos.writeByte(b);
			dos.writeShort(s);
			dos.writeChar(c);
			dos.writeBoolean(bo);    //������д���ʱ����˳��

			dos.flush();
		}catch(FileNotFoundException e){
		    e.printStackTrace();
		}catch(IOException e){
		    e.printStackTrace();
		}finally{
		    if(dos != null){
			   try{
			      dos.close();
			   }catch(IOException e){
			      e.printStackTrace();
			   }
			}
		}
	
	}

}