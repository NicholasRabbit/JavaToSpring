import java.io.File;
import java.util.Scanner;

public class DeleteAllTest002 {

	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.print("即将删除全部的.temp,请输入路径:");
		String str=s.nextLine();
		File f=new File(str);
		deleteAll(f);
	}

	public static void deleteAll(File f){
		if(f.isFile()){
			if(f.getName().endsWith(".temp")){
				if(f.delete()){
					System.out.println(f.getName()+"已删除");
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