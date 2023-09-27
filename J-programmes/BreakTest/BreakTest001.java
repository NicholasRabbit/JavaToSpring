
/*
 * break打断指定的循环
 * 在多层循环下，给各个循环起别名后，可用break指定打断哪个循环
 * */
public class BreakTest001{

    public static void main(String[] args){

	    for(int b=0;b<=10;b++){
		    if(b<6){
			    break;
			}
		
		   System.out.println(b);    //此行不会执行，因为上面从 <6，
		                             //即从0开始就打断了，因此不会输出任何值
		}
		
        System.out.println("分隔符>>>>>>>>>>>>>>>>>>>>>>");

		//注意break后循环名称在不同情况下的用法
        for1:for(int c=0;c<10;c++){
				 System.out.print(c + ":");
		         for2:for(int d=0;d<5;d++){      
				     if(c==4){                    
					    break for2;  //这里打断for2代表的循环
						//System.out.print("check");  //break终端for循环以后，后边的程序就不只执行了，此处报错
					 }
				     System.out.print(" " + d);
				 }

				System.out.println();
		
		}

		
        System.out.println("分隔符>>>>>>>>>>>>>>>>>>>>>>");

	    for1:for(int c=0;c<10;c++){
				 System.out.print(c + ":");
				 for2:for(int d=0;d<5;d++){      
					 if(c==4){                     
						break for1;  //这里打断外部的for1循环
					 }
					 System.out.print(" " + d);
				 }

				System.out.println();
		
		}

	}

}
