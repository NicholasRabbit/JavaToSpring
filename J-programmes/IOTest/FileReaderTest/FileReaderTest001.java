import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReaderTest001 {

    public static void main(String[] args){
	    //FileReader字符输入流，适用于单个字符传输，普通文本文件，不适用于视频，图片等等，word不是普通文本
		//本例，从fileReader01.txt文件中读取，并打印出来。
	    FileReader fr=null;
		try{
		    fr=new FileReader("E:\\Learning\\Computer\\Java\\J-programmes\\IOTest\\fileReader01.txt");

			char[] chars=new char[5];
			
			/*
			int readCount=0;
			while(true){
			    readCount = fr.read(chars);
				if(readCount ==-1){
				  break;  
				}
				String str = new String(chars,0,readCount);
				System.out.print(str);  //想要输出与原文一样的格式，不要换行，用print()
            }
			*/
			//whlile循环简洁写法
			int readCount=0;
			while((readCount = fr.read(chars)) != -1){
               System.out.print(new String(chars,0,readCount));
            }
		}catch(FileNotFoundException e){
			    e.printStackTrace();
		}catch(IOException e){
			    e.printStackTrace();
		}finally{
			    if(fr != null){
				   try{
					   fr.close();
				   }catch(IOException e){
					   e.printStackTrace();   
				   }
				}
		}
	
	}

}

/*
上面while循环简洁写法:
int readCount=0;
while((readCount = fr.read(chars)) != -1){
    System.out.print(new String(chars,0,readCount))
}

*/