import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;

//File���ﳣ�÷�����
public class FileTest001  {

    public static void main(String[] args) throws Exception{
	
	    File f1=new File("E:\\Learning\\book.txt");
		
		boolean b=f1.exists();   //�ж�f1��������ļ��Ƿ���ڡ�
		System.out.println(b);
		
		f1.createNewFile();   //�����µ��ļ�book.txt�������׳�IOException,ʡ��try,catch��䣬��main�����׳�

		File f2=new File("directory1");  //�ڵ�ǰ·���趨һ��Ŀ¼������f2����
		if(!f2.exists())  f2.mkdir();      //�����Ŀ¼�����ڣ��򴴽�����if����ֻ��һ�䣬�ɲ��Ӵ�����

		//�ݹ鴴���ļ�����mkdirs()����
		File f3=new File("a/b/c/dir");   //���·��
		if(!f3.exists())  f3.mkdirs(); 
		
		String str=f3.getParent();           //��ȡ����ֵΪString���͵�f3�����dir�ĸ�·��
		System.out.println(str);             //���a/b/c
	    File parentFile=f3.getParentFile();  //��ȡ����ֵΪFile���͵�f3��·��
		System.out.println("parentFile:"+parentFile);

		String fileName=f3.getName();
		System.out.println("fileName�� "+fileName);  //��ȡ�ļ���:dir

		boolean b2=f1.isFile();
		System.out.println("f1�Ƿ�Ϊ�ļ�����"+b2);   //�ж�book.txt�Ƿ�Ϊ�ļ�
		boolean b3=f1.isDirectory();
		System.out.println("f1�Ƿ�ΪĿ¼����"+b3);   //�ж�book.txt�Ƿ�ΪĿ¼ 
		
		//lastModified()�������ж��ļ����һ���޸ĵ�ʱ�䣬�Ż�currentTimeMillis()�ĺ���ֵ����1970-01-01 00:00,000 ��
	    //����ֵΪlong����
		File  f4=new File("D:\\Movies\\�˶���.mp4");
		long timeModified=f4.lastModified();
		Date dateModified=new Date(timeModified);    //�Ѵ�1970�꿪ʼ�ĺ���ֵ��Ϊ����
        SimpleDateFormat  sdf=new SimpleDateFormat("yyyy,MM,dd  hh:mm:ss.SSS");  //�趨�й�ϰ�����ڸ�ʽ
		String dateChinaForm=sdf.format(dateModified);    //����format()��������ϵͳĬ�����ڸ�ʽ��Ϊ�й�ϰ�ߵ�
		System.out.println(dateChinaForm);

		long size=f4.length();      //��ȡ�ļ���С������ֵΪlong���ͣ���λΪ�ֽ�byte
		System.out.println(size);
		
		
	}

}