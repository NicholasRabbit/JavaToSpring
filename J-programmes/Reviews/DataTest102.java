public class DataTest102{
    
	public static void main(String[] args){
	
	     DataTest102.dataTest04();

		             dataTest05();
	}
	
	public static void dataTest04(){
	     byte m=127;

		 int  a=30;
		 //byte b=a/3;             //此行报错，java Complier编译时不做计算，只检查语法，
		                           //因为a是int类型，int类型中有数值超过byte范围，所以报错。
		 System.out.println(m);
		 //System.out.println(b);
	
	}

	public static void dataTest05(){
	    
		long q=100;
		//byte r=(byte)q/4;         //此行错误，应为4属于int类型，前面无论怎么转换，和4相除，又变回int类了
		byte r=(byte)(q/4);
		System.out.println(r);
	
	}

}