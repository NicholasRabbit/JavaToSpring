import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileInputStreamTest001 {

    public static void main(String[] args){
	    
		//字节输如流，即向内存中去
		FileInputStream fis=null; //因为finally语句要是用fis，因此不可在try语句中声明FileInputStream fis=new FIS();
		                          //否则编译会报错,即finally大括号里找不大变量fis

	    try{                                        //注意文件路径加转义符“\”,或者写为E:/Learning...一个右斜杠"/"
		    fis=new FileInputStream("E:\\Learning\\Computer\\Java\\J-programmes\\IOTest\\file.txt");
		    
			/*
			int data=fis.read();
			while(data !=-1){
			    System.out.println(data);     //while循环个人写法,不简洁
				data=fis.read();
			}
			*/
			while(true){
			    int data=fis.read();     //read()方法读取的是字母的ASCII码
				if(data==-1){
				    break;
				}
				System.out.println(data);   //注意看file.txt，有个空格ASCII码是32
			}

			
			
		}catch(FileNotFoundException e){
		    e.printStackTrace();
		}catch(IOException e){
		    e.printStackTrace();
		}finally{
		   if(fis !=null){    //注意，如果fis是null,则没必要关闭流
		       try{
		         fis.close();    //这里在finally语句里关闭流 
		       }catch(IOException e){
		         e.printStackTrace();     
		       }
		   
		   }
		   
		}
		
	}

}