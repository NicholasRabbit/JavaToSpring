import java.io.*;

public class BufferedReaderTest201 {

    public static void main(String[] args){
	
	    BufferedReader br=null;
		try{
            FileReader fr=new FileReader("bufferFile.txt");
			br=new BufferedReader(fr);
            String firstLine=br.readLine();
			System.out.println(firstLine);
			String secondLine=br.readLine();
			System.out.println(secondLine);
            
			String str=null;
			while((str=br.readLine()) != null){
			    System.out.print(str);
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