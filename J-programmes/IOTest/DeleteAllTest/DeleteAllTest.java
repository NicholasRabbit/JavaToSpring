//ɾ��ͬһ��׺���ļ�����

import java.io.*;

public class DeleteAllTest {

	public static void main(String[] args){
		
		File f=new File("F:\\DY-works\\��Ԫ�ؿ�");
		deleteMethod(f);
	}

	public static void deleteMethod(File f){
	
		
		if(f.isFile()){
			if(f.getName().endsWith(".log")){
				f.delete();
				System.out.println(f.getName()+" has been deleted.");
				return;
			}
			
		}else if(f.isDirectory()){     //ע������f.isDirectory()������if����жϣ�������Ĳ�����.log��β���ļ�Ҳ��
									   //����ִ�У���ֵ��f.listFiles(),���f����Ŀ¼�򷵻�null��������ͻ����NullPointerException
			File[] files=f.listFiles();
		    for(int i=0; i<files.length; i++){
			deleteMethod(files[i]);
		    }
		}
		
		
	}
}