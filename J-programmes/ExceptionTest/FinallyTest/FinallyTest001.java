import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyTest001 {

    public static void main(String[] args){
	
	    method01();
	
	}

	public static void method01(){
	    
		FileInputStream fis = null;
	    try{
		   	fis=new FileInputStream("D:\\javase");
		}catch(FileNotFoundException e){
		    e.printStackTrace();
		}finally{
		    System.out.println("finally”Ôæ‰÷¥––");
			if(fis != null){
			    try{
				   fis.close();
				}catch(IOException e){
				   e.printStackTrace();
				  
				}
		    }
					
		}
	}

}