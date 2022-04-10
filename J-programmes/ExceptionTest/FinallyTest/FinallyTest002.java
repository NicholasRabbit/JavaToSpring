/*
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
*/

public class FinallyTest002 {

    public static void main(String[] args){
	
	    method();    
	
	}

	public static void method(){
	 
	    try {
			System.out.println("try语句执行");     //可以只有try,后跟finally语句，不用catch也可以。
			                                       //如果try语句里有return，也不影响finally语句里的程序执行。即finally语句执行完，才执行return语句。
			return;
        }
		finally {
		    System.out.println("finally语句执行");
		}

	
	}

}