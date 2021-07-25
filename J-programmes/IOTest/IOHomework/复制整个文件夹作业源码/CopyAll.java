

import java.io.*;

/*
����Ŀ¼
 */
public class CopyAll {
    public static void main(String[] args) {
        // ����Դ
        File srcFile = new File("D:����");
        // ����Ŀ��
        File destFile = new File("F:\\");
        // ���÷�������
        copyDir(srcFile, destFile);
    }

    /**
     * ����Ŀ¼
     * @param srcFile ����Դ
     * @param destFile ����Ŀ��
     */
    private static void copyDir(File srcFile, File destFile) {
        if(srcFile.isFile()) {
            // srcFile�����һ���ļ��Ļ����ݹ������
            // ���ļ���ʱ����Ҫ������
            // ....һ�߶�һ��д��
            FileInputStream in = null;
            FileOutputStream out = null;
            try {
                // ������ļ�
                // D:\course\02-JavaSE\document\JavaSE���׽���\JavaSE����-01-�������.pdf
                in = new FileInputStream(srcFile);
                // д������ļ���
                // C:\course\02-JavaSE\document\JavaSE���׽���\JavaSE����-01-�������.pdf
                String path = (destFile.getAbsolutePath().endsWith("\\") ? destFile.getAbsolutePath() : destFile.getAbsolutePath() + "\\")  + srcFile.getAbsolutePath().substring(3);
                out = new FileOutputStream(path);
                // һ�߶�һ��д
                byte[] bytes = new byte[1024 * 1024]; // һ�θ���1MB
                int readCount = 0;
                while((readCount = in.read(bytes)) != -1){
                    out.write(bytes, 0, readCount);
                }
                out.flush();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (out != null) {
                    try {
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            return;
        }
        // ��ȡԴ�������Ŀ¼
        File[] files = srcFile.listFiles();
        for(File file : files){
            // ��ȡ�����ļ��ģ�����Ŀ¼���ļ�������·��
            //System.out.println(file.getAbsolutePath());
            if(file.isDirectory()){
                // �½���Ӧ��Ŀ¼
                //System.out.println(file.getAbsolutePath());
                //D:\course\02-JavaSE\document\JavaSE���׽���       ԴĿ¼
                //C:\course\02-JavaSE\document\JavaSE���׽���       Ŀ��Ŀ¼
                String srcDir = file.getAbsolutePath();
                String destDir = (destFile.getAbsolutePath().endsWith("\\") ? destFile.getAbsolutePath() : destFile.getAbsolutePath() + "\\")  + srcDir.substring(3);
                File newFile = new File(destDir);
                if(!newFile.exists()){
                    newFile.mkdirs();
                }
            }
            // �ݹ����
            copyDir(file, destFile);
        }
    }
}
