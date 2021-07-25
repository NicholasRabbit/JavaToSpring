//package语法练习，package语句必须放在有效执行程序的第一句，前面可以有注释。
package com.javase.file01; 

import com.javase.file02.User302;

public class PackageTest301 {

    
    public static void main(String[] args){
	
	     PackageTest301.method01();

		 User301 u1=new User301();
		         u1.UserMethod();
         
		 com.javase.file02.User302 u2=new com.javase.file02.User302();  
		 //User302的class文件在file02内，不和PackageTest301.class在同一个文件夹里，新创建对象必须这样写。 
		 
		 User302 u3=new User302();
        
	}

	public static void method01(){
	
	    System.out.println("method01打印输出");
	}

}

