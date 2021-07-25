package com.bjpowernode.java.reflect;

import java.io.FileReader;

/*
�о�һ���ļ�·�������⡣
��ô��ȡһ���ļ��ľ���·�������½�������ַ�ʽ��ͨ�õġ���ǰ���ǣ��ļ���Ҫ����·���¡����������ַ�ʽ��
 */
public class AboutPath {
    public static void main(String[] args) throws Exception{
        // ���ַ�ʽ��·��ȱ���ǣ���ֲ�Բ��IDEA��Ĭ�ϵĵ�ǰ·����project�ĸ���
        // �����������뿪��IDEA������������λ�ã����ܵ�ǰ·���Ͳ���project�ĸ��ˣ���ʱ���·������Ч�ˡ�
        //FileReader reader = new FileReader("chapter25/classinfo2.properties");

        // ������˵һ�ֱȽ�ͨ�õ�һ��·������ʹ���뻻λ���ˣ�������д��Ȼ��ͨ�õġ�
        // ע�⣺ʹ������ͨ�÷�ʽ��ǰ���ǣ�����ļ���������·���¡�
        // ʲô��·���£���ʽ��src�µĶ�����·���¡�����ס����
        // src����ĸ�·����
        /*
        ���ͣ�
            Thread.currentThread() ��ǰ�̶߳���
            getContextClassLoader() ���̶߳���ķ��������Ի�ȡ����ǰ�̵߳������������
            getResource() ����ȡ��Դ�����������������ķ�������ǰ�̵߳��������Ĭ�ϴ���ĸ�·���¼�����Դ��
         */
        String path = Thread.currentThread().getContextClassLoader()
                .getResource("classinfo2.properties").getPath(); // ���ַ�ʽ��ȡ�ļ�����·����ͨ�õġ�

        // �������ϵĴ�������õ�һ���ļ��ľ���·����
        // /C:/Users/Administrator/IdeaProjects/javase/out/production/chapter25/classinfo2.properties
        System.out.println(path);

        // ��ȡdb.properties�ļ��ľ���·��������ĸ�·������Ϊ��㿪ʼ��
        String path2 = Thread.currentThread().getContextClassLoader()
                .getResource("com/bjpowernode/java/bean/db.properties").getPath();
        System.out.println(path2);

    }
}
