
import java.io.File;

public class RenameAllTest001 {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("请输入命名文件所在文件夹：");
        String path = scanner.nextLine();
        renameAll(new File(path));
    }

    private static int renameAll(File file) {
        File[] files = file.listFiles();
        int count = 1;
        for (int i = 0; i < files.length; i++) {
            //获取后缀
            String fileName = files[i].getName();
            //如果是文件夹则修改其内部的文件，如果内部还有文件夹，则继续递归
            if (files[i].isDirectory()) {
                renameAll(files[i]);   //注意这里递归的时候要写成:files[i]，不要写成file，否则递归无穷尽
            } else {
                int index = fileName.lastIndexOf(".");
                String suffix = "";
                if (index > 0) {
                    suffix = fileName.substring(index, fileName.length());
                }
                File newFile = new File(file.getAbsolutePath() + "\\" + count + suffix);
                boolean success = files[i].renameTo(new File(file.getAbsolutePath() + "\\" + count + suffix));
                if (success) {
                    System.out.println("重命名文件：" + files[i].getAbsolutePath() + " 为===>：" + newFile.getAbsolutePath());
                }
                count++;
            }
        }
        return count;
    }


}
