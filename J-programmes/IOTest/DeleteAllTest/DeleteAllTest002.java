import java.io.File;
import java.util.Scanner;

public class DeleteAllTest002 {

	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.print("����ɾ��ȫ����.temp,������·��:");
		String str=s.nextLine();
		File f=new File(str);
		deleteAll(f);
	}

	public static void deleteAll(File f){
		if(f.isFile()){
			if(f.getName().endsWith(".temp")){
				if(f.delete()){
					System.out.println(f.getName()+"��ɾ��");
				}
			}
			return;
		}

			File[] files=f.listFiles();
			for(int i=0; i<files.length; i++){
				deleteAll(files[i]);
			}
	}
}