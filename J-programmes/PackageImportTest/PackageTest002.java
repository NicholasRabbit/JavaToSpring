package com.cctv.sports.programmes;      //����package�����*.java�ļ��������ɵ�class�ļ�,
                                         //�������com\cctv\sports\programmesĿ¼�£��ſ�����
									     //ע�⣬cmd����comͬĿ¼�����У���Ϊ�������Ĭ���Ǵӵ�ǰ·��Ѱ��class�ļ�������������·����
import  com.cctv.sports.programmes02.*;  //ע��".*" ��Ҫ©�ˡ�


public class PackageTest002 {

    public static void main(String[] args){
	
	    System.out.println("main���������������");
	
	     User01 user01=new User01();        //���ɵ�User01.class�ļ���PITest001.class�ļ���ͬһĿ¼programmes�£���ȷ��������
         
		 //User02 user02=new User02();      //�˴�����User02.class��programmes02�ļ������д�����޷��������󲢵��á�
		 //��ȷд��,̫��̫��������䣺
		 com.cctv.sports.programmes02.User02 user02=new com.cctv.sports.programmes02.User02();  

		 User02 user03=new User02();        //����д��import���֮�󣬾Ϳ���ֱ�������񴴽���ͨ��������д��
        
	}

}
/*
ʹ��package���󣬶��java�ļ�����ʹ��ʱ��ô�� ����ʱcmd�ڵ�ǰĿ¼�´򿪣��Ѷ���й�����*.java�ļ�ͬʱ����
���磺javac -d . PackageTest001.java  User01.java User02.java
      ����javac -d . *.java
Ȼ��java�������б�����cmd��src��Ŀ¼��(com�����)����дȫ����:java  com.cctv.sports.programmes.Package

*/