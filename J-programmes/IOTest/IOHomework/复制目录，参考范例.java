java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
//�Ӽ��̽��������ļ���·��,������һ���ļ�����(��������)��������һ���ļ����� 
public class Test3 {
 
	public static void main(String[] args) throws IOException {
		File src = getDirectory();
		File dest = getDirectory();
		if (src.equals(dest)) {
			System.out.println("Ŀ���ļ�����ԭ�ļ��е����ļ���");
		} else {
			copyFile(src, dest);
		}
 
	}
 
	// �ж��Ƿ����ļ���
	public static File getDirectory() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������ļ�·��:");
 
		while (true) {
			String path = sc.next();
			File file = new File(path);
			if (!file.exists()) {
				System.out.print("�ļ������ڣ�����������:");
			} else if (file.isFile()) {
				System.out.print("����������ļ�·��,����������:");
			} else {
				return file;
			}
		}
 
	}
 
	// ʹ�õݹ鿽���ļ���
	public static void copyFile(File src, File dest) throws IOException {
 
		// ��Ҫ��Ŀ���ļ����ﴴ��ԭ�ļ���
		File newFile = new File(dest, src.getName());
		newFile.mkdir();
 
		// ����ԭ�ļ�����ļ����ļ���
		File[] files = src.listFiles();
 
		for (File file1 : files) {
			if (file1.isFile()) {
				BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file1));
				BufferedOutputStream bos = new BufferedOutputStream(
						new FileOutputStream(new File(newFile, file1.getName())));
				int b;
				while ((b = bis.read()) != -1) {
					bos.write(b);
				}
				bis.close();
				bos.close();
			} else {
				copyFile(file1, newFile);
			}
		}
	}
 