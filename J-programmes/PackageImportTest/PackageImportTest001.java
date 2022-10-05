
/*
Java编译不在当前目录下的源码命令：
(1)编译
--project
	--src/com/test/Test.java
	--out/com/test/Test.class (编译后的结果)
project/--> : javac -encoding utf-8 out /src/com/test/Test.java :编译Test.java到out目录下
注意如果Test.java中引入了别的包要一起编译，否则编译报错，例:FactoryTest.java中引入了order和entity报下的类，所以要一起编译，此例为设计模式中的工厂模式中的范例
javac -encoding utf-8 -d out src/com/factory/test/FactoryTest.java 
							 src/com/factory/order/*.java  
							 src/com/factory/entity/*.java


(2)运行：
out/--> : java com.test.Test
*/


package com.cctv.sports.programmes;   //注意后面不要忘加分号

public class PackageImportTest001 {

    public static void main(String[] args){
	
	    System.out.println("main方法包测试输出。");
	}

}