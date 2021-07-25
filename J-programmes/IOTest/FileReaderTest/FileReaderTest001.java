import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReaderTest001 {

    public static void main(String[] args){
	    //FileReader�ַ��������������ڵ����ַ����䣬��ͨ�ı��ļ�������������Ƶ��ͼƬ�ȵȣ�word������ͨ�ı�
		//��������fileReader01.txt�ļ��ж�ȡ������ӡ������
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
				System.out.print(str);  //��Ҫ�����ԭ��һ���ĸ�ʽ����Ҫ���У���print()
            }
			*/
			//whlileѭ�����д��
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
����whileѭ�����д��:
int readCount=0;
while((readCount = fr.read(chars)) != -1){
    System.out.print(new String(chars,0,readCount))
}

*/