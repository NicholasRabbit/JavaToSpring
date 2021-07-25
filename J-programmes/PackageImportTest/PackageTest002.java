package com.cctv.sports.programmes;      //加了package命令后，*.java文件编译生成的class文件,
                                         //必须放在com\cctv\sports\programmes目录下，才可运行
									     //注意，cmd需在com同目录下运行，因为类加载器默认是从当前路径寻找class文件，上面的是相对路径。
import  com.cctv.sports.programmes02.*;  //注意".*" 不要漏了。


public class PackageTest002 {

    public static void main(String[] args){
	
	    System.out.println("main方法包测试输出。");
	
	     User01 user01=new User01();        //生成的User01.class文件与PITest001.class文件在同一目录programmes下，正确，不报错。
         
		 //User02 user02=new User02();      //此处报错，User02.class在programmes02文件里，这样写错误，无法创建对象并调用。
		 //正确写法,太长太繁琐的语句：
		 com.cctv.sports.programmes02.User02 user02=new com.cctv.sports.programmes02.User02();  

		 User02 user03=new User02();        //上面写了import语句之后，就可以直接这样像创建普通对象那样写。
        
	}

}
/*
使用package语句后，多个java文件互相使用时那么， 编译时cmd在当前目录下打开，把多个有关联的*.java文件同时编译
例如：javac -d . PackageTest001.java  User01.java User02.java
      或者javac -d . *.java
然后java命令运行必须是cmd到src根目录下(com的起点)，且写全包名:java  com.cctv.sports.programmes.Package

*/