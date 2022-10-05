
/*
Java编译不在当前目录下的源码命令：
--project
	--src/com/test/Test.java
	--out/com/test/Test.class (编译后的结果)
project/--> : javac -encoding utf-8 out /src/com/test/Test.java :编译Test.java到out目录下
运行：
out/--> : java com.test.Test
*/


package com.cctv.sports.programmes;   //注意后面不要忘加分号

public class PackageImportTest001 {

    public static void main(String[] args){
	
	    System.out.println("main方法包测试输出。");
	}

}