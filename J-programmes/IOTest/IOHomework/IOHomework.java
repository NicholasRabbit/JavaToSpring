import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

//复制整个文件夹所有文件到另一盘符下，                                 //例如：菜谱\\川菜
//难点：新目录路径的创建，解决方法，用源目录srcFile.substring(3)方法，把盘符D:\去掉，然后对接在新盘符下
//问题点:1, 新盘符F:\\或创建后的F:\\菜谱，有的以\\结尾，有的不以\\结尾，要用三元运算符判断。
//       2, fos=new FileOutputStream(destPath);此行有可能出异常，因为如果先复制文件，则"菜谱"目录没创建，因此异常
//       3, fos.write(bytes)方法会把新文件写大，应该用fos.write(bytes,0,readCount)方法，源文件没内容就不写了
public class IOHomework {

    public static void main(String[] args){
	
        File srcFile=new File("D:\\菜谱");  //java程序只有代码中要加转义符“\”，实际是："D:\菜谱"，因此截取是从下标3开始
		File destFile=new File("F:\\");     //转义符在计算机读取编译文件是并不存在，只是为了写代码时防止混淆而加的

		copyAll(srcFile, destFile);
		//System.out.println(srcFile.getAbsolutePath().endsWith("\\"));
		//System.out.println(destFile.getAbsolutePath().endsWith("\\"));
	}

	public static void copyAll(File srcFile, File destFile){
	
	    
		
		if(srcFile.isFile()){
			FileInputStream fis=null;
            FileOutputStream fos=null;
		    try{
			    fis=new FileInputStream(srcFile);
				String subPath=srcFile.getAbsolutePath().substring(3);
				String destPath=destFile.getAbsolutePath().endsWith("\\") ? destFile.getAbsolutePath()+subPath : destFile.getAbsolutePath()+"\\"+subPath;
				//System.out.println(subPath+":"+destPath);
				
				File newFile00=new File(destPath);           //防止下面srcFile所代表的文件的父目录不存在，
				File newDir=new File(newFile00.getParent()); //则下面创建新输出流是会报异常
				if(!newDir.exists()){                        //老杜源码也有这样的bug
				    newDir.mkdirs();
				}

				fos=new FileOutputStream(destPath);    //这里起初出异常，因为程序先复制“冬瓜排骨汤.txt”等文件，不是路径，而“菜谱”这个路径并没有在F:\\下创建，因此报异常
				byte[] bytes=new byte[1024*1024];      //每次读1MB
                int readCount=0;
				while((readCount=fis.read(bytes)) != -1){
				    fos.write(bytes,0,readCount);   //注意，这里写文件时，不要用write(bytes)方法，这个方法在源文件没内容后，还一直读，
				}                                   //会导致复制后的新文件内存变大，bytes后要加0,readCount

				fos.flush();
			}catch(FileNotFoundException e){
			    e.printStackTrace();
			}catch(IOException e){
			    e.printStackTrace();
			}finally{
			    if(fis != null){
				    try{
					   fis.close();
					}catch(IOException e){
					    e.printStackTrace();
					}
				}
				if(fos != null){
				    try{
					   fos.close();
					}catch(IOException e){
					    e.printStackTrace();
					} 
				}
			}
			return;
		}
		
		File[] fileArray=srcFile.listFiles();
		for(int i=0; i<fileArray.length; i++){
		    //System.out.println(fileArray[i]);
            if( fileArray[i].isDirectory() ){
			    String subPath=fileArray[i].getAbsolutePath().substring(3);
				String destPath=destFile.getAbsolutePath().endsWith("\\")  ?  destFile.getAbsolutePath()+subPath : destFile.getAbsolutePath()+"\\"+subPath;  
                File newFile=new File(destPath);
				if(!newFile.exists()){
				    newFile.mkdirs();
				}
			}
			copyAll(fileArray[i],destFile);
		}
		return;
	}

}