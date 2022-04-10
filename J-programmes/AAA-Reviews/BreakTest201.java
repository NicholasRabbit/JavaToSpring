public class BreakTest201{
    public static void main(String[] args){
	     int m=BreakTest201.breakTest(1);
		 System.out.println(m);
	
	}
	public static int breakTest(int a){
	     for(;a<=10;a++){                //上面调用时已经给a赋值了，因此for后第一个分号前什么也不写
		     if(a==6){                   //写a的话会报错
			    break;
			 }
		 
		 }
		 
		 return a;
	
	
	}

}