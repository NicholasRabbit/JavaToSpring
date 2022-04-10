//删除同一后缀名文件范例

import java.io.*;

public class DeleteAllTest {

	public static void main(String[] args){
		
		File f=new File("F:\\DY-works\\大元重科");
		deleteMethod(f);
	}

	public static void deleteMethod(File f){
	
		
		if(f.isFile()){
			if(f.getName().endsWith(".log")){
				f.delete();
				System.out.println(f.getName()+" has been deleted.");
				return;
			}
			
		}else if(f.isDirectory()){     //注意这里f.isDirectory()不放在if语句判断，则上面的不是以.log结尾的文件也会
									   //往下执行，赋值与f.listFiles(),如果f不是目录则返回null，则下面就会出现NullPointerException
			File[] files=f.listFiles();
		    for(int i=0; i<files.length; i++){
			deleteMethod(files[i]);
		    }
		}
		
		
	}
}