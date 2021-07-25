import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

//���������ļ��������ļ�����һ�̷��£�                                 //���磺����\\����
//�ѵ㣺��Ŀ¼·���Ĵ����������������ԴĿ¼srcFile.substring(3)���������̷�D:\ȥ����Ȼ��Խ������̷���
//�����:1, ���̷�F:\\�򴴽����F:\\���ף��е���\\��β���еĲ���\\��β��Ҫ����Ԫ������жϡ�
//       2, fos=new FileOutputStream(destPath);�����п��ܳ��쳣����Ϊ����ȸ����ļ�����"����"Ŀ¼û����������쳣
//       3, fos.write(bytes)����������ļ�д��Ӧ����fos.write(bytes,0,readCount)������Դ�ļ�û���ݾͲ�д��
public class IOHomework {

    public static void main(String[] args){
	
        File srcFile=new File("D:\\����");  //java����ֻ�д�����Ҫ��ת�����\����ʵ���ǣ�"D:\����"����˽�ȡ�Ǵ��±�3��ʼ
		File destFile=new File("F:\\");     //ת����ڼ������ȡ�����ļ��ǲ������ڣ�ֻ��Ϊ��д����ʱ��ֹ�������ӵ�

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
				
				File newFile00=new File(destPath);           //��ֹ����srcFile��������ļ��ĸ�Ŀ¼�����ڣ�
				File newDir=new File(newFile00.getParent()); //�����洴����������ǻᱨ�쳣
				if(!newDir.exists()){                        //�϶�Դ��Ҳ��������bug
				    newDir.mkdirs();
				}

				fos=new FileOutputStream(destPath);    //����������쳣����Ϊ�����ȸ��ơ������Ź���.txt�����ļ�������·�����������ס����·����û����F:\\�´�������˱��쳣
				byte[] bytes=new byte[1024*1024];      //ÿ�ζ�1MB
                int readCount=0;
				while((readCount=fis.read(bytes)) != -1){
				    fos.write(bytes,0,readCount);   //ע�⣬����д�ļ�ʱ����Ҫ��write(bytes)���������������Դ�ļ�û���ݺ󣬻�һֱ����
				}                                   //�ᵼ�¸��ƺ�����ļ��ڴ���bytes��Ҫ��0,readCount

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