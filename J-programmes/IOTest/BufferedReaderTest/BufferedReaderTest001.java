import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

//BufferReader：带有缓冲区字符输入流，即不用char[]或byte[]数组，直接自己扩容
public class BufferedReaderTest001 {

    public static void main(String[] args){
	
	    BufferedReader br=null;
		FileReader fr=null;      //FileReader是抽象类Reader的一个子类
        
		try{
		    fr=new FileReader("E:\\Learning\\Computer\\Java\\J-programmes\\IOTest\\file03.txt");
			br=new BufferedReader(fr);   //此处调用有参构造：public BufferedReader(Reader  in);

			//注意readLine()方法不读取行尾的终止符(指“\n”"\r")等不同系统的换行符。
			String firstLine=br.readLine();  //一行一行的读取字符,如果读取不到，就返回null，可根据此特征写while循环
            String secondLine=br.readLine(); //读第二行，是个空行
			System.out.println(firstLine);   //readLine()读取一行，不读取换行符，因此这里用println，否则就成只有一行了
			System.out.println(secondLine);  //空行，见原文件file03.txt
            
			String str=null;
			while((str=br.readLine()) != null){
			    System.out.println(str);
			}

		}catch(FileNotFoundException e){
		    e.printStackTrace();
		}catch(IOException e){
		    e.printStackTrace();
		}finally{
		    if(br != null){
			    try{
				    br.close();          //这里关闭外部的包装流br的close()方法，也把内部节点流的方法给关了
				}catch(IOException e){   //因为源码里包含节点流关闭方法 in.close();
				    e.printStackTrace();
				}
			}
		}
	
	}

}