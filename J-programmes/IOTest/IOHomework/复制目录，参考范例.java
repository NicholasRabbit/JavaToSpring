java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
//从键盘接收两个文件夹路径,把其中一个文件夹中(包含内容)拷贝到另一个文件夹中 
public class Test3 {
 
	public static void main(String[] args) throws IOException {
		File src = getDirectory();
		File dest = getDirectory();
		if (src.equals(dest)) {
			System.out.println("目标文件夹是原文件夹的子文件夹");
		} else {
			copyFile(src, dest);
		}
 
	}
 
	// 判断是否是文件夹
	public static File getDirectory() {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入文件路径:");
 
		while (true) {
			String path = sc.next();
			File file = new File(path);
			if (!file.exists()) {
				System.out.print("文件不存在，请重新输入:");
			} else if (file.isFile()) {
				System.out.print("您输入的是文件路径,请重新输入:");
			} else {
				return file;
			}
		}
 
	}
 
	// 使用递归拷贝文件夹
	public static void copyFile(File src, File dest) throws IOException {
 
		// 先要在目的文件夹里创建原文件夹
		File newFile = new File(dest, src.getName());
		newFile.mkdir();
 
		// 遍历原文件里的文件和文件夹
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
 