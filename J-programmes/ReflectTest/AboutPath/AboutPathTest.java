
public class AboutPathTest {

	public static void main(String[] args){
		
		//��ƽ̨��ȡ�ļ�����·����ͨ�÷�ʽ
		//getResource("com/javase/reflect/info.properties")�����Ĳ����Ǵ������·����ʼ�ģ���srcΪ��Ŀ¼
		//������"AboutPath"Ŀ¼�൱��src
		//path.properties��src��Ŀ¼��
		String path=Thread.currentThread().getContextClassLoader().getResource("path.properties").getPath();
		System.out.println(path);

		String path02=Thread.currentThread().getContextClassLoader().getResource("com/javase/reflect/info.properties").getPath();
		System.out.println(path02);

	}

}