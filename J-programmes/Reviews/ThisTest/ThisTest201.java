public class ThisTest201{


	
			 
	public static void main(String[] args){
	
	     Test201 c=new Test201();
		         c.m;              //报错，不是语句,c.m是数据，java语法里数据不能单独成句
		 System.out.println(c.m);  //写进这里就不报错
	  
	}
	
}
class Test201
{
	int m=20;
}