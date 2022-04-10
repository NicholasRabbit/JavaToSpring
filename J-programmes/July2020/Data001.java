public class Data001{
     static char m=66;
     public static void main(String[] args){     
     System.out.println(m);   //此处输出'B'因为66再char里编码就是代表B                   
     //默认值验证，成员变量，声明前要加static；
	 //后面会学到为什么加。
	 

	 int  x,y,result;
	      x=50;
		  y=60;
          result=x+y;      
     //此处result的表达式必须写，
     //后面的System.out里的加号已经变成了字符串连接符
	 //起不到求和作用了
	 String operator="+";
	        
	 System.out.println(x+operator+y+"="+result);



}    



}