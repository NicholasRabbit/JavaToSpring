import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;

//File���ﳣ�÷�����
public class FileTest002  {

    public static void main(String[] args) throws Exception{
	
	
		File f3=new File("D:\\Movies\\�˶���.mp4");  
	
		
		String str=f3.getParent();           //��ȡ����ֵΪString���͵�f3�����dir�ĸ�·��
		System.out.println(str);             //���D:\\Movies\\
	    File parentFile=f3.getParentFile();  //��ȡ����ֵΪFile���͵�f3��·��
		System.out.println("parentFile:"+parentFile);

		//��ȡ����·��
		String absolutePath=f3.getAbsolutePath();
		System.out.println("f3�ľ���·����"+absolutePath);

		String fileName=f3.getName();
		System.out.println("f3��fileName�� "+fileName);  //��ȡ�ļ���:dir

		boolean b2=f3.isFile();
		System.out.println("f3�Ƿ�Ϊ�ļ�����"+b2);   //�ж�book.txt�Ƿ�Ϊ�ļ�
		boolean b3=f3.isDirectory();
		System.out.println("f3�Ƿ�ΪĿ¼����"+b3);   //�ж�book.txt�Ƿ�ΪĿ¼ 
		
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