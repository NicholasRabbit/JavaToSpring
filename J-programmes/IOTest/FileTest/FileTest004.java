import java.io.File;


public class FileTest004 {

    //�õݹ�ķ����ж�һ���ļ��еĴ�С
	public static void main(String[] args){
	
	      File file=new File("D:\\dell");
		  long size=fileSize(file);
		  System.out.println(size/1024/1024+"MB");
	
	}

	public static long fileSize(File file){
	         
			 long size=0;     //�ֲ�����size����д�����ÿ�εݹ��ǵ��õ���һ���µ�fileSize(File file)����
             
			 File[] fileArr=file.listFiles();
			 for(int i=0; i<fileArr.length; i++){   //����ÿ��Ԫ����fileArr[i]��������ʽ�����б����file
			     if(fileArr[i].isFile()){
			         size+=fileArr[i].length();
			     }else if(fileArr[i].isDirectory()){
				     size+=fileSize(fileArr[i]);
				 }
			 }
			  return size;
			 
	         
	}

}