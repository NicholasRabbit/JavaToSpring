import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedWriterTest001 {

    public static void main(String[] args){
	
	    BufferedWriter  bw=null;
		FileWriter  fw=null;

		try{
		    fw=new FileWriter("bufferedWriterfile.txt");  //在当前路径写一个文件bufferedWriterfile.txt
			bw=new BufferedWriter(fw);
			
			bw.write("你好");  //直接写字符串，从抽象类java.io.Writer继承的write(String str);方法
			bw.write("同志");
			bw.write("\r\n");
			bw.write("再见");

			bw.flush();   //write()写完要记得刷新
		}catch(FileNotFoundException e){
		    e.printStackTrace();
		}catch(IOException e){
		    e.printStackTrace();
		}finally{
		    if(bw != null){
			    try{
				   bw.close();
				}catch(IOException e){
				   e.printStackTrace();
				}
			}
		}
	
	}

}