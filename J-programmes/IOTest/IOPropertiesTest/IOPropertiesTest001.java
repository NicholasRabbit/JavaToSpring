package com.io.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


//������ Properties��IO�����ʹ��
/*�ô������ŵ㣺
  ���������ļ���java��class�ļ��Ƕ�̬�󶨵ģ��Ժ�Ķ���Ϣ�����������ļ����޸ľͿ����ˣ������޸ĳ��򣬲������±��룬���ٹ�����
  �����ļ������淶
  Javaһ����.properties��β��������Ӳ�Թ涨��������Ҳ���ԣ�����web.xml
*/
/*
properties�ļ�ע�ͱ�־���Ǻš�*��
��ֵ�Ժ͵Ⱥ�֮�䲻Ҫ�пո񣬺���Spring���ܻ��ȡ����
��ֵ�ԵĶ�Ӧ���Ž����õȺţ�������������ð�š�����Ҳ���ԣ���������
name=Jerry
age=20
password=123
*/
public class IOPropertiesTest001 {

    public static void main(String[] args){
	
	   FileInputStream fis=null;
	   Properties pro=null;
	   try{
		  /*(1)�ļ���Ҫ�Ӻ�׺*.properties
		    (2)��д����·����:D��\\javase\\...\\userInfo.properties
			(3)���������·���������������˰����ƣ����·����.class�ļ��ĸ�Ŀ¼Ϊ���д,��com����Ŀ¼
			   ע��:���·��"com\\..."��ǰ�治Ҫ�ӡ�\\��,���򱨴�
		  */                         
		  fis=new FileInputStream("com\\io\\properties\\userInfo.properties") ;  
		  pro=new Properties();                         //����ɸ�Ϊ web.xml
		  pro.load(fis);   //��IO��������ص�Properties�����У�������Ӧ�������ɻ�ȡ�ļ�����Ϣ
		  
		  //Properties�ڲ���ֵ�Զ���String����
		  String name=pro.getProperty("name");
		  String age=pro.getProperty("age");
		  String password=pro.getProperty("password");
		  System.out.println(name+"="+age+"="+password);
	   }catch(FileNotFoundException e){
	      e.printStackTrace();
	   }catch(IOException e){
	      e.printStackTrace();
	   }finally{
		  if(fis != null){
			try{
				fis.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		  }
	   }
	
	}    

}