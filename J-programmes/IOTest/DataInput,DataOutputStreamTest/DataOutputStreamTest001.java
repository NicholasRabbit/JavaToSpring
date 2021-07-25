import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//数据专属流练习，数据流写入有顺序，读出也要按照这个顺序
public class DataOutputStreamTest001 {

    public static void main(String[] args){
	
	    DataOutputStream  dos=null;
		try{                        //有参构造参数是一个抽象类，不能new对象，用它的子类
		    dos=new DataOutputStream(new FileOutputStream("datafile01.txt"));
			int a=100;                                  //这个文件记事本打开乱码，只能用DataInputStream输入，读取
			byte b=12;
			short s=160;
			char c='A';
			boolean  bo=false;
			
			dos.writeInt(a);
			dos.writeByte(b);
			dos.writeShort(s);
			dos.writeChar(c);
			dos.writeBoolean(bo);    //数据流写入的时候有顺序

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