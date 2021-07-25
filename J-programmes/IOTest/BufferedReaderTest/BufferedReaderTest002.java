import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

//�ֽ���FileInputStream��Ϊ�ڵ�����BufferedReader�е�ʹ��
//BufferedReaderֻ����ַ������ֽ�����Ҫת��Ϊ�ַ�����ʹ��InputStreamReaderת��
public class BufferedReaderTest002 {

    public static void main(String[] args){
	
	    BufferedReader br=null;
         
		try{
                                     //ISR��FIS�İ�װ��            <<<<<  //FIS��ISR�Ľڵ���
		   br=new BufferedReader(new InputStreamReader(new FileInputStream("bufferReadFile002.txt")));
		                             //<<<<  ISR��BR�Ľڵ���
		   String str=null;
		   while((str=br.readLine()) != null){
		       System.out.println(str);        //readLine()���������ȡ���з���Ҫ����ԭ���Ű棬����println()
		   }
		}catch(FileNotFoundException e){
		       e.printStackTrace();

		}catch(IOException e){
		       e.printStackTrace();
		}finally{
		       if(br != null){
			      try{
				     br.close();
				  }catch(IOException e){
				     e.printStackTrace();
				  }
			   }
		 }
		                            

	
	}

}