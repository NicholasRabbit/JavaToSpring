
/*
Java���벻�ڵ�ǰĿ¼�µ�Դ�����
(1)����
--project
	--src/com/test/Test.java
	--out/com/test/Test.class (�����Ľ��)
project/--> : javac -encoding utf-8 out /src/com/test/Test.java :����Test.java��outĿ¼��
ע�����Test.java�������˱�İ�Ҫһ����룬������뱨����:FactoryTest.java��������order��entity���µ��࣬����Ҫһ����룬����Ϊ���ģʽ�еĹ���ģʽ�еķ���
javac -encoding utf-8 -d out src/com/factory/test/FactoryTest.java 
							 src/com/factory/order/*.java  
							 src/com/factory/entity/*.java


(2)���У�
out/--> : java com.test.Test
*/


package com.cctv.sports.programmes;   //ע����治Ҫ���ӷֺ�

public class PackageImportTest001 {

    public static void main(String[] args){
	
	    System.out.println("main���������������");
	}

}