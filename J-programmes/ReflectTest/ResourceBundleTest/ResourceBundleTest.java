/*
  ��Դ����ResourceBundle����,ResourceBundle��һ��������
  ��;�����Եõ������ļ��е�ֵvalue�����ֵ������һ���࣬����һ��MySqlʵ����ȵ�

*/

import java.util.ResourceBundle;

public class ResourceBundleTest {

	public static void main(String[] args){
		
		
		/* ʹ��ResourceBundle������Ҫ��
		һ���󶨵�ֻ������.propertiesΪ��׺�������ļ��������Ĳ��У�
		������getBundle(String baseName)��������������·��Ϊ���ģ�����src��Ŀ¼Ϊ���
		    ���ң�����ļ����Ʋ�Ҫ�Ӻ�׺
		*/
		
		//��һ��������ResourceBundle��ľ�̬����getBundle(..)
		ResourceBundle rb=ResourceBundle.getBundle("com/javase/reflect/bundleFile");
		
		//�ڶ���������ʵ������..String getString(String key)��ͨ��key�õ�value�������ֵ,String����
		String value=rb.getString("key01");
		System.out.println(value);
	}

}