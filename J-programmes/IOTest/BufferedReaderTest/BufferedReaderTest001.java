import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

//BufferReader�����л������ַ���������������char[]��byte[]���飬ֱ���Լ�����
public class BufferedReaderTest001 {

    public static void main(String[] args){
	
	    BufferedReader br=null;
		FileReader fr=null;      //FileReader�ǳ�����Reader��һ������
        
		try{
		    fr=new FileReader("E:\\Learning\\Computer\\Java\\J-programmes\\IOTest\\file03.txt");
			br=new BufferedReader(fr);   //�˴������вι��죺public BufferedReader(Reader  in);

			//ע��readLine()��������ȡ��β����ֹ��(ָ��\n��"\r")�Ȳ�ͬϵͳ�Ļ��з���
			String firstLine=br.readLine();  //һ��һ�еĶ�ȡ�ַ�,�����ȡ�������ͷ���null���ɸ��ݴ�����дwhileѭ��
            String secondLine=br.readLine(); //���ڶ��У��Ǹ�����
			System.out.println(firstLine);   //readLine()��ȡһ�У�����ȡ���з������������println������ͳ�ֻ��һ����
			System.out.println(secondLine);  //���У���ԭ�ļ�file03.txt
            
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
				    br.close();          //����ر��ⲿ�İ�װ��br��close()������Ҳ���ڲ��ڵ����ķ���������
				}catch(IOException e){   //��ΪԴ��������ڵ����رշ��� in.close();
				    e.printStackTrace();
				}
			}
		}
	
	}

}