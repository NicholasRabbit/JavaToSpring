package com.javax.tomcat;

import java.util.Scanner;
import java.util.*;
import java.io.*;

import com.javax.controller.LoginController;


//ģ��Tomcat������
public class TomcatMy {

	public static void main(String[] args){
	
		System.out.println("Tomcat����������......");
		System.out.println("��ʼ�������������.....");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("������·����");
		String  requestPath = scan.next();
		FileReader reader = null;
		Properties pro = null;
		try{
			/*
			* 1,Tomcat�������������web.xml�ļ�
			* 2,Tomcat�������Ѿ������д������̴���д���ˣ��͵ȳ���Աд��ҵ����룬�����ļ���
			* 3,web.xmlͷ��������Servlet�淶�������޸ġ��Զ���������Ϣ���ð��ո�ʽ���ɳ���Ա��д��
			* 
			*/
			reader = new FileReader("web.xml");  //��ȡ�����ļ�
			pro = new Properties();        
			pro.load(reader);		//�������ļ����ص�Properties������
			
			//�û��ڿͻ�������/login,  ��Ӧ�� value��LoginController
			String className = pro.getProperty(requestPath);
			System.out.println("className==>" + className);
			//���÷�����ƣ�ͨ���û�������������Ҷ�Ӧ�Ĵ�����
			Class controllerCalss = Class.forName("com.javax.controller." + className);
			//ʵ��������Ķ���
			LoginController  controller = (LoginController)controllerCalss.newInstance();
			controller.service();  //����LoginController����ķ���service(),�����д���������˵�����

		}catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(InstantiationException e){
			e.printStackTrace();
		}catch(IllegalAccessException e){
			e.printStackTrace();
		}finally{
			if(reader != null){
				try{
					reader.close();  //�ر�IO��
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}

	}
}