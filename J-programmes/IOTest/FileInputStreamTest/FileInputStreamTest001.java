import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileInputStreamTest001 {

    public static void main(String[] args){
	    
		//�ֽ��������������ڴ���ȥ
		FileInputStream fis=null; //��Ϊfinally���Ҫ����fis����˲�����try���������FileInputStream fis=new FIS();
		                          //�������ᱨ��,��finally���������Ҳ������fis

	    try{                                        //ע���ļ�·����ת�����\��,����дΪE:/Learning...һ����б��"/"
		    fis=new FileInputStream("E:\\Learning\\Computer\\Java\\J-programmes\\IOTest\\file.txt");
		    
			/*
			int data=fis.read();
			while(data !=-1){
			    System.out.println(data);     //whileѭ������д��,�����
				data=fis.read();
			}
			*/
			while(true){
			    int data=fis.read();     //read()������ȡ������ĸ��ASCII��
				if(data==-1){
				    break;
				}
				System.out.println(data);   //ע�⿴file.txt���и��ո�ASCII����32
			}

			
			
		}catch(FileNotFoundException e){
		    e.printStackTrace();
		}catch(IOException e){
		    e.printStackTrace();
		}finally{
		   if(fis !=null){    //ע�⣬���fis��null,��û��Ҫ�ر���
		       try{
		         fis.close();    //������finally�����ر��� 
		       }catch(IOException e){
		         e.printStackTrace();     
		       }
		   
		   }
		   
		}
		
	}

}